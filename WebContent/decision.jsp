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

<div class="header"><h1>ヘッダー</h1></div>

<h1>決裁状況一覧</h1>
<br>

<div align="center">登録日・プロジェクト名・案件名のどれかを入力してください</div>
<p>
<!-- <form action="form.php" method="post"> -->
<p>
<s:form action="Decisionselect">
<input type="text" name="searchString">
<input type="submit" value="検索" class="button">
</s:form>
</p>
<br>
<center>
<table border="1" cellspacing="0">
<tr>

<td><center>登録日</center></td><td><center>氏名</center></td><td><center>プロジェクト名</center></td><td><center>案件番号</center></td><td><center>案件名</center></td><td><center>詳細</center></td><td><center>実施起案番号</center></td><td><center>実施決裁番号</center></td><td><center>契約起案番号</center></td><td><center>契約決番号</center></td><td><center>実施兼契約起案番号</center></td><td><center>実施兼契約番号</center></td>
</tr>



<s:iterator value="list">
<tr>
<td><input type="text" name="Registration" value="<s:property value="Registration" />" /></td>
<td><input type="text" name="user" value="<s:property value="user" />" /></td>
<td><input type="text" name="project_list" value="<s:property value="project_list" />" /></td>
<td><input type="text" name="project_id" value="<s:property value="project_id" />" /></td>
<td><input type="text" name="project_name" value="<s:property value="project_name" />" /></td>
<td><input type="text" name="detail" value="<s:property value="detail" />" /></td>
<td><input type="text" name="i_drafting_id" value="<s:property value="i_drafting_id" />" /></td>
<td><input type="text" name="i_approval_id" value="<s:property value="i_approval_id" />" /></td>
<td><input type="text" name="a_drafting_id" value="<s:property value="project_list" />" /></td>
<td><input type="text"name="i_a_d_id" value="<s:property value="i_a_d_id" />" /></td>
<td><input type="text"name="i_a_id" value="<s:property value="i_a_id" />" /></td>
</tr>
</s:iterator>




</table>



</center>
<s:form action="BackGoAction">
<center><input type=submit value="戻る" class="button"></center>
</s:form>
</body>
</html>