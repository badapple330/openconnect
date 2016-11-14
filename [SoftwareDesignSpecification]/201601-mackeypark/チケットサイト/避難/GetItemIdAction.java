
package com.internousdevwork.mackeypark.action;


import java.util.ArrayList;

import com.internousdevwork.mackeypark.dao.GetItemIdDAO;
import com.internousdevwork.mackeypark.dto.GetItemIdDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品IDを検索して、
 * 値段情報を取得するためのクラス
 *
 * @author SAORI MAEKAWA
 * @since 1.0
 * @version 1.0
 */
public class GetItemIdAction extends ActionSupport{



    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = 3564155122100155960L;
    /**
     * 商品ID一覧のリスト
     */
    private ArrayList<GetItemIdDTO> selectList = new ArrayList<>();

    /**
     * MySQLのデータを取得する為のメソッド
     * @return result データを取得できたら、リストに格納をしてSUCCESS、できなかったらERRORを返します。
     */
    public String execute(){



        String result = ERROR;
        GetItemIdDAO dao = new GetItemIdDAO();
        if(dao.selectMySQL()){
            selectList = dao.getSelectList();
            result = SUCCESS;
        }
        return result;
    }



    /**
     * 商品ID一覧のリストを取得する為のメソッド
     * @return selectList 値段一覧のリスト
     */
    public ArrayList<GetItemIdDTO> getSelectList() {
        return selectList;
    }

    /**
     * 商品ID一覧のリストを格納する為のメソッド
     * @param selectList 値段一覧のリスト
     */
    public void setSelectList(ArrayList<GetItemIdDTO> selectList) {
        this.selectList = selectList;
    }
}