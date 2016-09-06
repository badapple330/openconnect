<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>購入完了</title>
<jsp:include page="base/base.jsp" flush="true" />
</head>
<body>
	<jsp:include page="base/header.jsp" flush="true" />
    <jsp:include page="base/nav.jsp" flush="true" />
    <br><br>
    <div class="container text-center">
	  <h1>購入完了</h1>
	  <hr>
	  <p>購入ありがとうございました。</p><br><br>
	  <a href="index.jsp"><input type="button" class="btn btn-danger" value="ホーム画面に戻る" /></a>
	</div>
    <br><br>
    <jsp:include page="base/footer.jsp" flush="true" />
  </body>
</html>

