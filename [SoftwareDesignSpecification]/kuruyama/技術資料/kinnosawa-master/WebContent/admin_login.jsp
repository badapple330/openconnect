<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><s:text name="admin_login.administrator" /></title>

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
<body class="bodyBack">
<div class="container" style="width:1170px;">
        <div class="adminHeader">
            <h1><s:property value="getText('admin_login.administrator')" /></h1>
        </div>
        <div class="adminBody">
            <s:form action="AdminLogInAction" method="post">
            <br>
            <br>
                <div class="text-center">
                    <div class="left">
                        <label><s:property value="getText('admin_login.id')" /></label><br>
                        <s:textfield name="id" cssClass="form-control" placeholder="%{getText('admin_login.enter_id')}" style="width:200px"/>
                        <br>
                        <label><s:property value="getText('admin_login.password')" /></label><br>
                        <s:password name="password" cssClass="form-control" placeholder="%{getText('admin_login.enter_password')}" style="width:200px"/>
                        <s:property value="errorLogin"/>
                        <br>
                        <br>
                        <s:submit value="%{getText('admin_login.login')}" cssClass="btn btn-primary"/>
                    </div>
                </div>
            </s:form>
            <br>
        </div>
    <div class="adminFooter"></div>
</div>
</body>
</html>