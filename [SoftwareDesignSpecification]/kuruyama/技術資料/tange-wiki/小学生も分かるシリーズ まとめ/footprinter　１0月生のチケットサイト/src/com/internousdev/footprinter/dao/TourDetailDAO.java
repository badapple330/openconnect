package com.internousdev.footprinter.dao;

import java.net.UnknownHostException;
import java.sql.Connection;  
import java.sql.PreparedStatement;  
import java.sql.ResultSet;  
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.footprinter.dto.TourDetailDTO;
import com.internousdev.footprinter.util.DBConnector;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

/**
 * DBを参照するクラス
 * @author 細谷 香菜
 * @version 1.0
 * @since 1.0
 */
public class TourDetailDAO {

	/**
	 * DBアクセス
	 */
	private DBConnector dbCon = new DBConnector("footprinter");

	/**
	 * DBから指定したイベントを選択するメソッド
	 * @param dto 選択したイベントの情報
	 * @param tourId イベントのid
	 * @return result boolean
	 */
	public boolean select(TourDetailDTO dto,int tourId){
		boolean result = false;
		Connection con = dbCon.getConnection();
		String sql = "SELECT * FROM event WHERE id = ?";
		
		try{
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1,tourId);
			ResultSet resultSet = stmt.executeQuery();
			if(resultSet.next()){
				DecimalFormat decimalFormat = new DecimalFormat("0.##");
				String price = decimalFormat.format(resultSet.getFloat("price"));
				dto.setEventName(resultSet.getString("name"));
				dto.setEventDate(resultSet.getString("event_date"));
				dto.setPrice(price);
				dto.setRemaining(resultSet.getInt("remaining"));
				dto.setImgPath(resultSet.getString("img_path"));
				dto.setDetail(resultSet.getString("detail"));
				result = true;
			}
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	/**
	 * イベントのレビューコメントをMongoDBから取得するメソッド
	 * @param tourId イベントid
	 * @return list
	 */
	public List<TourDetailDTO> selectComment(int tourId){
		DB db = null;
		List<TourDetailDTO> list = new ArrayList<TourDetailDTO>(); 
		
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
			   dto.setComment((String)dbs.get("COMMENT"));
			   dto.setUserName((String)dbs.get("NAME"));
			   list.add(dto);
		   }
		} finally {
		   cursor.close();
		}
		return list;
	}
}
