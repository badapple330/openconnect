<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><s:text name="admin_purchase.purchase" /></title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/pagination_style.css">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/bootstrap.js"></script>
<script src="js/jquery.pagination.js"></script>
<script src="js/kojin-jquery.js"></script>
</head>
<body class="bodyBack">
<jsp:include page="admin_header.jsp"/>
    <div class="container" style="width:1170px;">
        <div class="adminBody">
            <h2><s:text name="admin_purchase.purchaseScreen" /></h2>
            <br>
            <br>
            <div class="text-right">
                <s:form action="GoAdminPurchaseAction" method="post">
                    <s:textfield placeholder="%{getText('admin_purchase.searchInfo')}" style="width:250px" name="purchaseName" value=""/>
                    <s:submit cssClass="btn btn-default" value="%{getText('admin_purchase.search')}"/>
                </s:form>
                <div class="h2 text-center text-danger"><s:actionmessage style="list-style:none;"/></div>
            </div>
            ※ <s:text name="admin_purchase.information" />
            <div class="table-responsive">
            <table class="table table-bordered" style="width:100%; background-color:white;">
                <thead>
                        <th><s:text name="admin_purchase.orderNumber" /></th>
                        <th><s:text name="admin_purchase.userId" /></th>
                        <th><s:text name="admin_purchase.userName" /></th>
                        <th><s:text name="admin_purchase.sendAddressId" /></th>
                        <th><s:text name="admin_purchase.orderDate" /></th>
                </thead>
                <s:iterator value="purchaseList">
                <s:form method="post" action="GoAdminPurchaseDetailAction">

                <tbody class="li">
                    <tr class="text-nowrap ">
                        <td><input type="hidden" name="orderNumber" value="<s:property value="orderNumber"/>"/><s:submit cssClass ="btn-block" value="%{orderNumber}"/></td>
                        <td><s:property value="userId"/></td>
                        <td><s:property value="userName"/></td>
                        <td><s:property value="addressId"/></td>
                        <td><s:property value="buyDate"/></td>

                    </tr>
                </tbody>
                </s:form>
                </s:iterator>
            </table>
            </div>
            <div class="text-center">
                   </div>
      			<div class="text-center">
				<s:if test="purchaseList.size() > 0"><div class="pager"></div></s:if>
				<br>
			</div>
            </div>

        <div class="adminFooter">
        </div>
    </div>
</body>
</html>