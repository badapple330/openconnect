<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>カート</title>

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
        <div class="mainMenu" style="margin-top:23px;">
            <div class="signUp">
                <h3 class="sideMenu">現在のお買い物かごの中</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th class="text-center">削除</th>
                            <th class="text-center">商品画像</th>
                            <th class="text-center">商品名</th>
                            <th class="text-center">単価</th>
                            <th class="text-center">数量</th>
                            <th class="text-center">小計</th>
                        </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td class="text-center">
                            <input type="button" class="btn" value="削除">
                        </td>
                        <td class="text-center">
                            <img src="images/slide/item07.jpg" style="width:50px">
                        </td>
                        <td class="text-center">苺大福</td>
                        <td class="text-center">300円</td>
                        <td class="text-center">
                            <input type="number" min="0" max="10" style="text-align:right" maxlength="2" value="2">
                        </td>
                        <td class="text-center">600円</td>
                    </tr>
                    <tr>
                        <td class="text-center">
                            <input type="button" class="btn" value="削除">
                        </td>
                        <td class="text-center">
                            <img src="images/slide/item05.jpg" style="width:50px">
                        </td>
                        <td class="text-center">福うさぎ</td>
                        <td class="text-center">230円</td>
                        <td class="text-center">
                            <input type="number" min="0" max="10" style="text-align:right" maxlength="2" value="3">
                        </td>
                        <td class="text-center">690円</td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <th class="text-center">小計</th>
                        <td class="text-center">1290円</td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <th class="text-center">消費税</th>
                        <td class="text-center">103円</td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <th class="text-center">合計</th>
                        <td class="text-center">1393円</td>
                    </tr>
                    </tbody>
                </table>
            </div>
                <div class="text-right">
                ※送料につきましても別途費用が必要になります。
                </div>
                <br>
            <div class="text-center">
                <input type="button" class="btn btn-success" value="購入手続きへ ＞＞">
                <br>
                <br>
                <img src="images/map.jpg" style="width:100%">
                          
            </div>
        </div>
    </div>
</div>
</body>
</html>