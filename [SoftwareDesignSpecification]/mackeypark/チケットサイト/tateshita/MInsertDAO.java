package com.internousdev.prototype1601.dao;

import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.internousdev.prototype1601.dto.MInsertDTO;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class MInsertDAO {

    /**
     * 購入完了後の情報をMongoDBに格納メソッド
     * @param sales_id 購入ID
     * @param user_id ユーザーID
     * @param item_id 商品ID
     * @param num_of_tickets 購入枚数
     * @param amount 合計金額
     * @param date 購入日
     * @return true
     */

	public boolean insert(MInsertDTO dto,String sales_id, String user_id,String item_id,String num_of_tickets,float totalfee, String dt){

	    Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String sdfTime = sdf.format(c.getTime());
        dt = sdfTime;


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
		 input.put("user_id",user);
		 input.put("item_id",item  );
		 input.put("num_of_tickets", quantity);
		 input.put("amount", totalfee);
		 input.put("date", dt);
		 colls.insert(input);
		 return true;
	}


}




