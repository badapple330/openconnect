<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="css/projects.css">
<script src="js/jquery-3.1.0.min.js"></script>
<script src="js/projects.js"></script>


<title>プロジェクト一覧</title>
</head>
<body>

	<!-- ヘッダー -->
	<header><jsp:include page="header.jsp" /></header>

	<!-- 一覧表示 -->
	<div class="container">
		<h1 class="page-header">プロジェクト一覧</h1>
		<s:iterator value="siteInfoList">
			<ul>
				<s:a href="%{siteUrl}">
					<s:property value="siteName" />
					<br>
				</s:a>
			</ul>
		</s:iterator>
		<s:property value="notLoginMsg" />
	</div>


	<s:form action="ProjectsSearchAction">
		<input type="text" name="search" placeholder="プロジェクト名">
		<input type="submit" value="検索する">
	</s:form>

	<s:form action="ProjectsListEdit">

		<table border="1">
			<tbody id="list_body">
				<tr>

					<td></td>
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


						<td><input type="hidden" name="projectIdList"
							value="<s:property value="projectId"/>" class="projectId"></td>


						<td><s:property value="projectId"/></td>

						<td><input type="text" name="projectNameList" maxlength="100"
							value="<s:property value="projectName"/>" class="projectNamelist"></td>

						<td><input type="text" name="projectManagerIdList"
							value="<s:property value="managerId"/>"
							class="projectManagerIdlist"></td>

						<td><input type="text" name="projectSubManagerIdList"
							value="<s:property value="subManagerId"/>"
							class="projectSubManagerIdlist"></td>

						<td><input type="text" name="projectStartDateList"
							value="<s:property value="startDate"/>" class="projectStartDatelist"></td>

						<td><input type="text" name="projectEndDateList"
							value="<s:property value="endDate"/>" class="projectEnddatelist"></td>

						<td><input type="text" name="projectNoteList" maxlength="255"
							value="<s:property value="note"/>" class="projectNotelist"></td>
						<td><input type="button" value="削除" class="modal-open">
						</td>

					</tr>
				</s:iterator>
			</tbody>
		</table>
		<input class="button" type="submit" value="編集">
	</s:form>

	<s:form action="ProjectsInsert">
		<input type="text" name="projectName" placeholder="プロジェクト名"
			maxlength=100 required>
		<input type="text" name="managerId" placeholder="管理者ID(リーダー)">
		<input type="text" name="subManagerId" placeholder="管理者ID(サブ)">
		<input type="text" name="startDate" placeholder="開始日">
		<input class="button" type="submit" value="追加">
	</s:form>


	<div id="modal-main">
		<!-- #contents START -->
		プロジェクトID <input type="text" name="projectId" id="delete-projectid"
			readonly> <br> プロジェクト名 <input type="text"
			name="projectId" id="delete-projectname" readonly> <br>
		管理者（リーダー）<input type="text" name="projectId"
			id="delete-projectmanagerid" readonly> <br>管理者（サブ） <input
			type="text" name="projectId" id="delete-projectsubmanagerid" readonly>
		<br>開始日<input type="text" name="projectId"
			id="delete-projectstartdate" readonly> <br>終了日<input
			type="text" name="projectId" id="delete-projectenddate" readonly>
		<br>備考<input type="text" name="projectId" id="delete-projectnote"
			readonly> <br>


			 <input type="button"
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