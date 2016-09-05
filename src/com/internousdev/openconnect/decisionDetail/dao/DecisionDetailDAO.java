/**
 *
 */
package com.internousdev.openconnect.operate.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.operate.dto.OperateDTO;
import com.internousdev.util.DBConnector;

/**
 * @author internous
 *
 */
public class OperateDAO {

	public List<OperateDTO> select( String searchString ){

		Connection conn = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql").getConnection();

		String sql = "select * from operate where project_name LIKE '%" + searchString + "%'";

		List<OperateDTO> list = new ArrayList<OperateDTO>();

		try{

			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while( rs.next() ){

				OperateDTO dto = new OperateDTO();
				dto.setOperateId( rs.getInt( "operate_id" ) );
				dto.setProjectName( rs.getString( "project_name" ) );
				dto.setPassword( rs.getString( "password" ) );

				list.add( dto );
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

		return list;
	}

}
