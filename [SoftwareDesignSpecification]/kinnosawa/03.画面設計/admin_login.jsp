<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>管理者ログイン</title>

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
<div class="container">
        <div class="adminHeader">
            <h1>管理者ログイン</h1>
        </div>
        <div class="adminBody">
            <form action="#" method="post">
            <br>
            <br>
                <div class="text-center">
                    <div class="left">
                        <label>管理者ID</label><br>
                        <input type="text" placeholder="IDを入力して下さい" style="width:200px">
                        <br>
                        <label>管理者PassWord</label><br>
                        <input type="text" placeholder="パスワードを入力してください" style="width:200px">
                        <br>
                        <br>
                        <input type="submit" value="ログイン" class="btn btn-default">
                    </div>
                </div>
            </form>
            <br>
        </div>
    <div class="adminFooter"></div>
</div>
</body>
</html>