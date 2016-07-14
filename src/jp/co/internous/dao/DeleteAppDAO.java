package jp.co.internous.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jp.co.internous.util.DBconnector;

public class DeleteAppDAO {
	public int delete(int site_id) throws SQLException {
		int count = 0;
		DBconnector db = new DBconnector();

		Connection con = db.getConnection();
		String sql = "Delete from site WHERE site_id = ?";
		try {
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1,site_id);
		count = ps.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
				try{
						con.close();		//DBとの接続終了
				}catch (SQLException e){
						e.printStackTrace();
				}
		}
		return count;
	}
}
