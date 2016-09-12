package com.internousdev.openconnect.students.action;

import com.internousdev.openconnect.students.dao.StudentsInsertDAO;
import com.opensymphony.xwork2.ActionSupport;


public class StudentsInsertAction extends ActionSupport  {

	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = -2877294813706334535L;
	/**
	 * パス輪d－
	 */
	private String password;
	/**
	 * 姓(英語)
	 */
	private String familyName;
	/**
	 * 名(英語)
	 */
	private String givenName;
	/**
	 * 姓(漢字)
	 */
	private String familyNameKanji;
	/**
	 * 名(漢字)
	 */
	private String givenNameKanji;
	/**
	 * メールアドレス
	 */
	private String phoneEmail;
	/**
	 * 性別
	 */
	private String sex;
	/**
	 * ユーザーフラグ
	 */
	private int userFlg;
	/**
	 * 受講年
	 */
	private String year;
	/**
	 * 受講開始月
	 */
	private String month;

	/**
	 * DBの情報を追加する為のクラス
	 * @author KOHEI NITABARU
	 * @since 2016/09/04
	 * @version 1.0
	 */
	public String execute() {
		String result = ERROR;
		StudentsInsertDAO dao = new StudentsInsertDAO();
		int count = 0;
		count = dao.insert(password,familyName,givenName,familyNameKanji,givenNameKanji,phoneEmail,sex,userFlg,year,month);
		if (count > 0) {
			result = SUCCESS;
		}

		return result;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return password
	*/
	public String getPassword() {
		return password;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param password
	*/
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return familyName
	*/
	public String getFamilyName() {
		return familyName;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param familyName
	*/
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return givenName
	*/
	public String getGivenName() {
		return givenName;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param givenName
	*/
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return familyNameKanji
	*/
	public String getFamilyNameKanji() {
		return familyNameKanji;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param familyNameKanji
	*/
	public void setFamilyNameKanji(String familyNameKanji) {
		this.familyNameKanji = familyNameKanji;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return givenNameKanji
	*/
	public String getGivenNameKanji() {
		return givenNameKanji;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param givenNameKanji
	*/
	public void setGivenNameKanji(String givenNameKanji) {
		this.givenNameKanji = givenNameKanji;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return phoneEmail
	*/
	public String getPhoneEmail() {
		return phoneEmail;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param phoneEmail
	*/
	public void setPhoneEmail(String phoneEmail) {
		this.phoneEmail = phoneEmail;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return sex
	*/
	public String getSex() {
		return sex;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param sex
	*/
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return userFlg
	*/
	public int getUserFlg() {
		return userFlg;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param userFlg
	*/
	public void setUserFlg(int userFlg) {
		this.userFlg = userFlg;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return year
	*/
	public String getYear() {
		return year;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param year
	*/
	public void setYear(String year) {
		this.year = year;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return month
	*/
	public String getMonth() {
		return month;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param month
	*/
	public void setMonth(String month) {
		this.month = month;
	}

}