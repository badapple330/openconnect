package com.internousdev.openconnect.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.dao.RegisterDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 入力された新規登録情報をDAOに渡して結果を操作するためのクラス
 *
 * @author YUKI MAEDA
 * @author MASAHIRO KEDSUKA
 * @since 2016/10/05
 */
public class RegisterAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルバージョンIDの生成
	 */
	private static final long serialVersionUID = 2395811527732231559L;

	public Map<String, Object> sessionMap;

	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * ログインパスワード
	 */
	private String password;

	/**
	 * ログインパスワード確認
	 */
	private String passwordCheck;
	/**
	 * 姓（漢字）
	 */
	private String familyNameKanji;

	/**
	 * 名（漢字）
	 */
	private String givenNameKanji;

	/**
	 * 姓（ふりがな）
	 */
	private String familyNameKana;

	/**
	 * 名（ふりがな）
	 */
	private String givenNameKana;

	/**
	 * 姓（英語）
	 */
	private String familyName;


	/**
	 * 名（英語）
	 */
	private String givenName;

	/**
	 * 郵便番号
	 */
	private String zip;

	/**
	 * 住所
	 */
	private String address;

	/**
	 * 電話番号
	 */
	private String telNumber;

	/**
	 * 携帯電話番号
	 */
	private String mobileNumber;

	/**
	 * メールアドレス
	 */
	private String email;

	/**
	 * 携帯メールアドレス
	 */
	private String mobileEmail;

	/**
	 * 性別
	 */
	private String sex;

	/**
	 * 誕生日
	 */
	private String birthday;

	/**
	 * 受講年
	 */
	private int year;

	/**
	 * 受講開始月
	 */
	private String month;

	/**
	 * エラーメッセージ
	 */
	private String errorMsg;

	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 *
	 * @author YUKI MAEDA
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute() {
		String result = ERROR;
		RegisterDAO dao = new RegisterDAO();
		if(!(password.equals(passwordCheck))){
			errorMsg = "パスワードが異なります";
		}else if (dao.select(email)) {
			errorMsg = "入力されたメールアドレスは別のアカウントで使用されています";
		}else if (dao.insert(
				userId, password, familyName, givenName, familyNameKanji, familyNameKana,
				givenNameKanji, givenNameKana, zip, address, telNumber, email, mobileNumber,
				mobileEmail, sex, birthday, year, month) > 0) {
			result = SUCCESS;
			sessionMap.put("user", password);
		} else {
			errorMsg = "入力情報に誤りがあります";
		}
		return result;
	}

	/**
	 * ユーザーIDを取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @return userId 取得するユーザーID
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * ユーザーIDを格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @param userId 格納するユーザーID
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * パスワードを取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @return password 取得するパスワード
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * パスワードを格納するためのメソッド
	 *
	 * @param password 格納するパスワード
	 *
	 * @author YUKI MAEDA
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * パスワード(確認用)を取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @return passwordcheck 取得するパスワード(確認用)
	 */
	public String getPasswordCheck() {
		return passwordCheck;
	}

	/**
	 * パスワード(確認用)を格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @param passwordcheck 格納するパスワード(確認用)
	 */
	public void setPasswordCheck(String passwordCheck) {
		this.passwordCheck = passwordCheck;
	}



	/**
	 * 取得メソッド を取得
	 * @author
	 * @return familyNameKanji
	 */
	public String getFamilyNameKanji() {
		return familyNameKanji;
	}

	/**
	 * 設定メソッド を設定
	 * @author
	 * @param familyNameKanji
	 */
	public void setFamilyNameKanji(String familyNameKanji) {
		this.familyNameKanji = familyNameKanji;
	}

	/**
	 * 取得メソッド を取得
	 * @author
	 * @return givenNameKanji
	 */
	public String getGivenNameKanji() {
		return givenNameKanji;
	}

	/**
	 * 設定メソッド を設定
	 * @author
	 * @param givenNameKanji
	 */
	public void setGivenNameKanji(String givenNameKanji) {
		this.givenNameKanji = givenNameKanji;
	}

	/**
	 * 取得メソッド を取得
	 * @author
	 * @return familyNameKana
	 */
	public String getFamilyNameKana() {
		return familyNameKana;
	}

	/**
	 * 設定メソッド を設定
	 * @author
	 * @param familyNameKana
	 */
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}

	/**
	 * 取得メソッド を取得
	 * @author
	 * @return givenNamekana
	 */
	public String getGivenNameKana() {
		return givenNameKana;
	}

	/**
	 * 設定メソッド を設定
	 * @author
	 * @param givenNamekana
	 */
	public void setGivenNameKana(String givenNameKana) {
		this.givenNameKana = givenNameKana;
	}

	/**
	 * 取得メソッド を取得
	 * @author
	 * @return familyName
	 */
	public String getFamilyName() {
		return familyName;
	}

	/**
	 * 設定メソッド を設定
	 * @author
	 * @param familyName
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	/**
	 * 取得メソッド を取得
	 * @author
	 * @return givenName
	 */
	public String getGivenName() {
		return givenName;
	}

	/**
	 * 設定メソッド を設定
	 * @author
	 * @param givenName
	 */
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	/**
	 * 取得メソッド を取得
	 * @author
	 * @return mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * 設定メソッド を設定
	 * @author
	 * @param mobileNumber
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * 取得メソッド を取得
	 * @author
	 * @return mobileEmail
	 */
	public String getMobileEmail() {
		return mobileEmail;
	}

	/**
	 * 設定メソッド を設定
	 * @author
	 * @param mobileEmail
	 */
	public void setMobileEmail(String mobileEmail) {
		this.mobileEmail = mobileEmail;
	}

	/**
	 * 取得メソッド を取得
	 * @author
	 * @return year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * 設定メソッド を設定
	 * @author
	 * @param year
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * 取得メソッド を取得
	 * @author
	 * @return month
	 */
	public String getMonth() {
		return month;
	}

	/**
	 * 設定メソッド を設定
	 * @author
	 * @param month
	 */
	public void setMonth(String month) {
		this.month = month;
	}

	/**
	 * 郵便番号を取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @return postal 取得する郵便番号
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * 郵便番号を格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @param postal 格納する郵便番号
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}



	/**
	 * 住所を取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @return address 取得する住所
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 住所を格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @param address 格納する住所
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 電話番号を取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @return telNumber 取得する電話番号
	 */
	public String getTelNumber() {
		return telNumber;
	}

	/**
	 * 電話番号を格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @param telNumber 格納する電話番号
	 */
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	/**
	 * メールアドレスを取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @return email 取得するメールアドレス
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * メールアドレスを格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @param email 格納するメールアドレス
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 性別を取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @return sex 取得する性別
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * 性別を格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @param sex 格納する性別
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * 生年月日を取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @return birthday 取得する生年月日
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * 生年月日を格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @param birthday 格納する生年月日
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * エラーメッセージを取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @return errorMsg 取得するエラーメッセージ
	 */
	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	 * エラーメッセージを格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @param errorMsg 格納するエラーメッセージ
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	/**
	 * 格納メソッド セッションを格納
	 *
	 * @author YUKI MAEDA
	 * @param sessionMap セッション
	 */
	@Override
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}
}
