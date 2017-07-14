package com.internousdev.bulletinboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.bulletinboard.dto.StampDTO;
import com.internousdev.bulletinboard.dto.StampPackageDTO;
import com.internousdev.util.db.mysql.MySqlConnector;



public class StampDAO {
	/** ユーザーが使用可能なスタンプパッケージのリストを取得する */
	public ArrayList<StampPackageDTO> getStampPackageList(int userId){
		Connection con = new MySqlConnector("openconnect").getConnection();
		/* 使用可能なスタンプパッケージのリスト */
		ArrayList<StampPackageDTO> stampPackageList = new ArrayList<StampPackageDTO>();


		String sql1 = ""
				+"SELECT stamp_package_id, stamp_package_name, user_level FROM stamp_packages WHERE user_level <= ("
				+	"SELECT user_level FROM users WHERE user_id = ?"
				+") ORDER BY stamp_package_id ASC;";
		String sql2 = "SELECT stamp_id, stamp FROM stamps WHERE stamp_package_id = ? ORDER BY stamp_id ASC;";

		try{
			PreparedStatement ps1 = con.prepareStatement(sql1);
			ps1.setInt(1, userId);
			ResultSet rs1 = ps1.executeQuery();
			while(rs1.next()){
				StampPackageDTO packDTO = new StampPackageDTO();
				packDTO.setStampPackageId(rs1.getInt("stamp_package_id"));
				packDTO.setStampPackageName(rs1.getString("stamp_package_name"));
				packDTO.setUserLevel(rs1.getInt("user_level"));
				stampPackageList.add(packDTO);
			}
			ps1.close();

			PreparedStatement ps2 = con.prepareStatement(sql2);
			for (int i = 0; i < stampPackageList.size(); i++) {
				ps2.setInt(1, stampPackageList.get(i).getStampPackageId());
				ResultSet rs2 = ps2.executeQuery();

				ArrayList<StampDTO> stampList = new ArrayList<StampDTO>();
				while(rs2.next()){
					StampDTO stDTO = new StampDTO();
					stDTO.setStampId(rs2.getInt("stamp_id"));
					stDTO.setStamp(rs2.getString("stamp"));
					stampList.add(stDTO);
				}
				stampPackageList.get(i).setStampList(stampList);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return stampPackageList;
	}
}
