package com.internousdevwork.mackeypark.dao;

import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.internousdevwork.mackeypark.util.DBConnector;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;


public class InsertPurchaseHistoryDAO {


    Connection con;
    ResultSet rs;
    Statement stm;

    /**
     * 購入完了後の情報をMongoDBに格納メソッド
     * @param sales_id 購入ID
     * @param user_id ユーザーID
     * @param item_id 商品ID
     * @param ticketSum 購入枚数
     * @param amount 合計金額
     * @param date 購入日
     * @return true
     */

	public boolean insert(String sales_id, int user_id,String item_id,String ticketSum,String amount, String date){

	    Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String sdfTime = sdf.format(c.getTime());
        date = sdfTime;



		 DB db = null;
		 MongoClient mongo = null;
		 try {
		 mongo = new MongoClient("localhost", 27017);
		 } catch (UnknownHostException e) {
		 e.printStackTrace();
		 }
		 db = mongo.getDB("park");
		 DBCollection colls = db.getCollection("history");
		 BasicDBObject input = new BasicDBObject();


		 long count = colls.getCount();
		 long i = ++count;

		 String s = String.valueOf(i);

		 input.put("sales_id",s);
		 input.put("user_id",user_id);
		 input.put("item_id",item_id  );
		 input.put("num_of_tickets", ticketSum);
		 input.put("amount", amount);
		 input.put("date", date);
		 colls.insert(input);
		 return true;
	}



    /**
     * DBのクレジットカードトークンの有無を確認するメソッド
     * @param user_id ユーザーID
     * @return false
     */


	public boolean cardcheck(int user_id){

	    boolean res = false;
	    String sql;
        String token = null;
	    try{
        con = (Connection)DBConnector.getConnection("openconnect");
        stm = con.createStatement();
        sql = "select token from user where user_id = '"+user_id+"'";

        rs = stm.executeQuery(sql);

        while(rs.next()){
            token =rs.getString("token");

        }
        if(token != null){
            res = true;
            return res;
        }else{
            return false;
        }


	    }catch(SQLException e){
	        e.printStackTrace();
	    }

	    return false;

	}

}




