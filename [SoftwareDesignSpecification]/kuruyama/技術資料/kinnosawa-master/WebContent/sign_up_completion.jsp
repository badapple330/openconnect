<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><s:text name="sign_up_completion.title"/></title>

<!-- Bootstrap -->
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-1.11.3.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.js"></script>
<script src="js/jump-pages.js"></script>
<script src="js/browser.js"></script>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
	<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
<![endif]-->
</head>
<body background="images/washi.jpg">
	<jsp:include page="header.jsp"/>
<div class="container" style="width:1170px;">
	<div class="whiteBack">
		<div class="signUp">
			<h3 class="sideMenu"><s:text name="sign_up_completion.title"/></h3>
			<div class="text-center">
				<br>
				<br>
				<br>
				<h4 style="font-weight:bold;"><s:text name="sign_up_completion.comp"/></h4>
				<br>
				<h4 style="font-weight:bold;"><s:text name="sign_up_completion.trans"/></h4>
				<br>
				<br>
				<s:a href="GoTopPageAction"><s:text name="sign_up_completion.click"></s:text></s:a>
				<br>
				<br>
				<br>
				<br>
			</div>
		</div>
	</div>
</div>
	<jsp:include page="footer.jsp"/>
</body>
</html>
