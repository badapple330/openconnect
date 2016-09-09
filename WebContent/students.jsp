<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset=UTF-8>
<title>受講生一覧</title>
<link rel="stylesheet" href="css/students.css">
<script src="js/jquery-3.1.0.min.js"></script>
<script src="js/students.js"></script>
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
    <tbody id="list_body">
     <tr>

      <th>入社年</th>
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
      <th>パスワード</th>
      <th>ユーザーＩＤ</th>
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
      <td><input type="text" name="studentsPassword" value="<s:property value="password" />"class="studentsPassword"></td>
      <td><input type="text" name="studentsId" value="<s:property value="user_id" />"class="studentsId"></td>
      <td><input type="button" class="button modal-open" value="削除" class="modal-open"></td>
  </tr>
</s:iterator>
</tbody>
</table>
<input type="submit" class="button" value="更新" />
</s:form>




<div id="modal-main">
		id <input type="text" name="projectId" id="delete-projectid"> <br>
			○月生<input type="text" name="projectId"
			id="delete-projectday" readonly> <br>
			姓<input type="text" name="projectId" id="delete-projectname" readonly>
		<br>名 <input type="text" name="projectId" id="delete-projectplan" readonly>
		<br> <input type="button"
			class="delete-true button" value="削除"> <input type="button"
			class="modal-close button" value="閉じる">

		<div class="delete-prepare">
			本当に削除しますか？
			<s:form action="StudentsDelete">
				<input type="hidden" name="progressId" value="" id="true-delete">
				<input type="submit" class="delete-true button" value="はい">
				<input type="button" class="modal-close button" value="いいえ">
			</s:form>
		</div>
	</div>






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