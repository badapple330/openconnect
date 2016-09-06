<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>ユーザー管理</title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<script src="js/jquery-1.11.3.min.js"></script> 
<script src="js/bootstrap.js"></script>
</head>
<body class="bodyBack">
    <div class="container">
        <div class="adminBody">
            <h2>ユーザー情報管理画面</h2>
            <br>
            <br>
            <div class="text-right">
                <form action="#" method="post">
                    <input type="text" placeholder="検索するユーザー名を入力して下さい" style="width:250px">
                    <input type="submit" class="btn btn-default" value="検索">
                </form>
                <form action="#" method="post">
                    <input type="text" placeholder="削除するユーザーのIDを入力して下さい" style="width:250px">
                    <input type="submit" class="btn btn-default" value="削除">
                </form>
            </div>
            <br>
            <table class="table table-bordered" style="width:100%; background-color:white;">
                <thead>
                        <th>ユーザーID</th>
                        <th>名前</th>
                        <th>電話番号</th>
                        <th>住所</th>
                </thead>
                <tboby>
                    <tr>
                        <td>1</td>
                        <td>田中努</td>
                        <td>09011112222</td>
                        <td>東京都文京区本郷7-3-1</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>山田太郎</td>
                        <td>09022223333</td>
                        <td>千葉県銚子市外川町1-10835-6</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>嶋田浩</td>
                        <td>09033334444</td>
                        <td>京都府舞鶴市河辺由里2-20河辺由里タウン213</td>
                    </tr>
                    <tr>
                        <td>4</td>
                        <td>児島由夫</td>
                        <td>0969141016</td>
                        <td>熊本県上益城郡益城町寺中4-16-6</td> 
                    </tr>
                    <tr>
                        <td>5</td>
                        <td>藤川美雨</td>
                        <td>0982611506</td>
                        <td>宮崎県都城市郡元町3-7</td>
                    </tr>
                    <tr>
                        <td>6</td>
                        <td>堀口秀幸</td>
                        <td>0554786855</td>
                        <td>山梨県南巨摩郡早川町新倉1-13-3</td> 
                    </tr>
                    <tr>
                        <td>7</td>
                        <td>金野俊一</td>
                        <td>0826786007</td>
                        <td>広島県廿日市市虫所山1-2-5ロイヤル虫所山103</td>
                    </tr>
                    <tr>
                        <td>8</td>
                        <td>鳥居孝利</td>
                        <td>0894884318</td>
                        <td>愛媛県大洲市宇和川1-13-14</td>
                    </tr>
                    <tr>
                        <td>9</td>
                        <td>大川佐登子</td>
                        <td>0863094558</td>
                        <td>岡山県勝田郡勝央町田井3-11</td>
                    </tr>
                    <tr>
                        <td>10</td>
                        <td>鹿野寿</td>
                        <td>0959874242</td>
                        <td>長崎県対馬市厳原町上槻3-6-14</td> 
                    </tr>
                    <tr>
                        <td>11</td>
                        <td>高梨淳一</td>
                        <td>0581834612</td>
                        <td>岐阜県多治見市生田町4-13-9生田町プレシャス300</td> 
                    </tr>
                    <tr>
                        <td>12</td>
                        <td>江藤治志</td>
                        <td>0179623556</td>
                        <td>青森県三戸郡五戸町熊ノ沢1-6-13</td>
                    </tr>
                    <tr>
                        <td>13</td>
                        <td>福地行夫</td>
                        <td>0293215087</td>
                        <td>茨城県ひたちなか市阿字ケ浦町1-12-5</td>
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