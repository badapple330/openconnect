<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/jquery-3.1.0.min.js"></script>
<script src="js/schedule.js"></script>
<link rel="stylesheet" href="css/schedule.css">
<title>スケジュール一覧</title>

</head>
<body>
<p>スケジュール検索</p>
<s:form action="ScheduleSelect">
<s:textfield name="search" label="スケジュール検索" placeholder="件名を入力" />
<s:submit value="検索"></s:submit>
</s:form>
<br>


<s:form action="ScheduleUpdate">
<table border="2" style="white">
<tbody>
<tr>
<td>ID</td><td>開始日</td><td>終了日</td><td>件名</td><td>内容</td>
</tr>

<s:iterator value="schedulelist">
<tr>
<td><input type="text" name="scheduleIdList" value="<s:property value="Id" />" class="scheduleIdList"></td>
<td><input type="text" name="scheduleStartdateList" value="<s:property value="Start_day" />" class="scheduleStartdateList"></td>
<td><input type="text" name="scheduleEnddateList" value="<s:property value="End_day" />" class="scheduleEnddateList"></td>
<td><input type="text" name="scheduleTitleList" value="<s:property value="Title" />" class="scheduleTitleList"></td>
<td><input type="text" name="scheduleContentList" value="<s:property value="Content" />" class="scheduleContentList"></td>
<td><input type="button" class="button modal-open" value="削除" /></td>
</tr>
</s:iterator>

<s:iterator value="dscheduleList">
<tr>
<td><input type="text" name="scheduleIdList" value="<s:property value="Id" />" class="delscheduleIdList"></td>
<td><input type="text" name="scheduleStartdateList" value="<s:property value="Startdate" />" class="delscheduleStartdateList"></td>
<td><input type="text" name="scheduleEnddateList" value="<s:property value="Enddate" />" class="delscheduleEnddateList"></td>
<td><input type="text" name="scheduleTitleList" value="<s:property value="Title" />" class="delscheduleTitleList"></td>
<td><input type="text" name="scheduleContentList" value="<s:property value="Content" />" class="delscheduleContentList"></td>
<td><input type="button" class="button modal-open2" value="削除" /></td>
</tr>
</s:iterator>
</tbody>
</table>
<button type="submit" class="button">編集</button>
</s:form>

<br><br>

<s:form action="ScheduleInsert">
<table border="2" cellspacing="0"style="white">
<tbody>
<tr>
<td>開始日</td><td>件名</td><td>内容</td><td></td>
</tr>
<tr>
<td><input type="text" name="start_day"></td>
<td><input type="text" name="title"></td>
<td><input type="text" name="content"></td>
<td><button type="submit" class="button">追加</button></td></tr>
</tbody>
</table>
</s:form>


<div id="modal-main">
	<!-- #contents START -->
	ID <input type="text" name="scheduleId" id="delete-scheduleid" readonly> <br>
	開始日<input type="text" name="scheduleId" id="delete-startdate" readonly> <br>
	終了日<input type="text" name="scheduleId" id="delete-enddate" readonly> <br>
	件名<input type="text" name="scheduleId" id="delete-title" readonly> <br>
	内容<input type="text" name="scheduleId" id="delete-content" readonly><br>
		<input type="button" class="delete-true button" value="削除">
		<input type="button" class="modal-close button" value="閉じる">

	<div class="delete-prepare">
    	<p>削除しますか。</p>
    	<s:form action="ScheduleDelete">
			<input type="hidden" name="scheduleId" value="" class="true-delete">
			<input type="submit" class="delete-true button" value="はい">
			<input type="button" class="modal-close button" value="いいえ">
    	</s:form>
	</div>
</div>
<br>
<s:form action="GetAddressAction">
<button type="submit" class="button">戻る</button>
</s:form>
</body>
</html>