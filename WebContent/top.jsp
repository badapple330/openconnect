<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="top.css" type="text/css">


<!-- 背景画像 -->
<style type="text/css">
<!--body {background: url(img/top.jpg) center center / cover no-repeat fixed;}-->
</style>
<!-- ここまで -->


<title>OPENCONNECT</title>

<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="top.css" type="text/css">
</head>
<body>

<!------------------    ユーザーログイン    ------------------->

			<h2 align="center">Open Connect</h2>
	<div align ="center">

				<s:property value="%{resultString}" />

				<s:form theme="simple" id="inner" class="form-horizontal"
					action="LoginAction" autocomplete="off">
					<!------------------    メールアドレス    ------------------->
						<div class="stringWidth">メールアドレス</div>
						<s:textfield class="textWidth" name="email"  value="" placeholder="example@example.com" />
						<br>
						<br>

					<!------------------    パスワード    ------------------->
						<div class="stringWidth">パスワード</div>
						<s:password class="textWidth" name="password" value="" />

						<s:textfield type="hidden" name="userFlg" value="userFlg" />
						<br>
						<br>
					<!------------------    ログイン情報を送信    ------------------->
						<div>
							<s:submit type="submit" value="ログイン" />

						</div>
				</s:form>
			</div>
		</div>
	</div>
</div>
</body>
</html>