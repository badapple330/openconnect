package jp.co.internous.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.internous.util.DBconnector;
import jp.co.internous.dto.LoginDTO;

public class LoginDAO {

    private boolean resultDAO = false;

    private Connection con;
    private String sql;
    private PreparedStatement stmt;
    private ResultSet result;

    public boolean select(String userID, String password){
        try {
            con = DBconnector.getConnection();

            sql = "SELECT * "
                + "FROM user "
                + "WHERE user_id = \"" + userID + "\" "
                + "AND password = \"" + password + "\""
                ;

            stmt = con.prepareStatement(sql);
            result = stmt.executeQuery();

            while(result.next()){
                resultDAO = true;
                LoginDTO logindto = new LoginDTO();
                logindto.setUserID(result.getString(1));
                logindto.setPassword(result.getString(2));
                logindto.setUserName(result.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultDAO;
    }
}
