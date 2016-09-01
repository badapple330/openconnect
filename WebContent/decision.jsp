<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>決済状況一覧</title>
</head>
<body>

<div class="header"><h1>ヘッダー<h1></div>

<h1>決裁状況一覧</h1>
<br>

<div align="center"><td>登録日・プロジェクト名・案件名のどれかを入力してください</td></div>
<p>
<!-- <form action="form.php" method="post"> -->
<p>
<s:form action="GoDecision">
<input type="text"><input type="submit" value="検索" class="button">
</s:form>
</p>
<br>
<center>
<table border="1" cellspacing="0">
<tr>

<td><center>登録日</center></td><td><center>氏名</center></td><td><center>プロジェクト名</center></td><td><center>案件番号</center></td><td><center>案件名</center></td><td><center>実施起案番号</center></td><td><center>実施決裁番号</center></td><td><center>契約起案番号</center></td><td><center>契約決番号</center></td><td><center>実施兼契約起案番号</center></td><td><center>実施兼契約番号</center></td>
<tr>
<td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text"></td><td><input type="text"></td>
<tr>
<td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text"></td><td><input type="text"></td>
<tr>
<td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text"></td><td><input type="text"></td>
<tr>
<td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text"></td><td><input type="text"></td>
<tr>
<td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text"></td><td><input type="text"></td>
<tr>
<td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text" size="10"></td><td><input type="text"></td><td><input type="text"></td>




</tr>
</table>



</center>
<center><input type=submit value="戻る" class="button"></center>
</body>
</html>