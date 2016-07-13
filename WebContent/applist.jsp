<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Open Connect</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<script src="js/bootstrap.js"></script>
</head>
<body>
	<header>
		<nav class="navbar navbar-default navbar-static-top">
			<div class="container">
				<div class="navbar-header">
					<h1>
						<a href="index.jsp">Open Connect</a>
					</h1>
				</div>
				<div class="collapse navbar-collapse">
					<ul class="nav navbar-nav navbar-right">
						<s:if test="notLoginMsg != null">
							<li><a href="login.jsp" class="dropdown-toggle"
								data-toggle="dropdown">ログイン</a></li>
							<li><a href="register.jsp" class="dropdown=toggle"
								data-toggle="dropdown">新規登録</a></li>
						</s:if>
						<s:else>
							<li><a href="logout" class="dropdown-toggle"
								data-toggle="dropdown">ログアウト</a></li>
						</s:else>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<div class="container">
		<h1 class="page-header">アプリ一覧</h1>
		<s:iterator value="siteInfoList">
			<ul>
				<s:a href="%{url}">
					<s:property value="siteName" />
					<br>
				</s:a>
			</ul>
		</s:iterator>
		<s:property value="notLoginMsg"></s:property>
	</div>

	<div class="container">
		<h1 class="page-header">勤怠管理</h1>
		<s:if test="notLoginMsg != null">
			<s:property value="notLoginMsg"></s:property>
		</s:if>
		<s:else>
			<ul>
				<s:a href="GoKintaiChooseAction">勤怠管理を行う方はこちらへ</s:a>
			</ul>
		</s:else>
	</div>
</body>
</html>