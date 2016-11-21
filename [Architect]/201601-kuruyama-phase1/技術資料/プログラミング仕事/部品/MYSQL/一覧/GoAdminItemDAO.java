package com.internousdev.prototype1601.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.prototype1601.dto.AdminItemDTO;
import com.internousdev.prototype1601.util.MySQLConnector;

/**
 * 全取得するDAOクラス
 * @author Takeshi Banshow
 * @version 1.0
 * @since 1.0
 */
public class GoAdminItemDAO{

    /**
     * 商品リスト
     */
    private ArrayList<AdminItemDTO> itemList=new ArrayList<>();

    /**
     * データベースに接続するためのインターフェース
     */
    private Connection con;

    /**
     * SQL文
     */
    private String sql;

    /**
     * 検索結果の有無
     */
    boolean isResult;

    /**
     * struts2データベースのlogin_tableを取得する為のメソッド
     * @return isResult 検索情報の取得に成功したらtrue、失敗したらfalseを返します
     */
    public boolean select(){
        isResult=false;
        try{
            con=MySQLConnector.getConnection("struts2");
            sql="SELECT * FROM login_table";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                AdminItemDTO dto=new AdminItemDTO();
                dto.setId(rs.getString("id"));
                dto.setName(rs.getString("password"));
                itemList.add(dto);
                isResult=true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
        return isResult;
    }

    /**
     * 商品リストを取得するクラス
     * @return itemList 商品リスト
     */
    public ArrayList<AdminItemDTO> getItemList(){
        return itemList;
    }

    /**
     * 商品リストを格納するクラス
     * @param itemList 商品リスト
     */
    public void setItemList(ArrayList<AdminItemDTO> itemList){
        this.itemList = itemList;
    }
}