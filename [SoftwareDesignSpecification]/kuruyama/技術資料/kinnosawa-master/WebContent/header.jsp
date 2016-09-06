<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title><s:text name = "header.title"/></title>

        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">

        <script src="js/jquery-1.11.3.min.js"></script>
        <script src="js/bootstrap.js"></script>

    </head>
    <body>
        <div class="container" style="width:1170px;">
            <div class="header">
                <s:a href="GoTopPageAction">
                    <div class="shopName">
                        <h1 class="shopSubName">甘味処</h1>
                        <h1 class="shopMainName">金<span style="font-size:60px;">ノ</span>沢</h1>
                    </div>
                </s:a>
                <div class="shopQuery">
                    <s:a href="GoQuestionAction" ><s:text name = "header.contact"/></s:a>
                    <s:if test="%{!#session.userName}">
                        <p><s:text name = "header.welcome"/></p>
                    </s:if>
                    <s:else>
                        <p><s:text name = "header.hello"/><%=session.getAttribute("userName") %><s:text name = "header.san"/></p>
                    </s:else>
                </div>
            </div>
        </div>
    </body>
</html>