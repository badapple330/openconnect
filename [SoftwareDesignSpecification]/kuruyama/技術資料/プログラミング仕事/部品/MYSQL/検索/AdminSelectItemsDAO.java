package com.internousdev.prototype1601.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.prototype1601.dto.AdminSelectItemsDTO;
import com.internousdev.prototype1601.util.MySQLConnector;

/**
 * 検索するDAOクラス
 * @author Takeshi Banshow
 * @version 1.0
 * @since 1.0
 */
public class AdminSelectItemsDAO {

    /**
     * 検索結果の有無
     */
    private boolean isResult;

    /**
     * SQL文
     */
    private String sql;

    /**
     * データベースに接続するためのインターフェース
     */
    private Connection connection;

    /**
     * SQL文を送るための準備
     */
    private PreparedStatement ps;

    /**
     * 結果を格納
     */
    private ResultSet rs;

    /**
     * 商品リスト
     */
    private ArrayList<AdminSelectItemsDTO> itemList=new ArrayList<>();

    /**
     * struts2データベースのlogin_table内をidで検索するメソッド
     * @param itemName 商品名
     * @return isResult 情報の取得に成功したらtrue、失敗したらfalseを返します
     */
    public boolean select(String itemName){
        isResult=false;
        try{
            connection=MySQLConnector.getConnection("struts2");
            sql="SELECT * FROM login_table WHERE id=?";
            ps=connection.prepareStatement(sql);
            ps.setString(1,itemName);
            rs=ps.executeQuery();
            while (rs.next()){
                AdminSelectItemsDTO dto=new AdminSelectItemsDTO();
                dto.setItemId(rs.getString("id"));
                dto.setItemName(rs.getString("password"));
                itemList.add(dto);
                isResult=true;
            }
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return isResult;
    }

    /**
     * 商品リストを取得するメソッド
     * @return itemList 商品リスト
     */
    public ArrayList<AdminSelectItemsDTO> getItemList(){
        return itemList;
    }
}
