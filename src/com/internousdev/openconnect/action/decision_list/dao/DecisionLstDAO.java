package com.internousdev.openconnect.action.decision_list.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.openconnect.action.decision_list.dto.DecisionLstDTO;
import com.internousdev.util.DBConnector;

public class DecisionLstDAO {
	/**
	 * ユーザー一覧情報を格納するリスト
	 */
	private ArrayList<DecisionLstDTO> list = new ArrayList<DecisionLstDTO>();

	/**
	 * 画面にユーザー情報一覧を表示させる為のメソッド
	 *
	 * @return result データベースからのユーザー一覧情報を格納できたか否か
	 * @throws SQLException
	 */
	public boolean select(String Registration) throws SQLException {
		boolean result = false;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		//上記はお決まり文
		String sql = "select * from decisin_list where Registration=?";
		//String sql = "select * from 何を？";//全て表示
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,Registration);
			//セッターする(1はお決まり)
			ResultSet rs = ps.executeQuery();
			//上記もお決まり文

            while(rs.next()) {
            	//括弧内はお決まり文。「終わるまで」という意味
            	DecisionLstDTO dto = new DecisionLstDTO();
            	//DTOに覚えてもらうためのセットする文
            	dto.setRegistration(rs.getString("Registration"));
            	list.add(dto);
            	result = true;
             }
         }catch (SQLException e) {
        	 e.printStackTrace();
         }finally{
        	 try{
        		 conn.close();
 	         }catch (SQLException e){
 	        	 e.printStackTrace();
 	         }
 	     }
         return result;

	}

	public ArrayList<DecisionLstDTO> getList() {
		return list;
	}

	public void setList(ArrayList<DecisionLstDTO> list) {
		this.list = list;
	}

	public ArrayList<DecisionLstDTO> getRegistrationSelect() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}





}
