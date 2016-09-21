<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<LINK rel="stylesheet" type="text/css" href="css/style.css">
<meta charset="UTF-8">
<link rel="shortcut icon" href="favicon.ico">
<script src="js/jquery-3.0.0.min.js"></script>
<script src="js/sendCheck.js"></script>
<title>申請一覧</title>
</head>
<body>
<s:if test="%{#session.userFlg >= 1}">
	<jsp:include page="header.jsp" />

	<h1>決裁手続き申請一覧画面</h1>
	<br>
	<br>

	<table border="1">
		<s:if test="%{decisionDetailList.size() > 0}">
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
		</tr>
		</s:if>
		<s:if test="%{decisionDetailList.size() == 0}">
		承認待ちの決裁はありません。
		</s:if>
		<s:iterator value="decisionDetailList">
			<s:if test="%{decisionStatus=='承認待'}">
				<tr>
					<td class="decision_detail_id"><s:property
							value="decisionDetailId" /></td>
					<td><s:property value="projectId" /></td>
					<td class="decision_id"><s:property value="decisionId" /></td>
					<td class="decision_name"><s:property value="projectName" /></td>
					<td class="decision_type"><s:property value="decisionType" /></td>
					<td class="decision_status"><s:property value="decisionStatus" /></td>

					<td><s:form action="DecisionDetailPreviewAction">
							<input type="hidden" name="decisionDetailId"
								value="<s:property value="decisionDetailId" />">
							<s:submit value="プレビュー" />
						</s:form></td>

					<td><s:form action="DecisionApplicationUpdateAction">
					<input type="hidden" name="decisionDetailId"
						value="<s:property value="decisionDetailId" />"> <input
						type="hidden" name="decisionStatus" value="承認"> <s:submit
							value="承認" /> </s:form></td>

					<td><s:form action="DecisionApplicationUpdateAction">
					<input type="hidden" name="decisionDetailId"
						value="<s:property value="decisionDetailId" />"> <input
						type="hidden" name="decisionStatus" value="差し戻し"> <s:submit
							value="差し戻し" /> </s:form></td>
				</tr>
			</s:if>
		</s:iterator>

	</table>
	<br>
	<br>
		</s:if>
	<s:form action="GetAddressAction">
		<s:submit value="戻る" class="button" />
	</s:form>

</body>
</html>