
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>商品一覧</title>

<!-- Bootstrap -->
<link rel="stylesheet" href="css/bootstrap.css">
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
<div class="container">
    <div class="main">
        <div class="itemDetails">
            <h2 class="text-center sideMenu">焼き菓子</h2>
            <form method="post" action="#">
            <div class="menu">
                <img src="images/slide/item02.jpg"alt=""class="mainImage"/>
                    <h2>どら焼き</h2>
                    <p class="salePrice">販売価格：500円<br>
                    <input type="button" value="詳細" class="btn btn-success">
                        </p>
            </div>
            </form>
            <form method="post" action="#">
            <div class="menu">
                <img src="images/slide/item49.jpg"alt=""class="mainImage"/>
                    <h2>生どら焼き</h2>
                    <p class="salePrice">販売価格：500円<br>
                    <input type="button" value="詳細" class="btn btn-success">
                        </p>
            </div>
            </form>
            <form method="post" action="#">
            <div class="menu">
                <img src="images/slide/item47.jpg"alt=""class="mainImage"/>
                    <h2>栗どら焼き</h2>
                    <p class="salePrice">販売価格：500円<br>
                    <input type="button" value="詳細" class="btn btn-success">
                        </p>
            </div>
            <div class="menu">
                <img src="images/slide/item36.jpg"alt=""class="mainImage"/>
                    <h2>煎餅</h2>
                    <p class="salePrice">販売価格：500円<br>
                    <input type="button" value="詳細" class="btn btn-success">
                        </p>
            </div>
            </form>
            <form method="post" action="#">
            <div class="menu">
                <img src="images/slide/item38.jpg"alt=""class="mainImage"/>
                    <h2>柴舟</h2>
                    <p class="salePrice">販売価格：500円<br>
                    <input type="button" value="詳細" class="btn btn-success">
                        </p>
            </div>
            <div class="menu">
                <img src="images/slide/item02.jpg"alt=""class="mainImage"/>
                    <h2>どら焼き</h2>
                    <p class="salePrice">販売価格：500円<br>
                    <input type="button" value="詳細" class="btn btn-success">
                        </p>
            </div>
            </form>
        </div>
</div>
</div>
</body>
</html>