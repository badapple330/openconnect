package com.internousdev.openconnect.projectProgress.dto;

public class GetAddressDTO {
	private int projectId;
	private String projectDay;
	private String project;
	private String projectPlan;
	private String projectResult;
	private String other;



	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectDay() {
		return projectDay;
	}

	public void setProjectDay(String projectDay) {
		this.projectDay = projectDay;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getProjectPlan() {
		return projectPlan;
	}

	public void setProjectPlan(String projectPlan) {
		this.projectPlan = projectPlan;
	}

	public String getProjectResult() {
		return projectResult;
	}

	public void setProjectResult(String projectResult) {
		this.projectResult = projectResult;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	/**
	 * ユーザーID
	 */
	private int userId;
	/**
	 * パスワード
	 */
	private String password;
	/**
	 * 名前
	 */
	private String name;
	/**
	 * 名まえ（ふりがな）
	 */
	private String nameF;
	/**
	 * 郵便番号
	 */
	private String postal;
	/**
	 * 住所
	 */
	private String address;
	/**
	 * メールアドレス
	 */
	private String email;
	/**
	 * 電話番号
	 */
	private String telNumber;
	/**
	 * ユーザーフラグ
	 */
	private int userFlg;
	/**
	 * サイトID
	 */
	private int siteId;
	/**
	 * サイト投稿日
	 */
	private String siteDate;
	/**
	 * タイトル
	 */
	private String siteTitle;
	/**
	 * サマリー
	 */
	private String summary;
	/**
	 * サイトURL
	 */
	private String siteBanner;
	/**
	 * ジャンル
	 */
	private String siteJanre;
	/**
	 * 画像URL
	 */
	private String imageUrl;
	/**
	 * レビュー日時
	 */
	private String reviewDate;
	/**
	 * レビュー内容
	 */
	private String text;
	/**
	 * タイトル
	 */
	private String title;

	/**
	 * 取得メソッド ユーザーIDを取得
	 *
	 * @author YUKI MAEDA
	 * @return userId 取得するユーザーID
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * 格納メソッド ユーザーIDを格納
	 *
	 * @author YUKI MAEDA
	 * @param userId
	 *            格納するユーザーID
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * 取得メソッド 名前を取得
	 *
	 * @author YUKI MAEDA
	 * @return name 取得する名前
	 */
	public String getName() {
		return name;
	}

	/**
	 * 格納メソッド 名前を格納
	 *
	 * @author YUKI MAEDA
	 * @param name
	 *            格納する名前
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 取得メソッド レビュー日時を取得
	 *
	 * @author YUKI MAEDA
	 * @return reviewDate 取得するレビュー日時
	 */
	public String getReviewDate() {
		return reviewDate;
	}

	/**
	 * 格納メソッド レビュー日時を格納
	 *
	 * @author YUKI MAEDA
	 * @param reviewDate
	 *            格納するレビュー日時
	 */
	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}

	/**
	 * 取得メソッド 内容を取得
	 *
	 * @author YUKI MAEDA
	 * @return text 取得する内容
	 */
	public String getText() {
		return text;
	}

	/**
	 * 格納メソッド 内容を格納
	 *
	 * @author YUKI MAEDA
	 * @param text
	 *            格納する内容
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * 取得メソッド タイトルを取得
	 *
	 * @author YUKI MAEDA
	 * @return title 取得するタイトル
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 格納メソッド タイトルを格納
	 *
	 * @author YUKI MAEDA
	 * @param title
	 *            格納するタイトル
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 取得メソッド パスワードを取得
	 *
	 * @author YUKI MAEDA
	 * @return password 取得するパスワード
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 格納メソッド パスワードを格納
	 *
	 * @author YUKI MAEDA
	 * @param password
	 *            格納するパスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 取得メソッド 名前（ふりがな）を取得
	 *
	 * @author YUKI MAEDA
	 * @return nameF 取得する名前（ふりがな）
	 */
	public String getNameF() {
		return nameF;
	}

	/**
	 * 格納メソッド 名前（ふりがな）を格納
	 *
	 * @author YUKI MAEDA
	 * @param nameF
	 *            格納する名前（ふりがな）
	 */
	public void setNameF(String nameF) {
		this.nameF = nameF;
	}

	/**
	 * 取得メソッド 郵便番号を取得
	 *
	 * @author YUKI MAEDA
	 * @return postal 取得する郵便番号
	 */
	public String getPostal() {
		return postal;
	}

	/**
	 * 格納メソッド 郵便番号を格納
	 *
	 * @author YUKI MAEDA
	 * @param postal
	 *            格納する郵便番号
	 */
	public void setPostal(String postal) {
		this.postal = postal;
	}

	/**
	 * 取得メソッド 住所を取得
	 *
	 * @author YUKI MAEDA
	 * @return address 取得する住所
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 格納メソッド 住所を格納
	 *
	 * @author YUKI MAEDA
	 * @param address
	 *            格納する住所
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 取得メソッド 電話番号を取得
	 *
	 * @author YUKI MAEDA
	 * @return telNumber 取得する電話番号
	 */
	public String getTelNumber() {
		return telNumber;
	}

	/**
	 * 格納メソッド 電話番号を格納
	 *
	 * @author YUKI MAEDA
	 * @param telNumber
	 *            格納する電話番号
	 */
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	/**
	 * 取得メソッド ユーザーフラグを取得
	 *
	 * @author YUKI MAEDA
	 * @return userFlg 取得するユーザーフラグ
	 */
	public int getUserFlg() {
		return userFlg;
	}

	/**
	 * 格納メソッド ユーザーフラグを格納
	 *
	 * @author YUKI MAEDA
	 * @param userFlg
	 *            格納するユーザーフラグ
	 */
	public void setUserFlg(int userFlg) {
		this.userFlg = userFlg;
	}

	/**
	 * 取得メソッド メールアドレスを取得
	 *
	 * @author YUKI MAEDA
	 * @return email 取得するメールアドレス
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 格納メソッド メールアドレスを格納
	 *
	 * @author YUKI MAEDA
	 * @param email
	 *            格納するメールアドレス
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 取得メソッド サイトIDを取得
	 *
	 * @author YUKI MAEDA
	 * @return siteId 取得するサイトID
	 */
	public int getSiteId() {
		return siteId;
	}

	/**
	 * 格納メソッド サイトIDを格納
	 *
	 * @author YUKI MAEDA
	 * @param siteId
	 *            格納するサイトID
	 */
	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}

	/**
	 * 取得メソッド サイト投稿日時を取得
	 *
	 * @author YUKI MAEDA
	 * @return siteDate 取得するサイト投稿日時
	 */
	public String getSiteDate() {
		return siteDate;
	}

	/**
	 * 格納メソッド サイト投稿日時を格納
	 *
	 * @author YUKI MAEDA
	 * @param siteDate
	 *            格納するサイト投稿日時
	 */
	public void setSiteDate(String siteDate) {
		this.siteDate = siteDate;
	}

	/**
	 * 取得メソッド タイトルを取得
	 *
	 * @author YUKI MAEDA
	 * @return siteTitle 取得するタイトル
	 */
	public String getSiteTitle() {
		return siteTitle;
	}

	/**
	 * 格納メソッド タイトルを格納
	 *
	 * @author YUKI MAEDA
	 * @param siteTitle
	 *            格納するタイトル
	 */
	public void setSiteTitle(String siteTitle) {
		this.siteTitle = siteTitle;
	}

	/**
	 * 取得メソッド 要約を取得
	 *
	 * @author YUKI MAEDA
	 * @return summary 取得する要約
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * 格納メソッド 要約を格納
	 *
	 * @author YUKI MAEDA
	 * @param summary
	 *            格納する要約
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}

	/**
	 * 取得メソッド サイトURLを取得
	 *
	 * @author YUKI MAEDA
	 * @return siteBanner 取得するサイトURL
	 */
	public String getSiteBanner() {
		return siteBanner;
	}

	/**
	 * 格納メソッド サイトURLを格納
	 *
	 * @author YUKI MAEDA
	 * @param siteBanner
	 *            格納するサイトURL
	 */
	public void setSiteBanner(String siteBanner) {
		this.siteBanner = siteBanner;
	}

	/**
	 * 取得メソッド サイトジャンルを取得
	 *
	 * @author YUKI MAEDA
	 * @return siteJanre 取得するサイトジャンル
	 */
	public String getSiteJanre() {
		return siteJanre;
	}

	/**
	 * 格納メソッド サイトジャンルを格納
	 *
	 * @author YUKI MAEDA
	 * @param siteJanre
	 *            格納するサイトジャンル
	 */
	public void setSiteJanre(String siteJanre) {
		this.siteJanre = siteJanre;
	}

	/**
	 * 取得メソッド 画像URLを取得
	 *
	 * @author YUKI MAEDA
	 * @return imageUrl 取得する画像URL
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * 格納メソッド 画像URLを格納
	 *
	 * @author YUKI MAEDA
	 * @param imageUrl
	 *            格納する画像URL
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}