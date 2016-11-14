package com.internousdev.prototype1601.dao;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.internousdev.prototype1601.util.MDBConnector;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;

/**
 * お問い合わせ情報をデータベースに入力する為のDAOクラス
 * @author TAKESHI BANSHOU
 * @version 1.0
 * @since 1.0
 */
public class ContactDAO{

    /**
     * お問い合わせ情報をramenDBのformテーブルに入力する為のメソッド
     * @param formName 問い合わせ投稿者名
     * @param formAddress 問い合わせメールアドレス
     * @param formContents 問い合わせ内容
     * @return true 常にtrueを返す
     */
    public boolean insert(String formName,String formAddress,String formContents){
        DB db=null;
        MDBConnector con=new MDBConnector();
        db=con.getConnection("ramen");
        DBCollection colls=db.getCollection("form");
        BasicDBObject input=new BasicDBObject();
        long longid=colls.count()+1;
        String formId=""+longid;
        input.put("form_id",formId);
        input.put("form_name",formName);
        input.put("form_address",formAddress);
        input.put("form_contents",formContents);
        Calendar c=Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
        input.put("form_resistration",sdf.format(c.getTime()));
        colls.insert(input);
        return true;
    }
}
