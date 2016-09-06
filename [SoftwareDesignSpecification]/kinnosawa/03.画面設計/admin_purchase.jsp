<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>購入情報</title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<script src="js/jquery-1.11.3.min.js"></script> 
<script src="js/bootstrap.js"></script>
</head>
<body class="bodyBack">
    <div class="container">
        <div class="adminBody">
            <h2>購入情報管理画面</h2>
            <br>
            <br>
            <div class="text-right">
                <form action="#" method="post">
                    <input type="text" placeholder="検索するユーザー名を入力して下さい" style="width:250px">
                    <input type="submit" class="btn btn-default" value="検索">
                </form>
            </div>
            ※ 注文番号の数字を押すと詳細ページに遷移できます
            <table class="table table-bordered" style="width:100%; background-color:white;">
                <thead>
                        <th>購入履歴ID</th>
                        <th>注文番号</th>
                        <th>ユーザーID</th>
                        <th>ユーザー名</th>
                        <th>お届け先ID</th>
                        <th>商品名</th>
                        <th>購入数</th>
                        <th>作成日時</th>
                </thead>
                <tboby>
                    <tr>
                        <td>1</td>
                        <td><a href="#">1</a></td>
                        <td>13</td>
                        <td>山田太郎</td>
                        <td>18</td>
                        <td>福うさぎ</td>
                        <td>5</td>
                        <td>20160713</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td><a href="#">1</a></td>
                        <td>13</td>
                        <td>山田太郎</td>
                        <td>18</td>
                        <td>ようかん</td>
                        <td>3</td>
                        <td>20160713</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td><a href="#">1</a></td>
                        <td>13</td>
                        <td>山田太郎</td>
                        <td>18</td>
                        <td>どら焼き</td>
                        <td>4</td>
                        <td>20160713</td>
                    </tr>
                    <tr>
                        <td>4</td>
                        <td><a href="#">2</a></td>
                        <td>26</td>
                        <td>児島由夫</td>
                        <td>35</td>
                        <td>ようかん</td>
                        <td>7</td>
                        <td>20160218</td>
                    </tr>
                    <tr>
                        <td>5</td>
                        <td><a href="#">2</a></td>
                        <td>26</td>
                        <td>児島由夫</td>
                        <td>35</td>
                        <td>どら焼き</td>
                        <td>3</td>
                        <td>20160218</td>
                    </tr>
                    <tr>
                        <td>6</td>
                        <td><a href="#">2</a></td>
                        <td>26</td>
                        <td>児島由夫</td>
                        <td>35</td>
                        <td>どら焼き</td>
                        <td>3</td>
                        <td>20160218</td>
                    </tr>
                    <tr>
                        <td>7</td>
                        <td><a href="#">3</a></td>
                        <td>33</td>
                        <td>金野俊一</td>
                        <td>45</td>
                        <td>きんつば</td>
                        <td>6</td>
                        <td>20151230</td>
                    </tr>
                    <tr>
                        <td>8</td>
                        <td><a href="#">3</a></td>
                        <td>33</td>
                        <td>金野俊一</td>
                        <td>45</td>
                        <td>ようかん</td>
                        <td>5</td>
                        <td>20151230</td>
                    </tr>
                    <tr>
                        <td>9</td>
                        <td><a href="#">3</a></td>
                        <td>33</td>
                        <td>金野俊一</td>
                        <td>45</td>
                        <td>苺だいふく</td>
                        <td>4</td>
                        <td>20151230</td>
                    </tr>
                    <tr>
                        <td>10</td>
                        <td><a href="#">3</a></td>
                        <td>33</td>
                        <td>金野俊一</td>
                        <td>45</td>
                        <td>どら焼き</td>
                        <td>5</td>
                        <td>20151230</td>
                    </tr>
                </tboby>
            </table>
            <div class="text-center">
                <ul class="pagination">
		<li>
			<a href="#" aria-label="前のページへ">
				<span aria-hidden="true">«</span>
			</a>
		</li>
		<li><a href="#">1</a></li>
		<li class="active"><a href="#">2</a></li>
		<li><a href="#">3</a></li>
		<li><a href="#">4</a></li>
		<li><a href="#">5</a></li>
		<li>
			<a href="#" aria-label="次のページへ">
				<span aria-hidden="true">»</span>
			</a>
		</li>
	</ul>
            </div>
        </div>
        <div class="adminFooter">
        </div>
    </div>    
</body>
</html>