package com.internousdev.footprinter.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.footprinter.util.DBConnector;
/**
 * データベースから選択された情報を削除する
 * @author 冨内 峻太朗
 * @version 1.0
 * @since version 1.0
 */
public class AdminEventDeleteDAO {
	/**
	 * コネクション
	 */
	private Connection con = null;
	/**
	 * DBConnectorのインスタンス
	 */
	private DBConnector dbCon = new DBConnector("footprinter");
	
	/**
	 * deleteIdの値でデータベースから削除処理を行う
	 * @param deleteId デリートするuserId
	 * @return result 結果
	 */
	public int delete(int deleteId) {
		con = dbCon.getConnection();
		int result = 0;
		try {
			String sql = "update event SET delete_flag = 1 where id = ?";
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