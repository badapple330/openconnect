<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title><s:text name = "admin_header.one"/></title>

        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
        <script src="js/jquery-1.11.3.min.js"></script>
        <script src="js/bootstrap.js"></script>
    </head>
    <body class="bodyBack">
        <div class="container" style="width:1170px;">
            <div class="adminHeader">
                <div class="navbar-header">
                    <strong class="navbar-brand"><s:text name = "admin_header.two"/></strong>
                </div>
                <ul class="nav navbar-nav">
                    <li>
                        <a href="GoAdminUserAction" style="color:white;"><s:text name = "admin_header.three"/></a>
                    </li>
                    <li>
                        <a href="GoAdminItemAction" style="color:white;"><s:text name = "admin_header.four"/></a>
                    </li>
                    <li>
                        <a href="GoAdminPurchaseAction" style="color:white;"><s:text name = "admin_header.five"/></a>
                    </li>
                    <li>
                        <a href="GoAdminCapacityAction" style="color:white;"><s:text name = "admin_header.six"/></a>
                    </li>
                    <li>
                        <a href="GoAdminContactAction" style="color:white;"><s:text name = "admin_header.seven"/></a>
                    </li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li style="width:100px"><a href="GoAdminLogInAction" style="color:white;"><s:text name = "admin_header.eight"/></a></li>
                </ul>
            </div>
        </div>
    </body>
</html>