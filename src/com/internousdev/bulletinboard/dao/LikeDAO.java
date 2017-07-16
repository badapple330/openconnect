package com.internousdev.bulletinboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.bulletinboard.dto.LikeDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * いいね情報に関するクラス
 * @author Ryo Maeda
 * @since 2017/06/12
 * @version 1.0
 *
 */
public class LikeDAO {

/**
 * 	ユーザIDとタイムラインIDから、その人がすでにいいねをしているか
 * 	どうかを確認するメソッド
 * @param userId
 * @param postId
 * @return
 */
	public boolean isLiked(int userId,int postId){
	    Connection con = new MySqlConnector("openconnect").getConnection();
	    ArrayList<LikeDTO> list=new ArrayList<LikeDTO>();
	    boolean is =false;
	    String sql="select * from likes where user_id = ? and post_id = ?";

	    try{
	    	PreparedStatement ps = con.prepareStatement(sql);
	    		ps.setInt(1, userId);
	    		ps.setInt(2, postId);
	    	ResultSet rs = ps.executeQuery();
	    	while(rs.next()){
	    		LikeDTO dto = new LikeDTO();
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

	public int insertLike(int userId,int postId){
	    Connection con = new MySqlConnector("openconnect").getConnection();

	    int inserted = 0;
	    String sql = "insert into likes (user_id, post_id) values (?, ?)";


	    try{
	    	PreparedStatement ps = con.prepareStatement(sql);
	    		ps.setInt(1, userId);
	    		ps.setInt(2, postId);
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
	public int pointPlus(int senderId,int postId){

		UserLevelDAO Level =new UserLevelDAO();

		Connection con = new MySqlConnector("openconnect").getConnection();
		int inserted=0;
		int inserted2=0;

		String sql = "update users set point = point+100 where user_id = ?";
		String sql2 ="update posts set like_count = like_count+1 where post_id = ?";

		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setInt(1,senderId);
			inserted = ps.executeUpdate();

			PreparedStatement ps2= con.prepareStatement(sql2);
			ps2.setInt(1,postId);
			inserted2 = ps2.executeUpdate();

			ps2.close();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		//経験値が1000以上だった場合にレベルUP
		Level.levelUp(senderId);
		return inserted;

	}

}
