<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>決済状況一覧</title>
<link rel="stylesheet" href="css/decision.css">
</head>
<body>

	<div class="container">

		<!-- ヘッダー読み込み -->
		<header><jsp:include page="header.jsp" /></header>
		<br>
		<h1>決裁状況一覧</h1>
		<br>
		<div align="left">案件名を入力してください</div>
		<p>
		<p>
			<s:form action="DecisionSelectAction">
				<input type="text" name="searchString" id="searchText">
				<input type="submit" value="検索" class="button">
			</s:form>
		</p>
		<br>
		<s:form action="DecisionUpdateAction">
			<div class="center">
				<table border="1">
					<tr>
						<!-- 一覧 -->
						<td></td>
						<td>
							<h5>登録日</h5>
						</td>
						<td>
							<h5>姓</h5>
						</td>
						<td>
							<h5>名</h5>
						</td>
						<td>
							<h5>プロジェクトID</h5>
						</td>
						<td>
							<h5>案件番号</h5>
						</td>
						<td>
							<h5>案件名</h5>
						</td>
						<td>
							<h5>詳細</h5>
						</td>
						<td>
							<h5>実施起案番号</h5>
						</td>
						<td>
							<h5>実施決裁番号</h5>
						</td>
						<td>
							<h5>契約起案番号</h5>
						</td>
						<td>
							<h5>契約決番号</h5>
						</td>
						<td>
							<h5>実施兼契約起案番号</h5>
						</td>
						<td>
							<h5>実施兼契約番号</h5>
						</td>
					</tr>
					<!-- 繰り返し -->
					<s:iterator value="decisiontList">
						<tr>
							<td><input type="hidden"
								value=<s:property value="decisionId" /> name="decisionId"></td>
							<td><input type="text" pattern=\d{4}-\d{2}-\d{2} required
								name="registration" value="<s:property value="registration" />"
								id="registration" /></td>
							<td><input type="text" pattern="[1-9][0-9]*" maxlength="11"
								required name="userId" value="<s:property value="userId" />"
								id="id" /></td>
							<td><input type="text" pattern="[1-9][0-9]*" maxlength="11"
								required name="userId" value="<s:property value="userId" />"
								id="id" /></td>
							<td><input type="text" pattern="[1-9][0-9]*" maxlength="11"
								required name="projectId"
								value="<s:property value="projectId" />" id="registration" /></td>
							<td><s:property value="decisionId" /></td>
							<td><input type="text" maxlength="100" name="decisionName"
								id="display" value="<s:property value="decisionName" />" /></td>
							<td><input type="text" maxlength="255" name="detail"
								id="display" value="<s:property value="detail" />" /></td>
							<td><input type="text" maxlength="100" name="iDraftingId"
								id="registration" value="<s:property value="iDraftingId" />" /></td>
							<td><input type="text" maxlength="100" name="iApprovalId"
								id="registration" value="<s:property value="iApprovalId" />" /></td>
							<td><input type="text" maxlength="100" name="aDraftingId"
								id="registration" value="<s:property value="aDraftingId" />" /></td>
							<td><input type="text" maxlength="100" name="cdId"
								id="registration" value="<s:property value="cdId" />" /></td>
							<td><input type="text" maxlength="100" name="iADId"
								id="registration" value="<s:property value="iADId" />" /></td>
							<td><input type="text" maxlength="100" name="iAId"
								id="registration" value="<s:property value="iAId" />" /></td>
						</tr>
					</s:iterator>
				</table>
			</div>
			<center>
				<s:if test="%{#session.userFlg == 3 || #session.userFlg == 2}">
					<input type="submit" value="編集" class="button">
				</s:if>
			</center>
		</s:form>
		<br>
		<s:form action="BackGoAction">
			<center>
				<input type=submit value="戻る" class="button">
			</center>
		</s:form>
	</div>
</body>
</html>