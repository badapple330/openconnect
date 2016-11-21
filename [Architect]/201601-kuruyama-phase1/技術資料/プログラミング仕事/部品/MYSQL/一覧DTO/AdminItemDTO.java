package com.internousdev.prototype1601.dto;

/**
 * 商品情報一覧を格納するDTOクラス
 * @author Takeshi Banshow
 * @version 1.0
 * @since 1.0
 */
public class AdminItemDTO{

    /**
     * 商品ID
     */
    private String id;

    /**
     * 商品名
     */
    private String name;

    /**
     * 商品IDを取得するメソッド
     * @return id 商品ID
     */
    public String getId(){
        return id;
    }

    /**
     * 商品IDをセットするメソッド
     * @param id 商品ID
     */
    public void setId(String id){
        this.id=id;
    }

    /**
     * 商品名を取得するメソッド
     * @return name 商品名
     */
    public String getName(){
        return name;
    }

    /**
     * 商品名をセットするメソッド
     * @param name 商品名
     */
    public void setName(String name){
        this.name=name;
    }
}
