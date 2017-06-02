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
<script type="text/javascript" src="js/attendance.js"></script>
<link rel="stylesheet" href="css/attendance.css">
</head>

<body>
	<!-- ヘッダー-->
	<jsp:include page="header.jsp" />

<div class="container">
<!-- タイトル -->
<h3 style="border-bottom: 1px solid rgba(0,0,0,0.1); box-shadow: 0 1px 0 rgba(255,255,255,1);">勤怠確認</h3>


    <!-- 検索窓 -->
  <s:form action="AdminAttendanceAction" method="post">
  <div class="input-group">
  <input type="date" name="atDate" placeholder="">
  <span class="input-group-btn">
  <button class="btn btn-default" type="submit">
<i class="glyphicon glyphicon-search"></i>
  </button>
  </span>
  </div>
  </s:form>





<!-- 顧客一覧 -->
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
<!-- ここからinterator、繰り返し処理 -->
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



</body>
</html>