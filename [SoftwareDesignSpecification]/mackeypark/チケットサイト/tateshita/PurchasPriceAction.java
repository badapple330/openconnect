
package com.internousdevwork.mackeypark.action;


import java.util.ArrayList;

import com.internousdevwork.mackeypark.dao.PurchasPriceDAO;
import com.internousdevwork.mackeypark.dto.PurchasPriceDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品IDを検索して、
 * 値段情報を取得するためのクラス
 *
 * @author SAORI MAEKAWA
 * @since 1.0
 * @version 1.0
 */
public class PurchasPriceAction extends ActionSupport{



    /**
	 * 生成されたシリアルナンバー
	 */
	private static final long serialVersionUID = -4364732902032986030L;
	/**
     * 値段一覧のリスト
     */
    private ArrayList<PurchasPriceDTO> selectList = new ArrayList<>();

    /**
     * MySQLのデータを取得する為のメソッド
     * @return result データを取得できたら、リストに格納をしてSUCCESS、できなかったらERRORを返します。
     */
    public String execute(){



        String result = ERROR;
        PurchasPriceDAO dao = new PurchasPriceDAO();
        if(dao.selectMySQL()){
            selectList = dao.getSelectList();
            result = SUCCESS;
        }
        return result;
    }



    /**
     * 値段一覧のリストを取得する為のメソッド
     * @return selectList 値段一覧のリスト
     */
    public ArrayList<PurchasPriceDTO> getSelectList() {
        return selectList;
    }

    /**
     * 値段一覧のリストを格納する為のメソッド
     * @param selectList 値段一覧のリスト
     */
    public void setSelectList(ArrayList<PurchasPriceDTO> selectList) {
        this.selectList = selectList;
    }
}