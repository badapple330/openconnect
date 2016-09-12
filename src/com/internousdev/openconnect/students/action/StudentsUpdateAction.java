package com.internousdev.openconnect.students.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.students.dao.StudentsUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

public class StudentsUpdateAction extends ActionSupport{
	private List<Integer> userIdList = new ArrayList<Integer>();
	private List<Integer> yearList = new ArrayList<Integer>();
	private List<String> monthList = new ArrayList<String>();
	private List<String> familyNameList = new ArrayList<String>();
	private List<String> givenNameList = new ArrayList<String>();
	private List<String> familyNameKanjiList = new ArrayList<String>();
	private List<String> familyNameKanaList = new ArrayList<String>();
	private List<String> givenNameKanjiList = new ArrayList<String>();
	private List<String> givenNameKanaList = new ArrayList<String>();
	private List<String> postalList = new ArrayList<String>();
	private List<String> addressList = new ArrayList<String>();
	private List<String> phoneNumberList = new ArrayList<String>();
	private List<String> phoneEmailList = new ArrayList<String>();
	private List<String> mobileNumberList = new ArrayList<String>();
	private List<String> mobileEmailList = new ArrayList<String>();
	private List<String> sexList = new ArrayList<String>();
	private List<String> birthdayList = new ArrayList<String>();
	private List<String> registerDayList = new ArrayList<String>();
	private List<String> updateDayList = new ArrayList<String>();
	private List<Boolean> userdelFlgList = new ArrayList<Boolean>();
	private List<Boolean> loginFlgList = new ArrayList<Boolean>();
	private List<Integer> userFlgList = new ArrayList<Integer>();
	private List<String> passwordList = new ArrayList<String>();

	public String execute() throws SQLException{

		String result =ERROR;
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
		}
		return result;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return userIdList
	*/
	public List<Integer> getUserIdList() {
		return userIdList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param userIdList
	*/
	public void setUserIdList(List<Integer> userIdList) {
		this.userIdList = userIdList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return yearList
	*/
	public List<Integer> getYearList() {
		return yearList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param yearList
	*/
	public void setYearList(List<Integer> yearList) {
		this.yearList = yearList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return monthList
	*/
	public List<String> getMonthList() {
		return monthList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param monthList
	*/
	public void setMonthList(List<String> monthList) {
		this.monthList = monthList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return familyNameList
	*/
	public List<String> getFamilyNameList() {
		return familyNameList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param familyNameList
	*/
	public void setFamilyNameList(List<String> familyNameList) {
		this.familyNameList = familyNameList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return givenNameList
	*/
	public List<String> getGivenNameList() {
		return givenNameList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param givenNameList
	*/
	public void setGivenNameList(List<String> givenNameList) {
		this.givenNameList = givenNameList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return familyNameKanjiList
	*/
	public List<String> getFamilyNameKanjiList() {
		return familyNameKanjiList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param familyNameKanjiList
	*/
	public void setFamilyNameKanjiList(List<String> familyNameKanjiList) {
		this.familyNameKanjiList = familyNameKanjiList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return familyNameKanaList
	*/
	public List<String> getFamilyNameKanaList() {
		return familyNameKanaList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param familyNameKanaList
	*/
	public void setFamilyNameKanaList(List<String> familyNameKanaList) {
		this.familyNameKanaList = familyNameKanaList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return givenNameKanjiList
	*/
	public List<String> getGivenNameKanjiList() {
		return givenNameKanjiList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param givenNameKanjiList
	*/
	public void setGivenNameKanjiList(List<String> givenNameKanjiList) {
		this.givenNameKanjiList = givenNameKanjiList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return givenNameKanaList
	*/
	public List<String> getGivenNameKanaList() {
		return givenNameKanaList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param givenNameKanaList
	*/
	public void setGivenNameKanaList(List<String> givenNameKanaList) {
		this.givenNameKanaList = givenNameKanaList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return postalList
	*/
	public List<String> getPostalList() {
		return postalList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param postalList
	*/
	public void setPostalList(List<String> postalList) {
		this.postalList = postalList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return addressList
	*/
	public List<String> getAddressList() {
		return addressList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param addressList
	*/
	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return phoneNumberList
	*/
	public List<String> getPhoneNumberList() {
		return phoneNumberList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param phoneNumberList
	*/
	public void setPhoneNumberList(List<String> phoneNumberList) {
		this.phoneNumberList = phoneNumberList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return phoneEmailList
	*/
	public List<String> getPhoneEmailList() {
		return phoneEmailList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param phoneEmailList
	*/
	public void setPhoneEmailList(List<String> phoneEmailList) {
		this.phoneEmailList = phoneEmailList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return mobileNumberList
	*/
	public List<String> getMobileNumberList() {
		return mobileNumberList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param mobileNumberList
	*/
	public void setMobileNumberList(List<String> mobileNumberList) {
		this.mobileNumberList = mobileNumberList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return mobileEmailList
	*/
	public List<String> getMobileEmailList() {
		return mobileEmailList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param mobileEmailList
	*/
	public void setMobileEmailList(List<String> mobileEmailList) {
		this.mobileEmailList = mobileEmailList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return sexList
	*/
	public List<String> getSexList() {
		return sexList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param sexList
	*/
	public void setSexList(List<String> sexList) {
		this.sexList = sexList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return birthdayList
	*/
	public List<String> getBirthdayList() {
		return birthdayList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param birthdayList
	*/
	public void setBirthdayList(List<String> birthdayList) {
		this.birthdayList = birthdayList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return registerDayList
	*/
	public List<String> getRegisterDayList() {
		return registerDayList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param registerDayList
	*/
	public void setRegisterDayList(List<String> registerDayList) {
		this.registerDayList = registerDayList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return updateDayList
	*/
	public List<String> getUpdateDayList() {
		return updateDayList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param updateDayList
	*/
	public void setUpdateDayList(List<String> updateDayList) {
		this.updateDayList = updateDayList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return userdelFlgList
	*/
	public List<Boolean> getUserdelFlgList() {
		return userdelFlgList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param userdelFlgList
	*/
	public void setUserdelFlgList(List<Boolean> userdelFlgList) {
		this.userdelFlgList = userdelFlgList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return loginFlgList
	*/
	public List<Boolean> getLoginFlgList() {
		return loginFlgList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param loginFlgList
	*/
	public void setLoginFlgList(List<Boolean> loginFlgList) {
		this.loginFlgList = loginFlgList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return userFlgList
	*/
	public List<Integer> getUserFlgList() {
		return userFlgList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param userFlgList
	*/
	public void setUserFlgList(List<Integer> userFlgList) {
		this.userFlgList = userFlgList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return passwordList
	*/
	public List<String> getPasswordList() {
		return passwordList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param passwordList
	*/
	public void setPasswordList(List<String> passwordList) {
		this.passwordList = passwordList;
	}

}