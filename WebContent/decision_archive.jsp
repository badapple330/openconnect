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

<title>完了済み決済</title>
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
		<h2>完了済み決済一覧</h2>
		<s:form action="DecisionArchiveAction">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>決済ID</th>
						<th>プロジェクト名</th>
						<th>プレビュー</th>
				</thead>

				<tbody>
					<s:iterator value="archiveList">
						<tr>
							<td><s:property value="siteId" /></td>
							<td><s:property value="siteName" /></td>
							<td>プレビュー</td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
		</s:form>

	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>