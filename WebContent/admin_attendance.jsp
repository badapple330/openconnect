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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
$("#searchButtun").click(function(){
if(($("#teamForm").val() != "") && (($("#familyForm").val() != "") || ($("#GivenForm").val() != ""))){
alert('チーム名、性、名を同時に検索できません');
}else if((($("#familyForm").val() != "" && $("#GivenForm").val() == "")) || (($("#familyForm").val() == "") && ($("#GivenForm").val() != ""))){
	alert('姓と名の両方を入力してください');
}else if(($("#id_year").val() !="") && (($("#id_month").val() !="")) && ($("#id_day").val() =="") ||
		($("#id_year").val() !="") && (($("#id_month").val() =="")) && ($("#id_day").val() =="") ||
		($("#id_year").val() =="") && (($("#id_month").val() !="")) && ($("#id_day").val() !="") ||
		($("#id_year").val() =="") && (($("#id_month").val() !="")) && ($("#id_day").val() =="") ||
		($("#id_year").val() =="") && (($("#id_month").val() !="")) && ($("#id_day").val() !="") ||
		($("#id_year").val() =="") && (($("#id_month").val() !="")) && ($("#id_day").val() =="")){
	alert('日付をすべて選択してください');
}else if(($("#id_year").val() =="") && (($("#id_month").val() =="")) && ($("#id_day").val() =="") &&
		(($("#familyForm").val() =="")) && (($("#givenForm").val() =="")) && (($("#teamForm").val() =="")) &&
		(($("#id_attendance").val !=""))){
	alert('出欠の他に入力してください');
}else{
$("#search").submit();
}
});
});
</script>

</head>

<body>
	<!-- ヘッダー-->
	<jsp:include page="header.jsp" />

<div class="container">
<!-- タイトル -->
<h3 style="border-bottom: 1px solid rgba(0,0,0,0.1); box-shadow: 0 1px 0 rgba(255,255,255,1);">勤怠確認</h3>


<!-- 日付、名前検索 -->
<s:form action="AdminAttendanceAction" method="get" id="search">
<select name="atYear" id="id_year" data-choice="year"><option value="">----</option></select>
<select name="atMonth" id="id_month" data-choice="month"><option value="">----</option></select>
<select name="atDay" id="id_day" data-choice="day"><option value="">----</option></select>
<select name="attendance" id="Id_attendance">
			<option value="">出欠状況</option>
			<option value="出席">出席</option>
			<option value="欠席">欠席</option>
			<option value="遅刻">遅刻</option>
			<option value="早退">早退</option>
		</select>
<s:textfield name="familyNameKanji" id="familyForm" placeholder="名字" title="名字"/>
<s:textfield name="givenNameKanji" id="GivenForm" placeholder="名前" title="名前"/>
<s:textfield name="teamName" placeholder="チーム名" id="teamForm" title="チーム名"/>
<s:submit value="検索" class="search-btn" id="searchButtun"/>
</s:form>
<table>
<tr>
<td>出席</td>
<td>欠席</td>
<td>遅刻</td>
<td>早退</td>
</tr>
<tr>
<td><s:property value="present" /></td>
<td><s:property value="absent" /></td>
<td><s:property value="late" /></td>
<td><s:property value="early" /></td>
</tr>
</table>



<!-- 一覧表示 -->
<table class="table table-striped table-borderd">
  <thead>
    <tr>
      <th>報告日時</th>
      <th>受講開始月</th>
      <th>チーム</th>
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
  	<s:property value="attendance"/>
  </td>
  <td>
    <s:property value="teamName"/>
  </td>
  <td>
    <s:property value="familyNameKanji"/>
  </td>
  <td>
    <s:property value="givenNameKanji"/>
  </td>
  <td>
    <s:property value="attendance"/>
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