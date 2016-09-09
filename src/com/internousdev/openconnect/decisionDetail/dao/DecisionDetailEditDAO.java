package com.internousdev.openconnect.decisionDetail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.decisionDetail.dto.DecisionDetailCheckDTO;
import com.internousdev.openconnect.decisionDetail.dto.DecisionDetailDTO;
import com.internousdev.util.DBConnector;
/**
 * 表示したい内容を、DBから取り出しDTOへ転送する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */
public class DecisionDetailEditDAO {

	/**
	 * 決裁手続きリスト
	 */
	private List<DecisionDetailDTO> decisionDetailList=new ArrayList<DecisionDetailDTO>();
	 /**
     * 表示メソッド  表示したい内容を、DBから取り出しDTOへ転送する為のメソッド
     * @author TATUHUMI ITOU
     * @return  projectList 抽出に成功したらSUCCESS、失敗したらERROR
     */
	public List<DecisionDetailDTO> select(int decisionDetailId) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con = db.getConnection();

		try {
			String sql="select*from decision_detail inner join projects on decision_detail.project_id = projects.project_id where decision_detail_id =?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, decisionDetailId);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				 DecisionDetailDTO dto = new DecisionDetailDTO();
				 dto.setDecisionDetailId(rs.getInt("decision_detail_id"));
				dto.setProjectName(rs.getString("project_name"));
				dto.setDecisionId(rs.getInt("decision_id"));
				dto.setDecisionType(rs.getString("decision_type"));
				dto.setDecisionStatus(rs.getString("decision_status"));
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


	public boolean check(int decisionDetailId,String password){

		boolean result = false;

		DBConnector db =new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con =db.getConnection();
		DecisionDetailCheckDTO dto =new DecisionDetailCheckDTO();

		String sql="select*from decision_detail where decision_detail_id=? and password=?";
		try{
			PreparedStatement ps =con.prepareStatement(sql);
			ps.setInt(1,decisionDetailId);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
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
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return decisionDetailList
	*/
	public List<DecisionDetailDTO> getDecisionDetailList() {
		return decisionDetailList;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param decisionDetailList
	*/
	public void setDecisionDetailList(List<DecisionDetailDTO> decisionDetailList) {
		this.decisionDetailList = decisionDetailList;
	}


}