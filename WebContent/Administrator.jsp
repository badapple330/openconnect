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
<script type="text/javascript">
	$(function() {
		var topBtn = $('#page-top');
		topBtn.hide();
		$(window).scroll(function() {
			if ($(this).scrollTop() > 100) {
				topBtn.fadeIn();
			} else {
				topBtn.fadeOut();
			}
		});
		topBtn.click(function() {
			$('body,html').animate({
				scrollTop : 0
			}, 500);
			return false;
		});
	});
	function numOnly() {
		m = String.fromCharCode(event.keyCode);
		if ("0123456789\b\r".indexOf(m, 0) < 0)
			return false;
		return true;
	}
</script>
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
	<s:form action="InsertAction">
		<table class="wwFormTable">
			<tbody>
				<tr>
					<td>アプリ名：<input type="text" name="siteName" maxlength="20"
						required>
					</td>
					<td>URL：<input type="text" name="url"
						style="ime-mode: disabled" size="20" required>
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
					<td>アプリID：<input type="text" name="id" maxlength="4"
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
					<td>アプリID : <input type="text" name="id" maxlength="20"
						onkeyDown="return numOnly()" pattern="[0-9]{1,10}"
						title="半角数字で入力してください" required>
					</td>

					<td>アプリ名：<input type="text" name="siteName" maxlength="20"
						required>
					</td>

					<td>URL：<input type="text" name="url"
						style="ime-mode: disabled" size="20" required>
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
		<table style="border: 3px solid #CCC; border-collapse: collapse; width:">
			<tr>
				<td	style="height: 3em; border: 2px solid #CCC; background-color: #FFCC99; font-weight: bold; padding: 1px; width: 10%;"
					align="center">appID</td>
				<td	style="height: 3em; border: 2px solid #CCC; background-color: #FFCC99; font-weight: bold; padding: 5px;"
					align="center">appNAME</td>
				<td	style="height: 3em; border: 2px solid #CCC; background-color: #FFCC99; font-weight: bold; padding: 5px;"
					align="center">URL</td>
			</tr>
			<s:iterator value="siteInfoList">
				<tr>
					<td	style="border: 1px solid #CCC; font-weight: bold; padding: 5px;"
						align="center"><s:property value="id" /></td>
					<td style="border: 1px solid #CCC;"><s:property
						value="siteName" /></td>
					<td style="border: 1px solid #CCC;"><s:property value="url" /></td>
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
	<p id="page-top">
		<a href="#wrap">PAGE TOP</a>
	</p>
</body>
</html>