/**
 *
 */
package com.internousdev.openconnect.decisionDetail.dto;

/**
 * @author internous
 *
 */
public class DecisionDetailDTO {

	private int projectId;
	private String day;
	private String decisionType;
	private String decisionStatus;
	private int userId;
	private String itemName;
	private String summary;
	private String cause;
	private String startDay;
	private String endDay;
	private String plan;
	private int persons;
	private String password;
	private int decisionId;
	private int decisionDetailId;
	private String projectName;
	private String familyNameKanji;
	private String GivenNameKanji;

private int developmentPersonnel;
private int developmentTerminal;
private int developmentPersonnelSum;
private int profitAndLossCost;
private int sum;




	/**
* 取得メソッド
* @author KENICHI HORIGUCHI
* @return
*/
public String getFamilyNameKanji() {
	return familyNameKanji;
}
/**
* 設定メソッド
* @author KENICHI HORIGUCHI
* @param
*/
public void setFamilyNameKanji(String familyNameKanji) {
	this.familyNameKanji = familyNameKanji;
}
/**
* 取得メソッド
* @author KENICHI HORIGUCHI
* @return
*/
public String getGivenNameKanji() {
	return GivenNameKanji;
}
/**
* 設定メソッド
* @author KENICHI HORIGUCHI
* @param
*/
public void setGivenNameKanji(String givenNameKanji) {
	GivenNameKanji = givenNameKanji;
}
	/**
* 取得メソッド
* @author KENICHI HORIGUCHI
* @return
*/
public int getDevelopmentTerminal() {
	return developmentTerminal;
}
/**
* 設定メソッド
* @author KENICHI HORIGUCHI
* @param
*/
public void setDevelopmentTerminal(int developmentTerminal) {
	this.developmentTerminal = developmentTerminal;
}
/**
* 取得メソッド
* @author KENICHI HORIGUCHI
* @return
*/
public int getDevelopmentPersonnelSum() {
	return developmentPersonnelSum;
}
/**
* 設定メソッド
* @author KENICHI HORIGUCHI
* @param
*/
public void setDevelopmentPersonnelSum(int developmentPersonnelSum) {
	this.developmentPersonnelSum = developmentPersonnelSum;
}
/**
* 取得メソッド
* @author KENICHI HORIGUCHI
* @return
*/
public int getProfitAndLossCost() {
	return profitAndLossCost;
}
/**
* 設定メソッド
* @author KENICHI HORIGUCHI
* @param
*/
public void setProfitAndLossCost(int profitAndLossCost) {
	this.profitAndLossCost = profitAndLossCost;
}
/**
* 取得メソッド
* @author KENICHI HORIGUCHI
* @return
*/
public int getSum() {
	return sum;
}
/**
* 設定メソッド
* @author KENICHI HORIGUCHI
* @param
*/
public void setSum(int sum) {
	this.sum = sum;
}
	/**
* 取得メソッド
* @author KENICHI HORIGUCHI
* @return
*/
public int getDevelopmentPersonnel() {
	return developmentPersonnel;
}
/**
* 設定メソッド
* @author KENICHI HORIGUCHI
* @param
*/
public void setDevelopmentPersonnel(int developmentPersonnel) {
	this.developmentPersonnel = developmentPersonnel;
}
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
	* @return day
	*/
	public String getDay() {
		return day;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param day
	*/
	public void setDay(String day) {
		this.day = day;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return decisionType
	*/
	public String getDecisionType() {
		return decisionType;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param decisionType
	*/
	public void setDecisionType(String decisionType) {
		this.decisionType = decisionType;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return decisionStatus
	*/
	public String getDecisionStatus() {
		return decisionStatus;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param decisionStatus
	*/
	public void setDecisionStatus(String decisionStatus) {
		this.decisionStatus = decisionStatus;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return userId
	*/
	public int getUserId() {
		return userId;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param userId
	*/
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return itemName
	*/
	public String getItemName() {
		return itemName;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param itemName
	*/
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return summary
	*/
	public String getSummary() {
		return summary;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param summary
	*/
	public void setSummary(String summary) {
		this.summary = summary;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return cause
	*/
	public String getCause() {
		return cause;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param cause
	*/
	public void setCause(String cause) {
		this.cause = cause;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return startDay
	*/
	public String getStartDay() {
		return startDay;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param startDay
	*/
	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return endDay
	*/
	public String getEndDay() {
		return endDay;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param endDay
	*/
	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return plan
	*/
	public String getPlan() {
		return plan;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param plan
	*/
	public void setPlan(String plan) {
		this.plan = plan;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return persons
	*/

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return password
	*/
	public String getPassword() {
		return password;
	}
	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return
	*/
	public int getPersons() {
		return persons;
	}
	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param
	*/
	public void setPersons(int persons) {
		this.persons = persons;
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
	* @return decisionId
	*/
	public int getDecisionId() {
		return decisionId;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param decisionId
	*/
	public void setDecisionId(int decisionId) {
		this.decisionId = decisionId;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return decisionDetailId
	*/
	public int getDecisionDetailId() {
		return decisionDetailId;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param decisionDetailId
	*/
	public void setDecisionDetailId(int decisionDetailId) {
		this.decisionDetailId = decisionDetailId;
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


}
