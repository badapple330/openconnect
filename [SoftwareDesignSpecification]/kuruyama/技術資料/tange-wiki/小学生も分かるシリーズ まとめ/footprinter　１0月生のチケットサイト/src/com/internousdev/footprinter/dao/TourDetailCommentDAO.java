package com.internousdev.footprinter.dao;

import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.footprinter.dto.TourDetailDTO;
import com.internousdev.footprinter.util.DBConnector;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

/**
 * ユーザレビューを処理するクラス
 * @author 細谷 香菜
 * @version 1.0
 * @since 1.0
 */
public class TourDetailCommentDAO {

	/**
	 * レビューコメントをMongoDBへinsertするメソッド
	 * @param loginId ユーザid
	 * @param tourId イベントid
	 * @param userName ユーザ名
	 * @param comment レビューコメント
	 * @return true
	 */
	public boolean insert(int loginId,int tourId, String userName,String comment){
		DB db = null;
		MongoClient mongo = null;
		try {
			mongo = new MongoClient("localhost", 27017);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		db = mongo.getDB("footprinter");
		DBCollection colls = db.getCollection("comment");
		BasicDBObject input = new BasicDBObject();
		input.put("ID",loginId);
		input.put("TOUR_ID", tourId);
		input.put("NAME",userName);
		input.put("COMMENT",comment);
		colls.insert(input);
		return true;
	}
	
	/**
	 * コメントをDBから取得するメソッド
	 * @param tourId イベントid
	 * @return list
	 */
	public ArrayList<TourDetailDTO> selectComment(int tourId) {
		DB db = null;

		ArrayList<TourDetailDTO> list = new ArrayList<TourDetailDTO>();
		MongoClient mongo = null;
		try {
			mongo = new MongoClient("localhost", 27017);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		db = mongo.getDB("footprinter");
		
		DBCollection colls = db.getCollection("comment");
		
		BasicDBObject query = new BasicDBObject("TOUR_ID",tourId);
		DBCursor cursor = colls.find(query);
		
		try {
		   while(cursor.hasNext()) {
			   TourDetailDTO dto = new TourDetailDTO();
			   DBObject dbs = cursor.next();
			   dto.setUserName((String)dbs.get("NAME"));
			   dto.setComment((String)dbs.get("COMMENT"));
			   list.add(dto);

		   }
		} finally {
		   cursor.close();
		}
		return list;
	}
	
	/**
	 * コメントを入力したユーザの名前を取得するメソッド
	 * @param dto 旅詳細情報保持用クラス
	 * @param loginId ユーザid
	 * @return result
	 */
	public boolean selectToUser(TourDetailDTO dto, int loginId){
		Connection con = null;
		boolean result = false;
		DBConnector dbCon = new DBConnector("footprinter");
		con = dbCon.getConnection();

		String sql = "SELECT * FROM user WHERE id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, loginId);
			ResultSet resultSet = ps.executeQuery();
			if(resultSet.next()){

				dto.setUserName(resultSet.getString(4));
	
				result = true;
			}
		}catch (SQLException e){
			e.printStackTrace();
		}
		if (con != null){
			try{
				con.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}		
		return result;
	}
}
