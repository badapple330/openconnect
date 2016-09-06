/**
 *
 */
package com.internousdev.openconnect.decisionDetail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.decisionDetail.dto.DecisionDetailDTO;
import com.internousdev.util.DBConnector;

/**
 * @author internous
 *
 */
public class DecisionDetailSearchDAO {

	public List<DecisionDetailDTO> select( String searchString ){

		Connection conn = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql").getConnection();

		String sql = "select*from decision_detail inner join projects on decision_detail.project_id = projects.project_id where project_name LIKE '%" + searchString + "%'";

		List<DecisionDetailDTO> operateList  = new ArrayList<DecisionDetailDTO>();

		try{

			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while( rs.next() ){

				DecisionDetailDTO dto = new DecisionDetailDTO();
				dto.setProjectName(rs.getString("project_name"));
				dto.setDecisionId(rs.getInt("decision_id"));
				dto.setDecisionType(rs.getString("decision_type"));
				dto.setDecisionStatus(rs.getString("decision_status"));

				operateList .add( dto );
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

		return operateList ;
	}

}
