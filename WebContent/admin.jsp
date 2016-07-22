<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/admin.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>admin画面</title>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.min.js"></script>
<script src="./js/admin.js"></script>
</head>
<body>
	<div class="centerdesign">
		<h1 style="text-align: center;">管理画面</h1>
	</div>
	<p class="caution">数字入力は半角のみ、 アプリID欄にはアプリIDのみ記入可能、
		値の確認は下のアプリ一覧情報取得から行ってください。 テンキー入力不可。</p>
	<br>
	<div align="center">
		<font size="2" color="red"> </font>
	</div>
	<h2>アプリ追加</h2>
	<s:form action="AddAppAction">
		<table class="wwFormTable">
			<tbody>
				<tr>
					<td>アプリ名：<input type="text" name="site_name" maxlength="20" required>
					</td>
					<td>URL：<input type="text" name="site_url"
						style="ime-mode: disabled" size="20" required>
					</td>
					<td>グループ：<select name="site_group" style="ime-mode: disabled" required>
						<option value="グループ" selected>グループ</option>
						<option value="ファッション">ファッション</option>
						<option value="グルメ">グルメ</option>
						<option value="スポーツ">スポーツ</option>
						<option value="エンタメ">エンタメ</option>
						</select>
					</td>

					<td><input type="submit" value="追加"></td>
				</tr>
			</tbody>
		</table>
	</s:form>

	<h2>アプリ削除</h2>
	<s:form action="DeleteAppAction">
		<table class="wwFormTable">
			<tbody>
				<tr>
					<td>アプリID：<input type="text" name="site_id" maxlength="4"
						onkeyDown="return numOnly()" pattern="[0-9a-z]{1,10}"
						title="半角数字で入力してください" required>

					</td>
					<td><input type="submit" value="削除"></td>
				</tr>
			</tbody>
		</table>
	</s:form>

	<h2>アプリ変更</h2>
	<s:form action="UpdateAppAction">
		<table class="wwFormTable">
			<tbody>
				<tr>
					<td>アプリID : <input type="text" name="site_id" maxlength="20"
						onkeyDown="return numOnly()" pattern="[0-9]{1,10}"
						title="半角数字で入力してください" required>
					</td>

					<td>アプリ名：<input type="text" name="site_name" maxlength="20"
						required>
					</td>

					<td>URL：<input type="text" name="site_url"
						style="ime-mode: disabled" size="20" required>
					</td>
					<td>グループ：<select name="site_group" style="ime-mode: disabled" required>
							<option value="グループ" selected>グループ</option>
							<option value="ファッション">ファッション</option>
							<option value="グルメ">グルメ</option>
							<option value="スポーツ">スポーツ</option>
							<option value="エンタメ">エンタメ</option>
					</select>
					</td>
					<td><input type="submit" value="変更"></td>
				</tr>
			</tbody>
		</table>
	</s:form>
	<br>
	<br>
	<br>
	<s:form action="GetAddressAdminAction">
		<input type="submit" value="アプリ一覧情報取得">
		<table class="siteList">
			<thead>
			<tr>
				<th>appID</th>
				<th>appNAME</th>
				<th>URL</th>
				<th>GROUP</th>
			</tr>
			</thead>
			<s:iterator value="siteInfoList">
				<tr>
					<td align="center"><s:property value="site_id" /></td>
					<td><s:property value="site_name" /></td>
					<td><s:property value="site_url" /></td>
					<td><s:property value="site_group" /></td>
				</tr>
			</s:iterator>
		</table>
	</s:form>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<div id="page-top">
		<a href="#wrap">PAGE TOP</a>
	</div>
		<a href="applist.jsp">HOMEへ</a>
</body>
</html>