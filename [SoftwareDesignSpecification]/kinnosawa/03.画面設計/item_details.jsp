<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>商品詳細</title>

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
            <h2 class="text-center sideMenu">商品詳細</h2>
                <div class="detail">
                    <img src="images/slide/item02.jpg" >
                        <div class="absolute">
                        <p >ここに文章が入りますここに文章が入りますここに文章が入りますここに文章が入りますここに文章が入りますここに文章が入りますここに文章が入りますここに文章が入りますここに文章が入りますここに文章が入ります</p>
                        <ul>
                            <li>日保ち： 製造後40日<br/>
                                <em>※日保ちは目安となります。到着後、各商品の賞味期限をご確認ください。</em></li>
                            <li>販売期間： 通年</li>
                            <li>アレルギー： 小豆・小麦粉・卵</li>
                        </ul>
                        </div>
                </div>
                <form method="post" action="#">
                <div class="item">
                    <img src="images/itemDetails/detail01.jpg">
                    <table>
                        <h3>どら焼き</h3>
                        <tr class="table">
                        <th>価格（税込）</th>
                        <th class="box">個数</th>
                        </tr>
                        <tr class="table">
                            <td>【6個入】 1,059円</td>
                            <td class="box"><input name="cnt" type="text" value="0" size="5"></td>
                        </tr>
                        <tr class="table">
                            <td>【10個入】 1,836円 </td>
                            <td class="box"><input name="cnt" type="text" value="0" size="5"></td>
                        </tr>
                        <tr class="table">
                            <td>【15個入】 2,754円 </td>
                            <td class="box"><input name="cnt" type="text" value="0" size="5"></td>
                        </tr>
                    </table>
                 <div class="right">
                	<input type="submit" value="カートに入れる" class="btn btn-success">
                <div>
                </div>
                </form>
            </div>
        
    </div>
</div>
</body>
</html>