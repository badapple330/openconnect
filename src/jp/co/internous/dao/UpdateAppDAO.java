package jp.co.internous.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jp.co.internous.util.DBconnector;

/**
 * UpdateAppDAO UpdateAppActionがDBにアクセスするためのDAOクラス
 * @author Arima Genki
 * @since 2015/06/18
 * @version 1.0
 */
public class UpdateAppDAO {

    Connection con = null;

    PreparedStatement ps = null;

    boolean result = false;
    /**
     * アプリを編集するメソッド
     * @author Arima Genki
     * @since 2015/06/18
     * @param id
     * @param siteName
     * @param url
     * @return result
     * @throws SQLException
     */
    public boolean update(int id, String siteName, String url) throws SQLException {
        con = DBconnector.getConnection();
        try {
            String sql = "update site set name=?,url=? where id=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, siteName);
            ps.setString(2, url);
            ps.setInt(3, id);
            int rsCount = ps.executeUpdate();
            if (rsCount > 0) {
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.close();
        }
        return result;
    }
}
