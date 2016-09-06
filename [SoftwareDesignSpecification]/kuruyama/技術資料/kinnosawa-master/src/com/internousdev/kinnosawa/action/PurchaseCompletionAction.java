/*
 * タイトル ：購入情報を各データベースに保存と削除する為の処理
 * 説明    ：purchase_completion.jspへ遷移する。
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kinnosawa.dao.PurchaseCompletionDAO;
import com.internousdev.kinnosawa.dao.PurchaseDeleteCartDAO;
import com.opensymphony.xwork2.ActionSupport;


/**
 * 購入情報を各データベースに登録と削除する為のクラス
 * @author K.Abe
 * @version 1.0
 * @since 1.0
 */
public class PurchaseCompletionAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -6510606315410922536L;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * カート内の商品IDの一覧
	 */
	private List<Integer> goodsIdList;

	/**
	 * カート内の購入枚数の一覧
	 */
	private List<Integer> numberList;

	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * お届け先名
	 */
	private String userName;

	/**
	 * 電話番号
	 */
	private String phoneNumber;

	/**
	 * 郵便番号
	 */
	private int postalCode;

	/**
	 * 住所
	 */
	private String streetAddress;

	/**
	 * 注文番号
	 */
	private int orderNum;

	/**
	 * お届け先ID
	 */
	private int sendId;

	/**
	 * 購入情報を各データベースに登録と削除をする為のメソッド
	 * @return result 各種処理を適切に実行できたらSUCCESS、できていなければERRORを返す
	 */
	public String execute(){

		String result=SUCCESS;
		userId=(int) session.get("userId");
		PurchaseCompletionDAO dao=new PurchaseCompletionDAO();
		boolean selectCart=dao.selectCart(userId);

		if(selectCart){
			goodsIdList= dao.getGoodsIdList();
			numberList=dao.getNumberList();
		}else{
			result= ERROR;
		}
		int sendAddress=dao.insert(userId, userName, phoneNumber, postalCode, streetAddress, null);

		if(sendAddress==0){
			result= ERROR;
		}
		boolean selestOrder=dao.select();

		if(selestOrder){
			orderNum=dao.getOrderNum();
		}else{
			result= ERROR;
		}
		boolean selectId=dao.selectId(streetAddress);

		if(selectId){
			sendId=dao.getSendId();
		}else {
			result=ERROR;
		}

		for (int i = 0; i < goodsIdList.size(); i++) {
			int item = dao.insert(orderNum, userId, sendId, goodsIdList.get(i), numberList.get(i), null);

			if (item == 0) {
				result = ERROR;
			}

		}
		PurchaseDeleteCartDAO cartDAO=new PurchaseDeleteCartDAO();
		int deleteCart=cartDAO.delete(userId);

		if(deleteCart==0){
			result= ERROR;
		}
		return result;
	}

	/**
	 * セッションを取得する為のメソッド
	 * @return session セッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッションを格納する為のメソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * ユーザーIDを取得する為のメソッド
	 * @return userId ユーザーID
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * ユーザーIDを格納する為のメソッド
	 * @param userId ユーザーID
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * お届け先名を取得する為のメソッド
	 * @return userName お届け先名
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * お届け先名を格納する為のメソッド
	 * @param userName お届け先名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 電話番号を取得する為のメソッド
	 * @return phoneNumber 電話番号
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * 電話番号を格納する為のメソッド
	 * @param phoneNumber 電話番号
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * 郵便番号を取得する為のメソッド
	 * @return postalCode 郵便番号
	 */
	public int getPostalCode() {
		return postalCode;
	}

	/**
	 * 郵便番号を格納する為のメソッド
	 * @param postalCode 郵便番号
	 */
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * 住所を取得する為のメソッド
	 * @return streetAddress 住所
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * 住所を格納する為のメソッド
	 * @param streetAddress 住所
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

}