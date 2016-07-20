package jp.co.internous.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import jp.co.internous.dao.RegisterDAO;

/**
 * 入力された新規登録情報をDAOに渡して結果を操作するためのクラス
 *
 * @author YUKI MAEDA
 * @since 2016/07/11
 */
public class RegisterAction extends ActionSupport implements SessionAware {
	public Map<String, Object> sessionMap;

	/**
	 * ユーザーID
	 */
	private String user_id;

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
	private String name_f;

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
	private String tel_number;

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
		if (!dao.selectByUserId(user_id) && password.equals(passwordcheck)) {
			if (dao.insert(user_id, password, name, name_f, postal, address, tel_number, email, sex, birthday) > 0) {
				result = SUCCESS;
				sessionMap.put("user", password);
			}
		} else {
			errorMsg = "そのＩＤは別のアカウントで使用されています";
		}
		return result;
	}

	/**
	 * ユーザーIDを取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 */
	public String getUser_id() {
		return user_id;
	}

	/**
	 * ユーザーIDを格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 */
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	/**
	 * パスワードを取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * パスワードを格納するためのメソッド
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
	 */
	public String getPasswordcheck() {
		return passwordcheck;
	}
	/**
	 * パスワード(確認用)を格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 */
	public void setPasswordcheck(String passwordcheck) {
		this.passwordcheck = passwordcheck;
	}
	/**
	 * 名前を取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 */
	public String getName() {
		return name;
	}
	/**
	 * 名前を格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 名前（ふりがな）を取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 */
	public String getName_f() {
		return name_f;
	}
	/**
	 * 名前（ふりがな）を格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 */
	public void setName_f(String name_f) {
		this.name_f = name_f;
	}
	/**
	 * 郵便番号を取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 */
	public String getPostal() {
		return postal;
	}
	/**
	 * 郵便番号を格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 */
	public void setPostal(String postal) {
		this.postal = postal;
	}
	/**
	 * 住所を取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 住所を格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 電話番号を取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 */
	public String getTel_number() {
		return tel_number;
	}
	/**
	 * 電話番号を格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 */
	public void setTel_number(String tel_number) {
		this.tel_number = tel_number;
	}
	/**
	 * メールアドレスを取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * メールアドレスを格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 性別を取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * 性別を格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * 生年月日を取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 */
	public String getBirthday() {
		return birthday;
	}
	/**
	 * 生年月日を格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	/**
	 * エラーメッセージを取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 */
	public String getErrorMsg() {
		return errorMsg;
	}
	/**
	 * エラーメッセージを格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	/**
	 * セッションに値（パスワード）を格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 */
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}
}
