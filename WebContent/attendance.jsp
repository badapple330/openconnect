<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=0.9, user-scalable=no" >
<link rel="shortcut icon" href="logo/oc.png">
<link rel="apple-touch-icon" href="logo/oc.png">
<title>勤怠更新</title>

<script type="text/javascript" src="js/jquery-3.1.0.min.js"></script>
<script type="text/javascript" src="js/attendance.js"></script>
<link rel="stylesheet" href="css/attendance.css">
</head>
<body>


	<!-- ヘッダー-->
	<jsp:include page="header.jsp" />

	<div  class="attendance" align="center">

	<h1 align="center">勤怠更新</h1><hr>
	<s:if test="%{#session.userFlg >= 1}">
<p>

	<s:form action="AttendanceAction">

	<table class="atform">
	<colgroup>
        <col style="width:33%;">
        <col style="width:67%;">
    </colgroup>

	       <tr><th> ユーザー名：</th>
	        <td><s:iterator value="atUserList">
	          <s:property value="familyNameKanji"/> <s:property value="givenNameKanji"/>
	          </s:iterator></td></tr>

	     <tr>
	        <th>  日  時  ：</th>
	        <td>
	        <select style="width: 60px;" name="atYear" id="id_year" data-choice="year" required="required"></select>
	        <span style="margin-left: 3px; margin-right: 5px; display: inline-block;">年</span>

	        <select style="width: 45px;" name="atMonth" id="id_month" data-choice="month" required="required"></select>
	        <span style="margin-left: 3px; margin-right: 5px; display: inline-block;">月</span>

	        <select style="width: 45px;" name="atDay" id="id_day" data-choice="day" required="required"></select>
	        <span style="margin-left: 3px; margin-right: 5px; display: inline-block;">日</span>
	        </td></tr>

	        <tr><th>
	出欠確認：</th><td>
	<select name="attendance" required="required">

	<option value="">以下から選択</option>
	<option value="出席">出席</option>
	<option value="欠席">欠席</option>
	<option value="遅刻">遅刻</option>
	<option value="早退">早退</option>

	</select>
	</td></tr>

	<tr><th>
	  備  考  ：</th><td>
	<textarea name="reason"  rows="6" cols="40" maxlength="200" placeholder="(例）病気のため欠席、電車遅延のため10分遅刻など"></textarea>
	</td></tr>

	</table>

<br>
	<input type="submit"  value="送信" class="button" onClick="javascript:double(this)"/>


	</s:form>

	</s:if>
	<s:else>
	ログイン後に表示します。
	</s:else>
	</div>

<script src="js/jquery.ymdpulldown.js"></script>
<script>
$(function() {
  $("#id_year").ymdpulldown({
                startyear:2016,
              });
  $("#id_month").ymdpulldown();
  $("#id_day").ymdpulldown();
});

</script>
</body>
</html>