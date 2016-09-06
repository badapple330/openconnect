/*
 * タイトル：新規登録画面に入力された情報を登録、検索する為の処理
 * 説明    ：MySQLに接続し、登録情報を登録
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *        ：
 */
package com.internousdev.kinnosawa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.internousdev.kinnosawa.util.DBConnector;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
 * 新規登録画面に入力された情報を登録、検索する為のクラス
 * @author K.Sugano
 * @version 1.1
 * @since 1.0
 */
public class SignUpCompletionDAO {

	/**
	 * ID
	 */
	private int id;

	/**
	 * 新規登録画面に入力された情報を登録する為のメソッド
	 * @param email メールアドレス
	 * @param password パスワード
	 * @param name 名前
	 * @param nameKana フリガナ
	 * @param tellNum 電話番号
	 * @param postalCode 郵便番号
	 * @param address 住所
	 * @return count 登録出来れば1,失敗なら0を返す
	 */
	public int insert(String email,String password,String name,String nameKana,String tellNum,String postalCode,String address){

		int count=0;
		Connection con=(Connection) DBConnector.getConnection();
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dt=sd.format(cal.getTime());
		String sql="INSERT INTO user(email,password,name,name_kana,tel_num,postal_code,"
				+"address,created_at,updated_at)value(?,?,?,?,?,?,?,?,?)";

		try{
			PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ps.setString(3, name);
			ps.setString(4, nameKana);
			ps.setString(5, tellNum);
			ps.setString(6, postalCode);
			ps.setString(7, address);
			ps.setString(8, dt);
			ps.setString(9, dt);
			count=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			if(con!=null){
				try{
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		return count;
	}

	/**
	 * 登録された情報からIDを検索する為のメソッド
	 * @param email メールアドレス
	 * @return result 処理が出来たか否かを返す
	 */
	public boolean select(String email){

		boolean result=false;
		Connection con=(Connection) DBConnector.getConnection();
		String sql="SELECT id FROM user WHERE email = ? ";

		try{
			PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, email);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				id=rs.getInt("id");
				result=true;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			if(con!=null){
				try{
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	/**
	 * IDを取得する為のメソッド
	 * @return id ID
	 */
	public int getId() {
		return id;
	}

	/**
	 * IDを出力する為のメソッド
	 * @param id ID
	 */
	public void setId(int id) {
		this.id = id;
	}
}