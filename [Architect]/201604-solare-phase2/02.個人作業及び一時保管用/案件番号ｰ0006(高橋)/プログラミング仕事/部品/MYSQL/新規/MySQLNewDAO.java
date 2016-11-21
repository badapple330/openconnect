package com.internousdev.prototype1601.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.prototype1601.util.MySQLConnector;

/**
 * 新規作成するDAOクラス
 * @author Takeshi Banshow
 * @version 1.0
 * @since 1.0
 */
public class MySQLNewDAO{

    /**
     * struts2データベースのlogin_tableに新規に入力するメソッド
     * @param id 新規で入力する値
     * @param password 新規で入力する値
     * @return res 新規作成が成功したときtrue、失敗したときfalseを返す
     */
    public boolean select(String id,String password){
        boolean res=true;
        Connection con;
        String sql;
        PreparedStatement ps;
        try{
            con=(Connection)MySQLConnector.getConnection("struts2");
            sql="insert into login_table values(?,?)";
            ps=con.prepareStatement(sql);
            ps.setString(1,id);
            ps.setString(2,password);
            int rs= ps.executeUpdate();
            if(rs==0){
                res=false;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return res;
    }
}