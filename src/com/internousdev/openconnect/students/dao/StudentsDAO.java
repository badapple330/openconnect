package com.internousdev.openconnect.students.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.students.dto.StudentsSearchDTO;
import com.internousdev.util.DBConnector;

public class StudentsDAO {

	private List<StudentsSearchDTO>studentsList = new ArrayList<StudentsSearchDTO>();

	public List<StudentsSearchDTO> select() {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con = db.getConnection();

		try {
			String sql="SELECT * FROM users";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				StudentsSearchDTO dto = new StudentsSearchDTO();
				dto.setFamilyname(rs.getString("family_name"));
				dto.setGivenname(rs.getString("given_name"));
				dto.setYear(rs.getString("year"));
				dto.setMonth(rs.getString("month"));
				dto.setUserid(rs.getInt("userid"));

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
