<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- css読み込み  -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<!-- js読み込み -->
<script src="js/bootstrap.js"></script>
</head>
<body>

<!-- ヘッダー -->
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
						<s:if test="%{#session.userFlg == null}">

							<li><a href="login.jsp" class="dropdown-toggle"
								data-toggle="dropdown">ログイン</a></li>

							<li><a href="register.jsp" class="dropdown=toggle"
								data-toggle="dropdown">新規登録</a></li>
						</s:if>

						<s:if test="%{#session.userFlg != null}">
							<li><a href="logout" class="dropdown-toggle"
								data-toggle="dropdown">ログアウト</a></li>

						</s:if>
						<s:property value="%{#session.userFlg}"/>
						<s:if test="%{#session.userFlg == 2}">
							<li><a href="admin.jsp" class="droptoggle"
								data-toggle="dropdown">管理者画面</a></li>
						</s:if>



					</ul>
				</div>
			</div>
		</nav>
	</header>
	<!-- ヘッダーはここまで -->

</body>
</html>