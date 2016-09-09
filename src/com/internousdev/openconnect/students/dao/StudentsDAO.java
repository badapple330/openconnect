package com.internousdev.openconnect.students.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.students.dto.StudentsDTO;
import com.internousdev.util.DBConnector;

public class StudentsDAO {

	private List<StudentsDTO>studentsList = new ArrayList<StudentsDTO>();

	public List<StudentsDTO> select() {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con = db.getConnection();

		try {
			String sql="SELECT * FROM users";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				StudentsDTO dto = new StudentsDTO();
				dto.setFamily_name(rs.getString("family_name"));
				dto.setGiven_name(rs.getString("given_name"));
				dto.setYear(rs.getString("year"));
				dto.setMonth(rs.getString("month"));

				studentsList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return studentsList;
	}


}
