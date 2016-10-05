package com.internousdev.openconnect.students.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import com.internousdev.util.DBConnector;

/**
 * DBの受講生の情報を更新する為のクラス
 * @author KOHEI NITABARU
 * @since 2016/09/04
 * @version 1.0
 */
public class StudentsUpdateDAO {

    /**
     * 実行メソッド 受講生の情報をDBから削除
     * @author KOHEI NITABARU
     * @param userId
     * @param year
     * @param month
     * @param familyName
     * @param givenName
     * @param familyNameKanji
     * @param familyNameKana
     * @param givenNameKanji
     * @param givenNameKana
     * @param postal
     * @param address
     * @param phoneNumber
     * @param phoneEmail
     * @param mobileNumber
     * @param mobileEmail
     * @param sex
     * @param birthday
     * @param registerDay
     * @param updateDay
     * @param userdelFlg
     * @param loginFlg
     * @param userFlg
     * @param password
     * @return count
     */
    public int update(
            int userId, String password, String familyName, String givenName, String familyNameKanji,
            String familyNameKana,
            String givenNameKanji, String givenNameKana, String postal, String address, String phoneNumber,
            String phoneEmail,
            String mobileNumber, String mobileEmail, String sex, String birthday,
            boolean userdelFlg, boolean loginFlg, int userFlg, int year, String month) {

        int result = 0;
        DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
                "mysql");
        Connection con = db.getConnection();

        String sql = "UPDATE users SET "
                + "password=?, family_name=?, given_name=?, family_name_kanji=?, family_name_kana=?, given_name_kanji=?,"
                + " given_name_kana=?, postal=?, address=?, phone_number=?, phone_email=?, mobile_number=?, mobile_email=?, "
                + "sex=?, birthday=?, update_day=?, userdel_flg=?, login_flg=?, user_flg=?, year=?, month=? "
                + "where user_id=?";

        String birthDayStr = birthday;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");

        if (birthDayStr.equals(""))
            birthDayStr = "0000-00-00";

        try {
            String updateDayStr = sdf.format(System.currentTimeMillis());

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, password);
            ps.setString(2, familyName);
            ps.setString(3, givenName);
            ps.setString(4, familyNameKanji);
            ps.setString(5, familyNameKana);
            ps.setString(6, givenNameKanji);
            ps.setString(7, givenNameKana);
            ps.setString(8, postal);
            ps.setString(9, address);
            ps.setString(10, phoneNumber);
            ps.setString(11, phoneEmail);
            ps.setString(12, mobileNumber);
            ps.setString(13, mobileEmail);
            ps.setString(14, sex);
            ps.setString(15, birthDayStr);
            ps.setString(16, updateDayStr);
            ps.setBoolean(17, userdelFlg);
            ps.setBoolean(18, loginFlg);
            ps.setInt(19, userFlg);
            ps.setInt(20, year);
            ps.setString(21, month);
            ps.setInt(22, userId);
            result = ps.executeUpdate();

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
