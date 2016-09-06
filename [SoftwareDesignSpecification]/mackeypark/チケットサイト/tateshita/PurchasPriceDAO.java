package com.internousdevwork.mackeypark.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdevwork.mackeypark.dto.PurchasPriceDTO;
import com.internousdevwork.mackeypark.util.DBConnector;;

/**
 * MySQLのデータを取得する為のクラス
 * @author SAORI MAEKAWA
 * @since 1.0
 * @version 1.0
 */
public class PurchasPriceDAO {

	/**
	 * 値段一覧情報を格納するリスト
	 */
	private ArrayList<PurchasPriceDTO> selectList = new ArrayList<>();

	/**
	 * MySQLのデータを取得する為のメソッド
	 * @return result 取得できたらリストに格納してtrue、できなかったらfalseを返します。
	 */
	public boolean selectMySQL() {


		boolean result = false;

		Connection connection = ( Connection )DBConnector.getConnection("park");
		String sql = "select price from ticket where item_name = '1日(大人)' group by item_name";
		PurchasPriceDTO dto = new PurchasPriceDTO();
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				dto.setPrice(rs.getString("price"));
				selectList.add(dto);
				result = true;
			}
			System.out.println(dto.getPrice());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 値段リストを取得する為のメソッド
	 * @return selectList 値段ーリスト
	 */
	public ArrayList<PurchasPriceDTO> getSelectList() {
		return selectList;
	}

	/**
	 * ユーザーリストを格納する為のメソッド
	 * @param selectList 値段リスト
	 */
	public void setSelectList(ArrayList<PurchasPriceDTO> selectList) {
		this.selectList = selectList;
	}
}