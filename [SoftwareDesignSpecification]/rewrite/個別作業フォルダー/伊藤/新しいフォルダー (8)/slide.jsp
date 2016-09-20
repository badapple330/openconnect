<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/jquery.fullPage.css" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.fullPage.js"></script>
</head>
<body>
	<form action="MainAction"></form>
	<div id="fullpage">
		<div id="sec2" class="section">
			<div class="slide slide1">
				<s:iterator value="MainList">
					<s:form action="WithdrawReviewAction" style="display:inline">
						<s:submit type="<s:property value="site_Banner" />"
							src="<s:property value="image_url" />" id="img"></s:submit>
					</s:form>
				</s:iterator>
			</div>
			<div class="slide slide1"></div>
			<div class="slide slide1"></div>
		</div>
	</div>
</body>
</html>