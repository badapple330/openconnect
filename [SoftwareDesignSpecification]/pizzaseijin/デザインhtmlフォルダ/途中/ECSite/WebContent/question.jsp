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
		<h1>お問い合わせ</h1>
		<hr>
		  <h3>商品についてのお問い合わせ</h3>
		  <hr>
	</div>
	<div class="container text-left">
		     御商品についてのお問い合わせ:ご注文商品についてお問い合わせがあるお客様は下記の連絡先までお問い合わせください<br>
                        お問い合わせ先<br>
          &nbsp;&nbsp;&nbsp;&nbsp;TEL : 0471-80-9705<br>
          &nbsp;&nbsp;&nbsp;&nbsp;Email : test@test.com
		  <hr>
		  <h3>ネット注文についてのお問い合わせ</h3><br>
		     本サイトの操作についての操作についてはヘルプを参照ください：&nbsp;&nbsp;<a href = "help.jsp"><button type="button" class="btn btn-danger">ヘルプ</button></a>

			<hr>
			<h3>その他お問い合わせ</h3><br>
			その他のお問い合わせについて:その他のお問い合わせに関しましては下記の連絡先へご連絡ください
			お問い合わせ先<br>
			&nbsp;&nbsp;&nbsp;&nbsp;TEL : 0524-80-3221<br>
			&nbsp;&nbsp;&nbsp;&nbsp;Email : test@test.com<br><br>
	</div>
	<br><br>
    <div align="center">
    	<a href="index.jsp"><button type="button" class="btn btn-danger">ホームに戻る</button></a>
    </div><br><br>
    <jsp:include page="base/footer.jsp" flush="true" />
    </body>
</html>
