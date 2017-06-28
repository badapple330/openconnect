/**
 *
 */
package com.internousdev.openconnect.decision.detail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.internousdev.openconnect.decision.detail.dto.DecisionDetailDTO;
import com.internousdev.util.DBConnector;

/**
 * 画面に検索結果を表示する為のクラス
 * @author TATUHUMI ITOU, SOSHI AZUMA
 * @since 2016/09/04
 * @version 1.0
 */
public class DecisionDetailSelectDAO {

	/**
	 * DAOに入力されたデータを元に検索を行いその結果をDTOに転送するメソッド
	 * 自プロジェクト以外を呼び出す専用
	 * @author TATUHUMI ITOU, SOSHI AZUMA
	 */
	public List<DecisionDetailDTO> selectAnotherD( String searchString, int userId, int userId1 ){

		Connection con = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql").getConnection();

		String sql = "select * from decision inner join projects on decision.project_id = projects.project_id "
				+"where decision_status != 7 and ( manager_id != ? and sub_manager_id != ? ) and project_name LIKE '%" + searchString + "%'";

		List<DecisionDetailDTO> decisionDetailList1 = new ArrayList<DecisionDetailDTO>();

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, userId);
			ps.setInt(2, userId1);

			ResultSet rs = ps.executeQuery();

			while( rs.next() ){
				DecisionDetailDTO dto = new DecisionDetailDTO();
				dto.setDecisionId(rs.getInt("decision_id"));
				dto.setProjectId(rs.getInt("project_Id"));
				dto.setProjectName(rs.getString("project_name"));
				dto.setDecisionType(rs.getString("decision_type"));
				dto.setDecisionStatus(rs.getInt("decision_status"));

				dto.setManagerId(rs.getInt("manager_id"));
				dto.setSubManagerId(rs.getInt("sub_manager_id"));
				dto.setPermitStatus(rs.getInt("permit_status"));
				dto.setJPermiterId1(rs.getInt("j_permiter_id1"));
				dto.setJPermiterId2(rs.getInt("j_permiter_id2"));
				dto.setJPermiterId3(rs.getInt("j_permiter_id3"));
				dto.setKPermiterId1(rs.getInt("k_permiter_id1"));
				dto.setKPermiterId2(rs.getInt("k_permiter_id2"));
				dto.setKPermiterId3(rs.getInt("k_permiter_id3"));

				decisionDetailList1.add( dto );
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}

		return decisionDetailList1 ;
	}


	/**
	 * DAOに入力されたデータを元に検索を行いその結果をDTOに転送するメソッド
	 * ログイン中ユーザーの自プロジェクトを呼び出す専用
	 * @author TATUHUMI ITOU, SOSHI AZUMA
	 */
	public List<DecisionDetailDTO> selectMyD( int userId, int userId1 ){

		Connection con = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql").getConnection();

		String sql = "select * from decision inner join projects on decision.project_id = projects.project_id "
				+"where decision_status != 7 and ( manager_id = ? or sub_manager_id = ? )";

		List<DecisionDetailDTO> decisionDetailList2  = new ArrayList<DecisionDetailDTO>();


		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, userId);
			ps.setInt(2, userId1);

			ResultSet rs = ps.executeQuery();

			while( rs.next() ){
				DecisionDetailDTO dto = new DecisionDetailDTO();
				dto.setDecisionId(rs.getInt("decision_id"));
				dto.setProjectId(rs.getInt("project_Id"));
				dto.setProjectName(rs.getString("project_name"));
				dto.setDecisionType(rs.getString("decision_type"));
				dto.setDecisionStatus(rs.getInt("decision_status"));

				dto.setManagerId(rs.getInt("manager_id"));
				dto.setSubManagerId(rs.getInt("sub_manager_id"));
				dto.setJImpId(rs.getString("j_imp_id"));
				dto.setKImpId(rs.getString("k_imp_id"));
				dto.setJkImpId(rs.getString("jk_imp_id"));
				dto.setJDecId(rs.getString("j_dec_id"));
				dto.setKDecId(rs.getString("k_dec_id"));
				dto.setJkDecId(rs.getString("jk_dec_id"));

				decisionDetailList2.add( dto );
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}

		return decisionDetailList2;
	}


	/**
	 * DAOに入力されたデータを元に検索を行いその結果をDTOに転送するメソッド
	 * ログイン中ユーザーの決裁未着手の自プロジェクトを呼び出す専用
	 * @author SOSHI AZUMA
	 */
 	public List<DecisionDetailDTO> selectBeginP(int userId, int userId1){
		Connection con = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql").getConnection();

		String sql = "select * from projects left outer join decision on projects.project_id = decision.project_id "
				+"where decision_id is null and ( manager_id = ? or sub_manager_id = ? )";

		List<DecisionDetailDTO> decisionBeginList = new ArrayList<DecisionDetailDTO>();

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, userId);
			ps.setInt(2, userId1);

			ResultSet rs = ps.executeQuery();

			while( rs.next() ){
				DecisionDetailDTO dto = new DecisionDetailDTO();

				dto.setProjectId(rs.getInt("project_id"));
				dto.setProjectName(rs.getString("project_name"));
				dto.setManagerId(rs.getInt("manager_id"));
				dto.setSubManagerId(rs.getInt("sub_manager_id"));
				dto.setDecisionId(rs.getInt("decision_id"));

				decisionBeginList.add( dto );
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}

		return decisionBeginList ;
	}





 	/**
	 * DBの終了日を取り出し今日の日付と比較し、その結果をDTOに転送するメソッド
	 * @author SOSHI AZUMA
	 */
 	public DecisionDetailDTO selectCompareDay(int userId, int userId1){
		Connection con = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql").getConnection();

		String sql = "select end_day from decision where manager_id = ? or sub_manager_id = ?";

		DecisionDetailDTO dto = new DecisionDetailDTO();

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, userId);
			ps.setInt(2, userId1);

			ResultSet rs = ps.executeQuery();

			while( rs.next() ){

				String endDay = rs.getString("end_day");

			// 変換対象の日付文字列
	        String strEndDay = endDay + "00:00:00";

	        //フォーマットパターンを指定して表示する
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");

	        //String→Date型に変換
	        Date dateEndDay = null;
	        try {
	        	dateEndDay = new Date( sdf.parse(strEndDay).getTime() );
	        } catch (ParseException e) {
	        	e.printStackTrace();
	        }

	        //Date→Calendar型に変換
	        Calendar calEndDay = Calendar.getInstance();
	        calEndDay.setTime(dateEndDay);



	        //現在日時を取得する
	        Calendar calToday = Calendar.getInstance();
	        calToday.getTime();

	        // 2つの日付を比較し、結果を格納(-1:過去, 0:当日, 1:未来)
	        int diff = calEndDay.compareTo(calToday);

	        dto.setCompareDay(diff);

			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}

		return dto;
	}


}
