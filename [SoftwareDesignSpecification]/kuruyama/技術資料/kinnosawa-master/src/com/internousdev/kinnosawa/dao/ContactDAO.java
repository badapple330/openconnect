/*
 * タイトル：問い合わせをMongoDBへ追加、参照する為の処理
 * 説明    ：問い合わせをMongoDBへ追加、参照する
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 *変更履歴：
 *        ：
 */
package com.internousdev.kinnosawa.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;

import com.internousdev.kinnosawa.dto.ContactDTO;
import com.internousdev.kinnosawa.util.MongoDBConnector;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONObject;

/**
 * 問い合わせをMongoDBへ追加、参照する為のクラス
 * @author Y.Tashiro
 * @since 1.0
 * @version 1.0
 */
public class ContactDAO extends ActionSupport{

	/**
	 *シリアルID
	 */
	private static final long serialVersionUID = -2020294701854777185L;

	/**
	 * 問い合わせをMongoDBへ追加する為のメソッド
	 * @param questionName ユーザー名
	 * @param questionEmail メールアドレス
	 * @param questionText 問い合わせ本文
	 * @return result 追加が成功すればtrue、失敗すればfalseを返す
	 */
	public boolean insert(String questionName, String questionEmail, String questionText){

		MongoDBConnector connector = null;
		boolean result = false;

		try{
			connector = new MongoDBConnector();
			DB db = connector.getConnection();
			DBCollection collection = db.getCollection("contact");
			int idNumber = collection.find().count() + 1;
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			String formatDate = sdf.format(date);
			DBObject json = (DBObject) JSON.parse("{'id':" + idNumber + ", "
													+ "'user_name':'"+ questionName +"', "
													+ "'email':'" + questionEmail + "', "
													+ "'contact':'" + questionText + "',"
													+ "'created_at':'" + formatDate + "'}");
			collection.insert(json);
			result = true;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				connector.closeConnection();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 *問い合わせをMongoDBから参照する為のメソッド
	 * @param list 問い合わせ一件分のデータを格納するDTO
	 * @return result 参照が成功すればtrue、失敗すればfalseを返す
	 */
	public boolean serch(ArrayList<ContactDTO> list){

		MongoDBConnector connector = null;
		boolean result = false;
		ContactDTO dto = null;

		try{
			connector = new MongoDBConnector();
			DB db = connector.getConnection();
			DBCollection collection = db.getCollection("contact");
			DBCursor cursor = collection.find().sort((DBObject) JSON.parse("{ 'id': -1 }"));
			try {
					while(cursor.hasNext()) {
						JSONObject jsonObject = JSONObject.fromObject(cursor.next().toString());
						dto = new ContactDTO();
						dto.setId((int)jsonObject.get("id"));
						dto.setQuestionName(jsonObject.get("user_name").toString());
						dto.setQuestionEmail(jsonObject.get("email").toString());
						dto.setQuestionText(jsonObject.get("contact").toString());
						dto.setCreatedAt(jsonObject.get("created_at").toString());
						list.add(dto);
					}
					result = true;
				}catch(Exception e){
					e.printStackTrace();
				}finally {
					cursor.close();
				}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				connector.closeConnection();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 問い合わせをMongoDBから参照する為のメソッド
	 * @param list 問い合わせ一件分のデータを格納するDTO
	 * @param contactName ユーザー名
	 * @return result 参照が成功すればtrue、失敗すればfalseを返す
	 */
	public boolean serch(ArrayList<ContactDTO> list, String contactName){

		MongoDBConnector connector = null;
		boolean result = false;
		ContactDTO dto = null;

		try{
			connector = new MongoDBConnector();
			DB db = connector.getConnection();
			DBCollection collection = db.getCollection("contact");
			Pattern pattern = Pattern.compile(".*" + contactName + ".*");
			DBCursor cursor = collection.find(new BasicDBObject("user_name",pattern)).sort((DBObject) JSON.parse("{ 'id': -1 }"));
			try {
					while(cursor.hasNext()) {
						JSONObject jsonObject = JSONObject.fromObject(cursor.next().toString());
						dto = new ContactDTO();
						dto.setId((int)jsonObject.get("id"));
						dto.setQuestionName(jsonObject.get("user_name").toString());
						dto.setQuestionEmail(jsonObject.get("email").toString());
						dto.setQuestionText(jsonObject.get("contact").toString());
						dto.setCreatedAt(jsonObject.get("created_at").toString());
						list.add(dto);
					}
					result = true;
				}catch(Exception e){
					e.printStackTrace();
				}finally {
					cursor.close();
				}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				connector.closeConnection();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return result;
	}
}
