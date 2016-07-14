package jp.co.internous.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import jp.co.internous.dao.RegisterDAO;

/**
 * 入力された新規情報をDAOに渡して結果を操作するためのクラス
 *
 * @author YUKI MAEDA
 * @since 2016/07/11
 */
public class RegisterAction extends ActionSupport implements SessionAware{
    public Map<String, Object> sessionMap;

	/**
	 * ユーザーID
	 */
	private String user_id ;

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
			if (dao.insert(user_id, password, name, name_f, postal, address, tel_number, email, sex,
				   birthday) > 0) {
				result = SUCCESS;
			    sessionMap.put("user", password);
			}
		}else{
			errorMsg = "そのＩＤは別のアカウントで使用されています";
		}
		return result;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getPasswordcheck() {
		return passwordcheck;
	}

	public void setPasswordcheck(String passwordcheck) {
		this.passwordcheck = passwordcheck;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName_f() {
		return name_f;
	}

	public void setName_f(String name_f) {
		this.name_f = name_f;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel_number() {
		return tel_number;
	}

	public void setTel_number(String tel_number) {
		this.tel_number = tel_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}


public void setSession(Map<String, Object> sessionMap) {
    this.sessionMap = sessionMap;
}
}
