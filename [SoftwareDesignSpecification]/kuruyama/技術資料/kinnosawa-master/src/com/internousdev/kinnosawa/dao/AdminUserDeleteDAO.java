/*
 * タイトル：ユーザー情報をデータベースから削除する為の処理
 * 説明    ：ユーザー情報をデータベースから削除する
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.kinnosawa.util.DBConnector;


/**
* ユーザー情報を削除する為のクラス
* @author S.Makino
* @version 1.0
* @since 1.0
*/
public class AdminUserDeleteDAO {

	/**
	 * ユーザー名
	 */
	private String userName;

	/**
	 * ユーザー情報をデータベースから削除するためのメソッド
	 * @param id ユーザーID
	 * @return count 削除できれば１、失敗すれば0を返す
	 */
	public int userDelete(int id){

		 int count = 0;
         Connection conn =DBConnector.getConnection();

         try{
        	 String sql="SELECT name FROM user WHERE id= ?";
        	 PreparedStatement ps =conn.prepareStatement(sql);
        	 ps.setInt(1, id);
        	 ResultSet rs=ps.executeQuery();
        	 if(rs.next()){
        	 userName=rs.getString("name");
        	 }
        	 if(userName==null){
        		 count=2;
        		 return count;
        	 }
        	 String sql2 = "UPDATE user SET email=NULL,password=NULL,name=NULL,name_kana=NULL,tel_num=NULL,postal_code=NULL,"
 					+ "address=NULL,card_num=NULL,token=NULL,oauth_id=NULL,oauth_name=NULL  WHERE id =? ORDER BY id desc";
        	 PreparedStatement ps2 = conn.prepareStatement(sql2);
        	 ps2.setInt(1, id);
        	 ps2.executeUpdate();
         }catch (SQLException e) {
 	           e.printStackTrace();
 	     }finally{
 	           try{
 	        	   conn.close();
 	           }catch (SQLException e){
 	        	   e.printStackTrace();
 	           }
 	     }
         return count;
    }

}