/**
 *
 */
package com.internousdev.cadeau.dto;

/**
 * @author YUTA SANNOMIYA
 * データベースと値を受け渡しするクラス
 */
public class CadeauDTO {

	private String userName;

	private String phoneEmail;

	private String password;

	private int userId;

	private boolean loginFlg;

	private String familyName;

	private String givenName;

	private boolean userDelFlg;

	private int itemId;

	private String itemNameJa;

	private String itemNameEn;

	private String itemCategory;

	private int price;

	private String overviewJa;

	private String overviewEn;

	private String imgAddress;

	private int orderCount;

	private int amount;

	private int sumAmount;

	private String registrationDate;

	/**
	 * phoneEmailを取得します
	 * @return phoneEmail Eメールアドレス
	 */
	public String getPhoneEmail() {
		return phoneEmail;
	}

	/**
	 * phoneEmailを設定します
	 * @param phoneEmail Eメールアドレス
	 */
	public void setPhoneEmail(String phoneEmail) {
		this.phoneEmail = phoneEmail;
	}

	/**
	 * passwordを取得します
	 * @return password パスワード
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * passwordを設定します
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * userIdを取得します
	 * @return userId ユーザーID
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * userIdを設定します
	 * @param userId ユーザーID
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * loginFlgを取得します
	 * @return loginFlg ログインフラグ
	 */
	public boolean isLoginFlg() {
		return loginFlg;
	}

	/**
	 * loginFlgを設定します
	 * @param loginFlg ログインフラグ
	 */
	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}

	/**
	 * familyNameを取得します
	 * @return familyName 性
	 */
	public String getFamilyName() {
		return familyName;
	}

	/**
	 * familyNameを設定します
	 * @param familyName 性
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	/**
	 * givenNameを取得します
	 * @return givenName 名
	 */
	public String getGivenName() {
		return givenName;
	}

	/**
	 * givenNameを設定します
	 * @param givenName 名
	 */
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	/**
	 * userDelFlgを取得します
	 * @return userDelFlg ユーザーデリートフラグ
	 */
	public boolean isUserDelFlg() {
		return userDelFlg;
	}

	/**
	 * userDelFlgを設定します
	 * @param userDelFlg ユーザーデリートフラグ
	 */
	public void setUserDelFlg(boolean userDelFlg) {
		this.userDelFlg = userDelFlg;
	}

	/**
	 * itemIdを取得します
	 * @return itemId 商品ID
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * itemIdを設定します
	 * @param itemId 商品ID
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * itemNameJaを取得します
	 * @return itemNameJa 商品名（日本語）
	 */
	public String getItemNameJa() {
		return itemNameJa;
	}

	/**
	 * itemNameJaを設定します
	 * @param itemNameJa 商品名（日本語）
	 */
	public void setItemNameJa(String itemNameJa) {
		this.itemNameJa = itemNameJa;
	}

	/**
	 * itemNameEnを取得します
	 * @return itemNameEn 商品名（英語）
	 */
	public String getItemNameEn() {
		return itemNameEn;
	}

	/**
	 * itemNameEnを設定します
	 * @param itemNameEn 商品名（英語）
	 */
	public void setItemNameEn(String itemNameEn) {
		this.itemNameEn = itemNameEn;
	}

	/**
	 * itemCategoryを取得します
	 * @return itemCategory 商品ジャンル
	 */
	public String getItemCategory() {
		return itemCategory;
	}

	/**
	 * itemCategoryを設定します
	 * @param itemCategory 商品ジャンル
	 */
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	/**
	 * priceを取得します
	 * @return price 価格
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * priceを設定します
	 * @param price 価格
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * overviewJaを取得します
	 * @return overviewJa 詳細文（日本語）
	 */
	public String getOverviewJa() {
		return overviewJa;
	}

	/**
	 * overviewJaを設定します
	 * @param overviewJa 詳細文（日本語）
	 */
	public void setOverviewJa(String overviewJa) {
		this.overviewJa = overviewJa;
	}

	/**
	 * overviewEnを取得します
	 * @return overviewEn 詳細文（英語）
	 */
	public String getOverviewEn() {
		return overviewEn;
	}

	/**
	 * overviewEnを設定します
	 * @param overviewEn 詳細文（英語）
	 */
	public void setOverviewEn(String overviewEn) {
		this.overviewEn = overviewEn;
	}

	/**
	 * imgAddressを取得します
	 * @return imgAddress 画像アドレス
	 */
	public String getImgAddress() {
		return imgAddress;
	}

	/**
	 * imgAddressを設定します
	 * @param imgAddress 画像アドレス
	 */
	public void setImgAddress(String imgAddress) {
		this.imgAddress = imgAddress;
	}

	/**
	 * orderCountを取得します
	 * @return orderCount 注文数
	 */
	public int getOrderCount() {
		return orderCount;
	}

	/**
	 * orderCountを設定します
	 * @param orderCount 注文数
	 */
	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}

	/**
	 * amountを取得します
	 * @return amount 合計価格
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * amountを設定します
	 * @param amount 合計価格
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	/**
	 * sumAmountを取得します
	 * @return sumAmount カート価格合計
	 */
	public int getSumAmount() {
		return sumAmount;
	}

	/**
	 * sumAmountを設定します
	 * @param sumAmount カート価格合計
	 */
	public void setSumAmount(int sumAmount) {
		this.sumAmount = sumAmount;
	}

	/**
	 * registrationDateを取得します
	 * @return registrationDate 登録日
	 */
	public String getRegistrationDate() {
		return registrationDate;
	}

	/**
	 * registrationDateを設定します
	 * @param registrationDate 登録日
	 */
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	/**
	 * userNameを取得します
	 * @return userName ユーザー名
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * userNameを設定します
	 * @param userName ユーザー名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

}

