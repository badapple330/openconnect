package com.internousdev.footprinter.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.footprinter.dao.MemberInfoDAO;
import com.opensymphony.xwork2.ActionSupport;


/**
 * 新規登録時、登録情報に重複があるかないかを判断するためのActionクラス
 * @author 田原 一樹
 * @since  1.0
 * @version 1.0
 */
public class SignUpConfirmAction extends ActionSupport implements SessionAware{
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 8299202327070012808L;
	/**
	 * メールアドレス
	 */
	private String email;
	/**
	 * password
	 */
	private String pass;
	/**
	 * 名前
	 */
	private String name;
	/**
	 * フリガナ
	 */
	private String kana;
	/**
	 * 電話番号
	 */
	private String tel;
	/**
	 * エラーメッセージ
	 */
	private String errorMsg;
	/**
	 * セッション
	 */
	private Map<String,Object>session;
	/**
	 * 取得した値をDAOへ渡し、結果をもらうメソッド
	 * @return result
	 */
	public String execute(){
		boolean result = false;
		MemberInfoDAO dao = new MemberInfoDAO();
		try {
			result = dao.isExists(email,pass);
			if (!result) {
				setErrorMsg(getText("lang.login.validMailRegisteredAlready"));
				return ERROR;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		session.put("email",email);
		session.put("pass",pass);
		session.put("name",name);
		session.put("kana",kana);
		session.put("tel",tel);
		return SUCCESS;
	}
	/**
	 * password取得メソッド
	 * @return pass
	 */
	public String getPass() {
		return pass;
	}
	/**
	 * password格納メソッド
	 * @param pass パスワード
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}
	/**
	 * セッション値取得メソッド
	 * @return session
	 */
	public Map<String,Object> getSession() {
		return session;
	}
	/**
	 * セッション値格納メソッド
	 * @param session セッション
	 */
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}
	/**
	 * メールアドレス取得メソッド
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * メールアドレス格納メソッド
	 * @param email メールアドレス
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 名前取得メソッド
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * 名前格納メソッド
	 * @param name 名前
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * フリガナ取得メソッド
	 * @return kana
	 */
	public String getKana() {
		return kana;
	}
	/**
	 * フリガナ格納メソッド
	 * @param kana 名前カナ
	 */
	public void setKana(String kana) {
		this.kana = kana;
	}
	/**
	 * 電話番号取得メソッド
	 * @return tel
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * 電話番号格納メソッド
	 * @param tel 電話番号
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/**
	 * エラーメッセージ取得メソッド
	 * @return　erroMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}
	/**
	 * エラーメッセージ格納メソッド
	 * @param errorMsg エラーメッセージ
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
