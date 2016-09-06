<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>退会完了</title>
    <jsp:include page="base/base.jsp" flush="true" />
</head>
<body>
<jsp:include page="base/header.jsp" flush="true" />
		<div class="container text-center">
			<h1>退会完了ページ</h1>
			<hr>
				<h3>退会完了しました</h3>
				<p>今までのご利用ありがとうございました。</p>
				<p>またのご利用をお待ちしております。</p>
				<a href="index.jsp"><input type="button" class="btn btn-danger" value="ホームに戻る"/></a>
		</div>
	<br>
    <jsp:include page="base/footer.jsp" flush="true" />
    </body>
</html>