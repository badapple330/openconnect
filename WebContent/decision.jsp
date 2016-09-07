<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>決済状況一覧</title>

<link rel="stylesheet" href="css/decision.css">
</head>
<body>

<div class="header"><h1>ヘッダー</h1></div>

<h1>決裁状況一覧</h1>
<br>

<div align="center">登録日・プロジェクト名・案件名のどれかを入力してください</div>
<p>
<!-- <form action="form.php" method="post"> -->
<p>
<s:form action="DecisionSelect">
<input type="text" name="searchString">
<input type="submit" value="検索" class="button">
</s:form>
</p>
<br>
<div class="center">
<table border="1">
<tr>

<td><div class="center">登録日</div></td>
<td><div class="center">姓</div></td>
<td><div class="center">名</div></td>
<td><div class="center">プロジェクト名</div></td>
<td><div class="center">案件番号</div></td>
<td><div class="center">案件名</div></td>
<td><div class="center">詳細</div></td>
<td><div class="center">実施起案番号</div></td>
<td><div class="center">実施決裁番号</div></td>
<td><div class="center">契約起案番号</div></td>
<td><div class="center">契約決番号</div></td>
<td><div class="center">実施兼契約起案番号</div></td>
<td><div class="center">実施兼契約番号</div></td>
</tr>



<s:iterator value="decisiontList">
<tr>
<td><input type="text" name="registration" value="<s:property value="registration" />" /></td>
<td><input type="text" name="user_id" value="<s:property value="user_id" />" /></td>
<td><input type="text" name="user_id" value="<s:property value="user_id" />" /></td>
<td><input type="text" name="project_id" value="<s:property value="project_id" />" /></td>
<td><input type="text" name="decision_id" value="<s:property value="decision_id" />" /></td>
<td><input type="text" name="decision_name" value="<s:property value="decision_name" />" /></td>
<td><input type="text" name="detail" value="<s:property value="detail" />" /></td>
<td><input type="text" name="i_drafting_id" value="<s:property value="i_drafting_id" />" /></td>
<td><input type="text" name="i_approval_id" value="<s:property value="i_approval_id" />" /></td>
<td><input type="text" name="a_drafting_id" value="<s:property value="a_drafting_id" />" /></td>
<td><input type="text" name="cd_id" value="<s:property value="cd_id" />" /></td>
<td><input type="text"name="i_a_d_id" value="<s:property value="i_a_d_id" />" /></td>
<td><input type="text"name="i_a_id" value="<s:property value="i_a_id" />" /></td>
</tr>
</s:iterator>




</table>



</div>
<s:form action="BackGoAction">
<center><input type=submit value="戻る" class="button"></center>
</s:form>
</body>
</html>