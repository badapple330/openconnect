<%@page import="com.internousdev.kinnosawa.dto.GoCartDTO"%>
<%@page import="com.internousdev.kinnosawa.dao.GoCartDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.apache.struts2.interceptor.SessionAware" %>
<%@page import="com.opensymphony.xwork2.ActionSupport" %>
<%@page import="java.util.Map"%>
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
<title><s:text name="side_bar.title" /></title>
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
<div class="sidebar">
	<div class="text-center">

<s:if test="%{#session.userId == null}">
	<h4 class="error" style="font-weight:bold"><s:property value="errorMessage" /></h4>
	<h3 class="sideMenu"><s:text name="side_bar.sns" /></h3>

	<s:url var="facebook" action="login-facebook" />
	<s:a href="%{facebook}" cssClass="bttn facebook">
		<span class="fa fa-facebook"></span>
	</s:a>

	<s:url var="twitter" action="login-twitter" />
	<s:a href="%{twitter}" cssClass="bttn twitter">
		<span class="fa fa-twitter"></span>
	</s:a>

	<s:url var="google" action="login-google" />
	<s:a href="%{google}" cssClass="bttn google"><span class="fa fa-google-plus"></span>
	</s:a>

	<h3 class="sideMenu"><s:text name="side_bar.SignInOrUp" /></h3>
	<input type="button" value="<s:text name="side_bar.SignUp" />" class="btn btn-info" style="margin-bottom:10px; width:80%" onclick="location.href='GoSignUpAction'"><br>
	<button type="button" class="btn btn-primary sm" data-toggle="modal" data-target="#sampleModal" style="width: 80%" ><s:text name="side_bar.SignIn" /></button>

 <div class="modal fade" id="sampleModal" tabindex="-1">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<div class="text-center" >
					<h3 style="font-weight:bold"><s:text name="side_bar.SignInForModal" /></h3>
				</div>
			</div>

			<div class="modal-body">
				<button type="button" class="close" data-dismiss="modal"><span>×</span></button>
				<div class="text-center">
					<s:form action="GoLoginAction" method="post">

					<div class="left">
						<s:label><s:text name="side_bar.ModalEmail" /></s:label><br>
						<s:textfield name="email" placeholder="%{getText('side_bar.ModalEmailForm')}" /><br>
						<s:label><s:text name="side_bar.ModalPassword" /></s:label><br>
						<s:password name="password" placeholder="%{getText('side_bar.ModalPasswordForm')}" />
					</div>

					<hr>
					<p style="font-weight:bold"><s:submit value="%{getText('side_bar.ModalLoginButton')}" cssClass="btn btn-primary" cssstyle="height:35px" /></p>
					<button type="button" class="btn btn-default" data-dismiss="modal" style="font-weight:bold"><s:text name="side_bar.ModalBack" /></button>
					</s:form>
				</div>
			</div>
		</div>
	</div>
</div>

</s:if>
<s:else>
	<h3 class="sideMenu"><s:text name="side_bar.BeLoggingIn" /></h3>
		<s:a href ="MyPageAction"><input type="button" value="<s:text name="side_bar.MyPage" />" class="btn btn-success" style="margin-bottom:10px; width:80%"></s:a><br>
		<s:a href="GoLogoutAction"><input type="button" value="<s:text name="side_bar.LogOut" />" class="btn btn-info" style="margin-bottom:10px; width:80%"></s:a>
</s:else>
	</div>
<!-- カート -->
<h3 class="sideMenu"><s:text name="side_bar.Cart" /></h3>
	<%
 		ArrayList<GoCartDTO> list = new ArrayList<GoCartDTO>();
		ActionSupport as = new ActionSupport();

		try{
			int userId = (int)(session.getAttribute("userId"));
			GoCartDAO dao = new GoCartDAO();

			if(dao.select(userId)){
				list = dao.getList();
			}

			if(list.size()>0){

				int i = 0;
				int countNumber = 0;
				int countPrice =0;

				for(i=1;i<=list.size();i++){
					countNumber =countNumber + list.get(i-1).getCount();
				}

				for(i=1;i<=list.size();i++){
					countPrice =countPrice + list.get(i-1).getCountPrice();
				}

				int tax =(int)(countPrice*0.08);
				String jsp2 = as.getText("side_bar.CartText1")
							+"<br>"
							+"<div class=\"text-right\">"
							+"<b>"
							+countNumber
							+as.getText("side_bar.CartItem")
							+"</b>"
							+"</div>"
							+"<br>"
							+"<div class=\"text-left\">"
							+ as.getText("side_bar.CartText2")
							+"<br>"
							+"</div>"
							+"<div class=\"text-right\">"
							+"("
							+as.getText("side_bar.CartText3")
							+" "
							+countPrice
							+as.getText("side_bar.CartSumUp")
							+")"
							+"<br>"
							+"("
							+as.getText("side_bar.CartText4")
							+" "
							+tax
							+as.getText("side_bar.CartSumUp")
							+")"
							+"<br>"
							+" ＝ "
							+"<b>"
							+(tax+countPrice)
							+as.getText("side_bar.CartSumUp")
							+"</b>"
							+"</div>"
							+"<br>"
							+"<div class=\"text-jutify\">"
							+"<b>"
							+"※"
							+as.getText("side_bar.CartCaution")
							+"</b>"
							+"</div>"
							+"<br>";
							out.println(jsp2);
			}

		}catch(NullPointerException e){
			e.printStackTrace();
		}
	%>
	<div class="text-center">
		<a href="GoCartAction" class="btn btn-success" style="width:80%; margin-top:5px;"><s:text name="side_bar.GoToCart" /></a>
	</div>
<!-- カート終わり -->

	<!-- カテゴリー、イチオシのフォーム -->
	<h3 class="sideMenu"><s:text name="side_bar.Category" /></h3>
	<form name="formGebe1" action="GoItemAction" method="post">
		<input type="hidden" name="category" value="焼き菓子"/>
	</form>
	<form name="formGebe2" action="GoItemAction" method="post">
		<input type="hidden" name="category" value="まんじゅう"/>
	</form>
	<form name="formGebe3" action="GoItemAction" method="post">
		<input type="hidden" name="category" value="餅菓子"/>
	</form>
	<form name="formGebe4" action="GoItemAction" method="post">
		<input type="hidden" name="category" value="ようかん"/>
	</form>
	<form name="formGebe5" action="GoItemAction" method="post">
		<input type="hidden" name="category" value="その他"/>
	</form>
	<form name="formGebe6" action="GoItemAction" method="post">
		<input type="hidden" name="category" value="金沢のイチオシ一覧"/>
	</form>
    <!-- カテゴリー、イチオシのフォーム終わり -->

 	<!-- カテゴリー -->
	<ul class="categoryList">
		<li><a href="javascript:document.formGebe1.submit()"><s:text name="%{getText('side_bar.Yakigashi')}"/></a></li>
		<li><a href="javascript:document.formGebe2.submit()"><s:text name="%{getText('side_bar.Manju')}"/></a></li>
		<li><a href="javascript:document.formGebe3.submit()"><s:text name="%{getText('side_bar.Motigashi')}"/></a></li>
		<li><a href="javascript:document.formGebe4.submit()"><s:text name="%{getText('side_bar.Yokan')}"/></a></li>
		<li><a href="javascript:document.formGebe5.submit()"><s:text name="%{getText('side_bar.Etc')}"/></a></li>
	</ul>
	<!-- カテゴリー終わり -->

	<!-- イチオシ -->
	<h3  class="sideMenu"><s:text name="side_bar.PopularSweets" /></h3>
	<a href="javascript:document.formGebe6.submit()"><h4><s:text name="side_bar.List" /></h4></a>
	<!-- イチオシ終わり -->

	<h3 class="sideMenu"><s:text name="side_bar.Tel1" /></h3>
	<s:text name="side_bar.Tel2" /><br>
	<b><s:text name="side_bar.Tel3" /></b>
	<h3 class="sideMenu"><s:text name="side_bar.send1" /></h3>
	<s:text name="side_bar.send2" /><br>
	<s:text name="side_bar.send3" /><br>
	<a href="http://www.post.japanpost.jp/int/charge/list/ems_all.html" target="blank"><s:text name="side_bar.send4" /></a>
	<hr>
	<img src="images/kaigai.jpg" style="width:100%">

</div>
</body>
</html>