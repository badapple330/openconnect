package com.internousdev.openconnect.decision.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.internousdev.openconnect.decision.dto.DecisionDTO;
import com.internousdev.util.DBConnector;
import com.mysql.jdbc.Connection;
/**
 * 決裁状況一覧をActionから受け取った検索文で検索するクラス
 * @author KENICHI HORIGUCHI
 * @author KOUHEI NIRABARU
 * @since 2016/09/14
 * @version 1.0
 */
public class DecisionDAO {
	/**
	 * 決裁状況一覧情報を格納するリスト
	 * @author  KENICHI HORIGUCHI
	 */
	private ArrayList<DecisionDTO> list = new ArrayList<DecisionDTO>();
	/**
	 * 表示メソッド ログインした際にDBからサイト情報をリスト化して抽出し、DTOに格納する
	 * @author KENICHI HORIGUCHI
	 * @author KOUMEI IWAMOTO
	 * @return  searchString
	 */
	public boolean select(String searchString ) {
		boolean result = false;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = (Connection) db.getConnection();

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
				dto.setDecisionId(rs.getInt("decision_id"));
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
	 * 更新メソッド  画面で受け取った更新情報を、DBへ転送し、更新する為のメソッド
	 * @author KENICHI HORIGUCHI
	 * @author KOUHEI NITABARU
     * @author MASAHIRO KEDSUKA
	 */
	public int insert(
			String day, int userId, int projectId, String projectName, String summary){

		int count = 0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");

		Connection con = (Connection)db.getConnection();

		String sql = "insert into decision(registration, user_id, project_id, decision_name, detail, i_drafting_id, i_approval_id, a_drafting_id, cd_id, i_a_d_id, i_a_id)values(?,?,?,?,?,?,?,?,?,?,?)";
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd");
		day = sdf.format(System.currentTimeMillis());

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,day);
			ps.setInt(2,userId);
			ps.setInt(3,projectId);
			ps.setString(4,projectName);
			ps.setString(5,summary);
			ps.setString(6,"-");
			ps.setString(7,"-");
			ps.setString(8,"-");
			ps.setString(9,"-");
			ps.setString(10,"-");
			ps.setString(11,"-");
			count = ps.executeUpdate();

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

	/**
	 * 更新メソッド  画面で受け取った更新情報を、DBへ転送し、更新する為のメソッド
	 * @author KENICHI HORIGUCHI
	 * @author KOUHEI NITABARU
	 */
	public int update(
			String registration, int userId, int projectId, int decisionId,
			String decisionName, String  detail, String iDraftingId,
			String iApprovalId, String aDraftingId, String cdId, String iADId, String iAId ){

		int count = 0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");

		Connection con = (Connection)db.getConnection();

		String sql = " UPDATE decision SET "
				+ "registration=?, user_id=?, project_id=?, decision_id =?, decision_name=?, "
				+ "detail=?, i_drafting_id=?, i_approval_id=?, a_drafting_id=?, "
				+ "cd_id=?, i_a_d_id=?, i_a_id =? where  decision_id =?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,registration);
			ps.setInt(2,userId);
			ps.setInt(3,projectId);
			ps.setInt(4,decisionId);
			ps.setString(5,decisionName);
			ps.setString(6,detail);
			ps.setString(7,iDraftingId);
			ps.setString(8,iApprovalId);
			ps.setString(9,aDraftingId);
			ps.setString(10,cdId);
			ps.setString(11,iADId);
			ps.setString(12,iAId);
			ps.setInt(13, decisionId);

			count = ps.executeUpdate();

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
