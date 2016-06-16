<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>遅刻</title>
</head>
<body>
<div class="centerdesign">
		<h1>管理画面</h1>
</div>
	<p class="caution">管理番号は0001からスタート</p>
	<p class="caution">名前は漢字で登録、性と名の間は半角スペースを入れる</p>
	<br>
	<div align="center">
		<font size="2" color="red"> <s:property value="errormsg" /></font>
	</div>
<s:form action="KintaiTikokuAction">
<br>
		<s:textfield name="question" value="" label="管理番号" />
		<s:property value="errorQuestion" />
		<br>
		<s:textfield name="answer" value="" label="名前" />
		<s:property value="errorAnswer" />
		<s:select name="tikoku">
<s:option value="tien">電車遅延</s:option>
 <s:option value="nebou">寝坊</s:option>
 <s:option value="tuuin">通院</s:option>
 <s:option value="kankon">冠婚葬祭</s:option>
 <s:option value="gyousei">行政手続き</s:option>
</s:select>
		<s:submit label="追加" type="button" />
<s:/form>



</body>
</html>