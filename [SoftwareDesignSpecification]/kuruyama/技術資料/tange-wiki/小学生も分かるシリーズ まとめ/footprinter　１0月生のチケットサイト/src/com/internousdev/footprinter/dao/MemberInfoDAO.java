package com.internousdev.footprinter.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.internousdev.footprinter.util.DBConnector;

/**
 * 新規登録時、登録情報に重複が無いようにデータベース内を検索するDAOクラス
 * @author 田原 一樹
 * @since  1.0
 * @version 1.0
 */
public class MemberInfoDAO {
	
	/**
	 * DBコネクター
	 */
	private DBConnector dbCon = new DBConnector("footprinter");
	
	/**
	 * コネクション
	 */
	private Connection con = null;
	
	/**
	 * データベース内に既に登録されているemailの値があるか参照するためのメソッド
	 * @param email メールアドレス
	 * @param pass パスワード
	 * @return result
	 */
	public boolean isExists(String email,String pass){
		boolean result = true;
		con = dbCon.getConnection();
		String sql = "SELECT email,password FROM user WHERE email = ? AND password = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, email);;
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				result = false;
			}
		}catch (SQLException e){
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
