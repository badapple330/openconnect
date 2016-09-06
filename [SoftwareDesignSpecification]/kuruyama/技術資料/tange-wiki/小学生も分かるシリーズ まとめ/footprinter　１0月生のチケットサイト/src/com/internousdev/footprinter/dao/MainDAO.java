package com.internousdev.footprinter.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.internousdev.footprinter.dto.MainDTO;
import com.internousdev.footprinter.util.DBConnector;

/**
 * MainDAO DBに接続して新着イベント情報6件を取得するクラス
 * @author 北山 菜穂
 * @since  1.0
 * @version 1.0
 */
public class MainDAO {

	/**
	 * DBに接続して新着イベント情報6件を取得し、Listに3件ずつ格納
	 * @param newtourList_1 イベント情報一列目の3件
	 * @param newtourList_2 イベント情報二列目の3件
	 * @param language アクセス元言語
	 * @return result boolean
	 */
	public boolean select(ArrayList<MainDTO> newtourList_1,ArrayList<MainDTO> newtourList_2,String language){
		boolean result = false;
		DBConnector db = new DBConnector("footprinter");
		String date_pattern_ja = "yyyy/MM/dd";
		String date_pattern_en = "dd/MM/yyyy";
		DecimalFormat format = new DecimalFormat("0.#");
		Connection con = null;
		con = db.getConnection();
		String sql = "SELECT * FROM event ORDER BY event_date DESC LIMIT 6";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			int count = 0;
			while(rs.next()) {
				MainDTO dto = new MainDTO();
				dto.setId(rs.getInt("id"));
				dto.setName(rs.getString("name"));
				float price = rs.getFloat("price");
				String eventdate = null;
				if("en".equals(language)){
					eventdate = new SimpleDateFormat(date_pattern_en).format(rs.getDate("event_date"));
					price = (float) (price * 0.23);
				}else{
					eventdate = new SimpleDateFormat(date_pattern_ja).format(rs.getDate("event_date"));
					format.format(price);
				}
				
				DecimalFormat decimalFormat = new DecimalFormat("0.##");
				String detail = rs.getString("detail");
				if(detail.length() > 30){
					detail = detail.substring(0,30);
				}
				dto.setDate(eventdate);
				dto.setPrice(decimalFormat.format(price));
				dto.setDetail(detail);
				dto.setImgPath(rs.getString("img_path"));
				if(count < 3){
					newtourList_1.add(dto);
				}else{
					newtourList_2.add(dto);
				}
				count++;
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
}