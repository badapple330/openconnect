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
	private String decisionId;
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

	private String familyNameKanji;

	private String givenNameKanji;

	private String projectName;


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
	public String getiDraftingId() {
		return iDraftingId;
	}
	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param
	*/
	public void setiDraftingId(String iDraftingId) {
		this.iDraftingId = iDraftingId;
	}
	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return
	*/
	public String getiApprovalId() {
		return iApprovalId;
	}
	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param
	*/
	public void setiApprovalId(String iApprovalId) {
		this.iApprovalId = iApprovalId;
	}
	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return
	*/
	public String getaDraftingId() {
		return aDraftingId;
	}
	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param
	*/
	public void setaDraftingId(String aDraftingId) {
		this.aDraftingId = aDraftingId;
	}
	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return
	*/
	public String getiADId() {
		return iADId;
	}
	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param
	*/
	public void setiADId(String iADId) {
		this.iADId = iADId;
	}
	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return
	*/
	public String getiAId() {
		return iAId;
	}
	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param
	*/
	public void setiAId(String iAId) {
		this.iAId = iAId;
	}

	/**
	 * 取得メソッド 登録日
	 * @author KENICHI HORIGUCHI
	 * @return registration
	 */
	public String getRegistration() {
		return registration;
	}
	/**
	* 取得メソッド
	* @author KOUMEI IWAMOTO
	* @return
	*/
	public String getFamilyNameKanji() {
		return familyNameKanji;
	}
	/**
	* 設定メソッド
	* @author KOUMEI IWAMOTO
	* @param
	*/
	public void setFamilyNameKanji(String familyNameKanji) {
		this.familyNameKanji = familyNameKanji;
	}
	/**
	* 取得メソッド
	* @author KOUMEI IWAMOTO
	* @return
	*/
	public String getGivenNameKanji() {
		return givenNameKanji;
	}
	/**
	* 設定メソッド
	* @author KOUMEI IWAMOTO
	* @param
	*/
	public void setGivenNameKanji(String givenNameKanji) {
		this.givenNameKanji = givenNameKanji;
	}
	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param registration
	 */
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	/**
	 * 取得メソッド ユーザーID
	 * @author KENICHI HORIGUCHI
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * 取得メソッド プロジェクトID
	 * @author KENICHI HORIGUCHI
	 * @return projectId
	 */
	public int getProjectId() {
		return projectId;
	}
	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param projectId
	 */
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	/**
	 * 取得メソッド 案件番号
	 * @author KENICHI HORIGUCHI
	 * @return decisionId
	 */
	public String getDecisionId() {
		return decisionId;
	}
	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param decisionId
	 */
	public void setDecisionId(String decisionId) {
		this.decisionId = decisionId;
	}
	/**
	 * 取得メソッド 案件名
	 * @author KENICHI HORIGUCHI
	 * @return decisionName
	 */
	public String getDecisionName() {
		return decisionName;
	}
	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param decisionName
	 */
	public void setDecisionName(String decisionName) {
		this.decisionName = decisionName;
	}
	/**
	 * 取得メソッド 詳細
	 * @author KENICHI HORIGUCHI
	 * @return detail
	 */
	public String getDetail() {
		return detail;
	}
	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param detail
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}
	/**
	 * 取得メソッド 実施起案番号
	 * @author KENICHI HORIGUCHI
	 * @return iDraftingId
	 */
	public String getIDraftingId() {
		return iDraftingId;
	}
	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param iDraftingId
	 */
	public void setIDraftingId(String iDraftingId) {
		this.iDraftingId = iDraftingId;
	}
	/**
	 * 取得メソッド 実施決裁番号
	 * @author KENICHI HORIGUCHI
	 * @return iApprovalId
	 */
	public String getIApprovalId() {
		return iApprovalId;
	}
	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param iApprovalId
	 */
	public void setIApprovalId(String iApprovalId) {
		this.iApprovalId = iApprovalId;
	}
	/**
	 * 取得メソッド 契約起案番号
	 * @author KENICHI HORIGUCHI
	 * @return aDraftingId
	 */
	public String getADraftingId() {
		return aDraftingId;
	}
	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param aDraftingId
	 */
	public void setADraftingId(String aDraftingId) {
		this.aDraftingId = aDraftingId;
	}
	/**
	 * 取得メソッド 契約決番号
	 * @author KENICHI HORIGUCHI
	 * @return cdId
	 */
	public String getCdId() {
		return cdId;
	}
	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param cdId
	 */
	public void setCdId(String cdId) {
		this.cdId = cdId;
	}
	/**
	 * 取得メソッド 実施兼契約起案番号
	 * @author KENICHI HORIGUCHI
	 * @return iADId
	 */
	public String getIADId() {
		return iADId;
	}
	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param iADId
	 */
	public void setIADId(String iADId) {
		this.iADId = iADId;
	}
	/**
	 * 取得メソッド 実施兼契約番号
	 * @author KENICHI HORIGUCHI
	 * @return iAId
	 */
	public String getIAId() {
		return iAId;
	}
	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param iAId
	 */
	public void setIAId(String iAId) {
		this.iAId = iAId;
	}
}
