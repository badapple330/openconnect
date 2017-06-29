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
import com.internousdev.bulletinboard.util.DBConnector;

/**
 *
 *
 */
public class ProfileImgDAO {

		  public ArrayList<StampDTO> stampGet(){

			    DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
			    Connection con = db.getConnection();
			    ArrayList<StampDTO> stampList = new ArrayList<StampDTO>();
			    String sql="select * from prof_img";

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
	}

