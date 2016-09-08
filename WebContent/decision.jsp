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
<s:form action="DecisionUpdate">
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
<td><input type="text" name="userId" value="<s:property value="userId" />" /></td>
<td><input type="text" name="userId" value="<s:property value="userId" />" /></td>
<td><input type="text" name="projectId" value="<s:property value="projectId" />" /></td>
<td><input type="text" name="decisionId" value="<s:property value="decisionId" />" /></td>
<td><input type="text" name="decisionName" value="<s:property value="decisionName" />" /></td>
<td><input type="text" name="detail" value="<s:property value="detail" />" /></td>
<td><input type="text" name="iDraftingId" value="<s:property value="iDraftingId" />" /></td>
<td><input type="text" name="iApprovalId" value="<s:property value="iApprovalId" />" /></td>
<td><input type="text" name="aDraftingId" value="<s:property value="aDraftingId" />" /></td>
<td><input type="text" name="cdId" value="<s:property value="cdId" />" /></td>
<td><input type="text" name="iADId" value="<s:property value="iADId" />" /></td>
<td><input type="text" name="iAId" value="<s:property value="iAId" />" /></td>
</tr>
</s:iterator>
</table>
</div>


<center><input type="submit" value="編集" class="button"></center>
</s:form>

<s:form action="BackGoAction">
<center><input type=submit value="戻る" class="button"></center>
</s:form>
</body>
</html>