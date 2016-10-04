package com.internousdev.openconnect.decision.dto;
/**
 * 決裁状況一覧から検索したデータを溜め込むクラス。
 * @author KENICHI HORIGUCHI,KOUMEI IWAMOTO
 * @since 2016/09/14
 */
public class DecisionDTO {
	/**
	 * 登録日
	 *
	 */
	private String registration;
	/**
	 * ユーザーID
	 *
	 */
	private int userId;
	/**
	 * プロジェクトID
	 *
	 */
	private int projectId;
	/**
	 * 案件番号
	 *
	 */
	private int decisionId;
	/**
	 * 案件名
	 *
	 */
	private String decisionName;
	/**
	 * 詳細
	 *
	 */
	private String detail;
	/**
	 * 実施起案番号
	 *
	 */
	private String iDraftingId;
	/**
	 * 実施決裁番号
	 *
	 */
	private String iApprovalId;
	/**
	 * 契約起案番号
	 *
	 */
	private String aDraftingId;
	/**
	 * 契約決番号
	 *
	 */
	private String cdId;
	/**
	 * 実施兼契約起案番号
	 *
	 */
	private String iADId;
	/**
	 * 実施兼契約番号
	 *
	 */
	private String iAId;
	/**
	 * 姓
	 *
	 */
	private String familyNameKanji;
	/**
	 * 名
	 *
	 */
	private String givenNameKanji;
	/**
	 * プロジェクト名
	 *
	 */
	private String projectName;
	/**
	 *  数値を００００に直す
	 *
	 */
	private String decisionIdNumber;
	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return
	*/
	public String getRegistration() {
		return registration;
	}
	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param
	*/
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return
	*/
	public int getUserId() {
		return userId;
	}
	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param
	*/
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return
	*/
	public int getProjectId() {
		return projectId;
	}
	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param
	*/
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return
	*/
	public int getDecisionId() {
		return decisionId;
	}
	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param
	*/
	public void setDecisionId(int decisionId) {
		this.decisionId = decisionId;
	}
	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return
	*/
	public String getDecisionName() {
		return decisionName;
	}
	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param
	*/
	public void setDecisionName(String decisionName) {
		this.decisionName = decisionName;
	}
	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return
	*/
	public String getDetail() {
		return detail;
	}
	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param
	*/
	public void setDetail(String detail) {
		this.detail = detail;
	}
	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return
	*/
	public String getIDraftingId() {
		return iDraftingId;
	}
	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param
	*/
	public void setIDraftingId(String iDraftingId) {
		this.iDraftingId = iDraftingId;
	}
	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return
	*/
	public String getIApprovalId() {
		return iApprovalId;
	}
	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param
	*/
	public void setIApprovalId(String iApprovalId) {
		this.iApprovalId = iApprovalId;
	}
	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return
	*/
	public String getADraftingId() {
		return aDraftingId;
	}
	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param
	*/
	public void setADraftingId(String aDraftingId) {
		this.aDraftingId = aDraftingId;
	}
	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return
	*/
	public String getCdId() {
		return cdId;
	}
	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param
	*/
	public void setCdId(String cdId) {
		this.cdId = cdId;
	}
	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return
	*/
	public String getIADId() {
		return iADId;
	}
	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param
	*/
	public void setIADId(String iADId) {
		this.iADId = iADId;
	}
	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return
	*/
	public String getIAId() {
		return iAId;
	}
	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param
	*/
	public void setIAId(String iAId) {
		this.iAId = iAId;
	}
	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return
	*/
	public String getFamilyNameKanji() {
		return familyNameKanji;
	}
	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param
	*/
	public void setFamilyNameKanji(String familyNameKanji) {
		this.familyNameKanji = familyNameKanji;
	}
	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return
	*/
	public String getGivenNameKanji() {
		return givenNameKanji;
	}
	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param
	*/
	public void setGivenNameKanji(String givenNameKanji) {
		this.givenNameKanji = givenNameKanji;
	}
	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return
	*/
	public String getProjectName() {
		return projectName;
	}
	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param
	*/
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return
	*/
	public String getDecisionIdNumber() {
		return decisionIdNumber;
	}
	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param
	*/
	public void setDecisionIdNumber(String decisionIdNumber) {
		this.decisionIdNumber = decisionIdNumber;
	}


}
