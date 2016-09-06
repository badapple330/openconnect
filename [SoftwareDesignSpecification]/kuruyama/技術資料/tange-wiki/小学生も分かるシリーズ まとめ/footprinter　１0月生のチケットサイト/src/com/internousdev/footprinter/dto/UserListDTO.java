package com.internousdev.footprinter.dto;

/**
 * LoginUserDTO 顧客情報を格納する為のDTOクラス
 * @author 小澤 竜樹
 * @since 1.0
 * @version 1.0
 */
public class UserListDTO {
	
	/**
	 * ID
	 */
	private int id;
	/**
	 * メールアドレス
	 */
	private String email;
	/**
	 * パスワード
	 */
	private String passWord;
	/**
	 * 名前
	 */
	private String name;
	/**
	 * 振り仮名
	 */
	private String nameKana;
	/**
	 * 電話番号
	 */
	private String tel;
	/**
	 * 郵便番号
	 */
	private String postalCode;
	/**
	 * 住所
	 */
	private String address;
	/**
	 * クレジットトークン
	 */
	private String creditToken;
	/**
	 * カード番号
	 */
	private String creditNum;
	/**
	 * 個別ID
	 */
	private String uniqueId;
	/**
	 * OAuth名
	 */
	private String oauthName;
	/**
	 * 登録日
	 */
	private String createdAt;
	/**
	 * 更新日
	 */
	private String updatedAt;
	/**
	 * ページ
	 */
	private int page;
	

	/**
	 * ID取得メソッド
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * ID格納メソッド
	 * @param id ユーザーID
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * メールアドレス取得メソッド
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * メールアドレス格納メソッド
	 * @param email メールアドレス
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * パスワード取得メソッド
	 * @return password
	 */
	public String getPassWord() {
		return passWord;
	}

	/**
	 * パスワード格納メソッド
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.passWord = password;
	}

	/**
	 * 名前取得メソッド
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 名前取得格納メソッド
	 * @param name ユーザー名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 振り仮名取得メソッド
	 * @return nameKana
	 */
	public String getNameKana() {
		return nameKana;
	}

	/**
	 * 振り仮名格納メソッド
	 * @param nameKana 名前カナ
	 */
	public void setNameKana(String nameKana) {
		this.nameKana = nameKana;
	}

	/**
	 * 電話番号取得メソッド
	 * @return tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * 電話番号格納メソッド
	 * @param tel 電話番号
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * 郵便番号取得メソッド
	 * @return postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * 郵便番号格納メソッド
	 * @param postalCode 郵便番号
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * 住所取得メソッド
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 住所取得格納メソッド
	 * @param address 住所
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * クレジットトークン取得メソッド
	 * @return creditToken
	 */
	public String getCreditToken() {
		return creditToken;
	}

	/**
	 * クレジットトークン格納メソッド
	 * @param credittoken クレジットカードトークン
	 */
	public void setCreditToken(String credittoken) {
		this.creditToken = credittoken;
	}

	/**
	 * カード番号取得メソッド
	 * @return creditNum
	 */
	public String getCreditNum() {
		return creditNum;
	}

	/**
	 * カード番号格納メソッド
	 * @param creditnum クレジットカード番号
	 */
	public void setCreditNum(String creditnum) {
		this.creditNum = creditnum;
	}

	/**
	 * 個別ID取得メソッド
	 * @return uniqueId
	 */
	public String getUniqueId() {
		return uniqueId;
	}

	/**
	 * 個別ID格納メソッド
	 * @param uniqueid OAuthでの接続先のユニークId
	 */
	public void setUniqueId(String uniqueid) {
		this.uniqueId = uniqueid;
	}

	/**
	 * 登録日取得メソッド
	 * @return createdAt
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * 登録日格納メソッド
	 * @param createdAt 登録日
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * 更新日取得メソッド
	 * @return updatedAt
	 */
	public String getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * 更新日格納メソッド
	 * @param updatedAt 更新日
	 */
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * ページ取得メソッド
	 * @return page
	 */
	public int getPage() {
		return page;
	}

	/**
	 * ページ格納メソッド
	 * @param page ページ
	 */
	public void setPage(int page) {
		this.page = page;
	}

	/**
	 * OAuth格納メソッド
	 * @return oauthName
	 */
	public String getOauthName() {
		return oauthName;
	}

	/**
	 * OAuth名取得メソッド
	 * @param oauthName OAuthの取得先名
	 */
	public void setOauthName(String oauthName) {
		this.oauthName = oauthName;
	}
}
