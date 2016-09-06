<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>新規登録完了</title>
    <!-- CSSリンク  -->
 	<jsp:include page="base/base.jsp" flush="true" />
  </head>
<body>
 <jsp:include page="base/header.jsp" flush="true" />
	<div class="container text-center">
		<h1>登録完了</h1>
		<hr>
		<p>引き続き当サイトをご利用ください。</p><br><br>
		<a href="index.jsp"><input type="button" class="btn btn-danger" value="ホーム画面に戻る" /></a>
	</div>
	<br>
<jsp:include page="base/footer.jsp" flush="true" />
</body>
</html>
