package com.internousdev.bulletinboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.bulletinboard.dto.GoodDTO;
import com.internousdev.bulletinboard.util.DBConnector;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * いいね情報に関するクラス
 * @author Ryo Maeda
 * @since 2017/06/12
 * @version 1.0
 *
 */
public class GoodDAO {

/**
 * 	ユーザIDとタイムラインIDから、その人がすでにいいねをしているか
 * 	どうかを確認するメソッド
 * @param userId
 * @param postId
 * @return
 */
	public boolean isGood(int userId,int postId){
	    Connection con = new MySqlConnector("openconnect").getConnection();
	    ArrayList<GoodDTO> list=new ArrayList<GoodDTO>();
	    boolean is =false;
	    String sql="select * from good where user_id=? and post_id=?";

	    try{
	    	PreparedStatement ps = con.prepareStatement(sql);
	    		ps.setInt(1,userId);
	    		ps.setInt(2,postId);
	    	ResultSet rs = ps.executeQuery();
	    	while(rs.next()){
	    		GoodDTO dto = new GoodDTO();
	    		dto.setUserId(rs.getInt("user_id")); //ユーザーID
	    		dto.setPostId(rs.getInt("post_id")); //タイムラインID;
	    		list.add(dto);
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
	    if(list.size()>0){is=true;}
	     return is;
	  }

	public int goodSet(int userId,int postId){
	    DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
	    Connection con = db.getConnection();

	    int inserted=0;
	    String sql = "insert into good (user_id,post_id) values (?,?)";


	    try{
	    	PreparedStatement ps = con.prepareStatement(sql);
	    		ps.setInt(1,userId);
	    		ps.setInt(2,postId);
	    	inserted= ps.executeUpdate();
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
