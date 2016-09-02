/**
 *
 */
package com.internousdev.openconnect.updateAttendance.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.openconnect.updateAttendance.dto.UpdateAttendanceDTO;
import com.internousdev.util.DBConnector;
import com.mysql.jdbc.PreparedStatement;

/**
 * @author internous
 *
 */
public class UpdateAttendanceDAO {

	/**
	 * @param args
	 */
	private ArrayList<UpdateAttendanceDTO> list=new ArrayList<UpdateAttendanceDTO>();

	public boolean selectAll(){

		boolean result=false;

		Connection conn=new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql").getConnection();

		String sql="select * from attendance";

		try{
			PreparedStatement ps=(PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				UpdateAttendanceDTO dto=new UpdateAttendanceDTO();
				dto.setDate(rs.getInt("date"));
				dto.setId(rs.getInt("id"));
				dto.setAttendance(rs.getInt("attendance"));
				dto.setInterview(rs.getInt("interview"));
				list.add(dto);
				result=true;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return result;
	}



	public ArrayList<UpdateAttendanceDTO> getList(){
		return list;
	}
	public void setList(ArrayList<UpdateAttendanceDTO> list){
		this.list=list;
	}

}
