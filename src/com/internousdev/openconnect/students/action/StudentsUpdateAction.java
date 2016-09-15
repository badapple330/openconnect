package com.internousdev.openconnect.students.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	 * ユーザーIDリスト
	 */
	private List<Integer> userIdList = new ArrayList<Integer>();
	/**
	 * 受講年リスト
	 */
	private List<Integer> yearList = new ArrayList<Integer>();
	/**
	 * 受講開始月リスト
	 */
	private List<String> monthList = new ArrayList<String>();
	/**
	 * 姓(英語)リスト
	 */
	private List<String> familyNameList = new ArrayList<String>();
	/**
	 * 名(英語)リスト
	 */
	private List<String> givenNameList = new ArrayList<String>();
	/**
	 * 姓(漢字)リスト
	 */
	private List<String> familyNameKanjiList = new ArrayList<String>();
	/**
	 * 姓(かな)リスト
	 */
	private List<String> familyNameKanaList = new ArrayList<String>();
	/**
	 * 名(漢字)リスト
	 */
	private List<String> givenNameKanjiList = new ArrayList<String>();
	/**
	 * 名(かな)リスト
	 */
	private List<String> givenNameKanaList = new ArrayList<String>();
	/**
	 * 郵便番号リスト
	 */
	private List<String> postalList = new ArrayList<String>();
	/**
	 * 住所リスト
	 */
	private List<String> addressList = new ArrayList<String>();
	/**
	 * 電話番号リスト
	 */
	private List<String> phoneNumberList = new ArrayList<String>();
	/**
	 * メールアドレスリスト
	 */
	private List<String> phoneEmailList = new ArrayList<String>();
	/**
	 * 携帯電話番号リスト
	 */
	private List<String> mobileNumberList = new ArrayList<String>();
	/**
	 * 携帯メールアドレスリスト
	 */
	private List<String> mobileEmailList = new ArrayList<String>();
	/**
	 * 性別リスト
	 */
	private List<String> sexList = new ArrayList<String>();
	/**
	 * 誕生日リスト
	 */
	private List<String> birthdayList = new ArrayList<String>();
	/**
	 * 作成日リスト
	 */
	private List<String> registerDayList = new ArrayList<String>();
	/**
	 * 更新日リスト
	 */
	private List<String> updateDayList = new ArrayList<String>();
	/**
	 * ユーザー削除フラグリスト
	 */
	private List<Boolean> userdelFlgList = new ArrayList<Boolean>();
	/**
	 * ログインフラグリスト
	 */
	private List<Boolean> loginFlgList = new ArrayList<Boolean>();
	/**
	 * ユーザーフラグリスト
	 */
	private List<Integer> userFlgList = new ArrayList<Integer>();
	/**
	 * パスワードリスト
	 */
	private List<String> passwordList = new ArrayList<String>();
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
		for(int i=0;i< userIdList.size();++i){
			count = dao.update(
					userIdList.get(i),passwordList.get(i),familyNameList.get(i),givenNameList.get(i),familyNameKanjiList.get(i),familyNameKanaList.get(i),
					givenNameKanjiList.get(i),givenNameKanaList.get(i),postalList.get(i),addressList.get(i),phoneNumberList.get(i),phoneEmailList.get(i),
					mobileNumberList.get(i),mobileEmailList.get(i),sexList.get(i),birthdayList.get(i),registerDayList.get(i),updateDayList.get(i),userdelFlgList.get(i),
					loginFlgList.get(i),userFlgList.get(i),yearList.get(i),monthList.get(i));
		}
		if ( count > 0){
			result = SUCCESS;
			resultString = "更新に成功しました。";
		}
		return result;
	}

	/**
	* 取得メソッド ユーザーIDリストを取得
	* @author KOHEI NITABARU
	* @return userIdList
	*/
	public List<Integer> getUserIdList() {
		return userIdList;
	}

	/**
	* 設定メソッド ユーザーIDリストを設定
	* @author KOHEI NITABARU
	* @param userIdList
	*/
	public void setUserIdList(List<Integer> userIdList) {
		this.userIdList = userIdList;
	}

	/**
	* 取得メソッド 受講年リストを取得
	* @author KOHEI NITABARU
	* @return yearList
	*/
	public List<Integer> getYearList() {
		return yearList;
	}

	/**
	* 設定メソッド 受講年リストを設定
	* @author KOHEI NITABARU
	* @param yearList
	*/
	public void setYearList(List<Integer> yearList) {
		this.yearList = yearList;
	}

	/**
	* 取得メソッド 受講開始月リストを取得
	* @author KOHEI NITABARU
	* @return monthList
	*/
	public List<String> getMonthList() {
		return monthList;
	}

	/**
	* 設定メソッド 受講開始月リストを設定
	* @author KOHEI NITABARU
	* @param monthList
	*/
	public void setMonthList(List<String> monthList) {
		this.monthList = monthList;
	}

	/**
	* 取得メソッド 姓(英語)リストを取得
	* @author KOHEI NITABARU
	* @return familyNameList
	*/
	public List<String> getFamilyNameList() {
		return familyNameList;
	}

	/**
	* 設定メソッド 姓(英語)リストを設定
	* @author KOHEI NITABARU
	* @param familyNameList
	*/
	public void setFamilyNameList(List<String> familyNameList) {
		this.familyNameList = familyNameList;
	}

	/**
	* 取得メソッド 名(英語)リストを取得
	* @author KOHEI NITABARU
	* @return givenNameList
	*/
	public List<String> getGivenNameList() {
		return givenNameList;
	}

	/**
	* 設定メソッド 名(英語)リストを設定
	* @author KOHEI NITABARU
	* @param givenNameList
	*/
	public void setGivenNameList(List<String> givenNameList) {
		this.givenNameList = givenNameList;
	}

	/**
	* 取得メソッド 姓(漢字)リストを取得
	* @author KOHEI NITABARU
	* @return familyNameKanjiList
	*/
	public List<String> getFamilyNameKanjiList() {
		return familyNameKanjiList;
	}

	/**
	* 設定メソッド 姓(漢字)リストを設定
	* @author KOHEI NITABARU
	* @param familyNameKanjiList
	*/
	public void setFamilyNameKanjiList(List<String> familyNameKanjiList) {
		this.familyNameKanjiList = familyNameKanjiList;
	}

	/**
	* 取得メソッド 姓(かな)リストを取得
	* @author KOHEI NITABARU
	* @return familyNameKanaList
	*/
	public List<String> getFamilyNameKanaList() {
		return familyNameKanaList;
	}

	/**
	* 設定メソッド 姓(かな)リストを設定
	* @author KOHEI NITABARU
	* @param familyNameKanaList
	*/
	public void setFamilyNameKanaList(List<String> familyNameKanaList) {
		this.familyNameKanaList = familyNameKanaList;
	}

	/**
	* 取得メソッド 名(漢字)リストを取得
	* @author KOHEI NITABARU
	* @return givenNameKanjiList
	*/
	public List<String> getGivenNameKanjiList() {
		return givenNameKanjiList;
	}

	/**
	* 設定メソッド 名(漢字)リストを設定
	* @author KOHEI NITABARU
	* @param givenNameKanjiList
	*/
	public void setGivenNameKanjiList(List<String> givenNameKanjiList) {
		this.givenNameKanjiList = givenNameKanjiList;
	}

	/**
	* 取得メソッド 名(かな)リストを取得
	* @author KOHEI NITABARU
	* @return givenNameKanaList
	*/
	public List<String> getGivenNameKanaList() {
		return givenNameKanaList;
	}

	/**
	* 設定メソッド 名(かな)リストを設定
	* @author KOHEI NITABARU
	* @param givenNameKanaList
	*/
	public void setGivenNameKanaList(List<String> givenNameKanaList) {
		this.givenNameKanaList = givenNameKanaList;
	}

	/**
	* 取得メソッド 郵便番号リストを取得
	* @author KOHEI NITABARU
	* @return postalList
	*/
	public List<String> getPostalList() {
		return postalList;
	}

	/**
	* 設定メソッド 郵便番号リストを設定
	* @author KOHEI NITABARU
	* @param postalList
	*/
	public void setPostalList(List<String> postalList) {
		this.postalList = postalList;
	}

	/**
	* 取得メソッド 住所リストを取得
	* @author KOHEI NITABARU
	* @return addressList
	*/
	public List<String> getAddressList() {
		return addressList;
	}

	/**
	* 設定メソッド 住所リストを設定
	* @author KOHEI NITABARU
	* @param addressList
	*/
	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}

	/**
	* 取得メソッド 電話番号リストを取得
	* @author KOHEI NITABARU
	* @return phoneNumberList
	*/
	public List<String> getPhoneNumberList() {
		return phoneNumberList;
	}

	/**
	* 設定メソッド 電話番号リストを設定
	* @author KOHEI NITABARU
	* @param phoneNumberList
	*/
	public void setPhoneNumberList(List<String> phoneNumberList) {
		this.phoneNumberList = phoneNumberList;
	}

	/**
	* 取得メソッド メールアドレスリストを取得
	* @author KOHEI NITABARU
	* @return phoneEmailList
	*/
	public List<String> getPhoneEmailList() {
		return phoneEmailList;
	}

	/**
	* 設定メソッド メールアドレスリストを設定
	* @author KOHEI NITABARU
	* @param phoneEmailList
	*/
	public void setPhoneEmailList(List<String> phoneEmailList) {
		this.phoneEmailList = phoneEmailList;
	}

	/**
	* 取得メソッド 携帯電話番号リストを取得
	* @author KOHEI NITABARU
	* @return mobileNumberList
	*/
	public List<String> getMobileNumberList() {
		return mobileNumberList;
	}

	/**
	* 設定メソッド 携帯電話番号リストを設定
	* @author KOHEI NITABARU
	* @param mobileNumberList
	*/
	public void setMobileNumberList(List<String> mobileNumberList) {
		this.mobileNumberList = mobileNumberList;
	}

	/**
	* 取得メソッド 携帯メールアドレスリストを取得
	* @author KOHEI NITABARU
	* @return mobileEmailList
	*/
	public List<String> getMobileEmailList() {
		return mobileEmailList;
	}

	/**
	* 設定メソッド 携帯メールアドレスリストを設定
	* @author KOHEI NITABARU
	* @param mobileEmailList
	*/
	public void setMobileEmailList(List<String> mobileEmailList) {
		this.mobileEmailList = mobileEmailList;
	}

	/**
	* 取得メソッド 性別リストを取得
	* @author KOHEI NITABARU
	* @return sexList
	*/
	public List<String> getSexList() {
		return sexList;
	}

	/**
	* 設定メソッド 性別リストを設定
	* @author KOHEI NITABARU
	* @param sexList
	*/
	public void setSexList(List<String> sexList) {
		this.sexList = sexList;
	}

	/**
	* 取得メソッド 誕生日リストを取得
	* @author KOHEI NITABARU
	* @return birthdayList
	*/
	public List<String> getBirthdayList() {
		return birthdayList;
	}

	/**
	* 設定メソッド 誕生日リストを設定
	* @author KOHEI NITABARU
	* @param birthdayList
	*/
	public void setBirthdayList(List<String> birthdayList) {
		this.birthdayList = birthdayList;
	}

	/**
	* 取得メソッド 登録日リストを取得
	* @author KOHEI NITABARU
	* @return registerDayList
	*/
	public List<String> getRegisterDayList() {
		return registerDayList;
	}

	/**
	* 設定メソッド 登録日リストを設定
	* @author KOHEI NITABARU
	* @param registerDayList
	*/
	public void setRegisterDayList(List<String> registerDayList) {
		this.registerDayList = registerDayList;
	}

	/**
	* 取得メソッド 更新日リストを取得
	* @author KOHEI NITABARU
	* @return updateDayList
	*/
	public List<String> getUpdateDayList() {
		return updateDayList;
	}

	/**
	* 設定メソッド 更新日リストを設定
	* @author KOHEI NITABARU
	* @param updateDayList
	*/
	public void setUpdateDayList(List<String> updateDayList) {
		this.updateDayList = updateDayList;
	}

	/**
	* 取得メソッド ユーザー削除フラグリストを取得
	* @author KOHEI NITABARU
	* @return userdelFlgList
	*/
	public List<Boolean> getUserdelFlgList() {
		return userdelFlgList;
	}

	/**
	* 設定メソッド ユーザー削除フラグリストを設定
	* @author KOHEI NITABARU
	* @param userdelFlgList
	*/
	public void setUserdelFlgList(List<Boolean> userdelFlgList) {
		this.userdelFlgList = userdelFlgList;
	}

	/**
	* 取得メソッド ログインフラグリストを取得
	* @author KOHEI NITABARU
	* @return loginFlgList
	*/
	public List<Boolean> getLoginFlgList() {
		return loginFlgList;
	}

	/**
	* 設定メソッド ログインフラグリストを設定
	* @author KOHEI NITABARU
	* @param loginFlgList
	*/
	public void setLoginFlgList(List<Boolean> loginFlgList) {
		this.loginFlgList = loginFlgList;
	}

	/**
	* 取得メソッド ユーザーフラグリストを取得
	* @author KOHEI NITABARU
	* @return userFlgList
	*/
	public List<Integer> getUserFlgList() {
		return userFlgList;
	}

	/**
	* 設定メソッド ユーザーフラグリストを設定
	* @author KOHEI NITABARU
	* @param userFlgList
	*/
	public void setUserFlgList(List<Integer> userFlgList) {
		this.userFlgList = userFlgList;
	}

	/**
	* 取得メソッド パスワードリストを取得
	* @author KOHEI NITABARU
	* @return passwordList
	*/
	public List<String> getPasswordList() {
		return passwordList;
	}

	/**
	* 設定メソッド パスワードリストを設定
	* @author KOHEI NITABARU
	* @param passwordList
	*/
	public void setPasswordList(List<String> passwordList) {
		this.passwordList = passwordList;
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