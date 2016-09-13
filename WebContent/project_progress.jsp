<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>プロジェクト進捗状況</title>
<link rel="stylesheet" href="css/project_progress.css">
<script src="js/jquery-3.1.0.min.js"></script>
<script src="js/project_progress.js"></script>
</head>
<body>
	<div class="center">
		<header><jsp:include page="header.jsp" /></header>
		<h1>プロジェクト進捗報告</h1>
	</div>
	<s:form action="ProjectSelectAction">
		<input type="text" name="search" placeholder="プロジェクト名" maxlength="20">
		<input type="submit" value="検索" class="button">
	</s:form>

	<s:form action="ProjectUpdateAction">
		<table border=1>
			<tbody id="list_body">
				<tr>
					<th></th>
					<th>プロジェクトID</th>
					<th>日付</th>
					<th>プロジェクト名</th>
					<th>進捗予定</th>
					<th>進捗結果</th>
					<th>その他報告</th>
					<th>リーダーID</th>
					<th>サブリーダーID</th>
					<th>開始日</th>
					<th>終了日</th>
					<th>メモ</th>
				</tr>
				<s:iterator value="searchList">
					<tr>
						<td><input type="hidden" name="progressIdList"
							value="<s:property value="progressId" />" class="progressId"></td>

						<td><s:property value="projectId" /> <input type="hidden"
							name="projectIdList" value="<s:property value="projectId"/>"
							size="7" class="projectIdlist" maxlength="4"></td>
						<td><input type="text" name="projectDayList"
							value="<s:property value="projectDay" />" size="8"
							class="projectDaylist" maxlength="12"></td>
						<td><input type="text" name="projectnameList"
							value="<s:property value="projectName" />" class="projectlist"
							maxlength="20"></td>
						<td><input type="text" name="projectPlanList"
							value="<s:property value="projectPlan" />"
							class="projectPlanlist" maxlength="100"></td>
						<td><input type="text" name="projectResultList"
							value="<s:property value="projectResult" />"
							class="projectResultlist" maxlength="100"></td>
						<td><input type="text" name="otherList"
							value="<s:property value="other" />" class="otherlist"
							maxlength="100"></td>

						<td><s:property value="managerId" /></td>
						<td><s:property value="subManagerId" /></td>
						<td><s:property value="startDate" /></td>
						<td><s:property value="endDate" /></td>
						<td><s:property value="note" /></td>
						<td><s:if test="%{!(#session.userFlg == 1)}">
								<input type="button" class="button modal-open" value="削除" />
							</s:if></td>
					</tr>
				</s:iterator>

			</tbody>
		</table>
		<s:if test="%{!(#session.userFlg == 1)}">
			<input type="submit" class="button" value="編集" />
		</s:if>
	</s:form>

	<s:form action="ProjectInsertAction">
		<table border="1">
			<tr>
				<th>プロジェクトID</th>
				<th>進捗予定</th>
				<th>進捗結果</th>
				<th>その他報告</th>
			</tr>
			<tr>
				<td><input type="text" name="projectId" placeholder=""
					pattern="^[0-9]+$" maxlength="4"></td>
				<td><input type="text" name="projectPlan" placeholder=""
					maxlength="100"></td>
				<td><input type="text" name="projectResult" placeholder=""
					maxlength="100"></td>
				<td><input type="text" name="other" placeholder=""
					maxlength="100"></td>
			</tr>
		</table>
		<input type="submit" class="button" value="追加">
	</s:form>


	<div id="modal-main">
		<table border="1">
			<tr>
				<td>プロジェクトID</td>
				<td><span id="delete-projectid"></span></td>
			</tr>
			<tr>
				<td>日付</td>
				<td><span id="delete-projectday"></span></td>
			</tr>
			<tr>
				<td>プロジェクト名</td>
				<td><span id="delete-projectname"></span></td>
			</tr>
			<tr>
				<td>進捗予定</td>
				<td><span id="delete-projectplan"></span></td>
			</tr>
			<tr>
				<td>進捗結果</td>
				<td><span id="delete-projectresult"></span></td>
			</tr>
			<tr>
				<td>その他報告</td>
				<td><span id="delete-other"> </span></td>
			</tr>
		</table>

		<input type="button" class="delete-true button" value="削除"> <input
			type="button" class="modal-close button" value="閉じる">

		<div class="delete-prepare">
			本当に削除しますか？
			<s:form action="ProjectDeleteAction">
				<input type="hidden" name="progressId" value="" id="true-delete">
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
</html>