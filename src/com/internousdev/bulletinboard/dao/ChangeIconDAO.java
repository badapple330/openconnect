package com.internousdev.bulletinboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.bulletinboard.dto.StampDTO;
import com.internousdev.bulletinboard.dto.UserDTO;
import com.internousdev.bulletinboard.util.DBConnector;

/**
 * チャット取得、格納に関するクラス
 * @author Ryo Maeda
 * @since 2017/06/05
 * @version 1.0
 *
 */


public class ChangeIconDAO {
		/** グループアイコン変更 */
		public ArrayList<StampDTO> getGroupIcon(){

			    DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
			    Connection con = db.getConnection();
			    ArrayList<StampDTO> stampList = new ArrayList<StampDTO>();
			    String sql="select * from group_icon";

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

		  public int setGroupIcon(int groupId,String url){
			  int inserted=0;

			    DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
			    Connection con = db.getConnection();
			    String sql="update group_master set group_icon=? where group_id=?";

			    /////////

			    try{
			    	PreparedStatement ps = con.prepareStatement(sql);
			    	ps.setString(1, url);
			    	ps.setInt(2, groupId);
			    	inserted=ps.executeUpdate();
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

		  /** ユーザーアイコン */
		  public ArrayList<UserDTO> getUserIcon(){

			    DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
			    Connection con = db.getConnection();
			    ArrayList<UserDTO> userIconList = new ArrayList<UserDTO>();
			    String sql="select * from user_icon";

			    /////////

			    try{
			    	PreparedStatement ps = con.prepareStatement(sql);
			    	ResultSet rs = ps.executeQuery();
			    	while(rs.next()){
			    		UserDTO dto = new UserDTO();
			    		dto.setImgId(rs.getInt("img_id"));
			   			dto.setUrl(rs.getString("url"));
			   			userIconList.add(dto);
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
			     return userIconList;
		  }

		  public int setUserIcon(int userId,String url){
			  int inserted=0;

			    DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
			    Connection con = db.getConnection();
			    String sql="update users set user_icon=? where user_id=?";

			    /////////

			    try{
			    	PreparedStatement ps = con.prepareStatement(sql);
			    	ps.setString(1, url);
			    	ps.setInt(2, userId);
			    	inserted=ps.executeUpdate();
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
