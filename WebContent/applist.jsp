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

	<!-- 	ヘッダー読み込み -->
	<jsp:include page="header.jsp" />

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
	<s:form action="decision_list">
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
	<!--決済手続き電子化 -->
	<s:form action="decision_electron_list">
			<s:submit value="決済手続き電子化" />
	</s:form>
	<!--書籍一覧 -->
	<s:form action="book_list">
			<s:submit value="書籍一覧" />
	</s:form>

     <!--プロジェクト進捗報告 -->
	<s:form action="project_progress_list">
			<s:submit value="プロジェクト進捗報告" />
	</s:form>
	 <!--スケジュール一覧 -->
	 <s:form action="schedule_list">
			<s:submit value="スケジュール一覧" />
	 </s:form>
</body>
</html>