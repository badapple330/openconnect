/*
 * タイトル ：登録内容変更画面に遷移する為の処理
 * 説明    ：registration_change.jspへ遷移
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kinnosawa.dao.GoRegistrationChangeDAO;
import com.internousdev.kinnosawa.dto.GoRegistrationChangeDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 登録内容変更画面に遷移する為のクラス
 * @author Y.Murakami
 * @version 1.0
 * @since 1.0
 */
public class GoRegistrationChangeAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -5639774120993511282L;

	/**
	 * セッション
	 */
	private  Map<String , Object> session;

	/**
	 * メールアドレス
	 */
	private String email;

	/**
	 * パスワード
	 */
	private String password;

	/**
	 * 名前
	 */
	private String name;

	/**
	 * フリガナ
	 */
	private String nameKana;

	/**
	 * 電話番号
	 */
	private String telNumber;

	/**
	 * 郵便番号
	 */
	private String postalCode;

	/**
	 * 住所
	 */
	private String address;

	/**
	 * 都道府県名
	 */
	private String selectedPrefecture;

	/**
	 * 市区町村以下
	 */
	private String cityName;

	/**
	 * クレジットカード情報入力の初期値
	 */
	private int creditInput;

	/**
	 * 登録内容変更画面に遷移するの為のメソッド
	 * @return result 表示する内容が取得できればtrue、できないもしくはuserIdのセッションが切れている場合falseを返す
	 */
	public String execute() throws SQLException {

		try{
			if(session.get("userId")==null){
				return ERROR;
			}
			int id =(int)session.get("userId");
			GoRegistrationChangeDAO dao = new GoRegistrationChangeDAO();
			GoRegistrationChangeDTO dto = new GoRegistrationChangeDTO();

			if(!dao.registrationChange(id,dto)){
				return ERROR;
			}

			email=dto.getEmail();
			password=dto.getPassword();
			name=dto.getName();
			nameKana=dto.getNameKana();
			telNumber=dto.getTelNumber();
			postalCode=dto.getPostalCode();
			address=dto.getAddress();

			if(address==null){
				setSelectedPrefecture("（選択必須）");
			}else {
				//住所(address)を都道府県と市区町村以下に分割
				char cityIndex =address.charAt(3);
				if(cityIndex=='県'){
					setSelectedPrefecture(address.substring(0, 4));
					setCityName(address.substring(4));
				}else{
					setSelectedPrefecture(address.substring(0, 3));
					setCityName(address.substring(3));
				}
			}
			creditInput=1;
			return SUCCESS;

		}catch(NullPointerException e){
			return ERROR;
		}
	}

	/**
	 * セッションを取得する為のメソッド
	 * @return session セッション
	 */
	public Map<String , Object> getSession() {
		return session;
	}

	/**
	 * セッションを格納する為のメソッド
	 * @param session セッション
	 */
	public void setSession(Map<String , Object> session) {
		this.session = session;
	}

	/**
	 * メールアドレスを取得する為のメソッド
	 * @return email メールアドレス
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * メールアドレスを格納する為のメソッド
	 * @param email メールアドレス
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * パスワードを取得する為のメソッド
	 * @return password パスワード
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * パスワードを格納する為のメソッド
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 名前を取得する為のメソッド
	 * @return name 名前
	 */
	public String getName() {
		return name;
	}

	/**
	 * 名前を格納する為のメソッド
	 * @param name 名前
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * フリガナを取得する為のメソッド
	 * @return nameKana フリガナ
	 */
	public String getNameKana() {
		return nameKana;
	}

	/**
	 * フリガナを格納する為のメソッド
	 * @param nameKana フリガナ
	 */
	public void setNameKana(String nameKana) {
		this.nameKana = nameKana;
	}

	/**
	 * 電話番号を取得する為のメソッド
	 * @return telNumber 電話番号
	 */
	public String getTelNumber() {
		return telNumber;
	}

	/**
	 * 電話番号を格納する為のメソッド
	 * @param telNumber 電話番号
	 */
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	/**
	 * 郵便番号を取得する為のメソッド
	 * @return postalCode 郵便番号
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * 郵便番号を格納する為のメソッド
	 * @param postalCode 郵便番号
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * 住所を取得する為のメソッド
	 * @return address 住所
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 住所を格納する為のメソッド
	 * @param address 住所
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 都道府県名を取得する為のメソッド
	 * @return selectedPrefecture 都道府県名
	 */
	public String getSelectedPrefecture() {
		return selectedPrefecture;
	}

	/**
	 * 都道府県名を格納する為のメソッド
	 * @param selectedPrefecture 都道府県名
	 */
	public void setSelectedPrefecture(String selectedPrefecture) {
		this.selectedPrefecture = selectedPrefecture;
	}

	/**
	 * 市区町村以下を取得する為のメソッド
	 * @return cityName 市区町村以下
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * 市区町村以下を格納する為のメソッド
	 * @param cityName 市区町村以下
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * クレジットカード情報入力の初期値を取得する為のメソッド
	 * @return creditInput クレジットカード情報入力の初期値
	 */
	public int getCreditInput() {
		return creditInput;
	}

	/**
	 * クレジットカード情報入力の初期値を格納する為のメソッド
	 * @param creditInput クレジットカード情報入力の初期値
	 */
	public void setCreditInput(int creditInput) {
		this.creditInput = creditInput;
	}

}