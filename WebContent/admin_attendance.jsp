<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="logo/oc.png">
<link rel="apple-touch-icon" href="logo/oc.png">
<title>勤怠確認</title>

<script src="js/jquery-3.1.0.min.js"></script>
<link rel="stylesheet" href="css/attendance.css">
<script type="text/javascript" src="js/attendance.js"></script>
</head>

<body>
	<!-- ヘッダー-->
	<jsp:include page="header.jsp" />

<div class="container">
<!-- タイトル -->
<h3 style="border-bottom: 1px solid rgba(0,0,0,0.1); box-shadow: 0 1px 0 rgba(255,255,255,1);">勤怠確認</h3>


<!-- 日付、名前検索 -->
<s:form action="AdminAttendanceAction" method="get">
<!-- 年 -->
<select name="atYear" id="id_year" data-choice="year"></select>
<!-- 月 -->
<select name="atMonth" id="id_month" data-choice="month"></select>
<!-- 日 -->
<select name="atDay" id="id_day" data-choice="day"></select>
<!-- 性 -->
<s:textfield name="familyNameKanji" placeholder="苗字" />
<!-- 名 -->
<s:textfield name="givenNameKanji" placeholder="名前" />
<s:submit value="検索" class="search-btn" />
</s:form>

<!-- 一覧表示 -->
<table class="table table-striped table-borderd">
  <thead>
    <tr>
      <th>報告日時</th>
      <th>受講開始月</th>
      <th>性</th>
      <th>名</th>
      <th>出欠状況</th>
      <th>備考</th>
    </tr>
  </thead>

  <tbody>

<s:iterator value="searchList">
<tr>
  <td>
    <s:property value="atDate"/>
  </td>
  <td>
    <s:property value="month"/>
  </td>
  <td>
    <s:property value="familyNameKanji"/>
  </td>
  <td>
    <s:property value="givenNameKanji"/>
  </td>
  <td>
    <s:property value="attendance" />
  </td>
  <td>
    <s:property value="reason" />
  </td>
</tr>
 </s:iterator>


</tbody>

</table>
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