/*
 * タイトル：ユーザーから指定された商品データを検索する為の処理
 * 説明    ：ユーザーから指定された商品名を元に商品データを検索する
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
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.internousdev.kinnosawa.dto.AdminItemDTO;
import com.internousdev.kinnosawa.util.DBConnector;

/**
 * 検索した商品情報を表示する為のクラス
 * @author K.Hagiwara
 * @version 1.0
 * @since 1.0
 */
public class AdminItemSearchDAO {

/**
 * 商品情報一覧を格納するリスト
 */
	private ArrayList<AdminItemDTO> itemList = new ArrayList<AdminItemDTO>();

	/**
	 * 検索結果を表示する為のメソッド
	 * @param goodsName 検索する商品名
	 * @return result データベースから商品一覧情報を格納できたらtrue できなければfalse
	 */
	public boolean AdminItemSearch(String goodsName) {
		boolean result = false;
		boolean decision;
		Connection conn = DBConnector.getConnection();
		String sql =  "SELECT * FROM goods WHERE name LIKE '%" + goodsName + "%' ORDER BY id DESC" ;
		try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
    			AdminItemDTO dto = new AdminItemDTO();
    			dto.setId(rs.getInt("id"));
    			dto.setName(rs.getString("name"));
    			dto.setPrice(rs.getFloat("price"));
    			dto.setImgPath(rs.getString("img_path"));
    			dto.setSetImgPath(rs.getString("set_img_path"));
    			dto.setAllergie(rs.getString("allergie"));
    			dto.setCategory(rs.getString("category"));
    			decision = (rs.getBoolean("close_up"));
    			if(decision){
    				dto.setCloseUp("○");
    			}else{
    				dto.setCloseUp("×");
    			}
    			String creatdate = new SimpleDateFormat("yyyy'/'MM'/'dd'/'HH':'mm").format(rs.getTimestamp("created_at"));
              	dto.setCreatedDate(creatdate);
              	dto.setDetail(rs.getString("detail"));
              	decision = (rs.getBoolean("top_page"));
    			if(decision){
    				dto.setTopPage("○");
    			}else{
    				dto.setTopPage("×");
    			}
              	itemList.add(dto);
              	result = true;
		}
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		try{
			conn.close();
		}catch(SQLException e){

			e.printStackTrace();
		}
	}
		return result;
}
	/**
	 * 商品情報リストを取得する為のメソッド
	 * @return itemList 商品情報リスト
	 */
	public ArrayList<AdminItemDTO> getItemList(){
		return itemList;
	}

	/**
	 * 商品情報リストを格納する為のメソッド
	 * @param itemList 商品情報リスト
	 */
	public void setItemList(ArrayList<AdminItemDTO> itemList) {
		this.itemList = itemList;
	}
}


