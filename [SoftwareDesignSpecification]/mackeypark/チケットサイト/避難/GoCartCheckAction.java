package com.internousdevwork.mackeypark.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.mackeypark.dao.GetItemIdDAO;
import com.internousdevwork.mackeypark.dao.GetPriceDAO;
import com.internousdevwork.mackeypark.dto.CartCheckOfDesignDTO;
import com.internousdevwork.mackeypark.dto.CartCheckOfPriceDTO;
import com.internousdevwork.mackeypark.dto.GetItemIdDTO;
import com.internousdevwork.mackeypark.dto.GetPriceDTO;
import com.opensymphony.xwork2.ActionSupport;

/***
* @ 購入確認に遷移するためのクラス
* @author MOTONORI TATESHITA
* @version 1.0
* @since 1.0
**/
public class GoCartCheckAction extends ActionSupport implements SessionAware{
	private Map<String,Object> session;
	private String date;
	private String period;
	private String[] TicketArray;
	private ArrayList<CartCheckOfDesignDTO> ArrayListOfDesign;
	private ArrayList<CartCheckOfPriceDTO> ArrayListOfPrice;
	private String[] DesignArray;
	private String[] division;
	private int ticketSum;
	private int[] amount;
    private ArrayList<GetItemIdDTO> selectList = new ArrayList<>();
    private ArrayList<GetPriceDTO> priceList = new ArrayList<>();
	  /**
     * 購入確認に遷移させ次の画面に表示する全データを格納し直す為のメソッド
     * @return SUCCESS 常にSUCCESSを返す
     */
	public String execute() {
	        GetItemIdDAO dao = new GetItemIdDAO();
	        String path= (String)session.get("path");;
	        String DBperiod="1day";
	        if(path.equals("1day")){
	        	DBperiod="一日";
	        }
	        if(path.equals("1week")){

	        }
	        for(int i=0;i<TicketArray.length;i++){
	        	if(dao.selectMySQL(TicketArray[i],DBperiod,DesignArray[i])){

	        		setSelectList(dao.getSelectList());

	        	}else{
	        		return ERROR;
	        	}



	        	GetPriceDAO dao2 = new GetPriceDAO();
	        	if(dao2.selectMySQL(TicketArray[i],DBperiod)){
	        		 selectList = dao.getSelectList();
	        	}else{
	        		return ERROR;
	        	}

	        	for(int j=0;i<division.length;j++){
	        	    CartCheckOfPriceDTO dto=new CartCheckOfPriceDTO();
	        	    dto.setDivision(division[j]);
                    dto.setPrice(priceList.get(i).getPrice());
	        	    dto.setAmount(amount[j]);
	        	    ArrayListOfPrice.add(dto);
	        	}

	        	for(int j=0;i<TicketArray.length;j++){
                    CartCheckOfDesignDTO dto=new CartCheckOfDesignDTO();
                    dto.setTicket(TicketArray[j]);
                    dto.setDesign(DesignArray[j]);
                    ArrayListOfDesign.add(dto);
                }

	        	session.put("selectList", selectList);
	        	session.put("priceList", priceList);
	        	session.put("date", date);
	        	session.put("period",period);
	        	session.put("TicketArray", TicketArray);
	        	session.put("DesignArray", DesignArray);
	        	session.put("division", division);
	        	session.put("ticketSum", ticketSum);
	        	session.put("amount", amount);
	        }
			return SUCCESS;
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
	/**
	 * チケット有効期限開始期日を取得します。
	 * @return date
	 */
	public String getDate() {
	    return date;
	}
	/**
	 * チケット有効期限開始期日を設定します。
	 * @param date date
	 */
	public void setDate(String date) {
	    this.date = date;
	}
	/**
	 * チケット有効期限終了期日を取得します。
	 * @return period
	 */
	public String getPeriod() {
	    return period;
	}
	/**
	 * チケット有効期限終了期日を設定します。
	 * @param period period
	 */
	public void setPeriod(String period) {
	    this.period = period;
	}
	/**
	 * チケット種類全部を一つ一つ並べた配列を取得します。
	 * @return TicketArray
	 */
	public String[] getTicketArray() {
	    return TicketArray;
	}
	/**
	 * チケット種類全部を一つ一つ並べた配列を設定します。
	 * @param TicketArray TicketArray
	 */
	public void setTicketArray(String[] TicketArray) {
	    this.TicketArray = TicketArray;
	}
	/**
	 * チケットデザイン全部を一つ一つ並べた配列を取得します。
	 * @return DesignArray
	 */
	public String[] getDesignArray() {
	    return DesignArray;
	}
	/**
	 * チケットデザイン全部を一つ一つ並べた配列を設定します。
	 * @param DesignArray DesignArray
	 */
	public void setDesignArray(String[] DesignArray) {
	    this.DesignArray = DesignArray;
	}
	/**
	 * 選択されたチケットの種類を取得します。
	 * @return division
	 */
	public String[] getDivision() {
	    return division;
	}
	/**
	 * 選択されたチケットの種類を設定します。
	 * @param division division
	 */
	public void setDivision(String[] division) {
	    this.division = division;
	}
	/**
	 * チケット総数を取得します。
	 * @return ticketSum
	 */
	public int getTicketSum() {
	    return ticketSum;
	}
	/**
	 * チケット総数を設定します。
	 * @param ticketSum ticketSum
	 */
	public void setTicketSum(int ticketSum) {
	    this.ticketSum = ticketSum;
	}
	/**
	 * チケットの種類毎の枚数を取得します。
	 * @return amount
	 */
	public int[] getAmount() {
	    return amount;
	}
	/**
	 * チケットの種類毎の枚数を設定します。
	 * @param amount amount
	 */
	public void setAmount(int[] amount) {
	    this.amount = amount;
	}
	/**
	 * チケットのIDのリストを取得します。
	 * @return selectList
	 */
	public ArrayList<GetItemIdDTO> getSelectList() {
	    return selectList;
	}
	/**
	 * チケットのIDのリストを設定します。
	 * @param selectList selectList
	 */
	public void setSelectList(ArrayList<GetItemIdDTO> selectList) {
	    this.selectList = selectList;
	}
	/**
	 * チケットの値段を取得します。
	 * @return priceList
	 */
	public ArrayList<GetPriceDTO> getPriceList() {
	    return priceList;
	}
	/**
	 * チケットの値段を設定します。
	 * @param priceList priceList
	 */
	public void setPriceList(ArrayList<GetPriceDTO> priceList) {
	    this.priceList = priceList;
	}
}
