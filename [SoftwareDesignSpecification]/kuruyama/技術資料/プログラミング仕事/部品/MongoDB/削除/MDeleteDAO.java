package com.internousdev.prototype1601.dao;

import com.internousdev.prototype1601.util.MDBConnector;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

/**
 * 削除するDAOクラス
 * @author Takeshi Banshow
 * @version 1.0
 * @since 1.0
 */
public class MDeleteDAO{

    /**
     * eventデータベースのtestコレクションをidを使い検索し、削除するメソッド
     * @param id 検索するための値
     */
    public void delete(String id){
        MDBConnector con=new MDBConnector();
        DB db=con.getConnection("event");
        DBCollection coll=db.getCollection("test");
        BasicDBObject query=new BasicDBObject("id",id);
        DBCursor cursor=coll.find(query);
        try{
            if(cursor.hasNext()){
                DBObject doc=cursor.next();
                coll.remove(doc);
            }
        }finally{
            cursor.close();
        }
    }
}
