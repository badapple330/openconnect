<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">

<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- 背景画像 -->
<style type="text/css">
<!--body {background: url(img/water.jpg) center center / cover no-repeat fixed;}-->
</style>
<!-- ここまで -->


<title>Insert title here</title>
<!-- css読み込み  -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="css/header.css" rel="stylesheet">
<!-- js読み込み -->
<%-- <script src="js/bootstrap.js"></script> --%>
<script src="js/header.js"></script>
</head>
<body>

	<!-- ヘッダー -->

					<div id="headerSpace">
					<h1 class="container">
						<a href="applist.jsp" class="openConnect">Open Connect</a>

			   <!-- internousdevのロゴ -->
               <TABLE border="1" bordercolor="grey" align="right">
               <tr><td>
               <a href=""><img src="img/hd_logo.jpg"></a>
               </td></tr></table>

					</h1>
                        <div class="container" align="right">
						<div class="menuGroup">
						<s:if test="%{#session.userFlg == null}">
						<a href="GoLoginAction" class="part_line">■ Login</a>
						</s:if>
						</div>

						<s:if test="%{#session.userFlg != null}">
						<a href="GoLogoutAction" class="part_line">■ Logout</a>
 						</s:if>

						<s:if test="%{#session.userFlg == 3}">
					    <a href="GoAdminAction" class="part_line">■ 管理者 </a>

						</s:if>

<s:if test="%{#session.userFlg >= 1}">

					<select name="pulldown2" id="selectBer">
						<option value="">移動先を選択</option>
						<option value="ProjectsSelectAction">プロジェクト一覧</option>
						<option value="ProjectStatusSelectAction">プロジェクトリリース状況</option>
						<option value="ProjectProgressSelectAction">プロジェクト進捗報告</option>
						<option value="StudentsSelectAction">受講生一覧</option>
						<option value="GoTeamAction">チーム情報</option>
						<option value="GoAttendanceAction">勤怠更新</option>
						<s:if test="%{#session.userFlg >= 2}">
						<option value="GoAdminAttendanceAction">勤怠確認</option>
						</s:if>
						<option value="DecisionSelectAction">決裁一覧状況</option>
						<option value="DecisionDetailSelectAction">決裁手続き</option>
						<s:if test="%{#session.userFlg == 3}">
							<option value="DecisionApplicationSelectAction">決済手続き申請一覧</option>
						</s:if>
						<option value="BooksSelectAction">書籍一覧</option>
						<option value="ScheduleSelectAction">スケジュール一覧</option>
					</select>
					<input type="button" id="location" value="移動">

				</s:if>
						</div>
				<!-- 				<dl id="menuElementGroup"> -->
				<!-- 				<dd><a href="ProjectsSelectAction" class="menuElement">プロジェクト一覧</a></dd> -->
				<!-- 				<dd><a href="ProjectStatusSelectAction" class="menuElement">プロジェクトリリース状況</a></dd> -->
				<!-- 				<dd><a href="ProjectProgressSelectAction" class="menuElement">プロジェクト進捗報告</a></dd> -->
				<!-- 				<dd><a href="StudentsSelectAction" class="menuElement">受講生一覧</a></dd> -->
				<!-- 				<dd><a href="GoAttendanceAction" class="menuElement">勤怠更新</a></dd> -->
				<!-- 				<dd><a href="DecisionSelectAction" class="menuElement">決裁一覧状況</a></dd> -->
				<!-- 				<dd><a href="DecisionDetailSelectAction" class="menuElement">決裁手続き</a></dd> -->
				<%-- 				<s:if test="%{#session.userFlg  >= 2}"> --%>
				<!-- 					<dd><a href="DecisionApplicationSelectAction" class="menuElement">決済手続き申請一覧</a></dd> -->
				<%-- 				</s:if> --%>
				<!-- 				<dd><a href="BooksSelectAction" class="menuElement">書籍一覧</a></dd> -->
				<!-- 				<dd><a href="BooksBorrowSelectAction" class="menuElement">書籍貸し出し</a></dd> -->
				<!-- 				<dd><a href="ScheduleSelectAction" class="menuElement">スケジュール一覧</a></dd> -->
				<!-- 				</dl> -->
					</div>
	<!-- ヘッダーはここまで -->
<br>
<br>
<br>
<br>
</body>
</html>