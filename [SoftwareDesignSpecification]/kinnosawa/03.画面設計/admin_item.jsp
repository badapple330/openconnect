<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>商品管理</title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<script src="js/jquery-1.11.3.min.js"></script> 
<script src="js/bootstrap.js"></script>
<script src="js/kojin-jquery.js"></script>
</head>
<body class="bodyBack">
    <div class="container">
        
        <div class="adminBody">
            <h2>商品管理画面</h2>
            <br>
            <br>
            <div class="text-right">
                 <button type="button" class="btn btn-default sm" data-toggle="modal" data-target="#sampleModal" style="width: 55px" >追加</button>
                <form action="#" method="post">
                    <input type="text" placeholder="検索する商品名を入力して下さい" style="width:250px">
                    <input type="submit" class="btn btn-default" value="検索">
                </form>
                <form action="#" method="post">
                    <input type="text" placeholder="削除する商品のIDを入力して下さい" style="width:250px">
                    <input type="submit" class="btn btn-default" value="削除">
                </form>
                <!-- モーダル・ダイアログ -->
            <div class="modal fade" id="sampleModal" tabindex="-1">
	           <div class="modal-dialog">
		          <div class="modal-content">
                     <div class="modal-header">
                        <div class="text-center" >
                            <h3 style="font-weight:bold">商品追加画面</h3>
                        </div>
                    </div>
			        <div class="modal-body">
				        <button type="button" class="close" data-dismiss="modal"><span>×</span></button>
                        <form　method="post" action="example.cgi">
                            <div class="text-center">
                                <div class="left">
                                    <label>商品ID:</label><br>
                                    <input type="text"placeholder="商品ID"><br>
                                    <label>商品名:</label><br>
                                    <input type="text"placeholder="商品名"><br>
                                    <label>個数:</label><br>
                                    <input type="text"placeholder="個数"><br>
                                    <label>画像パス:</label><br>
                                    <input type="img"placeholder="画像パス"><br>
                                     <label>アレルギー:</label><br>
                                    <input type="text"placeholder="アレルギー"><br>
                                    <label>カテゴリー:</label><br>
                                    <input type="radio" name="q1" value="焼き菓子">焼き菓子
                                    <input type="radio" name="q1" value="まんじゅう">まんじゅう
                                    <input type="radio" name="q1" value="餅菓子">餅菓子<br>
                                    <input type="radio" name="q1" value="ようかん">ようかん
                                    <input type="radio" name="q1" value="その他">その他
                                    <br>
                                     <label>金沢イチオシ一覧:</label><br>
                                    <input type="checkbox" name="q1" value="金沢イチオシ一覧">金沢イチオシ一覧
                                    <br>
                                    </div>
                                </div>
                            <hr>
                            <div class="text-right">
                                <a href="#" class="btn btn-primary"style="height:35px"><p style="font-weight:bold">追加</p></a>
                                <button type="button" class="btn btn-default" data-dismiss="modal" style="font-weight:bold">戻る</button>
			             　　</div>
                        </form>
                    　</div>
		          </div>
	           </div>
            </div>
            </div>
            <br>
            <table class="table table-bordered" style="width:100%; background-color:white;">
                <thead>
                        <th>商品ID</th>
                        <th>商品名</th>
                        <th>個数</th>
                        <th>画像パス</th>
                        <th>アレルギー</th>
                        <th>カテゴリー</th>
                        <th>金沢イチオシ一覧</th>
                </thead>
                <tboby>
                    <tr>
                        <td>1</td>
                        <td>福ウサギ（ゆず）</td>
                        <td>1</td>
                        <td>item01.jpg</td>
                        <td>卵</td>
                        <td>まんじゅう</td>
                        <td>はい</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>福ウサギ（かぼちゃ）</td>
                        <td>1</td>
                        <td>item02.jpg</td>
                        <td>卵</td>
                        <td>まんじゅう</td>
                        <td>はい</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>福ウサギ（棒茶）</td>
                        <td>1</td>
                        <td>item03.jpg</td>
                        <td>卵</td>
                        <td>まんじゅう</td>
                        <td>はい</td>
                    </tr>
                    <tr>
                        <td>4</td>
                        <td>福ウサギ（白餡）</td>
                        <td>1</td>
                        <td>item04.jpg</td> 
                        <td>卵</td>
                        <td>まんじゅう</td>
                        <td>はい</td>
                    </tr>
                    <tr>
                        <td>5</td>
                        <td>福ウサギ（つぶあん）</td>
                        <td>1</td>
                        <td>item05.jpg</td>
                        <td>卵</td>
                        <td>まんじゅう</td>
                        <td>はい</td>
                    </tr>
                    <tr>
                        <td>6</td>
                        <td>きんつば（つぶあん）</td>
                        <td>1</td>
                        <td>item06.jpg</td> 
                        <td>小麦粉</td>
                        <td>ようかん</td>
                        <td>はい</td>
                    </tr>
                    <tr>
                        <td>7</td>
                        <td>きんつば（白餡）</td>
                        <td>1</td>
                        <td>item07.jpg</td>
                        <td>小麦粉</td>
                        <td>ようかん</td>
                        <td>はい</td>
                    </tr>
                    <tr>
                        <td>8</td>
                        <td>きんつば（抹茶）</td>
                        <td>1</td>
                        <td>item08.jpg</td>
                        <td>小麦粉</td>
                        <td>ようかん</td>
                        <td>はい</td>
                    </tr>
                    <tr>
                        <td>9</td>
                        <td>きんつば（栗）</td>
                        <td>1</td>
                        <td>item09.jpg</td>
                        <td>小麦粉</td>
                        <td>ようかん</td>
                        <td>はい</td>
                    </tr>
                    <tr>
                        <td>10</td>
                        <td>どら焼き（つぶあん）</td>
                        <td>1</td>
                        <td>item010.jpg</td> 
                        <td>小麦粉</td>
                        <td>その他</td>
                        <td>いいえ</td>
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