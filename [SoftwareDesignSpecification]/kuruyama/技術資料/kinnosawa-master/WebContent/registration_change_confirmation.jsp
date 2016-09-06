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
<title><s:text name="registration_change_confirmation.title" />登録内容変更確認</title>

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
<!--↓ヘッダー↓-->
	<jsp:include page="header.jsp"/>
<!--↑ヘッダー↑-->
<div class="container" style="width:1170px;">


        <div class="signUp">
            <h2 class="sideMenu"><s:text name="registration_change_confirmation.title" /></h2>
	            <div class="text-center">
	            <s:form  method="post">
	            <table class="table">
	                <tbody>
	                    <tr>
	                        <th class="text-right"><s:text name="registration_change_confirmation.name" />：</th>
	                        <td><s:property value="#session.updateName" /></td>
	                    </tr>
	                    <tr>
	                        <th class="text-right"><s:text name="registration_change_confirmation.nameKana" />：</th>
	                        <td><s:property value="#session.updateNameKana" /></td>
	                    </tr>
	                    <tr>
	                        <th class="text-right"><s:text name="registration_change_confirmation.telNumber" />：</th>
	                        <td><s:property value="#session.updateTelNumber" /></td>
	                    </tr>
	                    <tr>
	                        <th class="text-right"><s:text name="registration_change_confirmation.nowEmail" />：</th>
	                        <td><s:property value="#session.updateEmail" /></td>
	                    </tr>
	                    <tr>
	                        <th class="text-right"><s:text name="registration_change_confirmation.password" />：</th>
	                        <td><input type="password" value="<s:property value="#session.updatePassword" />" disabled style="border:none; background-color:#fffacd; text-align:center; "></td>
	                    </tr>
	                    <tr>
	                        <th class="text-right"><s:text name="registration_change_confirmation.postalCode" />：</th>
	                        <td>〒<s:property value="#session.updatePostalCode" /></td>
	                    </tr>
	                    <tr>
	                        <th class="text-right"><s:text name="registration_change_confirmation.address" />：</th>
	                        <td><s:property value="#session.updatePrefecture" /><s:property value="#session.updateCityName" /></td>
	                    </tr>
	                    <s:if test="creditInput==2">
	                    	<tr>
	                        	<th class="text-right"><s:text name="registration_change_confirmation.cardNumber" />：</th>
	                        	<td><s:property value="#session.updateCardNumber" /></td>
	                    	</tr>
	                    	<tr>
	                        	<th class="text-right"><s:text name="registration_change_confirmation.validThru" />：</th>
	                        	<td><s:property value="#session.updateExpirationDate" /></td>
	                    	</tr>
	                    	<tr>
	                        	<th class="text-right"><s:text name="registration_change_confirmation.cardHolder" />：</th>
	                        	<td><s:property value="#session.updateCardHolder" /></td>
	                    	</tr>
	                    	<tr>
	                        	<th class="text-right"><s:text name="registration_change_confirmation.cvv" />：</th>
	                        	<td><s:property value="#session.updateSecurityCode" /></td>
	                    	</tr>
	                    </s:if>
	                </tbody>
	            </table>
	            </s:form>
	            </div>

		        <div class="text-center">
		            <s:a href="GoRegistrationChangeAction" cssClass="btn btn-success" ><s:text name="registration_change_confirmation.correction" /></s:a>
		            <s:a href="RegistrationChangeCompletionAction" cssClass="btn btn-success" ><s:text name="registration_change_confirmation.registration" /></s:a>
		            <br>
		            <br>
		        </div>
        </div>
</div>
<!--↓フッター↓-->
    <jsp:include page="footer.jsp"/>
<!--↑フッター↑-->
</body>
</html>