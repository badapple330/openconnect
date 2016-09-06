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
<title><s:text name="sign_up_confirmation.tag"/></title>

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
<script src="js/browser.js"></script>
</head>
<body background="images/washi.jpg">
	<jsp:include page="header.jsp"/>
<div class="container" style="width:1170px;">
	<div class="whiteBack">
		<div class="signUp">
			<h3 class="sideMenu"><s:text name="sign_up_confirmation.title"/></h3>
			<div class="text-center">
				<table class="table">
					<tbody>
					<tr>
						<th class="text-right"><s:text name="sign_up.name"/>：</th>
						<td><s:property value="#session.name"/></td>
					</tr>
					<tr>
						<th class="text-right"><s:text name="sign_up.nameKana"/>：</th>
						<td><s:property value="#session.nameKana"/></td>
					</tr>
					<tr>
						<th class="text-right"><s:text name="sign_up_confirmation.tellNum"/>：</th>
						<td><s:property value="#session.tellNum"/></td>
					</tr>
					<tr>
						<th class="text-right"><s:text name="sign_up.email"/>：</th>
						<td><s:property value="#session.email"/></td>
					</tr>
					<tr>
						<th class="text-right"><s:text name="sign_up_confirmation.pass"/>：</th>
						<td><input type="password" value="<s:property value="#session.password"/>" disabled style="border:none; background-color:#fffacd; text-align:center; "></td>
					</tr>
					<tr>
						<th class="text-right"><s:text name="sign_up_confirmation.postal"/>：</th>
						<td><s:text name="sign_up.postalSym"/><s:property value="#session.postalCode"/></td>
					</tr>
					<tr>
						<th class="text-right"><s:text name="sign_up_confirmation.address"/>：</th>
						<td><s:property value="#session.address"/></td>
					</tr>
					</tbody>
				</table>
			</div>
		<div class="text-center">
			<div style="display:inline-flex">
				<s:form action="GoSignUpAction">
					<s:submit cssClass="btn" value="%{getText('sign_up_confirmation.back')}"/>
				</s:form>
				<p>　</p>
				<s:form action="SignUpCompletionAction">
					<s:submit cssClass="btn btn-success" value="%{getText('sign_up_confirmation.comp')}"/>
				</s:form>
			</div>
 		</div>
		<br>
		<br>
		</div>
	</div>
</div>
	<jsp:include page="footer.jsp"/>
</body>
</html>