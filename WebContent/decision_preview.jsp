<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<LINK rel="stylesheet" type="text/css" href="css/style.css">
<LINK rel="stylesheet" type="text/css" href="css/decision_preview.css">
<meta charset="UTF-8">
<link rel="shortcut icon" href="logo/oc.png">
<link rel="apple-touch-icon" href="logo/oc.png">
<script src="js/jquery-3.1.0.min.js"></script>
<script src="js/sendCheck.js"></script>
<script type="text/javascript" src="js/decision_preview.js"></script>
<title>決裁プレビュー</title>
</head>
<body>
	<s:if test="%{#session.userFlg >= 1}">
		<jsp:include page="header.jsp" />

		<h1>決裁プレビュー画面</h1>
		<br>
		<br>
		<s:if test="decisionPreviewList.size() == 0">
		まだ何も編集されていません。
	</s:if>
	<s:property value="%{resultString}" /><br>
		<s:iterator value="decisionPreviewList">
			<table>
				<tr>
					<td>
						<div align="right">
							日付
							<s:property value="day" />
						</div>
						<br>
						決裁分類：<s:property value="decisionType" />
						<br>
						起案者
						<br>
						氏名<s:property value="familyNameKanji" />
						<s:property value="givenNameKanji" />
						<br>
						<br>
						案件名：<s:property value="decisionName" />
						<br>
						<br>
						概要：
						<br>
						<s:property value="summary" />
						<br>
						<br>
						<div class="center">
							<h1>記</h1>
						</div>
						<br>
						１）理由・目的
						<br>
						<s:property value="cause" />
						<br>
						<br>
						２）費用
						<br>
						建設費用<s:property value="bildCost" /> 万円
						<br>
						損益費用：<s:property value="benefit" /> 万円
						<br>
						合計費用：<s:property value="amountAll" />万円
						<br>
						<br>
						３）実施時期・実施期間
						<br>
						<s:property value="startDay" />～<s:property value="endDay" />
						<br>
						<br>
						<div align="right">以上</div>
						<br>
						<br>
						<table id="tableApproval">
							<tr>
								<td><div class="width4">―：<br><br></div></td>
								<td><div class="width4">起案番号：<s:property value="iDraftingId" /><br><br></div></td>
								<td><div class="width4">実施決裁番号：<s:property value="iApprovalId" /><br><br></div></td>
							</tr>
							<tr>
								<td><div class="width4">承認者：<br> <br>日付：</div></td>
								<td><div class="width4">承認者：<br> <br>日付：</div></td>
								<td><div class="width4">承認者：<br> <br>日付：</div></td>
							</tr>
						</table>
						<br>
					</td>
				</tr>
			</table>
			<br>
			<br>
			<table>
				<tr>
					<td>
						<h2>実施計画</h2>
						<br>
						<br>
						以下の通り、当該開発計画を実施して良いかお伺いしたい。
						<br>
						<br>
						資料：
						<br>
						<s:property value="plan" />
						<s:if test="downloadList.size() > 0">
						<s:form action="DecisionDetailDownloadAction">
							<br>
							<s:iterator value="downloadList">
								<div class="textInline">
									<input type="submit" value="ダウンロード" class="downloadButton" />
									<s:property value="fileName" /><br>
								</div>
								<input type="hidden" value="<s:property value="fileName" />" class="fileNameStr">
							</s:iterator>
							<input type="hidden" name="fileName" value="" class="fileName">
							<input type="hidden" name="decisionDetailId" value="<s:property value="decisionDetailId" />">
						</s:form>
						</s:if>
					</td>
				</tr>
			</table>
			<br>
			<br>

		</s:iterator>
	</s:if>

			<form>
	<input type="button" value="戻る" onclick="history.back()">
	</form>
</body>
</html>