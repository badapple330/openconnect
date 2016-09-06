package com.internousdev.footprinter.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.internousdev.footprinter.dto.EventEntryRegistrationDTO;
import com.internousdev.footprinter.util.DBConnector;

/**
 * 管理者イベント登録用DAO
 * @author 北山 菜穂
 * @since 1.0
 * @version 1.0
 */
public class EventEntryRegistrationDAO {

	/**
	 * 入力されたイベント情報をDBに登録
	 * @param dto イベント情報が入力されているEventEntryRegistrationDTO
	 * @return result
	 */
	public int insert(EventEntryRegistrationDTO dto){
	    int result = 0;
		DBConnector dbCon = new DBConnector("footprinter");
		Connection con = null;
		con = dbCon.getConnection();
		String sql = "INSERT INTO event (name,event_date,price,num_of_tickets,remaining,detail,img_path,category_id,created_at,updated_at) value (?,?,?,?,?,?,?,?,?,?)";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,dto.getEventName());
			ps.setString(2,dto.getEventDate());
			ps.setDouble(3,dto.getPrice());
			ps.setInt(4,dto.getNumOfTickets());
			ps.setInt(5,dto.getNumOfTickets());
			ps.setString(6,dto.getEventDetail());
			ps.setString(7,dto.getImgPath());
			ps.setInt(8,dto.getCategory());
			Date today = new Date();
			SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
			String date = format.format(today);
			ps.setString(9,date);
			ps.setString(10,date);
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
