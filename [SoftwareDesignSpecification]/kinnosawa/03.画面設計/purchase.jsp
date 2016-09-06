<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>購入手続き</title>

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
<div class="container">

<!--↓ヘッダー↓-->
    
<!--↑ヘッダー↑-->

    <div class="main">
    
<!--↓サイドバー↓-->
    
<!--↑サイドバー↑-->
    
        <div class="purchaseDisplay">
            <div class="text-center">
                <h3 class="purchaseTitle">購入手続き</h3>
                <form action="#" method="post">
                    <div class="text-center">
                        <div class="purchaseSlip">
                            
                            
                                <div class="purchaseItemTable">
                                    
                                    <h4>■ご注文内容</h4>
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th>品名</th>
                                                <th><div class="text-right">数量</div></th>
                                                <th><div class="text-right">価格</div></th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>おはぎ</td>
                                                <td><div class="text-right">10</div></td>
                                                <td><div class="text-right">1,000</div></td>
                                            </tr>
                                            <tr>
                                                <td>ようかん</td>
                                                <td><div class="text-right">1</div></td>
                                                <td><div class="text-right">200</div></td>
                                            </tr>
                                        </tbody>
                                        <tfoot>
                                            <tr>
                                                <th>小計</th>
                                                <td><div class="text-right">11</div></td>
                                                <td><div class="text-right">1,200</div></td>
                                            </tr>
                                            <tr>
                                                <th>消費税（8%）</th>
                                                <td></td>
                                                <td><div class="text-right">96</div></td>
                                            </tr>
                                            <tr>
                                                <th>合計　※<a href="#map">送料</a>は別途となります</th>
                                                <th><div class="text-right">11</div></th>
                                                <th><div class="text-right">1,296</div></th>
                                            </tr>
                                        </tfoot>
                                    </table>
                                    
                                </div>
                            <br>
                            <div class="">
                            <h4>■送り先住所</h4>
                                
                                <input type="radio" name="sendAddress" value="1" id="radio1" checked/><label for="radio1">ご登録の住所に発送</label>
                                <input type="radio" name="sendAddress" value="2" id="radio2" /><label for="radio2">その他の住所に発送</label>
                                
                                <!--登録済みの住所表示スペース-->
                                <div class="purchaseAddressTable" id="tr1">
                                    <table class="table">
                                        <tbody>
                                            <tr>
                                                <td>お届け先名：</td>
                                                <td>氏名名前</td>
                                            </tr>
                                             <tr>
                                                <td>電話番号：</td>
                                                <td>08000000000</td>
                                            </tr>
                                             <tr>
                                                <td>郵便番号：</td>
                                                <td>1570032</td>
                                            </tr>
                                             <tr>
                                                <td>住所：</td>
                                                <td>東京都世田谷区祖師谷1-2-15</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                                <!--その他の住所入力テキストボックス-->
                                <div class="purchaseAddressTable" id="tr2">
                                    <table class="table">
                                        <tbody>
                                            <tr>
                                                <td>お届け先名：</td>
                                                <td><input class="purchaseName"  name="name" type="text" placeholder="氏名名前"/></td>
                                            </tr>
                                             <tr>
                                                <td>電話番号：</td>
                                                <td><input class="purchaseTel" name="tel" type="text" placeholder="08000000000"/></td>
                                            </tr>
                                             <tr>
                                                <td>郵便番号：</td>
                                                <td><input class="purchasePostalCode" name="postalCode" type="text" placeholder="1570032"/></td>
                                            </tr>
                                             <tr>
                                                <td>住所：</td>
                                                <td><input class="purchaseAddress" name="address" type="text" placeholder="東京都世田谷区祖師谷1-2-15" /></td>
                                            </tr>
                                    </table>    
                                </div>
                            </div>
                    
                            <div class="text-center">
                        <input type="button" value="購入確認へ" class="btn btn-success">
                    </div>
                        </div>
                    </div>
                </form>
                    <br><br><br>
                    <div class="purchaseSlip">
                        <h4  id="map">■送料について</h4>
                        <div class="text-center">
                        <img src="images/map.jpg" style="width:100%">
                        </div>
                    </div>
            </div>
        </div>

    </div>
<!--↓フッター↓-->
    
<!--↑フッター↑-->
    
</div>
</body>
</html>