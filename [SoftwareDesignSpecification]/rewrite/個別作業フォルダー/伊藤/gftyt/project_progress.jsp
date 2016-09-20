<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>プロジェクト進捗状況</title>
<link rel="stylesheet" href="css/project_progress_list.css">
<script src="js/jquery-3.1.0.min.js"></script>
<script src="js/project_progress_list.js"></script>
</head>
<body>
	<div class="center">
		<header><jsp:include page="header.jsp" /></header>
		<h1>プロジェクト進捗報告</h1>
	</div>
	<s:form action="ProjectSearch">
		<input type="text" name="search" placeholder="プロジェクト名">
		<input type="submit" value="検索" class="button">
	</s:form>

	<s:form action="ProjectEdit">
		<table border=1>
			<tbody id="list_body">
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
						<td><input type="text" name="projectIdList"
							value="<s:property value="projectId"/>" size="7"
							class="projectIdlist"></td>
						<td><input type="text" name="projectDayList"
							value="<s:property value="projectDay" />" size="8"
							class="projectDaylist"></td>
						<td><input type="text" name="projectnameList"
							value="<s:property value="project" />" class="projectlist"></td>
						<td><input type="text" name="projectPlanList"
							value="<s:property value="projectPlan" />"
							class="projectPlanlist"></td>
						<td><input type="text" name="projectResultList"
							value="<s:property value="projectResult" />"
							class="projectResultlist"></td>
						<td><input type="text" name="otherList"
							value="<s:property value="other" />" class="otherlist"></td>
						<td><input type="button" class="modal-delete button"
							value="削除" /></td>
					</tr>
				</s:iterator>

				<s:iterator value="searchList">
					<tr>
						<td class="projectid"><input type="text" name="projectIdList"
							value="<s:property value="projectId"/>" size="7"></td>
						<td class="projectDay"><input type="text"
							name="projectDayList" value="<s:property value="projectDay" />"
							size="8"></td>
						<td class="project"><input type="text" name="projectnameList"
							value="<s:property value="project" />"></td>
						<td class="projectPlan"><input type="text"
							name="projectPlanList" value="<s:property value="projectPlan" />"></td>
						<td class="projectResult"><input type="text"
							name="projectResultList"
							value="<s:property value="projectResult" />"></td>
						<td class="other"><input type="text" name="otherList"
							value="<s:property value="other" />"></td>
						<td><input type="button" class="modal-delete button"
							value="削除" /></td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
		<input type="submit" class="button" value="編集" />
	</s:form>

	<s:form action="ProjectCreate">
		<input type="text" name="project" placeholder="プロジェクト名">
		<input type="text" name="projectPlan" placeholder="進捗予定">
		<input type="text" name="projectResult" placeholder="進捗結果">
		<input type="text" name="other" placeholder="その他報告">
		<input type="submit" class="button" value="追加">
	</s:form>



	<div class="delete">
		<input type="text" name="projectId" id="delete-projectid" readonly> <input
			type="text" name="projectId" id="delete-projectday" readonly> <input
			type="text" name="projectId" id="delete-projectname" readonly> <input
			type="text" name="projectId" id="delete-projectplan" readonly> <input
			type="text" name="projectId" id="delete-projectresult" readonly> <input
			type="text" name="projectId" id="delete-other" readonly> <input
			type="button" class="delete-true button" value="削除"> <input
			type="button" class="modal-close button" value="閉じる">
	</div>

	<div class="delete-prepare">
		本当に削除しますか？
		<s:form action="ProjectDelete">
			<input type="hidden" name="projectId" value=""  id="true-delete">
			<input type="submit" class="delete-true button" value="はい">
			<input type="button" class="modal-close button" value="いいえ">
		</s:form>
	</div>




	<br>
	<br>
	<br>
	<br>
	<div id="pager">
		<div id="page_ctrl">
			<ul id="page_before">
				<li id="page_prev">prev</li>
			</ul>
			<ul id="page_number"></ul>
			<ul id="page_after">
				<li id="page_next">next</li>
			</ul>
		</div>
	</div>
	<br>
	<br>
	<br>
	<s:form action="BackGoAction">
		<input type="submit" class="button" value="戻る">
	</s:form>

</body>
</html>