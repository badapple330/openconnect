/*
 * タイトル：選択された商品名を元に、その商品の詳細情報を取得する処理
 * 説明    ：ユーザーが選択した商品名を元に、その商品の詳細情報を取得する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.kinnosawa.dto.GoItemDetailsDTO;
import com.internousdev.kinnosawa.util.DBConnector;

/**
 * 商品詳細画面に表示する情報を取得する為のクラス
 * @author S.Kobata
 * @version 1.0
 * @since 1.0
 */
public class GoItemDetailsDAO {

	/**
	 * 商品名から商品詳細情報を取得する為のメソッド
	 * @param name 商品名
	 * @param dto 商品詳細を格納するクラスのインスタンス
	 * @return result 商品詳細情報を取得できればtrue、できなければfalseを返す
	 */
	public boolean select(String name,GoItemDetailsDTO dto){

		boolean result = false;
		Connection conn = DBConnector.getConnection();
		String sql = "SELECT * FROM goods WHERE name = \""+name+"\"";
		PreparedStatement ps;

		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				dto.setId(rs.getInt("id"));
				dto.setName(rs.getString("name"));
				dto.setPrice((int)(rs.getFloat("price")));
				dto.setDetail(rs.getString("detail"));
				dto.setImgPath(rs.getString("img_path"));
				dto.setSetImgPath(rs.getString("set_img_path"));
				dto.setAllergie(rs.getString("allergie"));
			}
			result = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}
