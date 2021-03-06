package com.internousdev.openconnect.decision.edit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;
/**
 * 表示したい内容を、DBから取り出しDTOへ転送する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */
public class DecisionEditUpdateDAO {

	/**
	 * 決裁手続きリスト
	 */
	/**
	 * 表示メソッド  表示したい内容を、DBから取り出しDTOへ転送する為のメソッド
	 * @author TATUHUMI ITOU
	 * @return  projectList 抽出に成功したらSUCCESS、失敗したらERROR
	 */

	public int update(String day,String decisionType,int userId,String itemName,
			String summary,String cause,String startDay,String endDay,String plan,String persons,int decisionDetailId) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con = db.getConnection();
			int count = 0;
			String sql = "UPDATE decision_detail SET day=?,decision_type=?,user_id=?,item_name=?,summary=?,cause=?,start_day=?,end_day=? ,plan=? ,persons=? WHERE decision_detail_id=?";

			try{
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1,day);
				ps.setString(2,decisionType);
				ps.setInt(3,userId);
				ps.setString(4,itemName);
				ps.setString(5,summary);
				ps.setString(6,cause);
				ps.setString(7,startDay);
				ps.setString(8,endDay);
				ps.setString(9,plan);
				ps.setString(10,persons);
				ps.setInt(11,decisionDetailId);
				count =ps.executeUpdate();

			}catch (SQLException e) {
				e.printStackTrace();
			}finally{
				try{
					con.close();
				}catch (SQLException e){
					e.printStackTrace();
				}
			}
			return count;
		}
	}
