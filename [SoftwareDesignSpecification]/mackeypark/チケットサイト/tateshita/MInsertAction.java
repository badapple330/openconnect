package com.internousdev.prototype1601.action;

import com.internousdev.prototype1601.dao.MInsertDAO;
import com.internousdev.prototype1601.dto.MInsertDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
* 商品IDを検索して、
* 値段情報を取得するためのクラス
*
* @author SAORI MAEKAWA
* @since 1.0
* @version 1.0
*/

public class MInsertAction extends ActionSupport{

    /**
     * 購入ID
     */
	private String sales_id;

	 /**
     * ユーザーID
     */
	private String user_id;

	 /**
     * 商品ID
     */
	private String item_id;

    /**
    * 購入枚数
    */
	private String num_of_tickets;

    /**
    * 合計金額
    */
	private float amount;

    /**
    * 購入日
    */
    private String date;


	/**
     * MongoDBに購入履歴のデータを送る為のメソッド
     * @return result データを取得できたら、リストに格納をしてSUCCESS、できなかったらERRORを返します。
     */
	public String execute(){


		MInsertDAO dao = new MInsertDAO();
		MInsertDTO dto = new MInsertDTO();

		boolean result = dao.insert(dto,sales_id,user_id,item_id,num_of_tickets,amount,date);
		  if(!result){
	        	return ERROR;
	       }
		        return SUCCESS;

		  }


	public String getSales_id() {
		return sales_id;
	}


	public void setSales_id(String sales_id) {
		this.sales_id = sales_id;
	}


	public String getUser_id() {
		return user_id;
	}


	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getItem_id() {
        return item_id;
    }


    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }


    public String getNum_of_tickets() {
        return num_of_tickets;
    }


    public void setNum_of_tickets(String num_of_tickets) {
        this.num_of_tickets = num_of_tickets;
    }

	public float getAmount() {
		return amount;
	}


	public void setAmount(float amount) {
		this.amount = amount;
	}



	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
  }
}
