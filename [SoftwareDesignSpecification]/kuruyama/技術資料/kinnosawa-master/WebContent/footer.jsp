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

        <title><s:text name = "footer.title"/></title>

        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
        <script src="js/jquery-1.11.3.min.js"></script>
        <script src="js/bootstrap.js"></script>
    </head>
    <body>
        <div class="container" style="width:1170px;">
            <div class="footer">
                <a class="footerMenu" href="GoCompanyInfoAciton"><h3><s:text name = "footer.company"/></h3></a>
                <a class="footerMenu" href="GoAgreementAciton"><h3><s:text name = "footer.service"/></h3></a>
                <div class="globalSend">
                    <h2 class="opacityCansel"><s:text name = "footer.International"/></h2>
                    <div class="text-center">
                        <div class="left">
                            <p><s:text name = "footer.shipping1"/>
                                <br><s:text name = "footer.shipping2"/>
                                <br><s:text name = "footer.shipping3"/>
                                <br>
                                <a href="mailto:aaa@aa.aa">aaa@aa.aa</a>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>