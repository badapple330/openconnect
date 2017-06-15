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
            int userId, String password,  String familyNameKanji,
            String familyNameKana,
            String givenNameKanji, String givenNameKana,
            String phoneEmail,

            boolean userdelFlg, boolean loginFlg, int userFlg, int year, String month) {

        int result = 0;
        DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
                "mysql");
        Connection con = db.getConnection();

        String sql = "UPDATE users SET "
                + "password=?,family_name_kanji=?, family_name_kana=?, given_name_kanji=?,"
                + " given_name_kana=?, phone_email=?,"
                + "update_day=?, userdel_flg=?, login_flg=?, user_flg=?, year=?, month=? "
                + "where user_id=?";



        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");



        try {
            String updateDayStr = sdf.format(System.currentTimeMillis());

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, password);

            ps.setString(2, familyNameKanji);
            ps.setString(3, familyNameKana);
            ps.setString(4, givenNameKanji);
            ps.setString(5, givenNameKana);

            ps.setString(6, phoneEmail);

            ps.setString(7, updateDayStr);
            ps.setBoolean(8, userdelFlg);
            ps.setBoolean(9, loginFlg);
            ps.setInt(10, userFlg);
            ps.setInt(11, year);
            ps.setString(12, month);
            ps.setInt(13, userId);
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
