package com.internousdevwork.kuruyama.util;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;

/**
 * MongoDBの指定したデータベースに接続するutilクラス
 *
 * @author Banshow takeshi
 * @version 1.0
 * @since 1.0
 */
public class MDBConnector {

    /**
     * MongoDBの渡ってきたデータベース名で接続するメソッド
     * @param dbName 渡ってきたデータベース名
     * @return db 指定したデータベースへのコネクション情報を返します。
     */
    public DB getConnection(String dbName){
        DB db=null;
        try{
            MongoClient mongo=new MongoClient("localhost", 27017);
            db=mongo.getDB(dbName);
        }catch(UnknownHostException e){
            e.printStackTrace();
        }
        return db;
    }
}