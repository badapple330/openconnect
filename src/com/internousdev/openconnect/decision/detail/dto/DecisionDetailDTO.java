/**
 *
 */
package com.internousdev.openconnect.decision.detail.dto;

/**
 * @author internous
 * 決裁手続きから検索したデータを溜め込むクラス。
 * @since 2016/09/07
 */
public class DecisionDetailDTO {

	/**
	 *  プロジェクトID
	 */
	private int projectId;
	/**
	 *  日付
	 */
	private String day;
	/**
	 *  決裁種類
	 */
	private String decisionType;
	/**
	 *  実施決裁状況
	 */
	private int decisionStatus1;
	/**
	 *  契約/実施兼契約決裁状況
	 */
	private int decisionStatus2;
	/**
	 *  ユーザーID
	 */
	private int userId;
	/**
	 *  リーダーID
	 */
	private int managerId;

	/**
	 *  サブリーダーID
	 */
	private int subManagerId;
	/**
	 *  案件名
	 */
	private String decisionName;
	/**
	 *  概要
	 */
	private String summary;
	/**
	 *  理由
	 */
	private String cause;
	/**
	 *  開始日
	 */
	private String startDay;
	/**
	 *  終了日
	 */
	private String endDay;
	/**
	 *  資料
	 */
	private String plan;
	/**
	 *  人数
	 */
	private int persons;
	/**
	 *  パスワード
	 */
	private String password;
	/**
	 *  決裁ID
	 */
	private int decisionId;
	/**
	 *  プロジェクト名
	 */
	private String projectName;
	/**
	 *  姓漢字
	 */
	private String familyNameKanji;
	/**
	 *  名漢字
	 */
	private String givenNameKanji;
	/**
	 *  開発要員
	 */
	private double developmentPersonnel;
	/**
	 *  開発端末
	 */
	private double developmentTerminal;
	/**
	 *  建設費用
	 */
	private double developmentPersonnelSum;
	/**
	 *  損益費用
	 */
	private double profitAndLossCost;
	/**
	 *  合計
	 */
	private double sum;
	/**
	 *  数値を００００に直す
	 */
	private String decisionIdNumber;
	/**
	 * 承認状況
	 */
	private int permitStatus;
	/**
	 * 承認ユーザーID1
	 */
	private int permitUserId1;
	/**
	 * 承認ユーザーID2
	 */
	private int permitUserId2;
	/**
	 * 承認ユーザーID3
	 */
	private int permitUserId3;
	/**
	 * ID番号要素数
	 */
	private String idNumAmount;




	/**
	* 取得メソッド を取得
	* @author KOHEI NITABARU
	* @return decisionName
	*/
	public String getDecisionName() {
		return decisionName;
	}
	/**
	* 設定メソッド を設定
	* @author KOHEI NITABARU
	* @param decisionName
	*/
	public void setDecisionName(String decisionName) {
		this.decisionName = decisionName;
	}
	/**
	* 取得メソッド を取得
	* @author KOHEI NITABARU
	* @return managerId
	*/
	public int getManagerId() {
		return managerId;
	}
	/**
	* 設定メソッド を設定
	* @author KOHEI NITABARU
	* @param managerId
	*/
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	/**
	* 取得メソッド を取得
	* @author KOHEI NITABARU
	* @return subManagerId
	*/
	public int getSubManagerId() {
		return subManagerId;
	}
	/**
	* 設定メソッド を設定
	* @author KOHEI NITABARU
	* @param subManagerId
	*/
	public void setSubManagerId(int subManagerId) {
		this.subManagerId = subManagerId;
	}

	/**
	* 取得メソッド
	* @author TATUHUMI ITOU
	* @return decisionIdNumber
	*/
	public String getDecisionIdNumber() {
		return decisionIdNumber;
	}
	/**
	* 設定メソッド
	* @author TATUHUMI ITOU
	* @param decisionIdNumber
	*/
	public void setDecisionIdNumber(String decisionIdNumber) {
		this.decisionIdNumber = decisionIdNumber;
	}
	/**
	* 取得メソッド を取得
	* @author TEPPEI MATSUMOTO
	* @return permitStatus
	*/
	public int getPermitStatus() {
		return permitStatus;
	}
	/**
	* 設定メソッド を設定
	* @author TEPPEI MATSUMOTO
	* @param permitStatus
	*/
	public void setPermitStatus(int permitStatus) {
		this.permitStatus = permitStatus;
	}
	public int getPermitUserId1() {
		return permitUserId1;
	}
	public void setPermitUserId1(int permitUserId1) {
		this.permitUserId1 = permitUserId1;
	}
	public int getPermitUserId2() {
		return permitUserId2;
	}
	public void setPermitUserId2(int permitUserId2) {
		this.permitUserId2 = permitUserId2;
	}
	public int getPermitUserId3() {
		return permitUserId3;
	}
	public void setPermitUserId3(int permitUserId3) {
		this.permitUserId3 = permitUserId3;
	}
	/**
	 * 取得メソッド 姓の漢字を取得
	 * @author TATUHUMI ITOU
	 * @return familyNameKanji
	 */
	public String getFamilyNameKanji() {
		return familyNameKanji;
	}
	/**
	 * 設定メソッド 姓の漢字を設定
	 * @author TATUHUMI ITOU
	 * @param familyNameKanji
	 */
	public void setFamilyNameKanji(String familyNameKanji) {
		this.familyNameKanji = familyNameKanji;
	}
	/**
	 * 取得メソッド 開発端末を取得
	 * @author TATUHUMI ITOU
	 * @return developmentTerminal
	 */

	public double getDevelopmentTerminal() {
		return developmentTerminal;
	}
	/**
	 * 取得メソッド 名の漢字を取得
	 * @author KENICHI HORIGUCHI
	 * @return givenNameKanji
	 */
	public String getGivenNameKanji() {
		return givenNameKanji;
	}
	/**
	 * 設定メソッド 名の漢字を設定
	 * @author KENICHI HORIGUCHI
	 * @param givenNameKanji
	 */
	public void setGivenNameKanji(String givenNameKanji) {
		this.givenNameKanji = givenNameKanji;
	}
	/**
	 * 設定メソッド 開発端末を設定
	 * @author TATUHUMI ITOU
	 * @param developmentTerminal
	 */
	public void setDevelopmentTerminal(double developmentTerminal) {
		this.developmentTerminal = developmentTerminal;
	}
	/**
	 * 取得メソッド 建設費用を取得
	 * @author TATUHUMI ITOU
	 * @return developmentPersonnelSum
	 */
	public double getDevelopmentPersonnelSum() {
		return developmentPersonnelSum;
	}
	/**
	 * 設定メソッド  建設費用を設定
	 * @author TATUHUMI ITOU
	 * @param developmentPersonnelSum
	 */
	public void setDevelopmentPersonnelSum(double developmentPersonnelSum) {
		this.developmentPersonnelSum = developmentPersonnelSum;
	}
	/**
	 * 取得メソッド 損益費用を取得
	 * @author TATUHUMI ITOU
	 * @return profitAndLossCost
	 */
	public double getProfitAndLossCost() {
		return profitAndLossCost;
	}
	/**
	 * 設定メソッド 損益費用を設定
	 * @author TATUHUMI ITOU
	 * @param profitAndLossCost
	 */
	public void setProfitAndLossCost(double profitAndLossCost) {
		this.profitAndLossCost = profitAndLossCost;
	}
	/**
	 * 取得メソッド 合計を取得
	 * @author TATUHUMI ITOU
	 * @return sum
	 */
	public double getSum() {
		return sum;
	}
	/**
	 * 設定メソッド 合計を設定
	 * @author TATUHUMI ITOU
	 * @param sum
	 */
	public void setSum(double sum) {
		this.sum = sum;
	}
	/**
	 * 取得メソッド 開発要員を取得
	 * @author TATUHUMI ITOU
	 * @return developmentPersonnel
	 */
	public double getDevelopmentPersonnel() {
		return developmentPersonnel;
	}
	/**
	 * 設定メソッド 開発要員を設定
	 * @author TATUHUMI ITOU
	 * @param developmentPersonnel
	 */
	public void setDevelopmentPersonnel(double developmentPersonnel) {
		this.developmentPersonnel = developmentPersonnel;
	}
	/**
	 * 取得メソッド プロジェクトIDを取得
	 * @author TATUHUMI ITOU
	 * @return projectId
	 */
	public int getProjectId() {
		return projectId;
	}
	/**
	 * 設定メソッド プロジェクトIDを設定
	 * @author TATUHUMI ITOU
	 * @param projectId
	 */
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	/**
	 * 取得メソッド 日付を取得
	 * @author TATUHUMI ITOU
	 * @return day
	 */
	public String getDay() {
		return day;
	}
	/**
	 * 設定メソッド 日付を設定
	 * @author　TATUHUMI ITOU
	 * @param day
	 */
	public void setDay(String day) {
		this.day = day;
	}
	/**
	 * 取得メソッド 決裁分類を取得
	 * @author TATUHUMI ITOU
	 * @return decisionType
	 */
	public String getDecisionType() {
		return decisionType;
	}
	/**
	 * 設定メソッド 決裁分類を設定
	 * @author TATUHUMI ITOU
	 * @param decisionType
	 */
	public void setDecisionType(String decisionType) {
		this.decisionType = decisionType;
	}
	/**
	* 取得メソッド を取得
	* @author KOHEI NITABARU
	* @return decisionStatus1
	*/
	public int getDecisionStatus1() {
		return decisionStatus1;
	}
	/**
	* 設定メソッド を設定
	* @author KOHEI NITABARU
	* @param decisionStatus1
	*/
	public void setDecisionStatus1(int decisionStatus1) {
		this.decisionStatus1 = decisionStatus1;
	}
	/**
	* 取得メソッド を取得
	* @author KOHEI NITABARU
	* @return decisionStatus2
	*/
	public int getDecisionStatus2() {
		return decisionStatus2;
	}
	/**
	* 設定メソッド を設定
	* @author KOHEI NITABARU
	* @param decisionStatus2
	*/
	public void setDecisionStatus2(int decisionStatus2) {
		this.decisionStatus2 = decisionStatus2;
	}
	/**
	 * 取得メソッド ユーザーIDを取得
	 * @author TATUHUMI ITOU
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * 設定メソッド ユーザーIDを設定
	 * @author TATUHUMI ITOU
	 * @param userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * 取得メソッド 概要を取得
	 * @author TATUHUMI ITOU
	 * @return summary
	 */
	public String getSummary() {
		return summary;
	}
	/**
	 * 設定メソッド 概要を設定
	 * @author TATUHUMI ITOU
	 * @param summary
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}
	/**
	 * 取得メソッド 理由を取得
	 * @author TATUHUMI ITOU
	 * @return cause
	 */
	public String getCause() {
		return cause;
	}
	/**
	 * 設定メソッド 理由を設定
	 * @author TATUHUMI ITOU
	 * @param cause
	 */
	public void setCause(String cause) {
		this.cause = cause;
	}
	/**
	 * 取得メソッド 開始日を取得
	 * @author TATUHUMI ITOU
	 * @return startDay
	 */
	public String getStartDay() {
		return startDay;
	}
	/**
	 * 設定メソッド 開始日を設定
	 * @author KOHEI NITABARU
	 * @param startDay
	 */
	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}
	/**
	 * 取得メソッド 終了日を取得
	 * @author KOHEI NITABARU
	 * @return endDay
	 */
	public String getEndDay() {
		return endDay;
	}
	/**
	 * 設定メソッド 終了日を設定
	 * @author KOHEI NITABARU
	 * @param endDay
	 */
	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}
	/**
	 * 取得メソッド 資料を取得
	 * @author TATUHUMI ITOU
	 * @return plan
	 */
	public String getPlan() {
		return plan;
	}
	/**
	 * 設定メソッド 資料を取得
	 * @author TATUHUMI ITOU
	 * @param plan
	 */
	public void setPlan(String plan) {
		this.plan = plan;
	}
	/**
	 * 取得メソッド 人数を取得
	 * @author TATUHUMI ITOU
	 * @return persons
	 */

	/**
	 * 取得メソッド パスワードを取得
	 * @author TATUHUMI ITOU
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 取得メソッド 人数を取得
	 * @author TATUHUMI ITOU
	 * @return persons
	 */
	public int getPersons() {
		return persons;
	}
	/**
	 * 設定メソッド 人数を設定
	 * @author TATUHUMI ITOU
	 * @param
	 */
	public void setPersons(int persons) {
		this.persons = persons;
	}
	/**
	 * 設定メソッド パスワードを設定
	 * @author TATUHUMI ITOU
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 取得メソッド 決裁IDを取得
	 * @author TATUHUMI ITOU
	 * @return decisionId
	 */
	public int getDecisionId() {
		return decisionId;
	}
	/**
	 * 設定メソッド 決裁IDを設定
	 * @author TATUHUMI ITOU
	 * @param decisionId
	 */
	public void setDecisionId(int decisionId) {
		this.decisionId = decisionId;
	}
	/**
	 * 取得メソッド プロジェクト名を取得
	 * @author TATUHUMI ITOU
	 * @return projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * 設定メソッド プロジェクト名を設定
	 * @author TATUHUMI ITOU
	 * @param projectName
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	* 取得メソッド を取得
	* @return idNumAmount
	*/
	public String getIdNumAmount() {
		return idNumAmount;
	}
	/**
	* 設定メソッド を設定
	* @param idNumAmount
	*/
	public void setIdNumAmount(String idNumAmount) {
		this.idNumAmount = idNumAmount;
	}


}
