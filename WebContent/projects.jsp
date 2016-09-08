<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>プロジェクト一覧</title>
<CENTER>
	<h1>ヘッダー</h1>
</CENTER>
</head>
<body>

	<p>プロジェクト検索</p>
	<s:form action="ProjectsSearchAction">
		<input type="text" name="search">
		<input type="submit" value="検索する">
	</s:form>

	<s:form action="ProjectsListEdit">

		<table border="2" cellspacing="0" style="">
			<tr>
				<td>ID</td>
				<td>プロジェクト名</td>
				<td>管理者（リーダー）</td>
				<td>管理者（サブ）</td>
				<td>開始日</td>
				<td>終了日</td>
				<td>備考</td>
			</tr>
			<s:iterator value="projectList">
				<!-- 繰り返し -->
				<!-- 表示 -->
				<tr>
					<td><input type="text" name="projectIdList"
						value="<s:property  value="projectId" />"></td>

					<td><input type="text" name="projectNameList"
						value="<s:property value="projectName"/>"></td>

					<td><input type="text" name="projectManagerIdList"
						value="<s:property value="managerId"/>"></td>

					<td><input type="text" name="projectSubManagerIdList"
						value="<s:property value="subManagerId"/>"></td>

					<td><input type="text" name="projectStartDateList"
						value="<s:property value="startDate"/>"></td>

					<td><input type="text" name="projectEndDateList"
						value="<s:property value="endDate"/>"></td>

					<td><input type="text" name="projectNoteList"
						value="<s:property value="note"/>"></td>
				</tr>
			</s:iterator>

		</table>
		<input class="button" type="submit" value="編集">
	</s:form>

	<s:form action="ProjectsInsert">
		<input type="text" name="projectId" placeholder="プロジェクトID">
		<input type="text" name="projectName" placeholder="プロジェクト名">
		<input type="text" name="managerId" placeholder="管理者ID(リーダー)">
		<input type="text" name="subManagerId" placeholder="管理者ID(サブ)">
		<input type="text" name="startDate" placeholder="開始日">
		<input class="button" type="submit" value="追加">

		<br>
	</s:form>
	<s:form action="BackGoAction">
		<input type="submit" class="button" value="戻る">
	</s:form>



</body>
</body>
</html>