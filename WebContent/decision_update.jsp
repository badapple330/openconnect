<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<LINK rel="stylesheet" type="text/css" href="css/style.css">
<meta charset="UTF-8">
<script src="js/jquery-3.0.0.min.js"></script>
<script src="js/sendCheck.js"></script>
<title>決裁編集</title>
</head>
<body>

	<jsp:include page="header.jsp" />

<h1>決裁手続き編集画面</h1>

<s:iterator value="decisionDetailList">

<table border="1"><tr><td>
パスワード変更
<s:form action="PasswordEdit">
<input type="hidden" name="decisionDetailId" value="<s:property value="decisionDetailId"/>">
<input type="text" name="password" value="<s:property value="password"/>">
<input type="submit" value="変更" class="button">
</s:form>

<br>
</td></tr></table>
<br>
<br>

<h1>【決裁書】</h1>
<table border="1"><tr><td>
日付　<input type="text" value="<s:property value="day"/>">
<br>
プロジェクト名<input type="text" value="<s:property value="projectName"/>">
<br>
決裁分類
<br>
<input type="radio" name="type" value="<s:property value="decisionType"/>" checked>実施決裁　<input type="radio" name="type">契約決裁
<br>
起案者　<input type="text" value="<s:property value="userId"/>">
<br>
案件名　<input type="text" value="<s:property value="itemName"/>">
<br>
概要　<input type="text" value="<s:property value="summary"/>">
<br>
理由　<input type="text" value="<s:property value="cause"/>">
<br>
実施時期・実施機関
<br>
開始日　<input type="text" value="<s:property value="startDay"/>">
<br>
終了日　<input type="text" value="<s:property value="endDay"/>">
<br>
</td></tr></table>
<br>
<br>
<br>
<h1>【実施計画】</h1>
<table border="1"><tr><td>
資料
<br>
<input type="text" class="bigText" value="<s:property value="plan"/>">
<br>
</td></tr></table>
<br>
<br>
<br>
<h1>【見積書】</h1>
<table border="1"><tr><td>
人数　<input type="text"value="<s:property value="persons"/>">人
<br>
</td></tr></table>

</s:iterator>

<input type="button" value="登録" class="button">
<br>
<br>
<input type="button" value="戻る" class="button">
</body>
</html>