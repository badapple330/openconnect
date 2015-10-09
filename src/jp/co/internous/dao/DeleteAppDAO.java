package jp.co.internous.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import jp.co.internous.util.DBconnector;

public class DeleteAppDAO {
    int i;
    /**
     * コネクション
     */
    Connection con = null;
    /**
     * 文字列をSQL文にして格納する
     */
    PreparedStatement ps = null;
    /**
     * 結果
     */
    boolean result = false;
    /**
     * アプリを削除するメソッド
     * @author Arima Genki
     * @since 2015/06/18
     * @param id
     * @return result
     * @throws SQLException
     */
    public boolean delete(int id) throws SQLException {

        con = DBconnector.getConnection();
        try {
            String sql = "DELETE FROM site WHERE id=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            i = ps.executeUpdate();
            result = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ps.close();
        con.close();
        return result;
    }
}
