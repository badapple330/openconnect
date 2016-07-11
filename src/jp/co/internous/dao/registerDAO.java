package jp.co.internous.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import jp.co.internous.util.DBconnector;

/**
 * 新規登録情報を格納するためのDAO
 *
 * @author YUKI MAEDA
 * @since 2016/07/11
 */
public class registerDAO {

	/**
	 * 挿入メソッド 指定された情報をDBに接続して挿入するメソッド
	 *
	 * @author YUKI MAEDA
	 * @param user_id
	 *            ユーザーID
	 * @param password
	 *            パスワード
	 * @param name
	 *            名前
	 * @param name_f
	 *            名前(ふりがな)
	 * @param postal
	 *            郵便番号
	 * @param address
	 *            住所
	 * @param tel_number
	 *            代表者
	 * @param email
	 *            メールアドレス
	 * @param sex
	 *            性別
	 * @param birthday
	 *            誕生日
	 * @param register_day
	 *            登録日
	 * @param update_day
	 *            更新日
	 * @param userdel_flg
	 *            ユーザー削除フラグ
	 * @param login_flg
	 *             ログインフラグ
	 * @param user_flg
	 *             ユーザーフラグ
	 * @return result 挿入に成功したら1以上、失敗したら0
	 */
	public int insert(String user_id, String password, String name, String name_f, String postal,
			String address, String tel_number, String email, String sex, String birthday) {
		int result = 0;
		new DBconnector();
		Connection con = DBconnector.getConnection();

		String sql = "insert into user(user_id, password, name, name_f, postal, address,"
				+ "tel_number, email, sex, birthday, register_day, update_day,"
				+ "userdel_flg, login_flg, user_flg)"
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String registerDay = sdf.format(System.currentTimeMillis());

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_id);
			ps.setString(2, password);
			ps.setString(3, name);
			ps.setString(4,name_f);
			ps.setString(5, postal);
			ps.setString(6, address);
			ps.setString(7, tel_number);
			ps.setString(8, email);
			ps.setString(9, sex);
			ps.setString(10, birthday);
			ps.setString(11, registerDay);
			ps.setString(12, "0000/00/00 00:00:00");
			ps.setBoolean(13, false);
			ps.setBoolean(14, false);
			ps.setInt(15, 1);
			result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 抽出メソッド
	 * 指定されたログインＩＤが存在するかＤＢに接続して調べる
	 *
	 * @author YUKI MAEDA
	 * @param user_id
	 *            ユーザーID
	 * @return 存在したらtrue、存在しなければfalse
	 */
	public boolean selectByUserId(String user_id) {
		boolean result = false;

		new DBconnector();
		Connection con = DBconnector.getConnection();

		String sql = "select * from user where user_id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
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
