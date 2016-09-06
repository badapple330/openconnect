package com.internousdevwork.mackeypark.action;

import java.util.Map;

import com.internousdevwork.mackeypark.dao.InsertPurchaseHistoryDAO;
import com.opensymphony.xwork2.ActionSupport;


/**
 *購入履歴をhistoryのテーブルに挿入するクラス
 *
 * @author SAORI MAEKAWA
 * @since 1.0
 * @version 1.0
 */

public class INsertPurchaseHistoryAction extends ActionSupport{

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
    private String[] amount;

    /**
     * 購入日
     */
    private String date;

    /**
     *合計金額
     */
    private int totalprice;





    private Map<String,Object>session;

    /**
     * MongoDBに購入履歴のデータを送る為のメソッド
     * @return result データを取得できたら、リストに格納をしてSUCCESS、できなかったらERRORを返します。
     */
    public String execute(){




        InsertPurchaseHistoryDAO dao = new InsertPurchaseHistoryDAO();

        item_id = (String) session.get("item_id");
        user_id = (String) session.get("user_id");
        num_of_tickets = (String) session.get("ticketSum");

        String amount= String.valueOf(totalprice);




        int id = Integer.parseInt(user_id);


        boolean res = dao.cardcheck(id);
        if(!res){
            return ERROR;
        }


        boolean result = dao.insert(sales_id,id,item_id,num_of_tickets,amount,date);
        if(!result){
            return ERROR;
        }
        return SUCCESS;

    }

    /**
     * 購入IDを取得します。
     * @return 購入ID
     */
    public String getSales_id() {
        return sales_id;
    }

    /**
     * 購入IDを設定します。
     * @param sales_id 購入ID
     */
    public void setSales_id(String sales_id) {
        this.sales_id = sales_id;
    }

    /**
     * ユーザーIDを取得します。
     * @return ユーザーID
     */
    public String getUser_id() {
        return user_id;
    }

    /**
     * ユーザーIDを設定します。
     * @param user_id ユーザーID
     */
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    /**
     * 商品IDを取得します。
     * @return 商品ID
     */
    public String getItem_id() {
        return item_id;
    }

    /**
     * 商品IDを設定します。
     * @param item_id 商品ID
     */
    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    /**
     * 購入枚数を取得します。
     * @return 購入枚数
     */
    public String getNum_of_tickets() {
        return num_of_tickets;
    }

    /**
     * 購入枚数を設定します。
     * @param num_of_tickets 購入枚数
     */
    public void setNum_of_tickets(String num_of_tickets) {
        this.num_of_tickets = num_of_tickets;
    }

    /**
     * 合計金額を取得します。
     * @return 合計金額
     */
    public String[] getAmount() {
        return amount;
    }

    /**
     * 合計金額を設定します。
     * @param amount 合計金額
     */
    public void setAmount(String[] amount) {
        this.amount = amount;
    }

    /**
     * 購入日を取得します。
     * @return 購入日
     */
    public String getDate() {
        return date;
    }

    /**
     * 購入日を設定します。
     * @param date 購入日
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 合計金額を取得します。
     * @return 合計金額
     */
    public int getTotalprice() {
        return totalprice;
    }

    /**
     * 合計金額を設定します。
     * @param totalprice 合計金額
     */
    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    /**
     * sessionを取得します。
     * @return session
     */
    public Map<String,Object> getSession() {
        return session;
    }

    /**
     * sessionを設定します。
     * @param session session
     */
    public void setSession(Map<String,Object> session) {
        this.session = session;
    }









}
