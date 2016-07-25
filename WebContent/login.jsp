<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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

				<s:form theme="simple" id="inner" class="form-horizontal"
					action="LoginAction">
					<!------------------    メールアドレス    ------------------->
					<div class="form-group">
						<label class="col-sm-3">メールアドレス</label>
						<s:textfield class="col-sm-5" name="email" value="" />
					</div>

					<!------------------    パスワード    ------------------->
					<div class="form-group">
						<label class="col-sm-3">パスワード</label>
						<s:password class="col-sm-5" name="password" value="" />
					</div>
	<div class="form-group">

						<s:textfield  type="hidden" name="userFlg" value="userFlg" />
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