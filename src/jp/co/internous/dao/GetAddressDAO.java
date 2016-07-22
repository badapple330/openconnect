package jp.co.internous.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.util.DBConnector;

import jp.co.internous.dto.GetAddressDTO;

public class GetAddressDAO {

	public List<GetAddressDTO> select() throws SQLException {
		List<GetAddressDTO> siteInfoList = new ArrayList<GetAddressDTO>();
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		try {
			String sql = "select * from site";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				GetAddressDTO dto = new GetAddressDTO();
				dto.setSite_id(rs.getInt(1));
				dto.setSite_name(rs.getString(2));
				dto.setSite_url(rs.getString(3));
				dto.setGenre(rs.getString(4));
				siteInfoList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return siteInfoList;
	}
}