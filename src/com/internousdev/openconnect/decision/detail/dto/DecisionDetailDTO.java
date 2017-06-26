/**
 *
 */
package com.internousdev.openconnect.decision.detail.dto;

/**
 * 決裁手続きに関するデータを溜め込むDTOクラス。
 * @author SOSHI AZUMA
 * @since 2017/06/15
 * @version 1.0
 */
public class DecisionDetailDTO {


	/**
	 * 起案番号一時保管庫(DecisionDetailApplicationDAO)
	 */
	private String idNumAmount;

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



	/**
	 * sessionから取得したログイン中ユーザーID
	 */
	private int userId;
	/**
	* 取得メソッド を取得
	* @return userId
	*/
	public int getUserId() {
		return userId;
	}
	/**
	* 設定メソッド を設定
	* @param userId
	*/
	public void setUserId(int userId) {
		this.userId = userId;
	}



	/**
	 *  リーダーID
	 */
	private int managerId;
	/**
	 *  サブリーダーID
	 */
	private int subManagerId;
	/**
	 *  プロジェクト名
	 */
	private String projectName;




	/**
	 *  決裁ID
	 */
	private int decisionId;
	/**
	 *  プロジェクトID
	 */
	private int projectId;
	/**
	 *  実施申請日
	 */
	private String jApplyDay;
	/**
	 *  契約/実施兼契約申請日
	 */
	private String kApplyDay;
	/**
	 *  遡求申請日
	 */
	private String sApplyDay;
	/**
	 *  決裁種類
	 */
	private String decisionType;
	/**
	 *  決裁進捗状況
	 */
	private int decisionStatus;






	/**
	 * 実施起案番号
	 */
	private String jImpId;
	/**
	 * 契約起案番号
	 */
	private String kImpId;
	/**
	 * 実施兼契約起案番号
	 */
	private String jkImpId;
	/**
	 * [実施]承認状況
	 */
	private int permitStatusJ;
	/**
	 * [契約/実施兼契約]承認状況
	 */
	private int permitStatusK;
	/**
	 * [遡求]承認状況
	 */
	private int permitStatusS;
	/**
	 * 実施_承認者ID(1人目:リーダー)
	 */
	private int jPermiterId1;
	/**
	 * 実施_承認者ID(2人目:リーダー)
	 */
	private int jPermiterId2;
	/**
	 * 実施_承認者ID(3人目:先生)
	 */
	private int jPermiterId3;
	/**
	 * 契約_承認者ID(1人目:リーダー)
	 */
	private int kPermiterId1;
	/**
	 * 契約_承認者ID(2人目:リーダー)
	 */
	private int kPermiterId2;
	/**
	 * 契約_承認者ID(3人目:先生)
	 */
	private int kPermiterId3;











	/**
	* 取得メソッド を取得
	* @return managerId
	*/
	public int getManagerId() {
		return managerId;
	}
	/**
	* 設定メソッド を設定
	* @param managerId
	*/
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	/**
	* 取得メソッド を取得
	* @return subManagerId
	*/
	public int getSubManagerId() {
		return subManagerId;
	}
	/**
	* 設定メソッド を設定
	* @param subManagerId
	*/
	public void setSubManagerId(int subManagerId) {
		this.subManagerId = subManagerId;
	}
	/**
	* 取得メソッド を取得
	* @return projectName
	*/
	public String getProjectName() {
		return projectName;
	}
	/**
	* 設定メソッド を設定
	* @param projectName
	*/
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	* 取得メソッド を取得
	* @return decisionId
	*/
	public int getDecisionId() {
		return decisionId;
	}
	/**
	* 設定メソッド を設定
	* @param decisionId
	*/
	public void setDecisionId(int decisionId) {
		this.decisionId = decisionId;
	}
	/**
	* 取得メソッド を取得
	* @return projectId
	*/
	public int getProjectId() {
		return projectId;
	}
	/**
	* 設定メソッド を設定
	* @param projectId
	*/
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	/**
	* 取得メソッド を取得
	* @return jApplyDay
	*/
	public String getJApplyDay() {
		return jApplyDay;
	}
	/**
	* 設定メソッド を設定
	* @param jApplyDay
	*/
	public void setJApplyDay(String jApplyDay) {
		this.jApplyDay = jApplyDay;
	}
	/**
	* 取得メソッド を取得
	* @return kApplyDay
	*/
	public String getKApplyDay() {
		return kApplyDay;
	}
	/**
	* 設定メソッド を設定
	* @param kApplyDay
	*/
	public void setKApplyDay(String kApplyDay) {
		this.kApplyDay = kApplyDay;
	}
	/**
	* 取得メソッド を取得
	* @return sApplyDay
	*/
	public String getSApplyDay() {
		return sApplyDay;
	}
	/**
	* 設定メソッド を設定
	* @param sApplyDay
	*/
	public void setSApplyDay(String sApplyDay) {
		this.sApplyDay = sApplyDay;
	}
	/**
	* 取得メソッド を取得
	* @return decisionType
	*/
	public String getDecisionType() {
		return decisionType;
	}
	/**
	* 設定メソッド を設定
	* @param decisionType
	*/
	public void setDecisionType(String decisionType) {
		this.decisionType = decisionType;
	}
	/**
	* 取得メソッド を取得
	* @return decisionStatus
	*/
	public int getDecisionStatus() {
		return decisionStatus;
	}
	/**
	* 設定メソッド を設定
	* @param decisionStatus
	*/
	public void setDecisionStatus(int decisionStatus) {
		this.decisionStatus = decisionStatus;
	}
	/**
	* 取得メソッド を取得
	* @return jImpId
	*/
	public String getJImpId() {
		return jImpId;
	}
	/**
	* 設定メソッド を設定
	* @param jImpId
	*/
	public void setJImpId(String jImpId) {
		this.jImpId = jImpId;
	}
	/**
	* 取得メソッド を取得
	* @return kImpId
	*/
	public String getKImpId() {
		return kImpId;
	}
	/**
	* 設定メソッド を設定
	* @param kImpId
	*/
	public void setKImpId(String kImpId) {
		this.kImpId = kImpId;
	}
	/**
	* 取得メソッド を取得
	* @return jkImpId
	*/
	public String getJkImpId() {
		return jkImpId;
	}
	/**
	* 設定メソッド を設定
	* @param jkImpId
	*/
	public void setJkImpId(String jkImpId) {
		this.jkImpId = jkImpId;
	}
	/**
	* 取得メソッド を取得
	* @return permitStatusJ
	*/
	public int getPermitStatusJ() {
		return permitStatusJ;
	}
	/**
	* 設定メソッド を設定
	* @param permitStatusJ
	*/
	public void setPermitStatusJ(int permitStatusJ) {
		this.permitStatusJ = permitStatusJ;
	}
	/**
	* 取得メソッド を取得
	* @return permitStatusK
	*/
	public int getPermitStatusK() {
		return permitStatusK;
	}
	/**
	* 設定メソッド を設定
	* @param permitStatusK
	*/
	public void setPermitStatusK(int permitStatusK) {
		this.permitStatusK = permitStatusK;
	}
	/**
	* 取得メソッド を取得
	* @return permitStatusS
	*/
	public int getPermitStatusS() {
		return permitStatusS;
	}
	/**
	* 設定メソッド を設定
	* @param permitStatusS
	*/
	public void setPermitStatusS(int permitStatusS) {
		this.permitStatusS = permitStatusS;
	}
	/**
	* 取得メソッド を取得
	* @return jPermiterId1
	*/
	public int getJPermiterId1() {
		return jPermiterId1;
	}
	/**
	* 設定メソッド を設定
	* @param jPermiterId1
	*/
	public void setJPermiterId1(int jPermiterId1) {
		this.jPermiterId1 = jPermiterId1;
	}
	/**
	* 取得メソッド を取得
	* @return jPermiterId2
	*/
	public int getJPermiterId2() {
		return jPermiterId2;
	}
	/**
	* 設定メソッド を設定
	* @param jPermiterId2
	*/
	public void setJPermiterId2(int jPermiterId2) {
		this.jPermiterId2 = jPermiterId2;
	}
	/**
	* 取得メソッド を取得
	* @return jPermiterId3
	*/
	public int getJPermiterId3() {
		return jPermiterId3;
	}
	/**
	* 設定メソッド を設定
	* @param jPermiterId3
	*/
	public void setJPermiterId3(int jPermiterId3) {
		this.jPermiterId3 = jPermiterId3;
	}
	/**
	* 取得メソッド を取得
	* @return kPermiterId1
	*/
	public int getKPermiterId1() {
		return kPermiterId1;
	}
	/**
	* 設定メソッド を設定
	* @param kPermiterId1
	*/
	public void setKPermiterId1(int kPermiterId1) {
		this.kPermiterId1 = kPermiterId1;
	}
	/**
	* 取得メソッド を取得
	* @return kPermiterId2
	*/
	public int getKPermiterId2() {
		return kPermiterId2;
	}
	/**
	* 設定メソッド を設定
	* @param kPermiterId2
	*/
	public void setKPermiterId2(int kPermiterId2) {
		this.kPermiterId2 = kPermiterId2;
	}
	/**
	* 取得メソッド を取得
	* @return kPermiterId3
	*/
	public int getKPermiterId3() {
		return kPermiterId3;
	}
	/**
	* 設定メソッド を設定
	* @param kPermiterId3
	*/
	public void setKPermiterId3(int kPermiterId3) {
		this.kPermiterId3 = kPermiterId3;
	}










}
