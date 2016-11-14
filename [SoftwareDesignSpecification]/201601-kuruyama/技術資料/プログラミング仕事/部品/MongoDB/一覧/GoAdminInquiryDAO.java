package com.internousdev.prototype1601.dao;
import java.net.UnknownHostException;
import java.util.ArrayList;

import com.internousdev.prototype1601.dto.GoAdminInquiryDTO;
import com.internousdev.prototype1601.util.MDBConnector;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

/**
 * お問い合わせ情報をDBから取得する為のDAOクラス
 * @author TAKESHI BANSHOU
 * @version 1.0
 * @since 1.0
 */
public class GoAdminInquiryDAO{

    /**
     * eventデータベースのtestテーブルからお問い合わせ情報を取得する為のメソッド
     * @return list お問い合わせ情報を返します。
     * @throws UnknownHostException MongoDBに接続できない場合にスローします。
     */
    public ArrayList<GoAdminInquiryDTO> select() throws UnknownHostException{
        DB db=null;
        MDBConnector con=new MDBConnector();
        db=con.getConnection("event");
        DBCollection colls=db.getCollection("test");
        DBCursor cursor=colls.find();
        ArrayList<GoAdminInquiryDTO> formList=new ArrayList<GoAdminInquiryDTO>();
        try{
            while(cursor.hasNext()){
                GoAdminInquiryDTO dto=new GoAdminInquiryDTO();
                DBObject dbs=cursor.next();
                dto.setFormId((String)dbs.get("form_id"));
                dto.setFormName((String)dbs.get("form_name"));
                dto.setFormAddress((String)dbs.get("form_address"));
                dto.setFormContents((String)dbs.get("form_contents"));
                dto.setFormResistration((String)dbs.get("form_resistration"));
                formList.add(dto);
            }
        }finally{
            cursor.close();
        }
        return formList;
    }
}