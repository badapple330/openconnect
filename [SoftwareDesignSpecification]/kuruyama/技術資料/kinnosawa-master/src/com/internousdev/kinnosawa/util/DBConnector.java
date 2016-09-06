/*
 * タイトル：MySQLの指定したデータベースに接続する為の処理
 * 説明    ：MySQLの指定したデータベースに接続する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

 /**
 * MySQLの指定したデータベースに接続する為のクラス
 * @author S.Iiduka
 * @since 1.0
 * @version 1.0
 */
 public class DBConnector {

 	/**
 	 * MySQLのドライバー名
 	 */
     private static String driverName = "com.mysql.jdbc.Driver";

     /**
 	 * MySQLのkinnosawaというデータベースのURL
 	 */
     private static String url = "jdbc:mysql://localhost/kinnosawa";

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
      * @return con 指定したデータベースへのコネクション
      */
     public static Connection getConnection() {

    	 Connection con = null;

    	 try {
    		 Class.forName(driverName);
    		 con = DriverManager.getConnection(url,user,pass);
    	 } catch (ClassNotFoundException e) {
    		 e.printStackTrace();
    	 } catch (SQLException e) {
    		 e.printStackTrace();
    	 }
    	 return con;
     }

}