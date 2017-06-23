package com.internousdev.openconnect.projects.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.openconnect.projects.dto.ProjectsSelectDTO;
import com.internousdev.util.DBConnector;

/**
 * 画面から追加された情報をＤＢに追加するクラス
 * @author YUICHI KIRIU
 * @since 2016/09/07
 */
public class ProjectsInsertDAO {

	/**
	 * 追加された情報をＤＢに追加するメソッド
	 * @author YUICHI KIRIU
	 *  @param projectName
	 *  @param managerId
	 *  @param subManagerId
	 *  @param  startDate
	 *  @return   count
	 */

	public int insert(String projectName,int managerId,int subManagerId,String startDate){

		int count = 0;


		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "INSERT INTO projects(project_name,manager_id,sub_manager_id,start_date)VALUES(?, ?, ? ,?)";



		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,projectName);
			ps.setInt(2,managerId);
			ps.setInt(3,subManagerId);
			ps.setString(4,startDate);


			count = ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;





	}
	public ProjectsSelectDTO managerIdFinder(String manager_family_name, String manager_given_name){

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root", "mysql");
		Connection con = db.getConnection();
		ProjectsSelectDTO dto = new ProjectsSelectDTO();



		String sql = "SELECT user_id from users where family_name_kanji = '?' and given_name_kanji = '?'" ;
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,manager_family_name);
			ps.setString(2,manager_given_name);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {


				dto.setManagerId(rs.getInt("user_id"));



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

	public ProjectsSelectDTO subManagerIdFinder(String submanager_family_name, String submanager_given_name){

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root", "mysql");
		Connection con = db.getConnection();
		ProjectsSelectDTO dto = new ProjectsSelectDTO();

		String sql = "SELECT user_id from users where family_name_kanji = '?' and given_name_kanji = '?'" ;
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,submanager_family_name);
			ps.setString(2,submanager_given_name);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				dto.setManagerId(rs.getInt("user_id"));

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

