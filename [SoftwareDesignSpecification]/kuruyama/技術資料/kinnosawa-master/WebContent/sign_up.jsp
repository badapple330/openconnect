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
<title><s:text name="sign_up.title"/></title>

<!-- Bootstrap -->
<link rel="stylesheet" href="css/bootstrap.css">

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/kojin_jquery.js"></script>
<script src="http://ajaxzip3.googlecode.com/svn/trunk/ajaxzip3/ajaxzip3.js" charset="UTF-8"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<!--<script src="js/bootstrap.js"></script> -->
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
	<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
<![endif]-->
<style>
.red{
color:red;
}
</style>
</head>
<body background="images/washi.jpg">
	<jsp:include page="header.jsp"/>
<div class="container" style="width:1170px;">
	<div class="signUp">
		<div class="text-center">
			<h2 class="sideMenu"><s:text name="sign_up.title"/></h2>
			<br>
				<h3><s:text name="sign_up.atten"/></h3>
				<h4><s:text name="sign_up.atten2"/></h4>
				<br>
			<s:form action="SignUpConfirmationAction">
				<div class="left">

					<label><s:text name="sign_up.name"/></label>
					<br>
					<s:textfield  name="name" placeholder="%{getText('sign_up_place.name')}" cssStyle="width:200px"/>
					<p><s:fielderror cssClass="red" cssStyle="list-style-type:none"><s:param value="%{'name'}"/></s:fielderror></p>
					<label><s:text name="sign_up.nameKana"/></label>
					<br>
					<s:textfield name="nameKana" placeholder="%{getText('sign_up_place.nameKana')}" style="width:200px"/>
					<p><s:fielderror cssClass="red" cssStyle="list-style-type:none"><s:param value="%{'nameKana'}" /></s:fielderror></p>
					<label><s:text name="sign_up.tellNum"/></label>
					<br>
					<s:textfield  name="tellNum" placeholder="%{getText('sign_up_place.tellNum')}" cssStyle="width:200px"/>
					<p><s:fielderror cssClass="red" cssStyle="list-style-type:none"><s:param value="%{'tellNum'}" /></s:fielderror></p>
					<label><s:text name="sign_up.email"/></label>
					<br>
					<s:textfield name="email" placeholder="%{getText('sign_up_place.email')}" cssStyle="width:300px"/>
					<p class="red">
						<s:property value="errorEmail"/>
						<s:fielderror cssClass="red" cssStyle="list-style-type:none"><s:param value="%{'email'}"></s:param></s:fielderror>
					</p>
					<label><s:text name="sign_up_again.email"/></label>
					<br>
					<s:textfield name="checkEmail" placeholder="%{getText('sign_up_place_again.email')}" cssStyle="width:300px"/>
					<p><s:fielderror cssClass="red" cssStyle="list-style-type:none"><s:param value="%{'checkEmail'}"></s:param></s:fielderror></p>
					<label><s:text name="sign_up.pass"/></label>
					<br>
					<s:password name="password" placeholder="%{getText('sign_up_place.pass')}" style="width:200px" cssClass="password" />
					<p><s:fielderror cssClass="red" cssStyle="list-style-type:none"><s:param value="%{'password'}"></s:param></s:fielderror></p>
					<label><s:text name="sign_up_again.pass"/></label>
					<br>
					<s:password name="checkPassword" placeholder="%{getText('sign_up_place.pass')}" cssStyle="width:200px" cssClass="password"/>
					<p><s:fielderror cssClass="red" cssStyle="list-style-type:none"><s:param value="%{'checkPassword'}"></s:param></s:fielderror></p>
					<input type="checkbox" id="passcheck"><s:text name="sign_up_show.pass"/>
					<br>
					<br>
					<label><s:text name="sign_up.postal"/></label>
					<br>
					<s:text name="sign_up.postalSym"/><s:textfield name="postalCode" placeholder="%{getText('sign_up_place.postal')}" maxlength="7" onKeyUp="AjaxZip3.zip2addr(this,'','addressPrefecture','addressCity','addressOther');"/>
					<p><s:fielderror cssClass="red" cssStyle="list-style-type:none"><s:param value="%{'postalCode'}"></s:param></s:fielderror></p>
					<label><s:text name="sign_up.Prefecture"/></label>
					<br>
						<select name="addressPrefecture" id="select">
						<option value="北海道"><s:text name = "sign_up.Hokkaido"/></option>
						<option value="青森県"><s:text name = "sign_up.Aomori"/></option>
						<option value="岩手県"><s:text name = "sign_up.Iwate"/></option>
						<option value="宮城県"><s:text name = "sign_up.Miyagi"/></option>
						<option value="秋田県"><s:text name = "sign_up.Akita"/></option>
						<option value="山形県"><s:text name = "sign_up.Yamagata"/></option>
						<option value="福島県"><s:text name = "sign_up.Fukushima"/></option>
						<option value="茨城県"><s:text name = "sign_up.Ibaraki"/></option>
						<option value="栃木県"><s:text name = "sign_up.Tochigi"/></option>
						<option value="群馬県"><s:text name = "sign_up.Gunma"/></option>
						<option value="埼玉県"><s:text name = "sign_up.Saitama"/></option>
						<option value="千葉県"><s:text name = "sign_up.Chiba"/></option>
						<option value="東京都" selected><s:text name = "sign_up.Tokyo"/></option>
						<option value="神奈川県"><s:text name = "sign_up.Kanagawa"/></option>
						<option value="新潟県"><s:text name = "sign_up.Niigata"/></option>
						<option value="富山県"><s:text name = "sign_up.Toyama"/></option>
						<option value="石川県"><s:text name = "sign_up.Ishikawa"/></option>
						<option value="福井県"><s:text name = "sign_up.Fukui"/></option>
						<option value="山梨県"><s:text name = "sign_up.Yamanashi"/></option>
						<option value="長野県"><s:text name = "sign_up.Nagano"/></option>
						<option value="岐阜県"><s:text name = "sign_up.Gifu"/></option>
						<option value="静岡県"><s:text name = "sign_up.Shizuoka"/></option>
						<option value="愛知県"><s:text name = "sign_up.Aichi"/></option>
						<option value="三重県"><s:text name = "sign_up.Mie"/></option>
						<option value="滋賀県"><s:text name = "sign_up.Shiga"/></option>
						<option value="京都府"><s:text name = "sign_up.Kyoto"/></option>
						<option value="大阪府"><s:text name = "sign_up.Osaka"/></option>
						<option value="兵庫県"><s:text name = "sign_up.Hyogo"/></option>
						<option value="奈良県"><s:text name = "sign_up.Nara"/></option>
						<option value="和歌山県"><s:text name = "sign_up.Wakayama"/></option>
						<option value="鳥取県"><s:text name = "sign_up.Tottori"/></option>
						<option value="島根県"><s:text name = "sign_up.Shimane"/></option>
						<option value="岡山県"><s:text name = "sign_up.Okayama"/></option>
						<option value="広島県"><s:text name = "sign_up.Hiroshima"/></option>
						<option value="山口県"><s:text name = "sign_up.Yamaguchi"/></option>
						<option value="徳島県"><s:text name = "sign_up.Tokushima"/></option>
						<option value="香川県"><s:text name = "sign_up.Kagawa"/></option>
						<option value="愛媛県"><s:text name = "sign_up.Ehime"/></option>
						<option value="高知県"><s:text name = "sign_up.Kochi"/></option>
						<option value="福岡県"><s:text name = "sign_up.Fukuoka"/></option>
						<option value="佐賀県"><s:text name = "sign_up.Saga"/></option>
						<option value="長崎県"><s:text name = "sign_up.Nagasaki"/></option>
						<option value="熊本県"><s:text name = "sign_up.Kumamoto"/></option>
						<option value="大分県"><s:text name = "sign_up.Oita"/></option>
						<option value="宮崎県"><s:text name = "sign_up.Miyazaki"/></option>
						<option value="鹿児島県"><s:text name = "sign_up.Kagoshima"/></option>
						<option value="沖縄県"><s:text name = "sign_up.Okinawa"/></option>
						<option value="%{getText('sign_up.other')}"><s:text name="sign_up.other"/></option>
						</select>
					<br>
					<br>
					<label><s:text name="sign_up.addressCity"/></label>
					<br>
					<s:textfield name="addressCity" placeholder="%{getText('sign_up.place.addressCity')}" cssStyle="width:300px;"/>
					<p><s:fielderror cssClass="red" cssStyle="list-style-type:none"><s:param value="%{'addressCity'}"></s:param></s:fielderror></p>
					<label><s:text name="sign_up.addressOther"/></label>
					<br>
					<s:textfield name="addressOther" placeholder="%{getText('sign_up_place.addressOther')} " cssStyle="width:300px;"/>
					<p><s:fielderror cssClass="red" cssStyle="list-style-type:none"><s:param value="%{'addressOther'}"></s:param></s:fielderror></p>
				</div>
				<br>
				<br>
				<h4 style="font-weight:bold"><s:text name="sign_up.agree"/></h4>
				<h5 style="font-weight:bold"><s:text name="sign_up.card"/></h5>
				<s:a href="GoAgreementAciton" target="_blank" cssStyle="font-weight:bold"><s:text name="sign_up.agreement"/></s:a>
				<br>
				<br>
				<s:submit cssClass="btn btn-success" value="%{getText('sign_up.regster')}"/>
			</s:form>
			<br>
			<s:a href="GoTopPageAction"><s:text name="sign_up.back"/></s:a>
		</div>
		<br>
	</div>
</div>
	<jsp:include page="footer.jsp"/>
<script src="js/show-pass.js"></script>
</body>
</html>