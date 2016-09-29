<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="img/oc.png">
<link rel="apple-touch-icon" href="img/oc.png">
<title>Open Connect -ログイン</title>
<!-- css読み込み -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<!-- js読み込み -->
<script src="js/bootstrap.js"></script>
</head>
<body>

	<!-- ヘッダー -->
	<header>
		<nav class="navbar navbar-default navbar-static-top">
			<div class="container">
				<div class="navbar-header">
					<h1>
						<a href="index.jsp">Open Connect</a>
					</h1>
				</div>
			</div>
		</nav>
	</header>
	<!-- ヘッダーはここまで -->

	<!------------------    ユーザーログイン    ------------------->

	<div class="container">
		<div class="row">
			<div class="col-sm-8 col-sm-offset-2">
				<s:property value="%{resultString}" />

				<s:form theme="simple" id="inner" class="form-horizontal"
					action="LoginAction" autocomplete="off">
					<!------------------    メールアドレス    ------------------->
					<div class="form-group">
						<label class="col-sm-3">メールアドレス</label>
						<s:textfield class="col-sm-5" name="email"  value="" placeholder="example@example.com" />
					</div>

					<!------------------    パスワード    ------------------->
					<div class="form-group">
						<label class="col-sm-3">パスワード</label>
						<s:password class="col-sm-5" name="password" value="" />
					</div>
					<div class="form-group">

						<s:textfield type="hidden" name="userFlg" value="userFlg" />
					</div>
					<!------------------    ログイン情報を送信    ------------------->
					<div class="form-group">
						<div>
							<s:submit type="submit" value="ログイン" />

						</div>
					</div>
				</s:form>
			</div>
		</div>
	</div>
</body>
</html>