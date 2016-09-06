/*
 * タイトル :DBから商品情報を取得する為の処理
 * 説明    ：DBから商品情報を取得する
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 *変更履歴：
 */
package com.internousdev.kinnosawa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.kinnosawa.dto.GoTopPageDTO;
import com.internousdev.kinnosawa.util.DBConnector;

/**
 * DBから商品情報を取得する為のクラス
 * @author S.Sugimoto
 * @version 1.0
 * @since 1.0
 */
public class GoTopPageDAO {

	/**
	 * トップページに表示する季節のオススメを格納するリスト
	 */
	private ArrayList<GoTopPageDTO> itemList = new ArrayList<GoTopPageDTO>();

	/**
	 * DBから商品情報を取得する為のメソッド
	 * @return result 商品情報を取得出来ていたらtrue、falseを返す
	 */
	public boolean select(){

		boolean result = false;
		Connection con = DBConnector.getConnection();
		String sql = "SELECT name,img_path FROM goods WHERE top_page = 1";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				GoTopPageDTO dto = new GoTopPageDTO();
				dto.setName(rs.getString("name"));
				dto.setImgPath(rs.getString("img_path"));
				itemList.add(dto);
				result = true;
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

	/**
	 * トップページに表示する季節のオススメリストを取得する為のメソッド
	 * @return itemList	トップページに表示する季節のオススメを格納するリスト
	 */
	public ArrayList<GoTopPageDTO> getTopPage() {
		return itemList;
	}

	/**
	 * トップページに表示する季節のオススメリストを格納する為のメソッド
	 * @param itemList トップページに表示する季節のオススメを格納するリスト
	 */
	public void setList(ArrayList<GoTopPageDTO> itemList) {
		this.itemList = itemList;
	}

}