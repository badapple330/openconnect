package com.internousdev.bulletinboard.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.bulletinboard.dto.BotDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

public class BotTalk2 {

	private String postContents;

	public BotTalk2(String postContents){
		this.postContents = postContents;
	}

	public String talkContents(){
		String result = null;
		ArrayList<BotDTO> responseList = new ArrayList<BotDTO>();
		responseList = responseGet();
		for(int i=0;i<responseList.size();i++){
			if (postContents.matches(".*" + responseList.get(i).getWord() + ".*")) {
				result = responseList.get(i).getResponse();
			}
		}
		if(result == null){
			result = "そうだね";
		}
		return result;
	}

	/**
	 *
	 * @return
	 */
	public ArrayList<BotDTO> responseGet(){
		Connection con = new MySqlConnector("bulletinboard").getConnection();
		ArrayList<BotDTO> responseList = new ArrayList<BotDTO>();

		String sql = "select * from response";

		  try{
			  PreparedStatement ps = con.prepareStatement(sql);
			  ResultSet rs = ps.executeQuery();
			  while(rs.next()){
				  BotDTO dto = new BotDTO();
				  dto.setResponseId(rs.getInt("response_id"));
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

}
