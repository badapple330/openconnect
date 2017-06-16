package com.internousdev.openconnect.decision.detail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.decision.detail.dto.DecisionDetailDTO;
import com.internousdev.util.DBConnector;
/**
 * 表示したい内容を、DBから取り出しDTOへ転送する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */
public class DecisionDetailUpdateDAO {

	/**
	 * 決裁手続きリスト
	 */
	private List<DecisionDetailDTO> decisionDetailList=new ArrayList<DecisionDetailDTO>();
	 /**
     * 表示メソッド  表示したい内容を、DBから取り出しDTOへ転送する為のメソッド
     * @author TATUHUMI ITOU
     */
	public int insert(int projectId, String decisionType, int decisionStatus1){

		int count = 0;
		if(decisionType.equals("実施兼契約")) {
			decisionStatus1 = 2;
		}

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "INSERT INTO decision(project_id, decision_type, decision_status1)VALUES(?, ?, ?)";
		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,projectId);
			ps.setString(2,decisionType);
			ps.setInt(3,decisionStatus1);

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