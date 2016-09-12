package com.internousdev.openconnect.projectStatus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

/**
 * DBの情報を画面に表示する為のクラス
 * @author KOHEI NITABARU
 * @since 2016/09/04
 * @version 1.0
 */
public class ProjectStatusUpdateDAO {

	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author KOHEI NITABARU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public int update( String aEnvStart, String aEnvEnd, String bEnvStart, String bEnvEnd, String rEnvStart, String rEnvEnd, String awsStatus, String note, int statusId ){
		int count=0;

		Connection conn=new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql").getConnection();
		String sql="update project_status set aEnvStart=?, aEnvEnd=?, bEnvStart=?, bEnvEnd=?, rEnvStart=?, rEnvEnd=?, aws_status=?, note=? where status_id=?";

		try{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, aEnvStart);
			ps.setString(2, aEnvEnd);
			ps.setString(3, bEnvStart);
			ps.setString(4, bEnvEnd);
			ps.setString(5, rEnvStart);
			ps.setString(6, rEnvEnd);
			ps.setString(7, awsStatus);
			ps.setString(8, note);
			ps.setInt(9, statusId);

			count = ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;
	}
}
