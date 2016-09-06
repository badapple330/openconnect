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
<title><s:text name="registration_change.title" /></title>

<!-- Bootstrap -->
<link rel="stylesheet" href="css/bootstrap.css">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-1.11.3.min.js"></script>
<script src="http://ajaxzip3.googlecode.com/svn/trunk/ajaxzip3/ajaxzip3.js" charset="UTF-8"></script>

<!-- Include all compiled plugins (below), or include individual files as needed -->
<!--<script src="js/bootstrap.js"></script> -->
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
<script src="js/show-pass.js"></script>
<script src="js/browser.js"></script>
<style type="text/css">
.errorMessage {
	color: red;
	list-style-type: none;
	font-family:'Meiryo';
	font-size:11px;
}
</style>
</head>
<body background="images/washi.jpg">
<!--↓ヘッダー↓-->
	<jsp:include page="header.jsp"/>
<!--↑ヘッダー↑-->
<div class="container" style="width:1170px;">

    <div class="signUp">
        <div class="text-center">
            <h2 class="sideMenu"><s:text name="registration_change.title" /></h2>
            <br>
            <s:form action="RegistrationChangeConfirmationAction" method="post">
				<div class="registrationChangeLeft">
					<label><s:text name="registration_change.name" /></label>
					<br>
					<s:textfield name="name" size="30" placeholder="%{getText('registration_change.required')}"/>
					<s:fielderror><s:param value="%{'name'}" /></s:fielderror>
					<p><s:text name="registration_change.nameAnnotation" /></p>

					<label><s:text name="registration_change.nameKana" /></label>
					<br>
					<s:textfield name="nameKana" size="30" placeholder="%{getText('registration_change.kana')}"/>
					<s:fielderror><s:param value="%{'nameKana'}" /></s:fielderror>
					<br>
					<label><s:text name="registration_change.telNumber" /></label>
					<br>
					<s:textfield name="telNumber" size="30" placeholder="%{getText('registration_change.requiredHalfWidthNumbers')}"/>
					<s:fielderror><s:param value="%{'telNumber'}" /></s:fielderror>
					<br>
					<label><s:text name="registration_change.nowEmail" /></label>
					<br>
					<s:textfield readonly="true" name="email" size="40" placeholder="%{getText('registration_change.noSettings')}" />
					<br>
					<s:fielderror fieldName="unsetEmailError"/>
					<label><s:text name="registration_change.newEmail" /></label>
					<br>

					<s:textfield name="newEmail" size="40" placeholder="(例)example@hoge.com"/>
					<s:fielderror fieldName="emailOverlapError"/>
					<s:fielderror><s:param value="%{'newEmail'}" /></s:fielderror>

					<br>
					<label><s:text name="registration_change.reEnterEmail" /></label>
					<br>
					<s:textfield name="confirmEmail" size="40" placeholder="%{getText('registration_change.reEnter')}"/>
					<s:fielderror><s:param value="%{'confirmEmail'}" /></s:fielderror>
					<br>
					<label><s:text name="registration_change.password" /></label>
					<br>
					<s:textfield name="password" type="password" placeholder="%{getText('registration_change.requiredAlphanumeric')}" cssClass="password"/>
					<s:fielderror><s:param value="%{'password'}" /></s:fielderror>
					<s:fielderror><s:param value="%{'confirmPassword'}" /></s:fielderror>
					<br>
					<label><s:text name="registration_change.reEnterPassword" /></label>
					<br>
					<s:textfield name="confirmPassword"  type="password" placeholder="%{getText('registration_change.reEnter')}" cssClass="password"/>
					<br>
					<input type="checkbox" id="changePassCheck"><s:text name="%{getText('registration_change.showPassword')}"/>
					<br>
					<label><s:text name="registration_change.postalCode" /></label>
					<br>
					〒<s:textfield name="postalCode" placeholder="%{getText('registration_change.requiredHalfWidthNumbers')}" onKeyUp="AjaxZip3.zip2addr(this,'','selectedPrefecture','cityName');"/>
					<s:fielderror><s:param value="%{'postalCode'}" /></s:fielderror>
					<br>
					<label><s:text name="registration_change.prefectures" /></label>
					<br>
					<s:set name="prefecturesList" value="#{'（選択必須）':'（選択必須）',
															'北海道':'北海道',
															'青森県':'青森県',
															'秋田県':'秋田県',
															'岩手県':'岩手県',
															'山形県':'山形県',
															'宮城県':'宮城県',
															'福島県':'福島県',
															'茨城県':'茨城県',
															'栃木県':'栃木県',
															'群馬県':'群馬県',
															'埼玉県':'埼玉県',
															'神奈川県':'神奈川県',
															'千葉県':'千葉県',
															'東京都':'東京都',
															'山梨県':'山梨県',
															'長野県':'長野県',
															'新潟県':'新潟県',
															'富山県':'富山県',
															'石川県':'石川県',
															'福井県':'福井県',
															'岐阜県':'岐阜県',
															'静岡県':'静岡県',
															'愛知県':'愛知県',
															'三重県':'三重県',
															'滋賀県':'滋賀県',
															'京都府':'京都府',
															'大阪府':'大阪府',
															'兵庫県':'兵庫県',
															'奈良県':'奈良県',
															'和歌山県':'和歌山県',
															'鳥取県':'鳥取県',
															'島根県':'島根県',
															'岡山県':'岡山県',
															'広島県':'広島県',
															'山口県':'山口県',
															'徳島県':'徳島県',
															'香川県':'香川県',
															'愛媛県':'愛媛県',
															'高知県':'高知県',
															'福岡県':'福岡県',
															'佐賀県':'佐賀県',
															'長崎県':'長崎県',
															'熊本県':'熊本県',
															'大分県':'大分県',
															'宮崎県':'宮崎県',
															'鹿児島県':'鹿児島県',
															'沖縄県':'沖縄県'}"/>
					<s:select list="prefecturesList" value="selectedPrefecture" name="selectedPrefecture"/>
					<s:fielderror><s:param value="%{'selectedPrefecture'}" /></s:fielderror>
					<br>
					<label><s:text name="registration_change.cityName" /></label>
					<br>
					<s:textfield name="cityName" size="50" placeholder="%{getText('registration_change.requiredCityName')}"/>
					<s:fielderror><s:param value="%{'cityName'}"/></s:fielderror>
				</div>
				<br>
				<div class="text-center">
					<s:if test="creditInput==1">
					<input type="radio" name="creditInput" value="1" id="creditInput" checked/><label for="radio1"><s:text name="registration_change.noRegistrationCard"/></label>
					<input type="radio" name="creditInput" value="2" id="creditInput" /><label for="radio2"><s:text name="registration_change.registrationCard"/></label>
					</s:if>
					<s:elseif test="creditInput==2">
					<input type="radio" name="creditInput" value="1" id="creditInput" /><label for="radio1"><s:text name="registration_change.noRegistrationCard"/></label>
					<input type="radio" name="creditInput" value="2" id="creditInput" checked/><label for="radio2"><s:text name="registration_change.registrationCard"/></label>
					</s:elseif>

					<div class="registrationChangeLeft" id="tr1">
					</div>
					<div class="registrationChangeLeft" id="tr2">
						<label><s:text name="registration_change.cardNumber" /></label>
						<br>
						<s:textfield name="creditCardNumber" size="25" placeholder="%{getText('registration_change.requiredHalfWidthNumbers')}"/>
						<s:fielderror><s:param value="%{'creditCardNumber'}"/></s:fielderror>
						<s:fielderror fieldName="cardNumberError"/>
						<br>
						<label><s:text name="registration_change.validThru" /></label>
						<br>
						<s:set name="cardMonthList" value="#{'1':'1',
															'2':'2',
															'3':'3',
															'4':'4',
															'5':'5',
															'6':'6',
															'7':'7',
															'8':'8',
															'9':'9',
															'10':'10',
															'11':'11',
															'12':'12'}"/>
						<s:select name="cardMonth" headerKey="0" headerValue="%{getText('registration_change.cardMonth')}" list="cardMonthList" value="cardMonth" />
						 /
						 <s:set name="cardYearList" value="#{'16':'16',
																'17':'17',
																'18':'18',
																'19':'19',
																'20':'20',
																'21':'21',
																'22':'22',
																'23':'23',
																'24':'24',
																'25':'25'}"/>
						 <s:select name="cardYear" headerKey="0" headerValue="%{getText('registration_change.cardYear')}" list="cardYearList" value="cardYear" />
						<s:fielderror fieldName="checkExpirationDateError"/>
						<br>
						<label><s:text name="registration_change.cardHolder" /></label>
						<br>
						<s:textfield name="creditCardHolder"  size="25" placeholder="%{getText('registration_change.requiredUppercase')}" />
						<s:fielderror><s:param value="%{'creditCardHolder'}"/></s:fielderror>
						<s:fielderror fieldName="cardHolderError"/>
						<label><s:text name="registration_change.cvv" /></label>
						<br>
						<s:textfield name="securityCode"  size="25" placeholder="%{getText('registration_change.requiredHalfWidthNumbers')}" />
						<s:fielderror><s:param value="%{'securityCode'}"/></s:fielderror>
						<s:fielderror fieldName="securityCodeError"/>
					</div>
				</div>
				<br>
				<s:submit cssClass="btn btn-success" value="%{getText('registration_change.confirmation')}"/>
				<a href="MyPageAction" class="btn btn-success"><s:text name="registration_change.back" /></a>
			</s:form>

		</div>
		<br>
	</div>

</div>
<!--↓フッター↓-->
    <jsp:include page="footer.jsp"/>
<!--↑フッター↑-->
<script src="js/registration-change-radio.js"></script>
</body>
</html>