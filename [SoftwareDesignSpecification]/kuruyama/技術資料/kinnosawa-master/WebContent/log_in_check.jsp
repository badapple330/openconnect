<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><s:text name="log_in_check.title"/></title>

<!-- Bootstrap -->
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-1.11.3.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.js"></script>
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
	<div class="main" style="background-color : #f5deb3">
		<div class="signUp" style="font-weight:bold;">
			<div class="text-center">
				<h2><s:text name="log_in_check.title"/></h2>
			</div>
			<hr>
			<div class="UserCheck">
				<div class="text-center">
					<h3 class="text-center"style="font-weight:bold"><s:text name="log_in_check.arert"/></h3>
					<h3 class="sideMenu"><s:text name="log_in_check_sns.title"/></h3>
					<s:url var="facebook" action="login-facebook" />
					<s:a href="%{facebook}" cssClass="bttn facebook">
						<span class="fa fa-facebook"></span>
						<s:text name="log_in_check.fa"/>
					</s:a>
					<s:url var="twitter" action="login-twitter" />
					<s:a href="%{twitter}" cssClass="bttn twitter">
						<span class="fa fa-twitter"></span>
						<s:text name="log_in_check.tw"/>
					</s:a>
					 <s:url var="google" action="login-google" />
					<s:a href="%{google}" cssClass="bttn google">
						<span class="fa fa-google-plus"></span>
						<s:text name="log_in_check.gl"/>
					</s:a>
						<div class="text-center" style=clear:center>
							<h3 class="sideMenu"><s:text name="log_in_check_log.title"/></h3>
							<h4 style="color:red; font-weight:bold"><s:property value="errorMessage"/></h4>
							<button type="button" class="btn btn-primary sm" data-toggle="modal" data-target="#sampleModal" style="width: 30%" >
								<s:text name="log_in_check.log"/>
							</button>
							<p>
							<s:form action="GoSignUpAction">
							<s:a href="sign_up.jsp" cssClass="btn btn-default btn-sm" cssStyle="font-size:15px; height:35px;width: 30%">
								<p  style="font-weight:bold">
									<s:text name="log_in_check.sng"/>
								</p>
							</s:a>
							</s:form>
						</p>
						</div>
						<br>

						<!-- モーダル・ダイアログ -->
					<div class="modal fade" id="sampleModal" tabindex="-1">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<div class="text-center" >
										<h3 style="font-weight:bold"><s:text name="log_in_check.logPage"/></h3>
									</div>
								</div>
								<s:form action="GoLoginAction" method="post">
									<div class="modal-body">
										<button type="button" class="close" data-dismiss="modal"><span>×</span></button>
											<div class="text-center">
												<div class="left">
													<s:label><s:text name="log_in_check_log.email"></s:text>:</s:label>
													<br>
													<s:textfield name="email" placeholder="%{getText('log_in_check_log_place.email')}" />
													<br>
													<s:label><s:text name="log_in_check_log.pass"/>:</s:label>
													<br>
													<s:password name="password" placeholder="%{getText('log_in_check_log_place.pass')}" />
												</div>
											</div>
											<hr>
											<p style="font-weight:bold">
												<s:submit value="%{getText('log_in_check.log')}" cssClass="btn btn-primary" cssStyle="height:35px" name="loginCheck"/>
											</p>
											<button type="button" class="btn btn-default" data-dismiss="modal" style="font-weight:bold">
												<s:text name="sign_up_confirmation.back"/>
											</button>
									</div>
								</s:form>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="text-center" style=clear:left;>
				<s:a href="GoTopPageAction"><s:text name="sign_up.back"/></s:a>
				<br>
				<br>
			</div>
		</div>
	</div>
</div>
	<jsp:include page="footer.jsp"/>
</body>
</html>
