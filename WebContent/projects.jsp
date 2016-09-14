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


	<s:form action="ProjectsSelectAction">
		<input type="text" pattern="^[0-9A-Za-z]+$" maxlength="100"
			name="search" placeholder="プロジェクト名を記入">
		<input type="submit" value="検索する">
	</s:form>
	<br>
	<s:property value="%{resultString}" />
	<br>
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

						<td><s:property value="projectId" /></td>

						<td><input type="text" name="projectNameList" maxlength="100"
							value="<s:property value="projectName"/>" class="projectNamelist"></td>

						<td><input type="text" name="projectManagerIdList"
							maxlength="1000" value="<s:property value="managerId"/>"
							class="projectManagerIdlist"></td>

						<td><input type="text" name="projectSubManagerIdList"
							maxlength="1000" value="<s:property value="subManagerId"/>"
							class="projectSubManagerIdlist"></td>

						<td><input type="text" name="projectStartDateList" pattern="([0-2][0-9]{3})\-([0-1][0-9])\-([0-3][0-9])"
							maxlength="15" value="<s:property value="startDate"/>"
							class="projectStartDatelist"></td>

						<td><input type="text" name="projectEndDateList" pattern="([0-2][0-9]{3})\-([0-1][0-9])\-([0-3][0-9])"
							maxlength="15" value="<s:property value="endDate"/>"
							class="projectEnddatelist"></td>

						<td><input type="text" name="projectNoteList" maxlength="255"
							value="<s:property value="note"/>" class="projectNotelist"></td>
						<td><input type="button" value="削除" class="modal-open">
						</td>

					</tr>
				</s:iterator>
			</tbody>
		</table>
		<s:if test="%{#session.userFlg == 3}">
			<input class="button" type="submit" value="編集">
		</s:if>
	</s:form>
	<br>
	<s:form action="ProjectsInsertAction">
		<table border="1">
			<tbody id="list_body">
				<tr>

					<td>プロジェクト名</td>
					<td>管理者（リーダー）</td>
					<td>管理者（サブリーダー）</td>
					<td>開始日</td>

				</tr>

				<tr>

					<td><input type="text" name="projectName"
						placeholder="プロジェクト名を記入" maxlength=100 required></td>
					<td><input type="text" pattern="[1-9][0-9]*" name="managerId"
						placeholder="管理者ID(リーダー)を記入" maxlength="1000" required></td>
					<td><input type="text" pattern="[1-9][0-9]*"
						name="subManagerId" placeholder="管理者ID(サブ)を記入" maxlength="1000"
						required></td>
					<td><input type="text" pattern="([0-2][0-9]{3})\/([0-1][0-9])\/([0-3][0-9])"
						name="startDate" placeholder="開始日を記入" maxlength="15" required></td>
				</tr>
		</table>
		</tbody>
		<s:if test="%{#session.userFlg >= 2}">
			<input class="button" type="submit" value="追加">
		</s:if>
	</s:form>


	<div id="modal-main">
		<!-- #contents START -->
		<div id="modal-style">
			<table class="modal_border">

				<tr>
					<td>プロジェクト名
						<div class="delete-projectname modalDelete"></div>
					</td>
				</tr>
				<tr>
					<td>管理者（リーダー）
						<div class="delete-projectmanagerid modalDelete"></div>
					</td>
				</tr>
				<tr>
					<td>管理者（サブリーダー）
						<div class="delete-projectsubmanagerid modalDelete"></div>
					</td>
				</tr>
				<tr>
					<td>開始日
						<div class="delete-projectstartdate modalDelete"></div>
					</td>
				</tr>
				<tr>
					<td>終了日
						<div class="delete-projectenddate modalDelete"></div>
					</td>
				</tr>
				<tr>
					<td>備考
						<div class="delete-projectnote modalDelete"></div>
					</td>
			</table>
			<input type="button" class="delete-true button" value="削除"> <input
				type="button" class="modal-close button" value="閉じる">

			<div class="delete-prepare">
				<p>本当に削除しますか。</p>

				<s:form action="ProjectsDeleteAction">
					<input type="hidden" name="projectId" value="" class="true-delete">
					<input type="submit" class="delete-true button" value="はい">
					<input type="button" class="modal-close button" value="いいえ">
				</s:form>

			</div>
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
</html>