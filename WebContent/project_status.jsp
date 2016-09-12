<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>プロジェクトリリース状況</title>
</head>
<body>
<header><jsp:include page="header.jsp" /></header>

<div class="container">
	<div class="center">
		<br>
		<h1>プロジェクトリリース状況</h1>
	</div>
	<br>
	<s:form action="ProjectStatusSelectAction">
		<input type="text" name="searchString" placeholder="プロジェクト名">
		<input type="submit" value="検索" class="button">
	</s:form>
	<br>
	<s:property value="%{resultStrng}" />
	<br>
	<s:form action="ProjectStatusUpdateAction">
		<table border=1>
			<tr>
				<th>プロジェクトID</th>
				<th>プロジェクト名</th>
				<th>A環境開始日</th>
				<th>A環境終了日</th>
				<th>B環境開始日</th>
				<th>B環境終了日</th>
				<th>リリース環境開始日</th>
				<th>リリース環境終了日</th>
				<th>リリース状況</th>
				<th>備考</th>
			</tr>
			<s:iterator value="projectStatusList">
				<tr>
					<td><s:property value="projectId"/></td>
					<td><s:property value="projectName" /></td>
					<td><input type="text" name="aEnvStartList" value="<s:property value="aEnvStart" />"></td>
					<td><input type="text" name="aEnvEndList" value="<s:property value="aEnvEnd" />"></td>
					<td><input type="text" name="bEnvStartList" value="<s:property value="bEnvStart" />"></td>
					<td><input type="text" name="bEnvEndList" value="<s:property value="bEnvEnd" />"></td>
					<td><input type="text" name="rEnvStartList" value="<s:property value="rEnvStart" />"></td>
					<td><input type="text" name="rEnvEndList" value="<s:property value="rEnvEnd" />"></td>
					<td><s:property value="awsStatus" /></td>
					<td><input type="text" name="noteList" value="<s:property value="note" />"></td>
				</tr>
					<input type="hidden" name="projectIdList" value="<s:property value="projectId"/>">
					<input type="hidden" name="statusIdList" value="<s:property value="statusId"/>">
			</s:iterator>

		</table>
		<br>
		<input type="submit" class="button" value="編集" />
	</s:form>
	<br>
	<br>
	<s:form action="BackGoAction">
		<input type="submit" class="button" value="戻る">
	</s:form>
	<br>
</div>
</body>
</html>