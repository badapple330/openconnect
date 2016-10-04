<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/mongoselect.css">
<title>History</title>
</head>
<body>
	<h1>黒歴史（ゝω・） ﾃﾍﾍﾟﾛ</h1>

	<br>
	<table class="list">
		<tbody>
		<th>名前</th><th>コメント</th>

			<s:iterator value="nameList">
				<tr>
						<td><s:property value="name" /></td>
						<td><s:property value="comment" /></td>
					</tr>
			</s:iterator>
			</table>
	<br>
	<br>
	<s:form action="GoMongo">
		<s:submit type="button" value="└(―_―；)_―；)―；)；))┐こっそり退却！" class="btn"/>
	</s:form>
</body>
</html>