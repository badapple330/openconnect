package jp.co.internous.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.internous.dto.LoginDTO;
import jp.co.internous.util.DBconnector;

public class LoginDAO {

    private boolean resultDAO = false;

    private Connection con;
    private String sql;
    private PreparedStatement stmt;
    private ResultSet result;

    public boolean select(String email, String password){
        try {
            con = DBconnector.getConnection();

            sql = "SELECT * "
                + "FROM user "
                + "WHERE email = \"" + email + "\" "
                + "AND password = \"" + password + "\""
                ;

            stmt = con.prepareStatement(sql);
            result = stmt.executeQuery();

            while(result.next()){
                resultDAO = true;
                LoginDTO logindto = new LoginDTO();
                logindto.setEmail(result.getString(1));
                logindto.setPassword(result.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultDAO;
    }
}
