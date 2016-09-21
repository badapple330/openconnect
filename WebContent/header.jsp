<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script>


<title>Insert title here</title>
<!-- css読み込み  -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="css/header.css" rel="stylesheet">
<!-- js読み込み -->
<script src="js/bootstrap.js"></script>
<script src="js/header.js"></script>
</head>
<body>

	<!-- ヘッダー -->
	<header>
		<nav class="navbar navbar-default navbar-static-top">
			<div class="container">
				<div class="navbar-header">
					<h1>
						<a href="index.jsp" class="openConnect">Open Connect</a>
					</h1>
				</div>
				<div class="collapse navbar-collapse">
					<ul class="nav navbar-nav navbar-right">

						<s:if test="%{#session.userFlg == null}">

							<li><a href="login.jsp">ログイン</a></li>

							<li><a href="register.jsp">新規登録</a></li>
						</s:if>

						<s:if test="%{#session.userFlg != null}">
							<li><a href="GoLogoutAction">ログアウト</a></li>

						</s:if>
						<s:if test="%{#session.userFlg == 3}">
							<li><a href="admin.jsp">管理者画面</a></li>
						</s:if>
					</ul>
				</div>
				<dl>
				<dt id="menuBer">メニュー</dt>
				</dl>
				<dl id="menuElementGroup">
				<dd><a href="ProjectsSelectAction" class="menuElement">プロジェクト一覧</a></dd>
				<dd><a href="ProjectStatusSelectAction" class="menuElement">プロジェクトリリース状況</a></dd>
				<dd><a href="ProjectProgressSelectAction" class="menuElement">プロジェクト進捗報告</a></dd>
				<dd><a href="StudentsSelectAction" class="menuElement">受講生一覧</a></dd>
				<dd><a href="GoAttendanceAction" class="menuElement">勤怠更新</a></dd>
				<dd><a href="DecisionSelectAction" class="menuElement">決裁一覧状況</a></dd>
				<dd><a href="DecisionDetailSelectAction" class="menuElement">決裁手続き</a></dd>
				<s:if test="%{#session.userFlg  >= 2}">
					<dd><a href="DecisionApplicationSelectAction" class="menuElement">決済手続き申請一覧</a></dd>
				</s:if>
				<dd><a href="BooksSelectAction" class="menuElement">書籍一覧</a></dd>
				<dd><a href="BooksBorrowSelectAction" class="menuElement">書籍貸し出し</a></dd>
				<dd><a href="ScheduleSelectAction" class="menuElement">スケジュール一覧</a></dd>
				</dl>

			</div>
		</nav>
	</header>
	<!-- ヘッダーはここまで -->

</body>
</html>