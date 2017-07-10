/**
 *
 */
package com.internousdev.bulletinboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.bulletinboard.dto.StampDTO;
import com.internousdev.util.db.mysql.MySqlConnector;


public class GroupNameDAO {
	public ArrayList<StampDTO> stampGet(){

		Connection con = new MySqlConnector("openconnect").getConnection();
		ArrayList<StampDTO> stampList = new ArrayList<StampDTO>();
		String sql="select * from group_name";

		/////////

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				StampDTO dto = new StampDTO();
				dto.setStampId(rs.getInt("img_id"));
				dto.setUrl(rs.getString("url"));
				stampList.add(dto);
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
		return stampList;
	}

	public int setGroupName(String groupName, int groupId){
		int updated=0;

		Connection con = new MySqlConnector("openconnect").getConnection();
		String sql="update group_master set group_name=? where group_id=?";

		/////////

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, groupName);
			ps.setInt(2, groupId);
			updated=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try{
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return updated;
	}
}

