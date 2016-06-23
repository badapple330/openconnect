<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/admin.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>カレッジ生登録</title>
<!-- TOPに戻るボタンの設定 -->
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
		<h1 style="text-align: center;">新カレッジ生登録</h1>
	</div>
	<p class="caution">数字入力は半角のみ、データの確認は下の生徒一覧ボタンを押してください。</p>
	<br>
	<div align="center">
		<font size="2" color="red"> </font>
	</div>
	<!-- カレッジ生を登録するフォーム -->
	<h2>カレッジ生追加</h2>
	<s:form action="InsertAction">
		<table class="wwFormTable">
			<tbody>
				<tr>
					<td>管理番号：<input type="text" name="number" maxlength="5"
						required>
					</td>
					<td>氏名：<input type="text" name="name" maxlength="50" required>
					</td>
					<td>しめい：<input type="text" name="symbol" maxlength="50"
						required>
					</td>
					<td>入講年月：<input type="text" name="entrance" maxlength="10"
						required></td>
					<td><input type="submit" value="追加"></td>
				</tr>
			</tbody>
		</table>
	</s:form>

	<br>
	<br>
	<br>
	<s:form action="GetStudentsAdminAction">
		<input type="submit" value="生徒一覧">
		<table
			style="border: 3px solid #CCC; border-collapse: collapse; width:">
			<tr>
				<td
					style="height: 3em; border: 2px solid #CCC; background-color: #FFCC99; font-weight: bold; padding: 1px; width: 10%;"
					align="center">管理番号</td>
				<td
					style="height: 3em; border: 2px solid #CCC; background-color: #FFCC99; font-weight: bold; padding: 5px;"
					align="center">氏名</td>
				<td
					style="height: 3em; border: 2px solid #CCC; background-color: #FFCC99; font-weight: bold; padding: 5px;"
					align="center">しめい</td>
				<td
					style="height: 3em; border; 2 px solid #CCC; background-color: #FFCC99; font-weight: bold; padding: 5px;"
					align="center">入講年月</td>
			</tr>
			<s:iterator value="studentsList">
				<tr>
					<td
						style="border: 1px solid #CCC; font-weight: bold; padding: 5px;"
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