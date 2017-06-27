/**
 *
 */
package com.internousdev.bulletinboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.bulletinboard.util.DBConnector;

/**
 * @author internousdev
 *
 */
public class FollowListDeleteDAO {

	public int delete(int userId, int viewId){

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();

		int result=0;
		String delete="delete from follow where do=? && done=?";

		try{
			PreparedStatement ps = con.prepareStatement(delete);
		    ps.setInt(1,userId);
		    ps.setInt(2,viewId);
		    result=ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(con != null){
				try{
					con.close();
				}catch (SQLException e){
					e.printStackTrace();
				}
			}
		}
		return result;
	}
}
