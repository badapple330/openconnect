<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
<s:form action="KintaiTikokuAction"><br>
		<s:textfield name="question" value="" label="管理番号" />
		<s:property value="errorQuestion" /><br>
		<s:textfield name="answer" value="" label="名前" />
		<s:property value="errorAnswer" />


		<s:select label="理由を選んでください" name="hoge" list="#{ 'tien':'電車遅延','nebou':'寝坊','tuuin':'通院','kankon':'冠婚葬祭','gyousei':'行政手続き'}"></s:select>

		<!--
 		<option value="tien">電車遅延</option>
 		<option value="nebou">寝坊</option>
 		<option value="tuuin">通院</option>
 		<option value="kankon">冠婚葬祭</option>
 		<option value="gyousei">行政手続き</option>
		 -->
		<s:submit label="遅刻登録" type="button" />
</s:form>



</body>
</html>