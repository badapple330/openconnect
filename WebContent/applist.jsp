<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Open Connect</title>
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
						<s:if test="notLoginMsg != null">

							<li><a href="login.jsp" class="dropdown-toggle"
								data-toggle="dropdown">ログイン</a></li>

							<li><a href="register.jsp" class="dropdown=toggle"
								data-toggle="dropdown">新規登録</a></li>
						</s:if>

						<s:if test="notLoginMsg == null">
							<li><a href="logout" class="dropdown-toggle"
								data-toggle="dropdown">ログアウト</a></li>

						</s:if>
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

	<!-- アプリ一覧表示 -->
	<div class="container">
		<h1 class="page-header">アプリ一覧</h1>
		<s:iterator value="siteInfoList">
			<ul>
				<s:a href="%{siteUrl}">
					<s:property value="siteName" />
					<br>
				</s:a>
			</ul>
		</s:iterator>
		<s:property value="notLoginMsg"></s:property>
	</div>

	<!-- 勤怠管理サイト -->
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

	<!-- 決済一覧状況 -->
	<s:form action="header_list">
		<s:submit type="submit" value="決済状況一覧" />
	</s:form>
	<!-- プロジェクト一覧 -->
	<s:form action="project_list">
		<s:submit type="submit" value="プロジェクト一覧" />
	</s:form>
    <!--受講生一覧 -->
	<s:form action="students_list">
		<s:submit type="submit" value="受講生一覧" />
	</s:form>
	<!--勤怠更新 -->
	<s:form action="update_attendance">
		<s:submit type="submit" value="勤怠更新" />
	</s:form>
	<!--書籍一覧 -->
	<s:form action="book_list">
			<s:submit value="書籍一覧" />
	</s:form>
    <!--書籍貸し出し -->
	<s:form action="book_lending_list">
			<s:submit value="書籍貸し出し" />
	</s:form>
     <!--プロジェクト進捗報告 -->
	<s:form action="project_progress_list">
			<s:submit value="プロジェクト進捗報告" />
	</s:form>
	 <!--スケジュール一覧 -->
	 <s:form action="shedule_list">
			<s:submit value="スケジュール一覧" />
	 </s:form>
</body>
</html>