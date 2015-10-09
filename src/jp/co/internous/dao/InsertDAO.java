package jp.co.internous.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import jp.co.internous.util.DBconnector;

import com.mysql.jdbc.Connection;
import com.opensymphony.xwork2.ActionSupport;
/**
 * InsertDAO InsertActionがDBにアクセスするためのDAOクラス
 * @author Arima Genki
 * @since 2015/06/18
 * @version 1.0
 */
public class InsertDAO extends ActionSupport {
    private static final long serialVersionUID = -7154055684470828769L;

    public Map<String, Object> sessionMap;
    /**
     * コネクション
     */
    Connection con = null;
    /**
     * 文字列をSQL文にして格納する
     */
    PreparedStatement ps2 = null;
    /**
     * 結果
     */
    private boolean result = false;

    public String error;
    /**
     * アプリを追加するメソッド
     * @author Arima Genki
     * @since 2015/06/18
     * @param siteName
     * @param url
     * @return result
     * @throws SQLException
     */
    public boolean insert(String siteName, String url) throws Exception {

        con = (Connection) DBconnector.getConnection();
        try {
            String sql = "insert into site(id,name,url) select max(id) + 1, ?, ? from site ";
            ps2 = con.prepareStatement(sql);
            ps2.setString(1, siteName);
            ps2.setString(2, url);
            int rsCount = ps2.executeUpdate();
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
