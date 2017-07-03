/**
 *
 */
package com.internousdev.openconnect.decision.detail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.openconnect.decision.dto.DecisionDTO;
import com.internousdev.util.DBConnector;

/**
 * @author internousdev
 *
 */
public class DecisionArchiveDAO {

	ArrayList<DecisionDTO> archiveList =new ArrayList<DecisionDTO>();

	public  ArrayList<DecisionDTO> archive(int siteId, String siteName) {

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();

		String sql ="select site_id,site_name from site";

		try {

			PreparedStatement ps = null;
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();


			while (rs.next()) {
				DecisionDTO dto = new DecisionDTO();
				dto.setSiteId(rs.getInt("site_id"));
				dto.setSiteName(rs.getString("site_name"));


				archiveList.add(dto);
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
		return archiveList;
	}


}
