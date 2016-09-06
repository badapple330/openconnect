/*
 * タイトル：選択されたカテゴリーから商品一覧情報を取得する処理
 * 説明    ：ユーザーにカテゴリーを選択してもらいそれを元に検索する。
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
import java.util.ArrayList;

import com.internousdev.kinnosawa.dto.GoItemDTO;
import com.internousdev.kinnosawa.util.DBConnector;


/**
 * 商品一覧画面に表示する情報を取得する為のクラス
 * @author S.Kobata
 * @version 1.0
 * @since 1.0
 */
public class GoItemDAO {

	/**
	 * 商品リスト
	 */
	private ArrayList<GoItemDTO> list = new ArrayList<GoItemDTO>();

	/**
	 * 商品カテゴリーから商品情報を取得する為のメソッド
	 * @param category 商品カテゴリー
	 * @return result 商品情報を取得できればtrue、できなければfalseを返す
	 */
	public boolean select(String category){

		boolean result = false;
		String choices = "金沢のイチオシ一覧";
		String sql = null;
		Connection conn = DBConnector.getConnection();

		if(category.equals(choices)){
			sql = "SELECT * FROM goods WHERE close_up = 1";
		}else{
			sql = "SELECT * FROM goods WHERE category = '"+category+"'";
		}
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				GoItemDTO dto = new GoItemDTO();
				dto.setName(rs.getString("name"));
				dto.setPrice((int)(rs.getFloat("price")));
				dto.setImgPath(rs.getString("img_path"));
				list.add(dto);
				result = true;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 商品リストを取得する為のメソッド
	 * @return list 商品リスト
	 */
	public ArrayList<GoItemDTO> getList() {
		return list;
	}

	/**
	 * 商品リストを格納する為のメソッド
	 * @param list 商品リスト
	 */
	public void setList(ArrayList<GoItemDTO> list) {
		this.list = list;
	}
}
