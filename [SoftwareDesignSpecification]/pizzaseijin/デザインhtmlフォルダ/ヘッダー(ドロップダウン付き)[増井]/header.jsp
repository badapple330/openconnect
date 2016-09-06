<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<script type='text/javascript' src='js/jquery-1.2.3.min.js'></script>
<script type='text/javascript' src='js/menu.js'></script>
<link rel="stylesheet" href="css/drop_down.css" type="text/css"
	media="screen" />
<header>
	<div class="container">
		<div class="row">
			<div class="header-left">
				<a href="index.jsp"><img class="logo" src="./img/logo.png"></a>
			</div>
		</div>
		<div class="row">
			<div class="col-md-offset-8">
				<ul id="drop_down">
					<li><a href="#">
							<button type="button" class="btn btn-danger">SNS</button>
					</a>
						<ul>
							<li><a href="#"><img src="img/facebook.png"
									alt="facebookアカウントでログイン" class="fb"> Facebook</a></li>
							<li><a href="#"><img src="img/google.png"
									alt="googleアカウントでログイン" class="fb"> Google </a></li>
							<li><a href="#"><img src="img/twitter.png"
									alt="twitterアカウントでログイン" class="fb"> Twitter</a></li>

							<li><a href="#"><img src="img/yahoo.png"
									alt="yahooアカウントでログイン" class="fb"> Yahoo!</a></li>

						</ul></li>
				</ul>
				<button type="button" class="btn btn-danger">ログイン</button>
				<button type="button" class="btn btn-danger">新規登録</button>
				<br> <br>
			</div>
		</div>
	</div>
</header>