<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>スケジュール一覧</title>
<!-- ヘッダー読み込み -->
	<jsp:include page="header.jsp" />
	<!-- ヘッダーここまで -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" >
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
		<link href='css/schedule.css' rel='stylesheet' />
        <link href='css/fullcalendar.min.css' rel='stylesheet' />
        <link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1/themes/start/jquery-ui.css">
        <link href='js/calendar/fullcalendar.min.css' rel='stylesheet' />
        <link href='js/calendar/fullcalendar.print.min.css' rel='stylesheet' media='print' />
        <script src="js/calendar/calendar.js"></script>
        <script src="js/schedule.js"></script>
        <script src="js/calendar/jquery.min.js"></script>
        <script src="js/calendar/jquery-ui.min.js"></script>
        <script src="js/calendar/moment.min.js"></script>
        <script src="js/calendar/datepicker-ja.js"></script>
        <script src="js/calendar/jquery.tabletojson.js"></script>
        <script src="js/calendar/jquery.tabletojson.min.js"></script>
        <script src="js/calendar/fullcalendar.js"></script>
        <script src="js/calendar/fullcalendar.min.js"></script>
        <script src="js/calendar/gcal.js"></script>
        <script src="js/calendar/gcal.min.js"></script>

</head>
<body>
<!-- アプリ一覧表示 -->
	<div class="container">
		<h1 class="page-header"><s:property value ="scheduleList[0].teamName" />さんのスケジュール</h1>
		<s:iterator value="siteInfoList">
			<ul>
				<s:a href="%{siteUrl}">
					<s:property value="siteName" />
					<br>
				</s:a>
			</ul>
		</s:iterator>
		<s:property value="notLoginMsg" />
	</div>


<div id ="calendar"></div>
<div id="operation">

			<s:form action="ScheduleSelectAction">
			<h5>【チーム名で検索】</h5>
				<select name="search" required="required">
								<option value="">以下から選択</option>
								<s:iterator value="teamList">
									<option value="<s:property value="teamName[]" />"><s:property value="teamName" /></option>
								</s:iterator>
							</select>
				<s:submit value="検索"></s:submit>
			</s:form>
			<br>

			<!-- 検索した後に表示するメッセージ -->
			<s:property value="successMsg" />
			<s:property value="errorMsg" />
			<s:property value="selectSuccessMsg" />
			<s:property value="selectErrorMsg" />


			<s:form action="ScheduleUpdateAction">
				<table id = "schedule" border=1 style="">
					<tbody>
						<tr>
							<th>ID</th>
							<th>start</th>
							<th>end</th>
							<th>title</th>
							<th>チーム名</th>
							<th></th>
						</tr>

						<!-- scheduleListに格納した情報をテーブルで表示 -->
						<!-- カレンダーに渡すだけの情報は<div class="hidden">で囲ってcssで表示させないようにする -->
						<!-- jsファイルに渡す情報としてstart,end,titleが必要なのでこのような記述となっている -->
						<h5>start→開始日　end→終了日　title→作業内容</h5>
						<s:iterator value="scheduleList">
							<tr>
								<td><s:property value="id" /></td>
								<td><input type="text" name="scheduleStartdayList"
									value="<s:property value="startDay" />"
									class="scheduleStartdayList" type="date"
									pattern="([0-2][0-9]{3})\-([0-1][0-9])\-([0-3][0-9])"
									title="年-月-日で入力してください。" placeholder="開始日を入力" required><div class="hidden"><s:property value="startDay" /></div></td>
								<td><input type="text" name="scheduleEnddayList"
									value="<s:property value="endDay" />"
									class="scheduleEnddayList"
									pattern="([0-2][0-9]{3})\-([0-1][0-9])\-([0-3][0-9])"
									title="年-月-日で入力してください。" placeholder="終了日を入力"><div class="hidden"><s:property value="endDay" />T00:01:00</div></td>
								<td><input type="text" name="scheduleTitleList"
									value="<s:property value="title" />" class="scheduleTitleList"
									placeholder="件名を入力" maxlength=100 required><div class="hidden"><s:property value="title" /></div></td>
								<td>

								<input type="text" name="teamList"value="<s:property value="teamName" />"class="teamList" disabled>
								</td>
								<td>
										<input type="button" class="button modal-open" value="削除" />
								</td>
							</tr>
							<input type="hidden" name="scheduleIdList"
								value="<s:property value="id" />" class="scheduleIdList">
						</s:iterator>
					</tbody>
				</table>


					<button type="submit" class="button">編集</button>

			</s:form>

			<br>【予定を登録】
		<s:form action="ScheduleInsertAction">
				<table border="0" style="">
					<tbody>
						<tr>
							<td><input type="text" class="textcalendar" name="startDay" placeholder="開始日を入力"
								maxlength=100 required></td>
						</tr>
						<tr>
							<td><input type="text" class="textcalendar" name="endDay" placeholder="終了日を入力"
								maxlength=100 required></td>
						</tr>
							<td><input type="text" name="title" placeholder="件名を入力"
								maxlength=100 required></td>
						</tr>
						<tr>
							<select name="search" required="required">
								<option value="">以下から選択</option>
								<s:iterator value="teamList">
									<option value="<s:property value="teamName" />"><s:property value="teamName" /></option>
								</s:iterator>
							</select>
						</tr>
							<!-- tokenタグ -->

								<s:token />

						</tr>
					</tbody>
				</table>

				<button type="submit" class="button" name="startDay">追加</button>
			</s:form>


			<div id="modal-main">
				<!-- #contents START -->
				<div id="modal-style">
					<table class="modal_border">
						<tr>
							<td>開始日
								<div class="delete-startday modalDelete"></div>
							</td>
						</tr>
						<tr>
							<td>終了日
								<div class="delete-endday modalDelete"></div>
							</td>
						</tr>
						<tr>
							<td>件名
								<div class="delete-title modalDelete"></div>
							</td>
						</tr>
						<tr>
							<td>内容
								<div class="delete-content modalDelete"></div>
							</td>
						</tr>
					</table>
					<input type="button" class="delete-true button" value="削除">
					<input type="button" class="modal-close button" value="閉じる">

					<div class="delete-prepare">
						<p>本当に削除しますか。</p>
						<s:form action="ScheduleDeleteAction">
							<input type="hidden" name="scheduleId" value=""
								class="true-delete">
							<s:token />
							<input type="submit" class="delete-true button" value="はい">
							<input type="button" class="modal-close button" value="いいえ">
						</s:form>
					</div>
				</div>
			</div>

		<br>
		<s:form action="GetAddressAction">
			<button type="submit" class="button">トップへ戻る</button>
		</s:form>
</div>
</body>
</html>