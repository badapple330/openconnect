package com.internousdev.openconnect.decision.dto;

/**
 * 決裁手続クラス
 * @author KOTA MIYAZATO
 * @since 2017/06/05
 */
public class DecisionDTO {

	/**
	 * ユーザーID
	 *
	 */
	private int userId;

	/**
	 * 案件名
	 *
	 */
	private String decisionName;

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
	 * 契約決裁番号
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
	 * 承認番号
	 */
	private String adminNum;

	/**
	 * 理由・目的
	 */
	public String cause;


	/**
	 * 	頭紙文章
	 */
	private String head;

	/**
	 * 建設費用
	 */
	private float bildCost;

	/**
	 * 損益費用
	 */
	private float benefit;

	/**
	 * 合計金額
	 */
	private float amountAll;

	/**
	 * 概要
	 */
	public String summary;

	/**
	 * 開始日
	 */
	public String startDay;

	/**
	 * 終了日
	 */
	public String endDay;


	/**
	 * 開発端末料
	 */
	public int prove;

	/**
	 * リリース環境使用料
	 */
	public float re;

	/**
	 *回線使用料
	 */
	public int line;


	/**
	 *施設使用料
	 */
	public float room;

	/**
	 *開発要員
	 */
	public int human;

	/**
	 *雑費
	 */
	public float etc;


	/**
	 *姓（漢字）
	 */
	public String familyNameKanji;


	/**
	 *名（漢字）
	 */
	public String givenNameKanji;





	/**
	 * @return iDraftingId
	 */
	public String getiDraftingId() {
		return iDraftingId;
	}
	/**
	 * @param iDraftingId セットする iDraftingId
	 */
	public void setiDraftingId(String iDraftingId) {
		this.iDraftingId = iDraftingId;
	}
	/**
	 * @return iApprovalId
	 */
	public String getiApprovalId() {
		return iApprovalId;
	}
	/**
	 * @param iApprovalId セットする iApprovalId
	 */
	public void setiApprovalId(String iApprovalId) {
		this.iApprovalId = iApprovalId;
	}
	/**
	 * @return aDraftingId
	 */
	public String getaDraftingId() {
		return aDraftingId;
	}
	/**
	 * @param aDraftingId セットする aDraftingId
	 */
	public void setaDraftingId(String aDraftingId) {
		this.aDraftingId = aDraftingId;
	}
	/**
	 * @return iADId
	 */
	public String getiADId() {
		return iADId;
	}
	/**
	 * @param iADId セットする iADId
	 */
	public void setiADId(String iADId) {
		this.iADId = iADId;
	}
	/**
	 * @return iAId
	 */
	public String getiAId() {
		return iAId;
	}
	/**
	 * @param iAId セットする iAId
	 */
	public void setiAId(String iAId) {
		this.iAId = iAId;
	}
	/**
	 * @return prove
	 */
	public int getProve() {
		return prove;
	}
	/**
	 * @param prove セットする prove
	 */
	public void setProve(int prove) {
		this.prove = prove;
	}
	/**
	 * @return re
	 */
	public float getRe() {
		return re;
	}
	/**
	 * @param re セットする re
	 */
	public void setRe(float re) {
		this.re = re;
	}
	/**
	 * @return line
	 */
	public int getLine() {
		return line;
	}
	/**
	 * @param line セットする line
	 */
	public void setLine(int line) {
		this.line = line;
	}
	/**
	 * @return room
	 */
	public float getRoom() {
		return room;
	}
	/**
	 * @param room セットする room
	 */
	public void setRoom(float room) {
		this.room = room;
	}
	/**
	 * @return human
	 */
	public int getHuman() {
		return human;
	}
	/**
	 * @param human セットする human
	 */
	public void setHuman(int human) {
		this.human = human;
	}
	/**
	 * @return etc
	 */
	public float getEtc() {
		return etc;
	}
	/**
	 * @param etc セットする etc
	 */
	public void setEtc(float etc) {
		this.etc = etc;
	}

	/**
	* 取得メソッド
	* @author KOTA MIYAZATO
	* @return
	*/
	public int getUserId() {
		return userId;
	}
	/**
	* 設定メソッド
	* @author KOTA MIYAZATO
	* @param
	*/
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	* 取得メソッド
	* @author KOTA MIYAZATO
	* @return
	*/
	public String getDecisionName() {
		return decisionName;
	}
	/**
	* 設定メソッド
	* @author KOTA MIYAZATO
	* @param
	*/
	public void setDecisionName(String decisionName) {
		this.decisionName = decisionName;
	}

	/**
	* 取得メソッド
	* @author KOTA MIYAZATO
	* @return
	*/
	public String getIDraftingId() {
		return iDraftingId;
	}
	/**
	* 設定メソッド
	* @author KOTA MIYAZATO
	* @param
	*/
	public void setIDraftingId(String iDraftingId) {
		this.iDraftingId = iDraftingId;
	}
	/**
	* 取得メソッド
	* @author KOTA MIYAZATO
	* @return
	*/
	public String getIApprovalId() {
		return iApprovalId;
	}
	/**
	* 設定メソッド
	* @author KOTA MIYAZATO
	* @param
	*/
	public void setIApprovalId(String iApprovalId) {
		this.iApprovalId = iApprovalId;
	}
	/**
	* 取得メソッド
	* @author KOTA MIYAZATO
	* @return
	*/
	public String getADraftingId() {
		return aDraftingId;
	}
	/**
	* 設定メソッド
	* @author KOTA MIYAZATO
	* @param
	*/
	public void setADraftingId(String aDraftingId) {
		this.aDraftingId = aDraftingId;
	}
	/**
	* 取得メソッド
	* @author KOTA MIYAZATO
	* @return
	*/
	public String getCdId() {
		return cdId;
	}
	/**
	* 設定メソッド
	* @author KOTA MIYAZATO
	* @param
	*/
	public void setCdId(String cdId) {
		this.cdId = cdId;
	}
	/**
	* 取得メソッド
	* @author KOTA MIYAZATO
	* @return
	*/
	public String getIADId() {
		return iADId;
	}
	/**
	* 設定メソッド
	* @author KOTA MIYAZATO
	* @param
	*/
	public void setIADId(String iADId) {
		this.iADId = iADId;
	}
	/**
	* 取得メソッド
	* @author KOTA MIYAZATO
	* @return
	*/
	public String getIAId() {
		return iAId;
	}
	/**
	* 設定メソッド
	* @author KOTA MIYAZATO
	* @param
	*/
	public void setIAId(String iAId) {
		this.iAId = iAId;
	}
	/**
	 * @return adminNum
	 */
	public String getAdminNum() {
		return adminNum;
	}
	/**
	 * @param adminNum セットする adminNum
	 */
	public void setAdminNum(String adminNum) {
		this.adminNum = adminNum;
	}
	/**
	 * @return head
	 */
	public String getHead() {
		return head;
	}
	/**
	 * @param head セットする head
	 */
	public void setHead(String head) {
		this.head = head;
	}
	/**
	 * @return bildcost
	 */
	public float getBildCost() {
		return bildCost;
	}
	/**
	 * @param bildcost セットする bildcost
	 */
	public void setBildCost(float bildCost) {
		this.bildCost = bildCost;
	}

	/**
	 * @return cause
	 */
	public String getCause() {
		return cause;
	}
	/**
	 * @param cause セットする cause
	 */
	public void setCause(String cause) {
		this.cause = cause;
	}
		/**
		 * @return endDay
		 */
		public String getEndDay() {
			return endDay;
		}
		/**
		 * @param endDay セットする endDay
		 */
		public void setEndDay(String endDay) {
			this.endDay = endDay;
		}
		/**
		 * @return startDay
		 */
		public String getStartDay() {
			return startDay;
		}
		/**
		 * @param start_day セットする start_day
		 */
		public void setStartDay(String startDay) {
			this.startDay = startDay;
		}
		/**
		 * @return summary
		 */
		public String getSummary() {
			return summary;
		}
		/**
		 * @param summary セットする summary
		 */
		public void setSummary(String summary) {
			this.summary = summary;
		}
		/**
		 * @return benefit
		 */
		public float getBenefit() {
			return benefit;
		}
		/**
		 * @param benefit セットする benefit
		 */
		public void setBenefit(float benefit) {
			this.benefit = benefit;
		}
		/**
		 * @return amountAll
		 */
		public float getAmountAll() {
			return amountAll;
		}
		/**
		 * @param amountAll セットする amountAll
		 */
		public void setAmountAll(float amountAll) {
			this.amountAll = amountAll;
		}

		/**
		* 取得メソッド を取得
		* @author KOHEI NITABARU
		* @return familyNameKanji
		*/
		public String getFamilyNameKanji() {
			return familyNameKanji;
		}
		/**
		* 設定メソッド を設定
		* @author KOHEI NITABARU
		* @param familyNameKanji
		*/
		public void setFamilyNameKanji(String familyNameKanji) {
			this.familyNameKanji = familyNameKanji;
		}
		/**
		* 取得メソッド を取得
		* @author KOHEI NITABARU
		* @return givenNameKanji
		*/
		public String getGivenNameKanji() {
			return givenNameKanji;
		}
		/**
		* 設定メソッド を設定
		* @author KOHEI NITABARU
		* @param givenNameKanji
		*/
		public void setGivenNameKanji(String givenNameKanji) {
			this.givenNameKanji = givenNameKanji;
		}

}
