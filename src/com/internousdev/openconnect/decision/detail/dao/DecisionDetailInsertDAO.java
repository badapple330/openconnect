/**
 *
 */
package com.internousdev.openconnect.decision.detail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;
/**
 * 画面で追加した一覧情報をDBへ転送する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */
public class DecisionDetailInsertDAO {
	 /**
     * 挿入メソッド  画面で受け取った追加情報を、DBへ転送し、追加する為のメソッド
     * @author TATUHUMI ITOU
     */
	public int insert(int projectId, String decisionType){

		int count = 0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "INSERT INTO decision(project_id, decision_type)VALUES(? ,?)";
		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,projectId);
			ps.setString(2,decisionType);
			count = ps.executeUpdate();


		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;

	}


}
