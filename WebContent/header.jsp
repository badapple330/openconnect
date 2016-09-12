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
			</div>
		</nav>

		<div class="goButton">

			<!-- 	<!-- プロジェクト一覧 -->
			<s:form action="GoProjects">
				<s:submit type="submit" value="プロジェクト一覧" />
			</s:form>
			<!-- 	<!-- プロジェクトリリース状況 -->
			<s:form action="ProjectStatusSelectAction">
				<s:submit type="submit" value="リリース状況" />
			</s:form>
			<!--プロジェクト進捗報告 -->
			<s:form action="GoProjectProgress">
				<s:submit value="プロジェクト進捗報告" />
			</s:form>
			<!--     受講生一覧 -->
			<s:form action="StudentsSelectAction">
				<s:submit type="submit" value="受講生一覧" />
			</s:form>
			<!-- 	<!--勤怠更新 -->
			<s:form action="AttendanceSelectAction">
				<s:submit type="submit" value="勤怠更新" />
			</s:form>
			<!-- 決済一覧状況 -->
			<s:form action="DecisionSelect">
				<s:submit type="submit" value="決済状況一覧" />
			</s:form>
			<!--決済手続き電子化 -->
			<s:form action="GoDecisionDetail">
				<s:submit value="決済手続き" />
			</s:form>
			<!-- 	<!--決済手続き申請一覧 -->
			<s:if test="%{#session.userFlg == 3}">
				<s:form action="DecisionApplicationList">
					<s:submit value="決済手続き申請一覧" />
				</s:form>
			</s:if>
			<!--書籍一覧 -->
			<s:form action="GoBooks">
				<s:submit value="書籍一覧" />
			</s:form>
			<!--書籍貸し出し -->
			<s:form action="GoBooksBorrow">
				<s:submit value="書籍貸し出し" />
			</s:form>
			<!--スケジュール一覧 -->
			<s:form action="ScheduleSelect">
				<s:submit value="スケジュール一覧" />
			</s:form>
		</div>
	</header>
	<!-- ヘッダーはここまで -->

</body>
</html>