package com.internousdev.prototype1601.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.prototype1601.util.MySQLConnector;;

/**
 * 削除するDAOクラス
 * @author Takeshi Banshow
 * @version 1.0
 * @since 1.0
 */
public class MySQLDeleteDAO{

    /**
     * struts2データベースのlogin_table内のidで検索された情報を削除するメソッド
     * @param id 検索にしようする値
     * @return res 削除が成功したときtrue、失敗したときfalseを返す
     */
    public boolean delete(String id){
        boolean res=true;
        Connection con;
        String sql;
        PreparedStatement ps;
        try{
            con=(Connection)MySQLConnector.getConnection("struts2");
            sql="delete from login_table where id=?";
            ps=con.prepareStatement(sql);
            ps.setString(1,id);
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