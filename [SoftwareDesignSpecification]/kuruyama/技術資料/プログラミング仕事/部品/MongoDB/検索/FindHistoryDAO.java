package com.internousdev.prototype1601.dao;

import java.util.ArrayList;

import com.internousdev.prototype1601.dto.FindHistoryDTO;
import com.internousdev.prototype1601.util.MDBConnector;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

/**
 * 購入履歴を検索するDAOクラス
 * @author TAKESHI BANSHOU
 * @version 1.0
 * @since 1.0
 */
public class FindHistoryDAO{

    /**
     * eventデータベースのtestテーブルの購入履歴を検索するメソッド
     * @param column 選択されたテーブルのカラム名
     * @param columnValue 入力されたテーブルの要素
     * @return list 検索した購入履歴を返します。
     */
    public ArrayList<FindHistoryDTO> select(String column,String columnValue){
        DB db=null;
        MDBConnector con=new MDBConnector();
        db=con.getConnection("event");
        DBCollection coll=db.getCollection("test");
        BasicDBObject query=new BasicDBObject(column,columnValue);
        DBCursor cursor=coll.find(query);
        ArrayList<FindHistoryDTO> list=new ArrayList<FindHistoryDTO>();
        try{
            while(cursor.hasNext()){
                FindHistoryDTO dto=new FindHistoryDTO();
                DBObject dbs=cursor.next();
                dto.setSalesId((String)dbs.get("sales_id"));
                dto.setUserId((String)dbs.get("user_id"));
                dto.setItemId((String)dbs.get("item_id"));
                dto.setNumOfTickets((String)dbs.get("num_of_tickets"));
                dto.setAmount((String)dbs.get("amount"));
                dto.setDate((String)dbs.get("date"));
                list.add(dto);
            }
        }finally{
            cursor.close();
        }
        return list;
    }
}