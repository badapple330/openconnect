package com.internousdev.openconnect.students.action;

import java.sql.SQLException;

import com.internousdev.openconnect.students.dao.StudentsUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * DBの受講生の情報を更新するクラス
 * @author KOHEI NITABARU
 * @since 2016/09/04
 * @version 1.0
 */
public class StudentsUpdateAction extends ActionSupport{

	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = 8587637642584563442L;
	/**
	 * ユーザーID
	 */
	private int userId;
	/**
	 * 受講年
	 */
	private int year;
	/**
	 * 受講開始月
	 */
	private String month;
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
	 * 姓(かな)
	 */
	private String familyNameKana;
	/**
	 * 名(漢字)
	 */
	private String givenNameKanji;
	/**
	 * 名(かな)
	 */
	private String givenNameKana;
	/**
	 * 郵便番号
	 */
	private String postal;
	/**
	 * 住所
	 */
	private String address;
	/**
	 * 電話番号
	 */
	private String phoneNumber;
	/**
	 * メールアドレス
	 */
	private String phoneEmail;
	/**
	 * 携帯電話番号
	 */
	private String mobileNumber;
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
	 * 作成日
	 */
	private String registerDay;
	/**
	 * 更新日
	 */
	private String updateDay;
	/**
	 * ユーザー削除フラグ
	 */
	private String userdelFlg;
	/**
	 * ログインフラグ
	 */
	private String loginFlg;
	/**
	 * ユーザーフラグ
	 */
	private int userFlg;
	/**
	 * パスワード
	 */
	private String password;

	/**
	 * 結果文字
	 */
	private String resultString = "更新に失敗しました。";

	/**
	 * 実行メソッド DBの受講生情報を更新
	 * @author KOHEI NITABARU
	 * @return result
	 */
	public String execute() throws SQLException{

		String result = ERROR;
		StudentsUpdateDAO dao = new StudentsUpdateDAO();
		int count = 0;
		count = dao.update(
				userId,password,familyName,givenName,familyNameKanji,familyNameKana,
				givenNameKanji,givenNameKana,postal,address,phoneNumber,phoneEmail,
				mobileNumber,mobileEmail,sex,birthday,userdelFlg.equals("TRUE"),
				loginFlg.equals("TRUE"),userFlg,year,month);

		if ( count > 0){
			result = SUCCESS;
			resultString = "更新に成功しました。";
		}
		return result;
	}

	/**
	 * 取得メソッド ユーザーIDを取得
	 * @author KOHEI NITABARU
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * 設定メソッド ユーザーIDを設定
	 * @author KOHEI NITABARU
	 * @param userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * 取得メソッド 受講年を取得
	 * @author KOHEI NITABARU
	 * @return year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * 設定メソッド 受講年を設定
	 * @author KOHEI NITABARU
	 * @param year
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * 取得メソッド 受講開始月を取得
	 * @author KOHEI NITABARU
	 * @return month
	 */
	public String getMonth() {
		return month;
	}

	/**
	 * 設定メソッド 受講開始月を設定
	 * @author KOHEI NITABARU
	 * @param month
	 */
	public void setMonth(String month) {
		this.month = month;
	}

	/**
	 * 取得メソッド 姓(英語)を取得
	 * @author KOHEI NITABARU
	 * @return familyName
	 */
	public String getFamilyName() {
		return familyName;
	}

	/**
	 * 設定メソッド 姓(英語)を設定
	 * @author KOHEI NITABARU
	 * @param familyName
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	/**
	 * 取得メソッド 名(英語)を取得
	 * @author KOHEI NITABARU
	 * @return givenName
	 */
	public String getGivenName() {
		return givenName;
	}

	/**
	 * 設定メソッド 名(英語)を設定
	 * @author KOHEI NITABARU
	 * @param givenName
	 */
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	/**
	 * 取得メソッド 姓(漢字)を取得
	 * @author KOHEI NITABARU
	 * @return familyNameKanji
	 */
	public String getFamilyNameKanji() {
		return familyNameKanji;
	}

	/**
	 * 設定メソッド 姓(漢字)を設定
	 * @author KOHEI NITABARU
	 * @param familyNameKanji
	 */
	public void setFamilyNameKanji(String familyNameKanji) {
		this.familyNameKanji = familyNameKanji;
	}

	/**
	 * 取得メソッド 姓(かな)を取得
	 * @author KOHEI NITABARU
	 * @return familyNameKana
	 */
	public String getFamilyNameKana() {
		return familyNameKana;
	}

	/**
	 * 設定メソッド 姓(かな)を設定
	 * @author KOHEI NITABARU
	 * @param familyNameKana
	 */
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}

	/**
	 * 取得メソッド 名(漢字)を取得
	 * @author KOHEI NITABARU
	 * @return givenNameKanji
	 */
	public String getGivenNameKanji() {
		return givenNameKanji;
	}

	/**
	 * 設定メソッド 名(漢字)を設定
	 * @author KOHEI NITABARU
	 * @param givenNameKanji
	 */
	public void setGivenNameKanji(String givenNameKanji) {
		this.givenNameKanji = givenNameKanji;
	}

	/**
	 * 取得メソッド 名(かな)を取得
	 * @author KOHEI NITABARU
	 * @return givenNameKana
	 */
	public String getGivenNameKana() {
		return givenNameKana;
	}

	/**
	 * 設定メソッド 名(かな)を設定
	 * @author KOHEI NITABARU
	 * @param givenNameKana
	 */
	public void setGivenNameKana(String givenNameKana) {
		this.givenNameKana = givenNameKana;
	}

	/**
	 * 取得メソッド 郵便番号を取得
	 * @author KOHEI NITABARU
	 * @return postal
	 */
	public String getPostal() {
		return postal;
	}

	/**
	 * 設定メソッド 郵便番号を設定
	 * @author KOHEI NITABARU
	 * @param postal
	 */
	public void setPostal(String postal) {
		this.postal = postal;
	}

	/**
	 * 取得メソッド 住所を取得
	 * @author KOHEI NITABARU
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 設定メソッド 住所を設定
	 * @author KOHEI NITABARU
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 取得メソッド 電話番号を取得
	 * @author KOHEI NITABARU
	 * @return phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * 設定メソッド 電話番号を設定
	 * @author KOHEI NITABARU
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * 取得メソッド メールアドレスを取得
	 * @author KOHEI NITABARU
	 * @return phoneEmail
	 */
	public String getPhoneEmail() {
		return phoneEmail;
	}

	/**
	 * 設定メソッド メールアドレスを設定
	 * @author KOHEI NITABARU
	 * @param phoneEmail
	 */
	public void setPhoneEmail(String phoneEmail) {
		this.phoneEmail = phoneEmail;
	}

	/**
	 * 取得メソッド 携帯電話番号を取得
	 * @author KOHEI NITABARU
	 * @return mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * 設定メソッド 携帯電話番号を設定
	 * @author KOHEI NITABARU
	 * @param mobileNumber
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * 取得メソッド 携帯メールアドレスを取得
	 * @author KOHEI NITABARU
	 * @return mobileEmail
	 */
	public String getMobileEmail() {
		return mobileEmail;
	}

	/**
	 * 設定メソッド 携帯メールアドレスを設定
	 * @author KOHEI NITABARU
	 * @param mobileEmail
	 */
	public void setMobileEmail(String mobileEmail) {
		this.mobileEmail = mobileEmail;
	}

	/**
	 * 取得メソッド 性別を取得
	 * @author KOHEI NITABARU
	 * @return sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * 設定メソッド 性別を設定
	 * @author KOHEI NITABARU
	 * @param sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * 取得メソッド 誕生日を取得
	 * @author KOHEI NITABARU
	 * @return birthday
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * 設定メソッド 誕生日を設定
	 * @author KOHEI NITABARU
	 * @param birthday
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * 取得メソッド 登録日を取得
	 * @author KOHEI NITABARU
	 * @return registerDay
	 */
	public String getRegisterDay() {
		return registerDay;
	}

	/**
	 * 設定メソッド 登録日を設定
	 * @author KOHEI NITABARU
	 * @param registerDay
	 */
	public void setRegisterDay(String registerDay) {
		this.registerDay = registerDay;
	}

	/**
	 * 取得メソッド 更新日を取得
	 * @author KOHEI NITABARU
	 * @return updateDay
	 */
	public String getUpdateDay() {
		return updateDay;
	}

	/**
	 * 設定メソッド 更新日を設定
	 * @author KOHEI NITABARU
	 * @param updateDay
	 */
	public void setUpdateDay(String updateDay) {
		this.updateDay = updateDay;
	}

	/**
	 * 取得メソッド ユーザー削除フラグを取得
	 * @author KOHEI NITABARU
	 * @return userdelFlg
	 */
	public String getUserdelFlg() {
		return userdelFlg;
	}

	/**
	 * 設定メソッド ユーザー削除フラグを設定
	 * @author KOHEI NITABARU
	 * @param userdelFlg
	 */
	public void setUserdelFlg(String userdelFlg) {
		this.userdelFlg = userdelFlg;
	}

	/**
	 * 取得メソッド ログインフラグを取得
	 * @author KOHEI NITABARU
	 * @return loginFlg
	 */
	public String getLoginFlg() {
		return loginFlg;
	}

	/**
	 * 設定メソッド ログインフラグを設定
	 * @author KOHEI NITABARU
	 * @param loginFlg
	 */
	public void setLoginFlg(String loginFlg) {
		this.loginFlg = loginFlg;
	}

	/**
	 * 取得メソッド ユーザーフラグを取得
	 * @author KOHEI NITABARU
	 * @return userFlg
	 */
	public int getUserFlg() {
		return userFlg;
	}

	/**
	 * 設定メソッド ユーザーフラグを設定
	 * @author KOHEI NITABARU
	 * @param userFlg
	 */
	public void setUserFlg(int userFlg) {
		this.userFlg = userFlg;
	}

	/**
	 * 取得メソッド パスワードを取得
	 * @author KOHEI NITABARU
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 設定メソッド パスワードを設定
	 * @author KOHEI NITABARU
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 取得メソッド 結果文字リストを取得
	 * @author KOHEI NITABARU
	 * @return resultString
	 */
	public String getResultString() {
		return resultString;
	}

	/**
	 * 設定メソッド 結果文字リストを設定
	 * @author KOHEI NITABARU
	 * @param resultString
	 */
	public void setResultString(String resultString) {
		this.resultString = resultString;
	}

	/**
	 * 取得メソッド シリアル番号を取得
	 * @author KOHEI NITABARU
	 * @return serialVersionUID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}