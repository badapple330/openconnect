<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset=UTF-8>
<title>受講生一覧</title>
</head>
<body>
<h1>ヘッダー</h1>




<div class="header">
 <jsp:include page="header.jsp" />
</div>

<h1>受講生一覧</h1>
<s:form action="StudentsSearch">
   <input type="text" name="search" >
   <input class="button" type="submit" value="検索">
</s:form>


<s:form action="StudentsUpdate">
  <table border="1" cellspacing="0">
  <tr>

   <th>id</th>
   <th>○月生</th>
   <th>姓</th>
   <th>名</th>
   <th>性別</th>
   <th>出席日数</th>
   <th>欠席(連絡あり)</th>
   <th>欠席(連絡無し)</th>
   <th>遅刻(連絡あり)</th>
   <th>遅刻(連絡無し)</th>
   <th>面談</th>
   <th>削除</th>
</tr>

<s:iterator value="studentsList">

  <tr>
      <td><input type="text" name="studentsYear" value="<s:property value="year" />" class="studentsYear"></td>
      <td><input type="text" name="studentsMonth" value="<s:property value="month" />"class="studentsMonth"></td>
      <td><input type="text" name="studentsFamily_nameList" value="<s:property value="family_name" />"class="studentsFamily_name"></td>
      <td><input type="text" name="studentsGIven_nameList" value="<s:property value="given_name" />"class="studentsGiven_name"></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td><input type="submit" class="button" value="削除"></td>
  </tr>

</s:iterator>
</table>
<td><input type="submit" class="button" value="更新" /></td>
</s:form>

<s:form action ="StudentsUpdate">




</s:form>


<h2>新規受講生追加</h2>
 <s:form action="StudentsInsert" >
      <input type="text" name="year" placeholder="年">
      <input type="text" name="month" placeholder="月">
      <input type="text" name="family_name"placeholder="姓">
      <input type="text" name="given_name" placeholder="名">
      <input type="text" name="password" placeholder="パスワード">
      <input type="text" name="user_id" placeholder="ユーザーID">

  <input class="button" type="submit" value="追加">
</s:form>


<s:form action="BackGoAction">
	<input type="submit" class="button" value="戻る">
</s:form>


</body>
</html>