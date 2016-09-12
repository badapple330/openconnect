<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset=UTF-8>
<title>決裁手続き電子化</title>
<script src="js/jquery-3.1.0.min.js"></script>
<script src="js/decision_detail.js"></script>
<link rel="stylesheet" href="css/decision_detail.css">
</head>
<body>

	<!-- 	ヘッダー読み込み -->
	<jsp:include page="header.jsp" />

	<!-- 一覧表示 -->
	<h1>決裁手続き一覧</h1>
	<br>
	<s:form action="DecisionDetailSearch">
	プロジェクト検索<input type="text" placeholder="例：rewrite" name="searchString">
		<s:submit value="検索" />
	</s:form>
	<br>
	<br>
	<!-- 	リスト表示 -->
	<table border="1">
		<tr>
			<th>ID</th>
			<th>プロジェクトID</th>
			<th>案件番号</th>
			<th>プロジェクト名</th>
			<th>決裁分類</th>
			<th>申請・承認状況</th>
			<th></th>
			<th></th>
			<th></th>
			<th></th>
		</tr>

		<s:iterator value="decisionDetailList">
			<tr>

				<td class="decision_detail_id"><s:property
						value="decisionDetailId" /></td>
				<td><s:property value="projectId" /></td>
				<td class="decision_id"><s:property value="decisionId" /></td>
				<td class="decision_name"><s:property value="projectName" /></td>
				<td class="decision_type"><s:property value="decisionType" /></td>
				<td class="decision_status"><s:property value="decisionStatus" /></td>
				<td><input type="button" value="編集" class="modal-edit-open">

				</td>
				<td>	<s:if test="%{decisionStatus=='承認'}">
				<input type="button" value="申請" /></s:if>
				<s:else>
				<s:form action="DecisionDetailApplication">
						<input type="hidden" name="decisionDetailId"
							value="<s:property value="decisionDetailId" />">
						<input type="hidden" name="decisionStatus" value="承認待">
						<s:submit value="申請" />
					</s:form>
					</s:else>
					</td>
				<td><input type="button" value="削除" class="modal-open"></td>

				<td><s:form action="DecisionDetailPreview">
						<input type="hidden" name="decisionDetailId"
							value="<s:property value="decisionDetailId" />">
						<s:submit value="プレビュー" />
					</s:form></td>
			</tr>
		</s:iterator>

	</table>
	<br>


	<s:form action="DecisionDetailInsert">
		<input type="text" name="projectId" placeholder="プロジェクトID入力">
		<input type="text" name="password" pattern="^[0-9A-Za-z]+$" placeholder="パスワード入力 半角英数字のみ">
		<input type="submit" value="追加">
	</s:form>


	<div id="modal-edit-main">
		以下の内容を編集しますか？
		<table border="1">
			<tr>
				<td>案件ID</td>
				<td><span id="edit-projectid"></span></td>
			</tr>
			<tr>
				<td>プロジェクト名</td>
				<td><span id="edit-projectname"></span></td>
			</tr>
			<tr>
				<td>決裁分類</td>
				<td><span id="edit-classify"></span></td>
			</tr>
			<tr>
				<td>申請・承認状況</td>
				<td><span id="edit-status"> </span></td>
			</tr>
		</table>
		<input type="button" class="delete-true button" value="はい"> <input
			type="button" class="modal-close button" value="いいえ">

		<div class="delete-prepare">
			パスワードを入力してください
			<s:form action="DecisionDetailUpdate">
				<input type="text" name="password" pattern="^[0-9A-Za-z]+$" placeholder="パスワード入力 半角英数字のみ">
				<input type="hidden" name="decisionDetailId" value=""
					id="edit-delete">
				<input type="submit" class="delete-true button" value="編集">
			</s:form>
			<input type="button" class="modal-close button" value="閉じる">
		</div>
	</div>

	<div id="modal-main">
		以下の内容を削除しますか？
		<table border="1">
			<tr>
				<td>案件ID</td>
				<td><span id="delete-projectid"></span></td>
			</tr>
			<tr>
				<td>プロジェクト名</td>
				<td><span id="delete-projectname"></span></td>
			</tr>
			<tr>
				<td>決裁分類</td>
				<td><span id="delete-classify"></span></td>
			</tr>
			<tr>
				<td>申請・承認状況</td>
				<td><span id="delete-status"> </span></td>
			</tr>
		</table>
		<input type="button" class="delete-true button" value="削除"> <input
			type="button" class="modal-close button" value="閉じる">

		<div class="delete-prepare">
			本当に削除しますか？
			<s:form action="DecisionDetailDelete">
				<input type="hidden" name="decisionDetailId" value=""
					id="true-delete">
				<input type="submit" class="delete-true button" value="はい">
				<input type="button" class="modal-close button" value="いいえ">
			</s:form>
		</div>
	</div>

	<!-- 	戻る -->
	<s:form action="GetAddressAction">
		<s:submit value="戻る" />
	</s:form>

</body>
</html>