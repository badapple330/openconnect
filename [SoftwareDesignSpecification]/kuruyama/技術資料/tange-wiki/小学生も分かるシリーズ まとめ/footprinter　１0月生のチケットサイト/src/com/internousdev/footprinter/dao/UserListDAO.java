package com.internousdev.footprinter.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.footprinter.dto.UserListDTO;
import com.internousdev.footprinter.util.DBConnector;

/**
 * ユーザー一覧に必要な情報を取得するクラス
 * @author 小澤 竜樹
 * @since 1.0
 * @version 1.0
 */
public class UserListDAO {

	/**
	 * DBから名前を参照、pageを参照し、offsetを変えるメソッド
	 * @param UserList ユーザー情報格納用配列
	 * @param page ページ
	 * @param name 名前
	 * @return result boolean
	 */

	public boolean select(ArrayList<UserListDTO> UserList, int page, String name) {
		boolean result = false;
		DBConnector dbCon = new DBConnector("footprinter");
		Connection con = null;
		con = dbCon.getConnection();
		PreparedStatement ps;
		ResultSet rs;
		String sql;
		try {
			if (name == null|| "".equals(name)) {
				sql = "SELECT * FROM user WHERE delete_flag = 0 ORDER BY created_at DESC LIMIT 5 OFFSET ?";
				ps = con.prepareStatement(sql);
				ps.setInt(1, page);
				rs = ps.executeQuery();
			} else {
				sql = "SELECT * FROM user WHERE name LIKE ? AND delete_flag = 0 ORDER BY created_at DESC limit 5 offset ?";
				ps = con.prepareStatement(sql);
				ps.setString(1,"%"+name+"%");
				ps.setInt(2, page);
				rs = ps.executeQuery();
			}
			while (rs.next()) {
				UserListDTO dto = new UserListDTO();
				dto.setId(rs.getInt("id"));
				dto.setEmail(rs.getString("email"));
				dto.setName(rs.getString("name"));
				dto.setNameKana(rs.getString("name_kana"));
				dto.setTel(rs.getString("tel"));
				dto.setPostalCode(rs.getString("postal_code"));
				dto.setAddress(rs.getString("address"));
				dto.setCreditToken(rs.getString("credit_token"));
				dto.setCreditNum(rs.getString("credit_num"));
				dto.setUniqueId(rs.getString("unique_id"));
				dto.setOauthName(rs.getString("oauth_name"));
				dto.setCreatedAt(rs.getString("created_at"));
				dto.setUpdatedAt(rs.getString("updated_at"));
				UserList.add(dto);
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
