<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE htm>
<html>
<head>
<meta charset=UTF-8>
<!-- CSS読み込み -->
<link rel="stylesheet" href="css/admin_article.css">
<!-- jQuery読み込み -->
<script src="js/jquery-3.1.0.min.js"></script>
<!-- js読み込み -->
<script src="js/admin_article.js"></script>

<title>記事管理</title>
</head>
<body>
	<br>
	<br>
	<br>
	<br>
	<h1>
		<font size="5"> 記事一覧</font>
	</h1>
	<br>
	<br>
	<br>

	<form action="AdminArticleSearch">

		<div id="searchbox" align="center">
			<input type="text" id="selectcalender" name="summary" value="">
			<select name="siteJanre">
				<option value="politics">政治</option>
				<option value="economy">経済</option>
				<option value="IT">IT</option>
				<option value="bussiness">ビジネス</option>
				<option value="entertainment">エンタメ</option>
				<option value="fashion">おしゃれ</option>
				<option value="beauty">美容</option>
				<option value="blog">ブログ</option>
			</select> <input type="submit" value="検索" />

			<!-- モーダルウィンドウを開くボタン① -->
			<input type="button" class="modal-open-new" value="新規記事作成" />
		</div>
	</form>
	<table>
		<tr>
			<th>日付</th>
			<th>ジャンル</th>
			<th>タイトル</th>
			<th>編集</th>
			<th>削除</th>
		</tr>
		<tr>
			<s:iterator value="MainList">
				<tr>
					<td><s:property value="siteDate" /></td>
					<td><s:property value="siteJanre" /></td>
					<td><FONT color="blue"><a
							href="<s:url action="AdminArticleCheck"/>"><s:property
									value="siteTitle" /></a></FONT></td>
					<td>
						<!-- モーダルウィンドウを開くボタン ②--> <input type="button"
						class="modal-open-edit" value="編集" />
					</td>
					<td>
						<!-- モーダルウィンドウを開くボタン ③--> <input type="button"
						class="modal-open-delete" value="削除" />
					</td>
			</s:iterator>
		</tr>
		<tr>
			<s:iterator value="articleList">
				<tr>
					<td><s:property value="siteDate" /></td>
					<td><s:property value="siteJanre" /></td>
					<td><FONT color="blue"><a
							href="<s:url action="AdminArticleCheck"/>"><s:property
									value="siteTitle" /></a></FONT></td>
					<td>
						<!-- モーダルウィンドウを開くボタン ②--> <input type="button"
						class="modal-open-edit" value="編集" />
					</td>
					<td>
						<!-- モーダルウィンドウを開くボタン ③--> <input type="button"
						class="modal-open-delete" value="削除" />
					</td>
			</s:iterator>
		</tr>
	</table>
	<br>
	<br>
	<br>
	<div id="backbutton">
		<input type="button" value="戻る" onclick="history.back()">
	</div>
	<!-- モーダルウインドウ① -->
	<div id="modal-new">
		<s:form action="AdminArticleNew">
			<ul style="list-style: none">
				<li><label><span>タイトル</span> <input type="text"
						name="siteTitle" value="" /></label></li>
				<li><label><span>ジャンル</span> <!--	<input type="text"
						name="siteJanre" value="" />--> <select name="siteJanre">
							<option value="politics">政治</option>
							<option value="economy">経済</option>
							<option value="IT">IT</option>
							<option value="bussiness">ビジネス</option>
							<option value="entertainment">エンタメ</option>
							<option value="fashion">おしゃれ</option>
							<option value="beauty">美容</option>
							<option value="blog">ブログ</option>
					</select></label></li>
				<li><label><span>画像URL</span> <input type="text"
						name="imageUrl" value="" /></label></li>
				<li><label><span>本文</span> <input type="text"
						name="summary" value="" /></label></li>
				<li><label><span>外部URL</span> <input type="text"
						name="siteBanner" value="" /></label></li>
			</ul>
			<br>
			<div class="center">
				<input type="button" value="閉じる" form="contact" class="modal-button"
					id="modal-new-close"> <input type="submit" value="作成"
					form="contact" class="modal-button" />
			</div>
		</s:form>
	</div>

	<!-- モーダルウインドウ② -->
	<div id="modal-edit">
		<s:form action="AdminArticleEdit">
			<ul style="list-style: none">
				<li><label><span>旧タイトル</span> <input type="text"
						name="siteTitle" value="" /></label></li>
				<br>
				<br>
				<li><label><span>新タイトル</span> <input type="text"
						name="newSiteTitle" value="" /></label></li>
				<li><label><span>ジャンル</span> <select name="siteJanre">
							<option value="politics">政治</option>
							<option value="economy">経済</option>
							<option value="IT">IT</option>
							<option value="bussiness">ビジネス</option>
							<option value="entertainment">エンタメ</option>
							<option value="fashion">おしゃれ</option>
							<option value="beauty">美容</option>
							<option value="blog">ブログ</option>
					</select></label></li>
				<li><label><span>画像URL</span> <input type="text"
						name="imageUrl" value="" /></label></li>
				<li><label><span>本文</span> <input type="text"
						name="summary" value="" /></label></li>
				<li><label><span>外部URL</span> <input type="text"
						name="siteBanner" value="" /></label></li>
			</ul>
			<br>
			<div class="center">
				<input type="button" value="閉じる" form="contact" class="modal-button"
					id="modal-edit-close"> <input type="submit" value="編集"
					form="contact" class="modal-button" />
			</div>
		</s:form>
	</div>

	<!-- モーダルウインドウ③ -->
	<div id="modal-delete">
		<s:form action="AdminArticleDelete">
					<<span>タイトル</span>
			<input type="text" name="siteTitle" value="" />
			<a>削除しますか？</a>
			<div class="center">
				<input type="button" value="閉じる" form="contact" class="modal-button"
					id="modal-delete-close"> <input type="submit" value="削除"
					form="contact" class="modal-button" />
			</div>
		</s:form>
	</div>
</body>
</html>
