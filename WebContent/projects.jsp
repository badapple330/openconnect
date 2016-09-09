<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>プロジェクト一覧</title>

<link rel="stylesheet" href="css/projects.css">
<script src="js/jquery-3.1.0.min.js"></script>
<script src="js/projects.js"></script>


<header><jsp:include page="header.jsp" /></header>

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
						value="<s:property  value="projectId" />" class="projectId"></td>

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
					<td>
							<input type="button" value="削除"  class="modal-open">
						</td>

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
	</s:form>


	<div id="modal-main">
		<!-- #contents START -->
		プロジェクトID <input type="text" name="projectId" id="delete-projectid"
			readonly>
			<br>プロジェクト名 <input type="text" name="projectId"
			id="delete-projectname" readonly>
			<br> 管理者（リーダー）<input type="text" name="projectId"
			id="delete-projectmanagerid" readonly>
		<br>管理者（サブ） <input type="text" name="projectId"
			id="delete-projectsubmanagerid" readonly>
			<br>開始日<input type="text" name="projectId"
			 id="delete-projectstartdate" readonly>
		<br>終了日<input type="text" name="projectId" id="projectdelete-enddate"
			readonly>
			<br>備考<input type="text" name="projectId" id="projectdelete-projectnote"
			readonly>

			<br> <input type="button"
			class="delete-true button" value="削除"> <input type="button"
			class="modal-close button" value="閉じる">

		<div class="delete-prepare">
			本当に削除しますか？
			<s:form action="ProjectsDelete">
				<input type="hidden" name="projectId" id="true-delete">
				<input type="submit" class="delete-true button" value="はい">
				<input type="button" class="modal-close button" value="いいえ">
			</s:form>
		</div>
	</div>


	<div id="contents">

		<br>
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
</body>
</html>