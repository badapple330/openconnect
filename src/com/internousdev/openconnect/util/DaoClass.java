package com.internousdev.openconnect.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * DaoClass
 *DAOクラスを記述する際に共通のフィールドとメソッドを持った抽象クラス
 * @author SAKAI Shinya
 * @since 2015/6/15
 * @version 1.0
 */
public abstract class DaoClass {
	/**
	 * @author SAKAI Shinya
	 * @since 2015/6/15
	 * res 	レスポンス
	 * con 	コネクション
	 * sql	SQL文の基となる文字列
	 * ps	文字列をSQL文にして格納する
	 * rs	SQLの実行結果を格納する
	 */
	protected boolean res;
	protected Connection con;
	protected String sql;
	protected PreparedStatement ps;
	protected ResultSet rs;
}