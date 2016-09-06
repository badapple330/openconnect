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
			<td class="decision_detail_id"><s:property value="decisionDetailId" /></td>
				<td class="decision_id"><s:property value="decisionId" /></td>
				<td class="decision_name"><s:property value="projectName" /></td>
				<td class="decision_type"><s:property value="decisionType" /></td>
				<td class="decision_status"><s:property value="decisionStatus" /></td>
				<td><input type="button" value="編集"></td>
				<td><input type="button" value="申請"></td>
				<td><input type="button" value="削除" class="modal-open"></td>
				<td><input type="button" value="プレビュー"></td>
			</tr>
		</s:iterator>

		<s:iterator value="operateList">
			<tr>
			<td class="decision_detail_id"><s:property value="decisionDetailId" /></td>
				<td class="decision_id"><s:property value="decisionId" /></td>
				<td class="decision_name"><s:property value="projectName" /></td>
				<td class="decision_type"><s:property value="decisionType" /></td>
				<td class="decision_status"><s:property value="decisionStatus" /></td>
				<td><input type="button" value="編集"></td>
				<td><input type="button" value="申請"></td>
				<td><input type="button" value="削除" class="modal-open"></td>
				<td><input type="button" value="プレビュー"></td>
			</tr>
		</s:iterator>
	</table>
	<br>
	<br>


	プロジェクト名入力<input type="text" >
	<input type="submit" value="追加">

	<div id="modal-main">
		<!-- #contents START -->
		ID <input type="text" id="delete-projectid" readonly><br>
		プロジェクト名<input type="text" id="delete-projectname" readonly>
		<br>決裁分類<input type="text" id="decision-classify" readonly>
		<br>申請・承認状況<input type="text" id="decision-status" readonly>

		 <br><input type="button" class="delete-true button" value="削除">
		  <input type="button" class="modal-close button" value="閉じる">

		<div class="delete-prepare">
			本当に削除しますか？
			<s:form action="DecisionDetailDelete">
				<input type="hidden" name="decisionDetailId" value="" id="true-delete">
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