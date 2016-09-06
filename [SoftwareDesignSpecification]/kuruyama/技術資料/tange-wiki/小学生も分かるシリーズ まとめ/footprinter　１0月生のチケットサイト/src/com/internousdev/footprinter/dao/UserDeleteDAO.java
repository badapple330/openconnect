package com.internousdev.footprinter.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.internousdev.footprinter.util.DBConnector;

/**ユーザー削除に必要な情報を取得するメソッド
 * @author 小澤 竜樹
 * @since 1.0
 * @version 1.0
 */
public class UserDeleteDAO {
	/**
	 * コネクション
	 */
	private Connection con = null;
	/**
	 * DBアクセス
	 */
	private DBConnector dbCon = new DBConnector("footprinter");
	/**
	 * IDを参照し情報を削除するメソッド
	 * @param deleteId 削除対象ユーザーId
	 * @return result
	 */
	public int delete(int deleteId) {
		con = dbCon.getConnection();
		int result = 0;
		try {
			String sql = "update user SET delete_flag = 1 where id = ?";
			PreparedStatement ps;
			ps = con.prepareStatement(sql);
			ps.setInt(1, deleteId);
			result = ps.executeUpdate();
		} catch (Exception e) {
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