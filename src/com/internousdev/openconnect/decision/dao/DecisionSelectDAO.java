package com.internousdev.openconnect.decision.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.internousdev.openconnect.decision.dto.DecisionDTO;
import com.internousdev.util.DBConnector;
/**
 * 決裁状況一覧をActionから受け取った検索文で検索するクラス
 * @author KENICHI HORIGUCHI,KOUHEI NIRABARU
 * @since 2016/09/14
 * @version 1.0
 */
public class DecisionSelectDAO {
	/**
	 * 決裁状況一覧情報を格納するリスト
	 * @author  KENICHI HORIGUCHI
	 */
	private ArrayList<DecisionDTO> list = new ArrayList<DecisionDTO>();
	/**
	 * 表示メソッド ログインした際にDBからサイト情報をリスト化して抽出し、DTOに格納する
	 * @author KENICHI HORIGUCHI,KOUMEI IWAMOTO
	 * @return  searchString
	 */
	public boolean select(String searchString ) {
		boolean result = false;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		String sql = "select * from decision inner join users on decision.user_id = users.user_id inner join projects on decision.project_id = projects.project_id where decision_name like'%" + searchString + "%'";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				DecisionDTO dto = new DecisionDTO();
				dto.setRegistration(sdf.format( rs.getDate("registration") ).toString());
				dto.setUserId(rs.getInt("user_id"));
				dto.setProjectId(rs.getInt("project_id"));
				dto.setDecisionId(rs.getString("decision_id"));
				dto.setDecisionIdNumber(String.format("%04d", rs.getInt("decision_id")));
				dto.setDecisionName(rs.getString("decision_name"));
				dto.setDetail(rs.getString("detail"));
				dto.setIDraftingId(rs.getString("i_drafting_id"));
				dto.setIApprovalId(rs.getString("i_approval_id"));
				dto.setADraftingId(rs.getString("a_drafting_id"));
				dto.setCdId(rs.getString("cd_id"));
				dto.setIADId(rs.getString("i_a_d_id"));
				dto.setIAId(rs.getString("i_a_id"));
				dto.setFamilyNameKanji(rs.getString("family_name_kanji"));
				dto.setGivenNameKanji(rs.getString("given_name_kanji"));
				dto.setProjectName(rs.getString("project_name"));






				list.add(dto);
				result = true;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 取得メソッド リスト
	 * @author KENICHI HORIGUCHI
	 * @return list
	 */
	public ArrayList <DecisionDTO> getList() {
		return list;
	}

	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param list
	 */
	public void setList( ArrayList <DecisionDTO> list ) {
		this.list = list;
	}

}
