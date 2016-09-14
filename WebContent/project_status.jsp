<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>プロジェクトリリース状況</title>
<link rel="stylesheet" href="css/project_status.css">
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
		<input type="text" name="searchString" placeholder="プロジェクト名" id="searchText" maxlength="100">
		<input type="submit" value="検索" class="button" >
	</s:form>
	<br>
	<s:property value="%{resultStrng}" />
	<br>
	<s:form action="ProjectStatusUpdateAction">
		<table border=1>
			<tr>
				<th>プロジェクトID</th>
				<th>プロジェクト名</th>
				<th>リリース状況</th>
				<th>A環境開始日</th>
				<th>A環境終了日</th>
				<th>B環境開始日</th>
				<th>B環境終了日</th>
				<th>リリース環境開始日</th>
				<th>リリース環境終了日</th>
				<th>備考</th>
			</tr>
			<s:iterator value="projectStatusList">
				<tr>
					<td><s:property value="projectId"/></td>
					<td><s:property value="projectName" /></td>
					<td><s:property value="awsStatus" /></td>
					<td><input type="text" name="aEnvStartList" value="<s:property value="aEnvStart" />" pattern="([0-2][0-9]{3})\/([0-1][0-9])\/([0-3][0-9])"></td>
					<td><input type="text" name="aEnvEndList" value="<s:property value="aEnvEnd" />" pattern="([0-2][0-9]{3})\/([0-1][0-9])\/([0-3][0-9])"></td>
					<td><input type="text" name="bEnvStartList" value="<s:property value="bEnvStart" />" pattern="([0-2][0-9]{3})\/([0-1][0-9])\/([0-3][0-9])"></td>
					<td><input type="text" name="bEnvEndList" value="<s:property value="bEnvEnd" />" pattern="([0-2][0-9]{3})\/([0-1][0-9])\/([0-3][0-9])"></td>
					<td><input type="text" name="rEnvStartList" value="<s:property value="rEnvStart" />" pattern="([0-2][0-9]{3})\/([0-1][0-9])\/([0-3][0-9])"></td>
					<td><input type="text" name="rEnvEndList" value="<s:property value="rEnvEnd" />" pattern="([0-2][0-9]{3})\/([0-1][0-9])\/([0-3][0-9])"></td>
					<td><input type="text" name="noteList" value="<s:property value="note" />" maxlength="200"></td>
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