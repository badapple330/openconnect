
package com.internousdev.bulletinboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.bulletinboard.util.DBConnector;



/**
 * ログアウトに関するクラス
 * @author Miyauchi Akitomo
 * @since 2017/05/15
 * @version 1.0
 */
public class LogoutDAO {

	/**
	 * userIdのlogin_flgを引数loginFlgに更新するメソッド（基本loginFlg=false）
	 * @param userId ユーザーＩＤ
	 * @param loginFlg ログインフラグ
	 * @return count 正しく動作すれば変更を行った行数、errorならば0を返す
	 * @author Miyauchi Akitomo
	 * @since 2017/05/15
	 * @version 1.0
	 */
	public int update(int userId, boolean loginFlg){
		int count = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "bulletinboard", "root", "mysql");
		Connection con = db.getConnection();

		String sql = "update users set login_flg=? where user_id=?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setBoolean(1, loginFlg);
			ps.setInt(2, userId);
			count = ps.executeUpdate();
			return count;
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
 		return count;
	}


}
