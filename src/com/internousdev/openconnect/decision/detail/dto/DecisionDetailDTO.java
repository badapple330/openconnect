/**
 *
 */
package com.internousdev.openconnect.decision.detail.dto;

/**
 * @author SOSHI AZUMA
 * 決裁手続きから検索したデータを溜め込むクラス。
 * @since 2017/06/15
 */
public class DecisionDetailDTO {


	/**
	 * 起案番号一時保管庫
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
	 * 比較用起案番号一時保管庫
	 */
	private String compareId;
	/**
	* 取得メソッド を取得
	* @return compareId
	*/
	public String getCompareId() {
		return compareId;
	}
	/**
	* 設定メソッド を設定
	* @param compareId
	*/
	public void setCompareId(String compareId) {
		this.compareId = compareId;
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
	 *  申請日
	 */
	private String applyDay;
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
	 * 承認状況
	 */
	private int permitStatus;
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
	* @return applyDay
	*/
	public String getApplyDay() {
		return applyDay;
	}
	/**
	* 設定メソッド を設定
	* @param applyDay
	*/
	public void setApplyDay(String applyDay) {
		this.applyDay = applyDay;
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
	* @return decisionStatus1
	*/
	public int getDecisionStatus1() {
		return decisionStatus1;
	}
	/**
	* 設定メソッド を設定
	* @param decisionStatus1
	*/
	public void setDecisionStatus1(int decisionStatus1) {
		this.decisionStatus1 = decisionStatus1;
	}
	/**
	* 取得メソッド を取得
	* @return decisionStatus2
	*/
	public int getDecisionStatus2() {
		return decisionStatus2;
	}
	/**
	* 設定メソッド を設定
	* @param decisionStatus2
	*/
	public void setDecisionStatus2(int decisionStatus2) {
		this.decisionStatus2 = decisionStatus2;
	}
	/**
	* 取得メソッド を取得
	* @return jImpId
	*/
	public String getjImpId() {
		return jImpId;
	}
	/**
	* 設定メソッド を設定
	* @param jImpId
	*/
	public void setjImpId(String jImpId) {
		this.jImpId = jImpId;
	}
	/**
	* 取得メソッド を取得
	* @return kImpId
	*/
	public String getkImpId() {
		return kImpId;
	}
	/**
	* 設定メソッド を設定
	* @param kImpId
	*/
	public void setkImpId(String kImpId) {
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
	* @return permitStatus
	*/
	public int getPermitStatus() {
		return permitStatus;
	}
	/**
	* 設定メソッド を設定
	* @param permitStatus
	*/
	public void setPermitStatus(int permitStatus) {
		this.permitStatus = permitStatus;
	}
	/**
	* 取得メソッド を取得
	* @return jPermiterId1
	*/
	public int getjPermiterId1() {
		return jPermiterId1;
	}
	/**
	* 設定メソッド を設定
	* @param jPermiterId1
	*/
	public void setjPermiterId1(int jPermiterId1) {
		this.jPermiterId1 = jPermiterId1;
	}
	/**
	* 取得メソッド を取得
	* @return jPermiterId2
	*/
	public int getjPermiterId2() {
		return jPermiterId2;
	}
	/**
	* 設定メソッド を設定
	* @param jPermiterId2
	*/
	public void setjPermiterId2(int jPermiterId2) {
		this.jPermiterId2 = jPermiterId2;
	}
	/**
	* 取得メソッド を取得
	* @return jPermiterId3
	*/
	public int getjPermiterId3() {
		return jPermiterId3;
	}
	/**
	* 設定メソッド を設定
	* @param jPermiterId3
	*/
	public void setjPermiterId3(int jPermiterId3) {
		this.jPermiterId3 = jPermiterId3;
	}
	/**
	* 取得メソッド を取得
	* @return kPermiterId1
	*/
	public int getkPermiterId1() {
		return kPermiterId1;
	}
	/**
	* 設定メソッド を設定
	* @param kPermiterId1
	*/
	public void setkPermiterId1(int kPermiterId1) {
		this.kPermiterId1 = kPermiterId1;
	}
	/**
	* 取得メソッド を取得
	* @return kPermiterId2
	*/
	public int getkPermiterId2() {
		return kPermiterId2;
	}
	/**
	* 設定メソッド を設定
	* @param kPermiterId2
	*/
	public void setkPermiterId2(int kPermiterId2) {
		this.kPermiterId2 = kPermiterId2;
	}
	/**
	* 取得メソッド を取得
	* @return kPermiterId3
	*/
	public int getkPermiterId3() {
		return kPermiterId3;
	}
	/**
	* 設定メソッド を設定
	* @param kPermiterId3
	*/
	public void setkPermiterId3(int kPermiterId3) {
		this.kPermiterId3 = kPermiterId3;
	}










}
