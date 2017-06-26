package com.internousdev.bulletinboard.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.atilika.kuromoji.Token;
import org.atilika.kuromoji.Tokenizer;

import com.internousdev.bulletinboard.dto.BotDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * botが文章を学習するためのクラス
 * @author Misa Kikuchi
 * @since 2017/06/26
 * @version 1.0
 */
public class BotExercise {

	/**
	 * 教える文章
	 */
	private String sentence;

	/**
	 * 教える文章をセットする
	 * @param sentence 教える文章
	 */
	public BotExercise(String sentence){
		this.sentence = sentence;
	}

	/**
	 * 文章を単語に分けてリスト化するメソッド
	 * @return 単語のリスト
	 */
	public ArrayList<BotDTO> wordSeparate(){
		ArrayList<BotDTO> wordList = new ArrayList<BotDTO>();

		Tokenizer tokenizer = Tokenizer.builder().build();
		List<Token> tokens = tokenizer.tokenize(sentence);
		for (Token token : tokens) {
			BotDTO dto = new BotDTO();
			dto.setWord(token.getSurfaceForm()); //単語
			dto.setPartOfSpeech(token.getPartOfSpeech()); //品詞
			dto.setParts(token.getAllFeaturesArray()[6]); //単語の基本形
			dto.setDictionary(token.isKnown()); //kuromojiの辞書に載ってるか
			wordList.add(dto);
		}
		return wordList;
	}

	/**
	 * 単語のリストを文節で文章を分ける形に変更するメソッド
	 * @param wordList 文節のリスト
	 * @return
	 */
	public ArrayList<BotDTO> wordConbine(){
		ArrayList<BotDTO> wordList = new ArrayList<BotDTO>();
		wordList = wordSeparate();
		//単語の次に助詞・助動詞があった場合はくっつける
		for(int i=0;i<(wordList.size()-1);i++){
			if(wordList.get(i+1).getPartOfSpeech().contains("助詞") || wordList.get(i+1).getPartOfSpeech().contains("助動詞")){
				//記号と助詞助動詞はくっつけない
				if(!wordList.get(i).getPartOfSpeech().contains("記号")){
					wordList.get(i).setWord(wordList.get(i).getWord() + wordList.get(i+1).getWord());
					wordList.remove(i+1);
					i--;
				}
			}
		}

		return wordList;
	}

	public ArrayList<BotDTO> bracketsConbine(ArrayList<BotDTO> wordList){

		for(int i=0;i<(wordList.size()-1);i++){
			while(wordList.get(i).getPartOfSpeech().contains("括弧開")){
				wordList.get(i).setWord(wordList.get(i).getWord() + wordList.get(i+1).getWord());
				wordList.remove(i+1);
			}
			if(wordList.get(i).getPartOfSpeech().contains("括弧閉")){
				wordList.get(i-1).setWord(wordList.get(i-1).getWord() + wordList.get(i).getWord());
				wordList.remove(i);
				i--;
			}
		}
		return wordList;
	}
	/**
	 * リストをもとに、単語とその前後関係をテーブルに書き込むメソッド
	 * @return 成否を判断する変数
	 */
	public int wordSet(){
		ArrayList<BotDTO> wordList = new ArrayList<BotDTO>();
		wordList = wordConbine();
		//wordList = bracketsConbine(wordList);
		int inserted = 0;
		Connection con = new MySqlConnector("bbbot").getConnection();

		String sql = "insert into word_analysis(word,parts,part_of_speech,dictionary,after_word,before_word) values(?,?,?,?,?,?)";

	    try{
	    	PreparedStatement ps = con.prepareStatement(sql);
	    	for(int i=0;i<wordList.size();i++){
	    		ps.setString(1, wordList.get(i).getWord());
	    		ps.setString(2, wordList.get(i).getParts());
	    		ps.setString(3, wordList.get(i).getPartOfSpeech());
	    		ps.setBoolean(4, wordList.get(i).isDictionary());
	    		if(i==0){
	    			ps.setString(5, wordList.get(i+1).getWord());
	    			ps.setString(6, null);
	    		}else if((i+1)==wordList.size()){
	    			ps.setString(5, null);
	    			ps.setString(6, wordList.get(i-1).getWord());
	    		}else{
	    			ps.setString(5, wordList.get(i+1).getWord());
	    			ps.setString(6, wordList.get(i-1).getWord());
	    		}
	    		inserted = ps.executeUpdate();
	    	}


	    	ps.close();
	    }catch(SQLException e){
	    	e.printStackTrace();
	    }finally {
			try{
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	return inserted;
	}

}
