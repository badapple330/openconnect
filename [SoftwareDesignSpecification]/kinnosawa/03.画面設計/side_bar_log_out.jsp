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
<title>サイドバー（ログアウト）</title>

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
   
    <div class="main">
        <div class="sidebar">
            <div class="text-center">
            <h3 class="sideMenu">SNSでの登録、ログイン</h3>
            <a href="#" class="bttn facebook"><span class="fa fa-facebook"></span></a>
            <a href="#" class="bttn twitter"><span class="fa fa-twitter"></span></a>
        <a href="#" class="bttn google"><span class="fa fa-google-plus"></span></a>
            <h3 class="sideMenu">ログイン、登録</h3>
            <input type="button" value="新規登録" class="btn btn-info" style="margin-bottom:10px; width:80%"><br>
           <button type="button" class="btn btn-primary sm" data-toggle="modal" data-target="#sampleModal" style="width: 80%">ログイン</button> 
                
                <div class="modal fade" id="sampleModal" tabindex="-1">
	<div class="modal-dialog">
		<div class="modal-content">
             <div class="modal-header">
                        <div class="text-center" >
                            <h3 style="font-weight:bold">ログイン画面</h3>
                        </div>
                    </div>
			<div class="modal-body">
				        <button type="button" class="close" data-dismiss="modal"><span>×</span></button>
                        <form>
                            <div class="text-center">
                                <div class="left">
                                    <label>メールアドレス:</label><br>
                                    <input type="email"placeholder="メールアドレスの入力"><br>
                                    <label>パスワード:</label><br>
                                    <input type="password"placeholder="パスワードの入力">
                                </div>
                            </div>
                            <hr>
                            <div class="text-right">
                                <a href="#" class="btn btn-primary"style="height:35px"><p style="font-weight:bold">ログイン</p></a>
                                <button type="button" class="btn btn-default" data-dismiss="modal" style="font-weight:bold">戻る</button>
			             　　</div>
                        </form>
                    　</div>
		</div>
	</div>
</div>
            </div>
            <h3 class="sideMenu">カート情報</h3>
            カートに入っている商品は<br>
            <div class="text-right">
            個です。<br>
            </div>
            現在のカート合計金額は<br>
            <div class="text-right">
            円です。<br>
            </div>
            <div class="text-center">
            <input type="button" class="btn btn-success" value="カートに移動する" style="width:80%; margin-top:5px;">
            </div>
            <h3 class="sideMenu">カテゴリー一覧</h3>
            <ul class="categoryList">
                <li><a href="#">焼き菓子</a></li>
                <li><a href="#">まんじゅう</a></li>
                <li><a href="#">餅菓子</a></li>
                <li><a href="#">ようかん</a></li>
                <li><a href="#">その他</a></li>
            </ul>
            <h3  class="sideMenu">金沢のイチオシ!!</h3>
            <a href="#"><h4>金沢イチオシ一覧</h4></a>
            <h3 class="sideMenu">電話でのお問い合わせ</h3>
            電話でのお問い合わせはこちら<br>
                ＊＊－＊＊＊＊－＊＊＊＊
            <h3 class="sideMenu">海外発送の際の注意</h3>
            海外への発送はメールのみで受け付けております。<br>
            詳しい送料につきましては郵政のホームページをご確認下さい。<br>
            <a href="#">郵政のホームページへ</a>
            <hr>
            <img src="images/kaigai.jpg" style="width:100%">
        </div>
      
       
        

    </div>
    
 
</div>
</body>
</html>