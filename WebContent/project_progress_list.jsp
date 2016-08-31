<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>Insert title here</title>
<link rel="stylesheet" href="css/project_progress_list.css">
<script src="js/jquery-3.1.0.min.js"></script>
<script src="js/project_progress_list.js"></script>
</head>
<body>
	<h1>ヘッダー</h1>
	<h1>プロジェクト進捗報告</h1>

	<s:form action="projectSearch">
		<input type="text" name="search">
		<input type="submit" value="検索">
	</s:form>

<s:form action="projectEdit">
	<table border=1>

		<tr>
			<th>ID</th>
			<th>日付</th>
			<th>プロジェクト名</th>
			<th>進捗予定</th>
			<th>進捗結果</th>
			<th>その他報告</th>
			<th></th>
			<th></th>
		</tr>

		<s:iterator value="projectList">
			<tr>
				<td class="projectid"><input type="text" name="projectIdList" value="<s:property value="projectId"/>"></td>
				<td class="projectDay"><input type="text" name="projectDayList" value="<s:property value="projectDay" />"></td>
				<td class="project"><input type="text" name="projectnameList" value="<s:property value="project" />"></td>
				<td class="projectPlan"><input type="text" name="projectPlanList" value="<s:property value="projectPlan" />"></td>
				<td class="projectResult"><input type="text" name="projectResultList" value="<s:property value="projectResult" />"></td>
				<td class="other"><input type="text" name="otherList" value="<s:property value="other" />"></td>
				<td><input type="button" class="modal-delete" value="削除" /></td>
			</tr>
		</s:iterator>

</table>
<input type="submit" value="編集" />
		</s:form>


<table border=1>

		<s:iterator value="searchList">
			<tr>
				<td class="projectid"><s:property value="projectId" /><input type="text" hidden="hidden" name="projectIdList"
							value="<s:property value="projectId"/>"></td>
				<td class="projectDay"><input type="text" name="projectDayList" value="<s:property value="projectDay" />"></td>
				<td class="project"><input type="text" name="projectList" value="<s:property value="project" />"></td>
				<td class="projectPlan"><input type="text" name="projectPlanList" value="<s:property value="projectPlan" />"></td>
				<td class="projectResult"><input type="text" name="projectResultList" value="<s:property value="projectResult" />"></td>
				<td class="other"><input type="text" name="otherList" value="<s:property value="other" />"></td>
				<td><input type="button" class="modal-delete" value="削除" /></td>
			</tr>
		</s:iterator>
	</table>




	<s:form action="projectCreate">
		<input type="text" name="project">
		<input type="text" name="projectPlan">
		<input type="text" name="projectResult">
		<input type="text" name="other">
		<input type="submit" value="追加">
	</s:form>

	<div id="delete">
		<s:form action="projectDelete">
			<input type="text" id="delete-projectid" name="projectId">
			<input type="submit" value="削除">
			<input type="button" class="modal-close" value="閉じる">
		</s:form>
	</div>

	<div id="edit">
		編集するID

			<input type="text" id="edit-projectid" name="projectId">
			<input type="text" id="edit-projectday" name="projectDay">
			<input type="text" id="edit-project" name="project">
			<input type="text" id="edit-projectplan" name="projectPlan">
			<input type="text" id="edit-projectresult" name="projectResult">
			<input type="text" id="edit-other" name="other">

			<input type="button" class="modal-close" value="閉じる">

	</div>

</body>
</html>