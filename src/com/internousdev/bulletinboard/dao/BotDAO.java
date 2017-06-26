package com.internousdev.bulletinboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.bulletinboard.dto.BotDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * botに関するDAO
 * @author Misa Kikuchi
 * @since 2017/06/26
 * @version 1.0
 */
public class BotDAO {


	/**
	 * 単語がテーブルに存在するか調べるメソッド
	 * @param word 単語
	 * @return 単語のリスト
	 */
	public ArrayList<BotDTO> wordSearch(String word){
		ArrayList<BotDTO> wordList = new ArrayList<BotDTO>();
		Connection con = new MySqlConnector("bbbot").getConnection();
		String phase= "%"+ word + "%";

		String sql = "select word from word_analysis where word like ?";

		  try{
			  PreparedStatement ps = con.prepareStatement(sql);
			  ps.setString(1,phase);
			  ResultSet rs = ps.executeQuery();
			  while(rs.next()){
				  BotDTO dto = new BotDTO();
				  dto.setWord(rs.getString("word"));
				  wordList.add(dto);
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
		  return wordList;
	}


	/**
	 * 相手のタイムラインの投稿をリスト化するメソッド
	 * @param userId ユーザーID
	 * @return タイムラインの投稿内容のリスト
	 */
	public ArrayList<String> getContents(int userId){
		 Connection con = new MySqlConnector("bbbot").getConnection();
		 ArrayList<String> contentsList = new ArrayList<String>();

		 String sql = "select send_contents from send_timeline where sender_id = ?";

		  try{
			  PreparedStatement ps = con.prepareStatement(sql);
			  ps.setInt(1,userId);
			  ResultSet rs = ps.executeQuery();
			  while(rs.next()){
				  String contents = rs.getString("send_contents");
				  contentsList.add(contents);
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
		  return contentsList;
	}


	/**
	 * 文節がテーブルに存在するか調べるメソッド
	 * @param word 文節
	 * @return 文節のリスト
	 */
	public ArrayList<BotDTO> phaseSearch(String word){
		ArrayList<BotDTO> wordList = new ArrayList<BotDTO>();
		Connection con = new MySqlConnector("bbbot").getConnection();

		String sql = "select after_word from word_analysis where word=?";

		  try{
			  PreparedStatement ps = con.prepareStatement(sql);
			  ps.setString(1,word);
			  ResultSet rs = ps.executeQuery();
			  while(rs.next()){
				  BotDTO dto = new BotDTO();
				  dto.setWord(rs.getString("after_word"));
				  wordList.add(dto);
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
		  return wordList;
	}

}
