<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Stylesheet
      ================================================== -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="css/decision_archive.css">
<!-- Javascripts
      ================================================== -->
<script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
<script src="js/footerFixed.js" type="text/javascript"></script>

<title>完了済み決裁</title>
<script type="text/javascript">
	//選択箇所全入力
	$(function() {
		$("#input").on("keyup change", function() {
			$("#res,#lines,#c,#d").val($(this).val());
		});
	});
</script>

<jsp:include page="header.jsp" />

</head>
<body>
	<div class="container">
		<h2>完了済み決裁一覧</h2>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>決裁ID</th>
					<th>プロジェクト名</th>
					<th>決裁の種類</th>
					<th>実施決裁プレビュー</th>
					<th>契約決裁プレビュー</th>
					<th>実施兼契約決裁プレビュー</th>
				</tr>
			</thead>

			<tbody>
				<s:iterator value="contractedArchiveList">

					<tr>
						<td><s:property value="decisionId" /></td>
						<td><s:property value="projectName" /></td>
						<td><s:property value="decisionType" /></td>
						<td><s:if test="%{decisionType == '契約'}">
								<s:form action="DecisionPreviewAction">
									<input type="hidden" name="decisionId"
										value="<s:property value="decisionId" />">
									<input type="hidden" name="type" value="1">
									<button class="btn btn-default" type="submit">Preview</button>
								</s:form>
							</s:if></td>
						<td><s:if test="%{decisionType == '契約'}">
								<s:form action="DecisionPreviewAction">
									<input type="hidden" name="decisionId"
										value="<s:property value="decisionId" />">
									<input type="hidden" name="type" value="2">
									<button class="btn btn-default" type="submit">Preview</button>
								</s:form>
							</s:if></td>
						<td><s:if test="%{decisionType == '実施兼契約'}">
								<s:form action="DecisionPreviewAction">
									<input type="hidden" name="decisionId"
										value="<s:property value="decisionId" />">
									<input type="hidden" name="type" value="3">
									<button class="btn btn-default" type="submit">Preview</button>
								</s:form>
							</s:if></td>
					</tr>

				</s:iterator>
			</tbody>
		</table>


	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>