/**
 *
 */
package com.internousdev.openconnect.decision.detail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.decision.detail.dto.DecisionDetailDTO;
import com.internousdev.util.DBConnector;

/**
 * 画面に検索結果を表示する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */
public class DecisionDetailSelectDAO {

	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author TATUHUMI ITOU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public List<DecisionDetailDTO> select( String searchString ){

		Connection conn = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql").getConnection();

		String sql = "select*from decision_detail inner join projects on decision_detail.project_id = projects.project_id where project_name LIKE '%" + searchString + "%'";

		List<DecisionDetailDTO> decisionDetailList  = new ArrayList<DecisionDetailDTO>();

		try{

			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while( rs.next() ){

				DecisionDetailDTO dto = new DecisionDetailDTO();
				dto.setDecisionDetailId(rs.getInt("decision_detail_id"));
				dto.setProjectName(rs.getString("project_name"));
				dto.setProjectId(rs.getInt("project_Id"));
				dto.setDecisionId(rs.getInt("decision_id"));
				dto.setDecisionType(rs.getString("decision_type"));
				dto.setDecisionStatus(rs.getString("decision_status"));

				decisionDetailList .add( dto );
			}
		}catch (SQLException e) {
       	 e.printStackTrace();
        }finally{
       	 try{
       		 conn.close();
	         }catch (SQLException e){
	        	 e.printStackTrace();
	         }
	     }

		return decisionDetailList ;
	}

}
