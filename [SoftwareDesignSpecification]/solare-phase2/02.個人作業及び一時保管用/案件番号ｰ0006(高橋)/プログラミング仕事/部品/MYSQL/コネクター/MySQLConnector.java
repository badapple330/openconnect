
package com.internousdevwork.kuruyama.util;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
/**
 * MySQLの指定したデータベースに接続する為のクラス
 * @author HARUKI NAKAGAWA
 * @since 1.0
 * @version 1.0
 */
public class MySQLConnector{

    /**
     * MySQLのドライバー名
     */
    private static String driverName = "com.mysql.jdbc.Driver";
    /**
     * MySQLのデータベースのURL
     */
    private static String url = "jdbc:mysql://localhost/";

    /**
     * MySQLのユーザー名
     */
    private static String user = "root";

    /**
     * MySQLのパスワード
     */
    private static String pass = "mysql";

    /**
     * 指定したデータベースへのコネクションを取得する為のメソッド
     * @param database DAOで指定したデータベース
     * @return con データベースに接続するためのインターフェース
     */
    public static Connection getConnection(String database){
        url += database;
        Connection con = null;
        try{
            Class.forName(driverName);
            con = (Connection) DriverManager.getConnection(url,user,pass);
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        url = "jdbc:mysql://localhost/";
        return con;
    }
}