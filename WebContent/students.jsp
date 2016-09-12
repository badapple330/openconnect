<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
<s:form action="StudentsSelectAction">
   <input type="text" name="search" >
   <input class="button" type="submit" value="検索">
</s:form>


<s:form action="StudentsUpdateAction">
  <table border="1" cellspacing="0">
    <tbody id="list_body">
     <tr>

      <th>受講年</th>
      <th>受講開始月</th>
      <th>姓(英語)</th>
      <th>名(英語)</th>
      <th>姓(漢字)</th>
<!--       <th>姓(ふりがな)</th> -->
      <th>名(漢字)</th>
<!--       <th>名(ふりがな)</th> -->
<!--       <th>郵便番号</th> -->
<!--       <th>住所</th> -->
<!--       <th>電話番号</th> -->
<!--       <th>メールアドレス</th> -->
<!--       <th>携帯電話番号</th> -->
<!--       <th>携帯メールアドレス</th> -->
<!--       <th>性別</th> -->
<!--       <th>誕生日</th> -->
<!--       <th>登録日</th> -->
<!--       <th>更新日</th> -->
<!--       <th>退会フラグ</th> -->
<!--       <th>ログインフラグ</th> -->
<!--       <th>受講年</th> -->
<!--       <th>受講開始月</th> -->
<!--        <th>パスワード</th> -->
      <th>ユーザーＩＤ</th>
      <th>削除</th>
     </tr>

<s:iterator value="studentsList">

     <tr>
      <td><input type="text" name="yearList" value="<s:property value="year" />" class="year"></td>
      <td><input type="text" name="monthList" value="<s:property value="month" />"class="month"></td>
      <td><input type="text" name="familyNameList" value="<s:property value="familyName" />"class="familyName"></td>
      <td><input type="text" name="givenNameList" value="<s:property value="givenName" />"class="givenName"></td>
      <td><input type="text" name="familyNameKanjiList" value="<s:property value="familyNameKanji" />" class="familyNameKanji"></td>
<%--       <td><input type="text" name="familyNameHuriganaList" value="<s:property value="familyNameHurigana" />" class="familyNameHurigana"></td> --%>
      <td><input type="text" name="givenNameKanjiList" value="<s:property value="givenNameKanji" />" class="givenNameKanji"></td>
<%--       <td><input type="text" name="givenNameHuriganaList" value="<s:property value="givenNameHurigana" />" class="givenNameHurigana"></td> --%>
<%--       <td><input type="text" name="postalList" value="<s:property value="postal" />" class="postal"></td> --%>
<%--       <td><input type="text" name="addressList" value="<s:property value="address" />" class="address"></td> --%>
<%--       <td><input type="text" name="phoneNumberList" value="<s:property value="phoneNumber" />" class="phoneNumber"></td> --%>
<%--       <td><input type="text" name="phoneEmailList" value="<s:property value="phoneEmail" />" class="phoneEmail"></td> --%>
<%--       <td><input type="text" name="mobileNumberList" value="<s:property value="mobileNumber" />" class="mobileNumber"></td> --%>
<%--       <td><input type="text" name="mobileEmailList" value="<s:property value="mobileEmail" />" class="mobileEmail"></td> --%>
<%--       <td><input type="text" name="sexList" value="<s:property value="sex" />" class="sex"></td> --%>
<%--       <td><input type="text" name="birthdayList" value="<s:property value="birthday" />" class="birthday"></td> --%>
<%--       <td><input type="text" name="registerDayList" value="<s:property value="register" />" class="register"></td> --%>
<%--       <td><input type="text" name="updateDayList" value="<s:property value="update" />" class="update"></td> --%>
<%--       <td><input type="text" name="userdelFlgList" value="<s:property value="userdelFlg" />" class="userdelFlg"></td> --%>
<%--       <td><input type="text" name="loginFlgList" value="<s:property value="loginFlg" />" class="loginFlg"></td> --%>
<%--       <td><input type="text" name="userFlgList" value="<s:property value="userFlg" />" class="userFlg"></td> --%>
<%--       <td><input type="text" name="passwordList" value="<s:property value="password" />"class="password"></td> --%>
<%--       <td><input type="text" name="useridList" value="<s:property value="userid" />"class="userid"></td> --%>
<!--       <td><input type="button" class="button modal-open" value="削除" class="modal-open"></td> -->
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
			<s:form action="StudentsDeleteAction">
				<input type="hidden" name="progressId" value="" id="true-delete">
				<input type="submit" class="delete-true button" value="はい">
				<input type="button" class="modal-close button" value="いいえ">
			</s:form>
		</div>
	</div>






<h2>新規受講生追加</h2>
 <s:form action="StudentsInsertAction" >
      <input type="text" name="year" placeholder="年">
      <input type="text" name="month" placeholder="月">
      <input type="text" name="familyName"placeholder="姓">
<!--       <input type="text" name="givenName" placeholder="名"> -->
      <input type="text" name="familyName_kanji"placeholder="姓">
      <input type="text" name="givenName_kanji" placeholder="名">
      <input type="text" name="password" placeholder="パスワード">
      <input class="button" type="submit" value="追加">
</s:form>


<s:form action="BackGoAction">
	<input type="submit" class="button" value="戻る">
</s:form>


</body>
</html>