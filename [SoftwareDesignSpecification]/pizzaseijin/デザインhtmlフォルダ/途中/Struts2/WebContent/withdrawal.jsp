<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>お問い合わせ</title>
	<jsp:include page="base/base.jsp" flush="true" />
</head>
<body>
	<jsp:include page="base/header.jsp" flush="true" />
    <jsp:include page="base/nav.jsp" flush="true" />
	<div class="container text-center">
	  <div align="center">
		<h1>退会確認ページ</h1>
		<hr>
			<p>本当に退会してもよろしいですか？</p>
			<table>
				<tr><th colspan="2">丹下陽平さんの情報</th></tr>
					<tr>
						<td>名前:</td>
						<td id="name">ピザ星人A</td>
					</tr>
					<tr>
						<td>郵便番号:</td>
						<td>000-0000</td>
					</tr>
					<tr>
						<td>住所:</td>
						<td>埼玉県川口市○○町２−５</td>
					</tr>
					<tr>
						<td>電話番号:</td>
						<td>09017861111</td>
					</tr>
					<tr>
						<td>メール:</td>
						<td>pizza01@test.com</td>
					</tr>
			</table>
			<br><br>
			<p>上記の内容で退会する場合は[退会する]を押して下さい。</p>
			<br><br>
			<a href="mypage.jsp"><input type="button" class="btn btn-danger" value="マイページに戻る" /></a>
			<a href="withdrawal_end.jsp"><input type="button" class="btn btn-danger" value="退会する" /></a>
		  </div>
		</div>
	<br>
    <jsp:include page="base/footer.jsp" flush="true" />
    </body>
</html>