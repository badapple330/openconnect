package com.internousdev.bulletinboard.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.bulletinboard.dto.BotDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

public class BotTalk {

	/**
	 * botのID（-1～）
	 */
	private int botId;
	/**
	 * もらった発言
	 */
	private String postContents;
	/**
	 * 送り先のユーザーID
	 */
	private int receiverId;

	/**
	 * 必要な情報を取得する
	 * @param botId ボットのID（-1～）
	 * @param postContents もらった発言
	 */
	public BotTalk(int botId, int receiverId, String postContents){
		this.botId = botId;
		this.receiverId = receiverId;
		this.postContents = postContents;
	}


	/**
	 * レスポンステーブル以外の返答が来たときの対応
	 * @param response もらった発言
	 * @return 対応
	 */
	public String setResponse(){
		String result = "不明な要求です";

		//botのIDと、予期していない反応が来たときの対応を記入する
		if(botId == -1){
			ResponsiveTalk talk = new ResponsiveTalk(postContents);
			if(postContents.matches(".*" + "タイムライン" + ".*")){
				result=talk.timelineAnalysis(receiverId); //タイムラインの分析を返す
			}else{
				result=talk.responseGenerate(); //学習をもとにした自動返信
			}
			if(result == null){
				result = talk.responseThink(); //適当な自動返信
			}
		}else if(botId == -2){
			result = "えっなに？";
		}
		return result;
	}

	/**
	 *レスポンステーブルの情報をリスト化するメソッド
	 * @return レスポンスリスト
	 */
	public ArrayList<BotDTO> responseGet(){
		Connection con = new MySqlConnector("bbbot").getConnection();
		ArrayList<BotDTO> responseList = new ArrayList<BotDTO>();
		String sql = null;

		//botのIDと、それに対応したSQL文を記入する
		if(botId == -1){
			sql = "select * from response";
		}else if(botId == -2){
			sql = "select * from response_imouto";
		}else{
			return null;
			}

		  try{
			  PreparedStatement ps = con.prepareStatement(sql);
			  ResultSet rs = ps.executeQuery();
			  while(rs.next()){
				  BotDTO dto = new BotDTO();
				  dto.setSentenceId(rs.getInt("response_id"));
				  dto.setWord(rs.getString("word"));
				  dto.setResponse(rs.getString("response"));

				  responseList.add(dto);
				  }
			  }catch(SQLException e){
		    	e.printStackTrace();
		    	}finally {
			try{
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		  return responseList;
	}




	//以下はいじらなくて大丈夫


	/**
	 * もらった発言に反応する言葉があるか検索し、あった場合は反応を返す
	 * @return
	 */
	public String talkContents(){
		String result = null;
		ArrayList<BotDTO> responseList = new ArrayList<BotDTO>();
		responseList = responseGet();
		if(responseList == null){
			return null;
		}
		//検索
		for(int i=0;i<responseList.size();i++){
			if (postContents.matches(".*" + responseList.get(i).getWord() + ".*")) {
				//あったら反応を返す
				result = responseList.get(i).getResponse();
				if(result.matches(".*" + "特殊処理" + ".*")){
					result = setResponse();
				}
			}
		}
		if(result == null){
			result = setResponse();
		}
		return result;
	}



	/**
	 * 返信するメソッド
	 * @param receiverId
	 * @param postContents
	 * @return
	 */
	  public int botSet(int receiverId,String postContents){
		  int inserted = 0;
		  Connection con = new MySqlConnector("openconnect").getConnection();

		  String sql = "insert into post (sender_id,receiver_id,post_contents,img) values (?,?,?,'') ";
		    try{
		    	PreparedStatement ps = con.prepareStatement(sql);

		    		ps.setInt(1, botId);
		    		ps.setInt(2,receiverId);
		    		ps.setString(3,postContents);

		    	inserted = ps.executeUpdate();

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