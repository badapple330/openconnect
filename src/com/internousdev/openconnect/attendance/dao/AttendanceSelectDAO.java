/**
 *
 */
package com.internousdev.openconnect.attendance.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.openconnect.attendance.dto.AttendanceDTO;
import com.internousdev.util.DBConnector;
import com.mysql.jdbc.PreparedStatement;

/**
 * DBの情報を画面に表示する為のクラス
 * @author MINORI SUNAGAWA
 * @since 2016/09/04
 * @version 1.0
 */
public class AttendanceDAO {

	/**
	 * 勤怠リスト
	 */
	private ArrayList<AttendanceDTO> list = new ArrayList<AttendanceDTO>();

	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author MINORI SUNAGAWA
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public boolean select(String date){

		boolean result=false;

		Connection conn=new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql").getConnection();

		String sql="select * from attendance where date=?";

		try{
			PreparedStatement ps=(PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, date);
			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				AttendanceDTO dto=new AttendanceDTO();
				dto.setDate(rs.getString("date"));
				dto.setId(rs.getInt("id"));
				dto.setAttendance(rs.getInt("attendance"));
				dto.setInterview(rs.getInt("interview"));
				list.add(dto);
				result=true;
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
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author MINORI SUNAGAWA
	 */
	public void select(){

	}

	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return list
	*/
	public ArrayList<AttendanceDTO> getList(){
		return list;
	}
	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param list
	*/
	public void setList(ArrayList<AttendanceDTO> list){
		this.list = list;
	}

}
