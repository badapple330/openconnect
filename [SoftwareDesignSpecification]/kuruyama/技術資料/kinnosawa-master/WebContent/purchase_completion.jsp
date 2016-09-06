<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><s:text name="purchase_completion.title"/></title>

<!-- Bootstrap -->
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-1.11.3.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.js"></script>
<script src="js/browser.js"></script>
<script src="js/jump-pages.js"></script>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body background="images/washi.jpg">
 <jsp:include page="header.jsp"/>
    <div class="container" style="width:1170px;">
		<jsp:include page="side_bar.jsp"/>

            <div class="purchaseBack" style="font-weight:bold;">
                <br>
                <div class="purchaseSlip"style="font-weight:bold;">
                    <div class="text-center">
                    <h3 class="purchaseTitle"><s:text name="purchase_completion.title"/></h3>
                    <h4><s:text name="purchase_completion.conmp"/></h4>
                    <h4><s:text name="sign_up_completion.trans"/></h4>
                    <hr>
                    <s:a href="GoTopPageAction"><s:text name="sign_up_completion.click"></s:text></s:a>
                    <br>
                    </div>
                </div>
            </div>
        </div>
     <jsp:include page="footer.jsp"/>
</body>
</html>