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
<title>購入確認</title>

<!-- Bootstrap -->
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-1.11.3.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.js"></script>
<script src="js/browser.js"></script>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->


</head>
<body background="images/washi.jpg">
<div class="container" style="width:1170px;">

<!--↓ヘッダー↓-->
    <jsp:include page="header.jsp"/>
<!--↑ヘッダー↑-->

    <div class="main">

<!--↓サイドバー↓-->
    <jsp:include page="side_bar.jsp"/>
<!--↑サイドバー↑-->

        <div class="purchaseDisplay">
            <div class="text-center">
                <h3 class="purchaseTitle"><s:text name="purchase_confirmation.confirmation"/></h3>

                <s:form action="PurchaseCompletionAction" method="post">
                    <div class="text-center">
                        <div class="purchaseSlip">


                                <div class="purchaseItemTable">

                                    <h4>■<s:text name="purchase_confirmation.order"/></h4>
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th><s:text name="purchase_confirmation.product"/></th>
                                                <th><div class="text-right"><s:text name="purchase_confirmation.quantity"/></div></th>
                                                <th><div class="text-right"><s:text name="purchase_confirmation.price"/></div></th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <s:iterator value="list">
                                                <tr>
                                                    <td><s:property value="GoodsName" /></td>
                                                    <td><div class="text-right"><s:property value="goodsNumber" /></div></td>
                                                    <td><div class="text-right"><s:property value="goodsSubTotal" /></div></td>
                                                </tr>
                                            </s:iterator>
                                        </tbody>
                                        <tfoot>
                                            <tr>
                                                <th><s:text name="purchase_confirmation.sub_total"/></th>
                                                <td><div class="text-right"><s:property value="subNumber" /></div></td>
                                                <td><div class="text-right"><s:property value="subTotal" /></div></td>
                                            </tr>
                                            <tr>
                                                <th><s:text name="purchase_confirmation.tax"/>（8%）</th>
                                                <td></td>
                                                <td><div class="text-right"><s:property value="tax" /></div></td>
                                            </tr>
                                            <tr>
                                                <th><s:text name="purchase_confirmation.postage"/></th>
                                                <td></td>
                                                <td><div class="text-right"><s:property value="sendPrice" /></div></td>
                                            </tr>
                                            <tr>
                                                <th><s:text name="purchase_confirmation.total"/></th>
                                                <th><div class="text-right"><s:property value="subNumber" /></div></th>
                                                <th><div class="text-right"><s:property value="totalPrice" /></div></th>
                                            </tr>
                                        </tfoot>
                                    </table>

                                </div>
                            <br>
                            <div class="">
                            <h4>■<s:text name="purchase_confirmation.adress"/></h4>
                                <div class="purchaseAddressTable">
                                    <table class="table">
                                        <tbody>
                                            <tr>
                                                <td><s:text name="purchase_confirmation.name"/>：</td>
                                                <td><s:hidden name = "userName"><s:text name="userName"></s:text></s:hidden></td>
                                            </tr>
                                             <tr>
                                                <td><s:text name="purchase_confirmation.phone"/>：</td>
                                                <td><s:hidden name = "phoneNumber"><s:text name="phoneNumber"></s:text></s:hidden></td>
                                            </tr>
                                             <tr>
                                                <td><s:text name="purchase_confirmation.postal"/>：</td>
                                                <td><s:hidden name = "postalCode"><s:text name="postalCode"></s:text></s:hidden></td>
                                            </tr>
                                             <tr>
                                                <td><s:text name="purchase_confirmation.street_address"/>：</td>
                                                <td><s:hidden name = "streetAddress"><s:text name="streetAddress"/></s:hidden></td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                        </div>

                    <div class="text-center">
                        <s:submit cssClass="btn btn-success" value="%{getText('purchase_confirmation.purchase')}"/>
                        <a href="PurchaseAction" class="btn btn-warning"><s:text name="purchase_confirmation.back"/></a>
                    </div>
                        </div>
                    </div>
                </s:form>
            </div>
        </div>

    </div>

<!--↓フッター↓-->
    <jsp:include page="footer.jsp"/>
<!--↑フッター↑-->

</div>
</body>
</html>