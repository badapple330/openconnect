package com.internousdev.openconnect.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.dao.RegisterDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 入力された新規登録情報をDAOに渡して結果を操作するためのクラス
 *
 * @author YUKI MAEDA
 * @since 2016/07/11
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
	private String userId;

	/**
	 * ログインパスワード
	 */
	private String password;

	/**
	 * ログインパスワード確認
	 */
	private String passwordcheck;
	/**
	 * 名前
	 */
	private String name;

	/**
	 * 名前（ふりがな）
	 */
	private String nameF;

	/**
	 * 郵便番号
	 */
	private String postal;

	/**
	 * 住所
	 */
	private String address;

	/**
	 * 代表者
	 */
	private String telNumber;

	/**
	 * メールアドレス
	 */
	private String email;

	/**
	 * 性別
	 */
	private String sex;

	/**
	 * 誕生日
	 */
	private String birthday;

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
			if(!(password.equals(passwordcheck))){
				errorMsg = "パスワードが異なります";
			}else if (dao.select(email)) {
				errorMsg = "入力されたメールアドレスは別のアカウントで使用されています";
			}else if (dao.insert(userId, password, name, nameF, postal, address, telNumber, email, sex, birthday) > 0) {
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
	public String getUserId() {
		return userId;
	}

	/**
	 * ユーザーIDを格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @param userId 格納するユーザーID
	 */
	public void setUserId(String userId) {
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
	public String getPasswordcheck() {
		return passwordcheck;
	}

	/**
	 * パスワード(確認用)を格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @param passwordcheck 格納するパスワード(確認用)
	 */
	public void setPasswordcheck(String passwordcheck) {
		this.passwordcheck = passwordcheck;
	}

	/**
	 * 名前を取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @return name 取得する名前
	 */
	public String getName() {
		return name;
	}

	/**
	 * 名前を格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @param name 格納する名前
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 名前（ふりがな）を取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @return nameF 取得する名前（ふりがな）
	 */
	public String getNameF() {
		return nameF;
	}

	/**
	 * 名前（ふりがな）を格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @param nameF 格納する名前（ふりがな）
	 */
	public void setNameF(String nameF) {
		this.nameF = nameF;
	}

	/**
	 * 郵便番号を取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @return postal 取得する郵便番号
	 */
	public String getPostal() {
		return postal;
	}

	/**
	 * 郵便番号を格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @param postal 格納する郵便番号
	 */
	public void setPostal(String postal) {
		this.postal = postal;
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
