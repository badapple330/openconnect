package jp.co.internous.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jp.co.internous.util.DBconnector;

public class InsertDAO {
	public int insert(int site_id, String site_name, String site_url, String site_group){
		int count = 0;
		DBconnector db = new DBconnector();
		Connection con = DBconnector.getConnection();
		String sql = "insert into site(site_id, site_name, site_url, site_group)values(?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, site_id);
			ps.setString(2, site_name);
			ps.setString(3, site_url);
			ps.setString(4, site_group);
			count = ps.executeUpdate();

		} catch (Exception e) {
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

	public boolean selectBySiteId(int site_id) {
		boolean result = false;
		new DBconnector();
		Connection con = DBconnector.getConnection();
		String sql = "select * from site where site_id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, site_id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				result = true;
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
		return result;
	}
}
