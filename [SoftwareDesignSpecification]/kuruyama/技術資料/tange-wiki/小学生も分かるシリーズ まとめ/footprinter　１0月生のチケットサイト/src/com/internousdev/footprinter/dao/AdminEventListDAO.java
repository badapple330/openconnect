package com.internousdev.footprinter.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.footprinter.dto.AdminEventListDTO;
import com.internousdev.footprinter.util.DBConnector;
/**
 * データベースからAdminEventListDTOに値を格納する用
 * @author 冨内 峻太朗
 * @version 1.0
 * @since version 1.0
 */
public class AdminEventListDAO {
	/**
	 * コネクション
	 */
	private Connection con = null;
	/**
	 * DBConnectorのインスタンス
	 */
	private DBConnector dbCon = new DBConnector("footprinter");
	/**
	 * データベースからAdminEventListDTOに値を格納するメソッド
	 * @param AdminEventList ArrayList
	 * @param name 検索に入力したイベント名
	 * @param page ページ
	 * @return result boolean
	 */
	public boolean select(ArrayList<AdminEventListDTO> AdminEventList, String name ,int page) {
		boolean result = false;
		con = dbCon.getConnection();
		PreparedStatement ps;
		ResultSet rs;
		String sql ;

		try {
			if(name == null || "".equals(name)){
				sql = "SELECT * FROM event WHERE delete_flag = 0 ORDER BY created_at DESC limit 5 offset ?";
				ps= con.prepareStatement(sql);
				ps.setInt(1, page);
				rs = ps.executeQuery();
			}else{
				sql = "SELECT * FROM event WHERE name LIKE ? AND delete_flag = 0 ORDER BY created_at DESC limit 5 offset ?";
				ps= con.prepareStatement(sql);
				ps.setString(1,"%" + name + "%");
				ps.setInt(2, page);
				rs = ps.executeQuery();
			}
			while (rs.next()) {
				AdminEventListDTO dto = new AdminEventListDTO();
				dto.setId(rs.getInt("id"));
				dto.setName(rs.getString("name"));
				dto.setDetail(rs.getString("detail"));
				dto.setEventDate(rs.getString("event_date"));
				dto.setPrice(rs.getString("price"));
				dto.setNumOfTickets(rs.getInt("num_of_tickets"));
				dto.setRemaining(rs.getInt("remaining"));
				dto.setCreatedAt(rs.getString("created_at"));
				dto.setUpdatedAt(rs.getString("updated_at"));
				dto.setCategoryId(rs.getInt("category_id"));
				dto.setImgPath(rs.getString("img_path"));
				AdminEventList.add(dto);
				result = true;
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
		return result;
	}
}
