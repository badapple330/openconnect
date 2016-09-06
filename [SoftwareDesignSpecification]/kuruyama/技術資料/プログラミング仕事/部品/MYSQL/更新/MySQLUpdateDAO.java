package com.internousdev.prototype1601.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.prototype1601.util.MySQLConnector;

/**
 * 更新するDAOクラス
 * @author Takeshi Banshow
 * @version 1.0
 * @since 1.0
 */
public class MySQLUpdateDAO{

    /**
     * struts2データベースのlogin_table内のidで検索された情報を更新するメソッド
     * @param id 検索するための値
     * @param password 更新する値
     * @return res 更新が成功したときtrue、失敗したときfalseを返す
     */
    public boolean update(String id,String password){
        boolean res=true;
        Connection con;
        String sql;
        PreparedStatement ps;
        try{
            con=(Connection)MySQLConnector.getConnection("struts2");
            sql="update login_table set password=? where id=?";
            ps=con.prepareStatement(sql);
            ps.setString(1,password);
            ps.setString(2,id);
            int rs=ps.executeUpdate();
            if(rs==0){
                res=false;
                }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return res;
    }

}