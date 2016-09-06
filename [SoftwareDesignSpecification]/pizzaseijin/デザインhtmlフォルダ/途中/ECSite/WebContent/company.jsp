<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>会社概要</title>
<jsp:include page="base/base.jsp" flush="true" />
</head>
<body>
<jsp:include page="base/header.jsp" flush="true" />
<jsp:include page="base/nav.jsp" flush="true" />
	<div class="container">
	  <div class="row">
	    <div class="col-md-6 col-md-offset-3">
	    <div align="center">
		<h1>会社概要</h1>
		<hr>
			<h3>会社情報</h3>
			<img src="./img/company.jpg" class="company">
			<img src="./img/googlemap.png" class="company">
			<hr>
			<table>
				<tr>
					<td>商号:</td>
					<td>ピザ星人ホールディングス株式会社</td>
				</tr>
				<tr>
					<td>本社所在地:</td>
					<td>東京都文京区湯島３丁目２−１２ 御茶ノ水天神ビル2F</td>
				</tr>
				<tr>
					<td>電話番号:</td>
					<td>090-1111-2222</td>
				</tr>
				<tr>
					<td>設立:</td>
					<td>2015年12月5日</td>
				</tr>
				<tr>
					<td>資本金:</td>
					<td>1億円</td>
				</tr>
				<tr>
					<td>設立:</td>
					<td>2015年12月5日</td>
				</tr>
				<tr>
					<td>従業員数:</td>
					<td>16人</td>
				</tr>
			</table>
			<br><br>
		      <a href="index.jsp"><input type="button" class="btn btn-danger" value="ホームに戻る" /></a>
		    <br><br>
		    </div>
	      </div>
		</div>
	</div>
	<jsp:include page="base/footer.jsp" flush="true" />
</body>
</html>