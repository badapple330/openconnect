package com.internousdev.rewrite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.rewrite.dto.GetAddressDTO;
import com.internousdev.util.DBConnector;
/**
 * AdminUserDAO
 * 管理者がユーザーのレビューを管理するクラス
 * @author TATUHUMI ITO
 * @since 2016/08/18
 * @version1.0
 */
public class AdminUserDAO {
	/**
	 * データベースに格納されていユーザーリスト
	 */
	private List<GetAddressDTO>UserList=new ArrayList<GetAddressDTO>();
	/**
	 * DBから必要な情報を集めてくるメソッド
	 * @author TATUHUMI ITOU
	 * @since 2016/08/18
	 */
	public List<GetAddressDTO> select() {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "rewrite", "root","mysql");
		Connection con = db.getConnection();

		try {
			String sql="SELECT user_id,name,email,user_flg FROM user ";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				GetAddressDTO dto = new GetAddressDTO();
				dto.setUserId(rs.getInt("user_id"));
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));
				dto.setUserFlg(rs.getInt("user_flg"));

				UserList.add(dto);
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
		return UserList;
	}
	/**
     * ユーザーリスト取得メソッド
     * @author TATUHUMI ITO
     * @param UserList
     */
	public List<GetAddressDTO> getUserList() {
		return UserList;
	}
	/**
     * ユーザーリスト格納メソッド
     * @author TATUHUMI ITO
     * @param userList
     */
	public void setUserList(List<GetAddressDTO> userList) {
		UserList = userList;
	}


}