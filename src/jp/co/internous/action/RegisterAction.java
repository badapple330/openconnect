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
	 * @return user_id 取得するユーザーID
	 */
	public String getUser_id() {
		return user_id;
	}

	/**
	 * ユーザーIDを格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @param user_id
	 *            格納するユーザーID
	 */
	public void setUser_id(String user_id) {
		this.user_id = user_id;
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
	 * @param password
	 *            格納するパスワード
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
	 * @param passwordcheck
	 *            格納するパスワード(確認用)
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
	 * @param name
	 *            格納する名前
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 名前（ふりがな）を取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @return name_f 取得する名前（ふりがな）
	 */
	public String getName_f() {
		return name_f;
	}

	/**
	 * 名前（ふりがな）を格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @param name_f
	 *            格納する名前（ふりがな）
	 */
	public void setName_f(String name_f) {
		this.name_f = name_f;
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
	 * @param postal
	 *            格納する郵便番号
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
	 * @param address
	 *            格納する住所
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 電話番号を取得するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @return tel_number 取得する電話番号
	 */
	public String getTel_number() {
		return tel_number;
	}

	/**
	 * 電話番号を格納するためのメソッド
	 *
	 * @author YUKI MAEDA
	 * @param tel_number
	 *            格納する電話番号
	 */
	public void setTel_number(String tel_number) {
		this.tel_number = tel_number;
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
	 * @param email
	 *            格納するメールアドレス
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
	 * @param sex
	 *            格納する性別
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
	 * @param birthday
	 *            格納する生年月日
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
	 * @param errorMsg
	 *            格納するエラーメッセージ
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	/**
	 * 格納メソッド セッションを格納
	 *
	 * @author YUKI MAEDA
	 * @param session
	 *            セッション
	 */
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}
}
