<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ヘッダー</title>
<link rel="stylesheet" type="text/css" href="./css/header.css">
</head>
<body>

	<%
		boolean LoginState;
		if (session.getAttribute("id") == null) {
			LoginState = false;
		} else {
			LoginState = true;
		}
	%>

	<!--ヘッダー全部ここから-->
	<!--ログアウト時ヘッダー-->

	<%
		if (LoginState == false) {
	%>
	<div id="header"></div>
	<ul class="cds-navi">
	 	<li><a href="GoCustomerInfoAction">新規登録</a></li>
		<li><a href="GoLoginAction">ログイン</a></li>
		<li><a href="Go2CartAction">カート</a></li>
		<li><a href="GoTermsOfServiceAction">利用規約</a></li>
		<li><a href="GoCompanyAction">企業情報</a></li>
	</ul>

	<%
		}
	%>




	<!--ログイン時ヘッダー-->
	<%
		if (LoginState == true) {
	%>
	<div id="header"></div>
		<ul class="cds-navi">
			<li><a href="CustomerChangeAction">マイページ</a></li>
			<li><a href="GoLogoutCheckAction">ログアウト</a></li>
			<li><a href="Go2CartAction">カート</a></li>
			<li><a href="GoTermsOfServiceAction">利用規約</a></li>
			<li><a href="GoCompanyAction">企業情報</a></li>
		</ul>
	<%
		}
	%>

	<!--ヘッダー全部ここまで-->






</body>
</html>