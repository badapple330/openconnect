/**
 *
 */
package com.internousdev.openconnect.projectStatus.dto;

/**
 * DBの情報を画面に表示する為のクラス
 * @author KOHEI NITABARU
 * @since 2016/09/04
 * @version 1.0
 */
public class ProjectStatusDTO {
	/**
	 * プロジェクトID
	 */
	private int projectId;
	/**
	 * プロジェクト名
	 */
	private String projectName;
	/**
	 * A環境開始日
	 */
	private String aEnvStart;
	/**
	 * A環境終了日
	 */
	private String aEnvEnd;
	/**
	 * B環境開始日
	 */
	private String bEnvStart;
	/**
	 * B環境終了日
	 */
	private String bEnvEnd;
	/**
	 * リリース環境開始日
	 */
	private String rEnvStart;
	/**
	 * リリース環境終了日
	 */
	private String rEnvEnd;
	/**
	 * リリース状況
	 */
	private String awsStatus;
	/**
	 * 備考
	 */
	private String note;
	/**
	 * リリース状況ID
	 */
	private int statusId;
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return projectId
	*/
	public int getProjectId() {
		return projectId;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param projectId
	*/
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return projectName
	*/
	public String getProjectName() {
		return projectName;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param projectName
	*/
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return aEnvStart
	*/
	public String getaEnvStart() {
		return aEnvStart;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param aEnvStart
	*/
	public void setaEnvStart(String aEnvStart) {
		this.aEnvStart = aEnvStart;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return aEnvEnd
	*/
	public String getaEnvEnd() {
		return aEnvEnd;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param aEnvEnd
	*/
	public void setaEnvEnd(String aEnvEnd) {
		this.aEnvEnd = aEnvEnd;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return bEnvStart
	*/
	public String getbEnvStart() {
		return bEnvStart;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param bEnvStart
	*/
	public void setbEnvStart(String bEnvStart) {
		this.bEnvStart = bEnvStart;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return bEnvEnd
	*/
	public String getbEnvEnd() {
		return bEnvEnd;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param bEnvEnd
	*/
	public void setbEnvEnd(String bEnvEnd) {
		this.bEnvEnd = bEnvEnd;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return rEnvStart
	*/
	public String getrEnvStart() {
		return rEnvStart;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param rEnvStart
	*/
	public void setrEnvStart(String rEnvStart) {
		this.rEnvStart = rEnvStart;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return rEnvEnd
	*/
	public String getrEnvEnd() {
		return rEnvEnd;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param rEnvEnd
	*/
	public void setrEnvEnd(String rEnvEnd) {
		this.rEnvEnd = rEnvEnd;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return awsStatus
	*/
	public String getAwsStatus() {
		return awsStatus;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param awsStatus
	*/
	public void setAwsStatus(String awsStatus) {
		this.awsStatus = awsStatus;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return note
	*/
	public String getNote() {
		return note;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param note
	*/
	public void setNote(String note) {
		this.note = note;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return statusId
	*/
	public int getStatusId() {
		return statusId;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param statusId
	*/
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}


}
