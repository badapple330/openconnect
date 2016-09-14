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

<jsp:include page="header.jsp" />

<div class="container">

<h1>受講生一覧</h1>
<s:form action="StudentsSelectAction">
   <input type="text" name="search" placeholder="英語で姓か名を入力">
   <input class="button" type="submit" value="検索">
</s:form>
<br>

<s:form action="StudentsUpdateAction">
  <table border="1">
     <tr>

      <th>ID</th>
      <th>受講年</th>
      <th>受講開始月</th>
      <th>姓(英語)</th>
      <th>名(英語)</th>
      <th>姓(漢字)</th>
      <th>姓(ふりがな)</th>
      <th>名(漢字)</th>
      <th>名(ふりがな)</th>
      <th>郵便番号</th>
      <th>住所</th>
      <th>電話番号</th>
      <th>メールアドレス</th>
      <th>携帯電話番号</th>
      <th>携帯メールアドレス</th>
      <th>性別</th>
      <th>誕生日</th>
      <th>登録日</th>
      <th>更新日</th>
      <th>退会フラグ</th>
      <th>ログインフラグ</th>
      <th>ユーザーフラグ</th>
       <th>パスワード</th>
      <th>削除</th>
     </tr>

<s:iterator value="studentsList">

     <tr>
      <td><s:property value="userId" /></td>
      <td><input type="text" name="yearList" value="<s:property value="year" />" class="year smallText" maxlength="4" required></td>
      <td><input type="text" name="monthList" value="<s:property value="month" />"class="month smallText" maxlength="2" required></td>
      <td><input type="text" name="familyNameList" value="<s:property value="familyName" />"class="familyName smallText" maxlength="20" required></td>
      <td><input type="text" name="givenNameList" value="<s:property value="givenName" />"class="givenName smallText" maxlength="20" required></td>
      <td><input type="text" name="familyNameKanjiList" value="<s:property value="familyNameKanji" />" class="familyNameKanji smallText" maxlength="20" required></td>
      <td><input type="text" name="familyNameKanaList" value="<s:property value="familyNameKana" />" class="familyNameKana smallText" maxlength="20"></td>
      <td><input type="text" name="givenNameKanjiList" value="<s:property value="givenNameKanji" />" class="givenNameKanji smallText" maxlength="20" required></td>
      <td><input type="text" name="givenNameKanaList" value="<s:property value="givenNameKana" />" class="givenNameKana smallText" maxlength="20"></td>
      <td><input type="text" name="postalList" value="<s:property value="postal" />" class="postal bigText" maxlength="20"></td>
      <td><input type="text" name="addressList" value="<s:property value="address" />" class="address bigText" maxlength="100"></td>
      <td><input type="text" name="phoneNumberList" value="<s:property value="phoneNumber" />" class="phoneNumber bigText" maxlength="20"></td>
      <td><input type="text" name="phoneEmailList" value="<s:property value="phoneEmail" />" class="phoneEmail bigText" maxlength="100" required></td>
      <td><input type="text" name="mobileNumberList" value="<s:property value="mobileNumber" />" class="mobileNumber bigText" maxlength="20"></td>
      <td><input type="text" name="mobileEmailList" value="<s:property value="mobileEmail" />" class="mobileEmail bigText" maxlength="100"></td>
      <td><input type="text" name="sexList" value="<s:property value="sex" />" class="sex smallText" maxlength="3" required></td>
      <td><input type="text" name="birthdayList" value="<s:property value="birthday" />" class="birthday bigText" maxlength="20"></td>
      <td><input type="text" name="registerDayList" value="<s:property value="registerDay" />" class="registerDay bigText" maxlength="20"></td>
      <td><input type="text" name="updateDayList" value="<s:property value="updateDay" />" class="updateDay bigText" maxlength="20"></td>
      <td><input type="text" name="userdelFlgList" value="<s:property value="userdelFlg" />" class="userdelFlg smallText" maxlength="4"></td>
      <td><input type="text" name="loginFlgList" value="<s:property value="loginFlg" />" class="loginFlg smallText" maxlength="4"></td>
      <td><input type="text" name="userFlgList" value="<s:property value="userFlg" />" class="userFlg smallText" maxlength="1" required></td>
      <td><input type="text" name="passwordList" value="<s:property value="password" />"class="password smallText" maxlength="20" required></td>
      <td><input type="button" class="button modal-open" value="削除" class="modal-open"></td>
		</tr>
		<input type="hidden" name="userIdList" value="<s:property value="userId" />" class="userId" >
</s:iterator>
</table>
<input type="submit" class="button" value="編集" />
</s:form>

<div id="modal-main">
			id ： <div class="deleteUserId modalDelete"></div><br>
			受講年 ： <div class="deleteYear modalDelete"></div><br>
			受講開始月 ： <div class="deleteMonth modalDelete"></div><br>
			姓 ： <div class="deleteFamilyName modalDelete"></div><br>
			名 ： <div class="deleteGivenName modalDelete"></div><br>
			<input type="button" class="delete-true button" value="削除">
			<input type="button" class="modal-close button" value="閉じる">

		<div class="delete-prepare">
			本当に削除しますか？
			<s:form action="StudentsDeleteAction">
				<input type="hidden" name="userId" value="" class="deleteUserId delete-true">
				<input type="submit" class="delete-true button" value="はい">
				<input type="button" class="modal-close button" value="いいえ">
			</s:form>
		</div>
	</div>

<h2>新規受講生追加</h2>
 <s:form action="StudentsInsertAction" >
 	<table border=1>
 	<tr>
 	<td>受講年</td>
 	<td>受講開始月</td>
 	<td>姓(英語)</td>
 	<td>名(英語)</td>
 	<td>姓(漢字)</td>
 	<td>名(漢字)</td>
 	<td>メールアドレス</td>
 	<td>性別</td>
 	<td>ユーザーフラグ</td>
 	<td>パスワード</td>
 	</tr>
 	<tr>
      <td><input type="text" name="year" placeholder="例：2016" maxlength="4" required></td>
      <td><input type="text" name="month" placeholder="例：08" maxlength="2" required></td>
      <td><input type="text" name="familyName"placeholder="例：tanaka" maxlength="20" required></td>
      <td><input type="text" name="givenName" placeholder="例：taro" maxlength="20" required></td>
      <td><input type="text" name="familyNameKanji"placeholder="例：田中" maxlength="20" required></td>
      <td><input type="text" name="givenNameKanji" placeholder="例：太郎" maxlength="20" required></td>
      <td><input type="text" name="phoneEmail" placeholder="例：example@gmail.com" maxlength="100" required></td>
      <td><input type="text" name="sex" placeholder="男or女" maxlength="3" required></td>
      <td><input type="text" name="userFlg" placeholder="1～3" pattern="[1-9][0-9]*" maxlength="1" required></td>
      <td><input type="text" name="password" placeholder="8桁以上" pattern=".{8,}" maxlength="20" required></td>
		</tr>
      </table>
      <input class="button" type="submit" value="追加">
</s:form>
<br>
<br>

<s:form action="BackGoAction">
	<input type="submit" class="button" value="戻る">
</s:form>
</div>
<br>
</body>
</html>