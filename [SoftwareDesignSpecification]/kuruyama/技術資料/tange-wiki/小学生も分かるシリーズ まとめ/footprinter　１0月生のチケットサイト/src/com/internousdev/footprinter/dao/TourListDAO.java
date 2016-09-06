package com.internousdev.footprinter.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.internousdev.footprinter.dto.TourListDTO;
import com.internousdev.footprinter.util.DBConnector;

/**旅一覧に必要な情報を取得するクラス
 * @author 小澤 竜樹
 * @since 1.0
 * @version 1.0
 */
public class TourListDAO {
	/**
	 * DBアクセス
	 */
	private DBConnector dbCon = new DBConnector("footprinter");
	/**
	 * DBアクセス
	 */
	private Connection con = null;

	/**　
	 * 大陸別のIDを参照し、表示内容を変え、pageを参照し、offsetを変える　langの値によってprice event＿dateの表記を変えるメソッド
	 * @param tourList 配列
	 * @param categoryId 大陸別のID
	 * @param page ページ
	 * @param lang 言語
	 * @return result false
	 */
	public boolean select(ArrayList<TourListDTO> tourList, int categoryId, int page, String lang){
		boolean result = false;
		PreparedStatement ps = null;
		con = dbCon.getConnection();
		DecimalFormat format = new DecimalFormat("0.#");
		String date_pattern = "yyyy/MM/dd";
		String date_pattern2 = "dd/MM/yy";

		if (categoryId != 0) {
			String sql = "SELECT * FROM event WHERE category_id = ? AND delete_flag = 0 ORDER BY created_at DESC limit 5 offset ?";
			try {
				ps = con.prepareStatement(sql);
				ps.setInt(1, categoryId);
				ps.setInt(2, page);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			String sql = "SELECT * FROM event WHERE delete_flag = 0 ORDER BY created_at DESC limit 5 offset ?";
			try {
				ps = con.prepareStatement(sql);
				ps.setInt(1, page);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		try {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				TourListDTO dto = new TourListDTO();
				float price = rs.getFloat("price");
				String eventdate = null;
				if ("en".equals(lang)) {
					price = (float) (price * 0.16);
					eventdate = new SimpleDateFormat(date_pattern2).format(rs.getDate("event_date"));
				} else {
					format.format(price);
					eventdate = new SimpleDateFormat(date_pattern).format(rs.getDate("event_date"));
				}

				dto.setName(rs.getString("name"));
				dto.setId(rs.getInt("id"));
				dto.setDetail(rs.getString("detail"));
				dto.setImgPath(rs.getString("img_path"));
				dto.setCategoryId(rs.getInt("Category_id"));
				dto.setEventDate(eventdate);
				DecimalFormat decimalFormat = new DecimalFormat("0.##");
				dto.setPrice(decimalFormat.format(price));
				tourList.add(dto);
			}
			result = true;
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