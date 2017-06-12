package com.internousdev.openconnect.decision.detail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.decision.detail.dto.DecisionDetailDTO;
import com.internousdev.util.DBConnector;
/**
 * 表示したい内容を、DBから取り出しDTOへ転送する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */
public class DecisionDetailUpdateDAO {

	/**
	 * 決裁手続きリスト
	 */
	private List<DecisionDetailDTO> decisionDetailList=new ArrayList<DecisionDetailDTO>();
	 /**
     * 表示メソッド  表示したい内容を、DBから取り出しDTOへ転送する為のメソッド
     * @author TATUHUMI ITOU
     */
	public List<DecisionDetailDTO> select(int decisionId) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con = db.getConnection();

		try {
			String sql = "select * from decision inner join projects on decision.project_id = projects.project_id where decision_id =?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, decisionId);
			ResultSet rs = ps.executeQuery();

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

			while (rs.next()) {
				 DecisionDetailDTO dto = new DecisionDetailDTO();
				dto.setDecisionId(rs.getInt("decision_id"));
				dto.setProjectName(rs.getString("project_name"));
				dto.setDecisionType(rs.getString("decision_type"));
				dto.setDecisionStatus1(rs.getInt("decision_status1"));
				dto.setDecisionStatus2(rs.getInt("decision_status2"));
				dto.setProjectId(rs.getInt("project_id"));
				try {dto.setDay(sdf.format(rs.getDate("day")).toString()); }catch(Exception e){}
				dto.setUserId(rs.getInt("user_id"));
				dto.setDecisionName(rs.getString("decision_name"));
				dto.setSummary(rs.getString("summary"));
				dto.setCause(rs.getString("cause"));
				try { dto.setStartDay(sdf.format(rs.getDate("start_day")).toString()); }catch(Exception e){}
            	try { dto.setEndDay(sdf.format(rs.getDate("end_day")).toString()); }catch(Exception e){}
				dto.setPlan(rs.getString("plan"));
				dto.setPersons(rs.getInt("persons"));
				dto.setPassword(rs.getString("password"));


				 decisionDetailList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return  decisionDetailList;
	}
	 /**
     * 表示メソッド  表示したい内容を、DBから取り出しDTOへ転送する為のメソッド
     * @author TATUHUMI ITOU,KENICHI HORIGUCHI
     */
	public boolean check(int decisionId,String password){

		boolean result = false;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con = db.getConnection();

		String sql = "select * from decision where decision_id=? and password=?";
		try{
			PreparedStatement ps =con.prepareStatement(sql);
			ps.setInt(1,decisionId);
			ps.setString(2,password);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){

				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}

	/**
	* 取得メソッド 決裁手続きリストを取得
	* @author TATUHUMI ITOU,KENICHI HORIGUCHI
	* @return decisionDetailList
	*/
	public List<DecisionDetailDTO> getDecisionDetailList() {
		return decisionDetailList;
	}
	/**
	* 設定メソッド
	* @author TATUHUMI ITOU
	* @param decisionDetailList
	*/
	public void setDecisionDetailList(List<DecisionDetailDTO> decisionDetailList) {
		this.decisionDetailList = decisionDetailList;
	}


}