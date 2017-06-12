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
public class DecisionDetailPreviewDAO {

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
			String sql = "select*from decision inner join projects on decision.project_id = projects.project_id "
					+ "inner join users on decision.user_id = users.user_id where decision_id =?";
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
				try { dto.setDay(sdf.format(rs.getDate("day")).toString()); }catch(Exception e){}
				dto.setUserId(rs.getInt("user_id"));
				dto.setDecisionName(rs.getString("decision_name"));
				dto.setSummary(rs.getString("summary"));
				dto.setCause(rs.getString("cause"));
				try { dto.setStartDay(sdf.format(rs.getDate("start_day")).toString()); }catch(Exception e){}
				try { dto.setEndDay(sdf.format(rs.getDate("end_day")).toString()); }catch(Exception e){}
				dto.setPlan(rs.getString("plan"));
				dto.setPersons(rs.getInt("persons"));
				dto.setFamilyNameKanji(rs.getString("family_name_kanji"));
				dto.setGivenNameKanji(rs.getString("given_name_kanji"));
				dto.setPassword(rs.getString("password"));
				//開発端末
				dto.setDevelopmentTerminal((rs.getInt("persons"))*8);
				//開発要員
				dto.setDevelopmentPersonnel((rs.getInt("persons"))*100);
				//建設費用
				dto.setDevelopmentPersonnelSum((rs.getInt("persons"))*100+58);
				//損益費用
				dto.setProfitAndLossCost((rs.getInt("persons"))*100+1);
				//合計
				dto.setSum((rs.getInt("persons"))*100+58+(rs.getInt("persons"))*100+1);



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
	 * 取得メソッド 決裁手続きリストを取得
	 * @author TATUHUMI ITOU
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