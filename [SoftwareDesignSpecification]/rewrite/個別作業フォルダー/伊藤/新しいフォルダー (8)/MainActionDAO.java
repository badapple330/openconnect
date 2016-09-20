/**
 *
 */
package com.internousdev.rewrite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.rewrite.dto.MainActionDTO;
import com.internousdev.util.DBConnector;

/**
 * @author internous
 *
 */
public class MainActionDAO {

	public List<MainActionDTO> MaintList = new ArrayList<MainActionDTO>();


	public List<MainActionDTO> select() {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "rewrite", "root",
				"z2789c6981");
		Connection con = db.getConnection();

		try {
			String sql="SELECT  site_janre,image_url,site_Banner FROM article";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				MainActionDTO dto = new MainActionDTO();
				dto.setSite_janre(rs.getString("site_janre"));
				dto.setImage_url(rs.getString("image_url"));
				dto.setSite_Banner(rs.getString("site_Banner"));

				MaintList.add(dto);
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
		return MaintList;
	}


	public List<MainActionDTO> getMaintList() {
		return MaintList;
	}


	public void setMaintList(List<MainActionDTO> maintList) {
		MaintList = maintList;
	}

}
