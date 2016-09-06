package com.internousdev.footprinter.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * DBコネクタ
 * @author 田中 賢樹
 * @since 1.0
 * @version 1.0
 */
public class DBConnector {

    /**
     * プロパティ
     */
    private ResourceBundle bundle = ResourceBundle.getBundle("dbconnector");

    /**
     * コネクション
     */
    private Connection con = null;
    
    /**
     * DB名
     */
    private String dbName;

    /**
     * DBコネクター
     * @param dbName DB名
     */
    public DBConnector(String dbName) {
        this.dbName = dbName;
    }

    /**
     * DBコネクタ取得
     * @return Connection
     */
    public Connection getConnection() {
    	try {
            Class.forName(bundle.getString("driverName"));
            con = DriverManager.getConnection(bundle.getString("url") + dbName, bundle.getString("user"), bundle.getString("pass"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
