package com.internousdev.prototype1601.dao;

import com.internousdev.prototype1601.util.MDBConnector;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

/**
 * 更新するDAOクラス
 * @author Takeshi Banshow
 * @version 1.0
 * @since 1.0
 */
public class MUpdateDAO {

    /**
     * eventデータベースのtestコレクションをidを使い検索し、更新するメソッド
     * @param id 検索に使用する値
     * @param name 更新する値
     * @param price 更新する値
     * @param quantity 更新する値
     */
    public void update(String id,String name,String price,String quantity){
        DB db=null;
        MDBConnector con=new MDBConnector();
        db=con.getConnection("event");
        DBCollection colls=db.getCollection("test");
        BasicDBObject query=new BasicDBObject("id",id);
        DBCursor cursor=colls.find(query);
        if (cursor.hasNext()){
            DBObject doc=cursor.next();
            doc.put("name",name);
            doc.put("price",price);
            doc.put("quantity",quantity);
            colls.save(doc);
        }
    }
}
