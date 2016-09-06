package com.internousdevwork.mackeypark.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdevwork.mackeypark.dto.GetItemIdDTO;
import com.internousdevwork.mackeypark.util.DBConnector;;

/**
 * MySQLのデータを取得する為のクラス
 * @author MOTONORI TATESHITA
 * @since 1.0
 * @version 1.0
 */
public class GetItemIdDAO {

	/**
	 * 商品ID一覧情報を格納するリスト
	 */
	private ArrayList<GetItemIdDTO> selectList = new ArrayList<>();

	/**
	 * MySQLのデータを取得する為のメソッド
	 * @return result 取得できたらリストに格納してtrue、できなかったらfalseを返します。
	 */
	public boolean selectMySQL(String ta,String DBp,String da) {


		boolean result = false;



		Connection connection = ( Connection )DBConnector.getConnection("park");

		String sql = "select item_id from ticket where item_name = '"+DBp+"("+ta+")' and design = '"+da+"'";

		GetItemIdDTO dto = new GetItemIdDTO();

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				dto.setItemid(rs.getString("item_id"));
				selectList.add(dto);
				System.out.println(rs.getString("item_id"));
				result = true;
			}
			System.out.println(dto.getItemid());
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
	 * 商品IDリストを取得する為のメソッド
	 * @return selectList 値段ーリスト
	 */
	public ArrayList<GetItemIdDTO> getSelectList() {
		return selectList;
	}

	/**
	 * 商品IDを格納する為のメソッド
	 * @param selectList 値段リスト
	 */
	public void setSelectList(ArrayList<GetItemIdDTO> selectList) {
		this.selectList = selectList;
	}
}