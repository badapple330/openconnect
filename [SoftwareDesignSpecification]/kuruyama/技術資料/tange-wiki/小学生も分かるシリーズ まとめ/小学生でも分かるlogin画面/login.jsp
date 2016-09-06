<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FootPrinter</title>
<style type="text/css">
<!--
.errorMessage {
	color: red;
}
-->
</style>
<link
	href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css"
	rel="stylesheet">
<link href="css/login.css" rel="stylesheet" type="text/css" />
<jsp:include page="base/base.jsp" flush="true" />
</head>
<jsp:include page="base/header.jsp" flush="true" />
<body>
	<br>
	<br>
	<div class="container">
		<div class="row">
			<div class="col-md-10 col-md-offset-1">
				<div class="col-md-6">
					<h2 class="subTitle">
						<s:text name="lang.login.Login" />
					</h2>
					<s:form action="login-action">
						<div class="form-group">
							<div class="errorMessage">
								<s:property value="errorMsg"></s:property>
							</div>
							<s:fielderror>
								<s:param>email</s:param>
							</s:fielderror>
							<label for="email" class="control-label">ID</label>
							<s:textfield cssClass="form-control" name="email"
								placeholder="example@gmail.com" />
							<span class="help-block"></span>
							<s:fielderror>
								<s:param>password</s:param>
							</s:fielderror>
							<label for="password" class="control-label"><s:text
									name="lang.login.Pass" /></label>
							<s:password cssClass="form-control" name="password" maxlength="13"
								placeholder="password" />
							<span class="help-block"></span>
							<s:submit value="%{getText('lang.login.Login')}" />
						</div>
					</s:form>
					<br> <br> <br>
				</div>
				<div class="col-md-5">
					<h2 class="subTitle">
						<s:text name="lang.login.Singup" />
					</h2>
					<p>
						<s:text name="lang.login.Please" />
						<br>
						<s:text name="lang.login.Please1" />
					</p>
					<s:url var="signUp" action="sign-up" />
					<s:a href="%{signUp}" cssClass="btn btn-success">
						<s:text name="lang.login.Singup" />
					</s:a>
					<hr>
					<h3 class="subTitle">
						<s:text name="lang.login.LoginWith" />
					</h3>
					<s:url var="facebook" action="login-facebook" />
					<s:url var="twitter" action="login-twitter" />
					<s:url var="google" action="login-google" />
					<s:a href="%{facebook}">
						<img src="img/facebook-j.png">
					</s:a>
					<s:a href="%{twitter}">
						<img src="img/twitter-j.png">
					</s:a>
					<s:a href="%{google}">
						<img src="img/google-j.png">
					</s:a>
					<br> <br>
				</div>

			</div>
		</div>
	</div>
	<jsp:include page="base/footer.jsp" flush="true" />
</body>

</html>
