/**
 *
 */
package com.internousdev.bulletinboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.bulletinboard.dto.UserDTO;
import com.internousdev.bulletinboard.util.DBConnector;

/**
 *
 *
 */
public class UserImgDAO {

		  public ArrayList<UserDTO> imageGet(){

			    DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
			    Connection con = db.getConnection();
			    ArrayList<UserDTO> userImgList = new ArrayList<UserDTO>();
			    String sql="select * from user_img";

			    /////////

			    try{
			    	PreparedStatement ps = con.prepareStatement(sql);
			    	ResultSet rs = ps.executeQuery();
			    	while(rs.next()){
			    		UserDTO dto = new UserDTO();
			    		dto.setImgId(rs.getInt("img_id"));
			   			dto.setUrl(rs.getString("url"));
			   			userImgList.add(dto);
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
			     return userImgList;
		  }
	}

