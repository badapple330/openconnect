/*
 * タイトル：データベースから管理者ID,パスワードを検索し、判定する為の処理
 * 説明    ：データベースから管理者ID,パスワードを検索し、判定する
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.kinnosawa.util.DBConnector;

/**管理者ログインを判定する為のクラス
 * @author S.Makino
 * @version 1.0
 * @since 1.0
 */
public class AdminLogInDAO {

	/**
	 * 管理者ログインでIDとPASSWORDがあっているか判定するためのメソッド
	 * @param id 管理者ID
	 * @param password パスワード
	 * @return result 入力された値ががデータベース内に存在していればtrue、なければfalseを返す
	 */
		public boolean Login(int id,String password){

			boolean result= false;
			Connection con=DBConnector.getConnection();
			String sql="SELECT id,password FROM admin WHERE id=? AND password=?";

			try{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1,id);
				ps.setString(2,password);
				ResultSet rs =ps.executeQuery();
				if(rs.next()){
					result=true;
				}
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				try{
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
			return result;
		}

}
