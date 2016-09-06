<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><s:text name="admin_purchase_detail.purchaseDetail" /></title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/bootstrap.js"></script>
</head>
<body class="bodyBack">
      <jsp:include page="admin_header.jsp"/>
      <div class="container" style="width:1170px;">
        <div class="adminBody">
            <h2><s:text name="admin_purchase_detail.purchaseDetailScreen" /></h2>
            <br>
            <br>
                  <div class="h2 text-center text-danger"><s:actionmessage style="list-style:none;"/></div>
            <table class="table" style="width:100%; background-color:white;">
                <tbody>
                    <tr>
                        <th><s:text name="admin_purchase_detail.orderNumber" /></th>
                        <td><s:property value="orderNumber"/></td>
                    </tr>
                    <tr>
                        <th><s:text name="admin_purchase_detail.userName" /></th>
                        <td><s:property value="userName"/></td>
                    </tr>
                    <tr>
                        <th><s:text name="admin_purchase_detail.address" /></th>
                        <td><s:property value="address"/></td>
                    </tr>
                    <tr>
                        <th><s:text name="admin_purchase_detail.telNumber" /></th>
                        <td><s:property value="telNumber"/></td>
                    </tr>
                    <tr>
                        <th><s:text name="admin_purchase_detail.mail" /></th>
                        <td><s:property value="mail"/></td>
                    </tr>
                    <tr>
                        <th><s:text name="admin_purchase_detail.orderItem" /></th>
                          <td>
  						<s:iterator value="goodsList">
                        <s:property value="goodsName"/>：<s:property value="buyNumber"/><br>
                        </s:iterator>
                           </td>
                    </tr>
                    <tr>
                        <th><s:text name="admin_purchase_detail.buyDate" /></th>
                        <td><s:property value="buyDate"/></td>
                    </tr>
                </tbody>
            </table>
            <div class="text-center">
               <s:submit value="%{getText('admin_purchase_detail.back')}" onClick="history.back()"/>
            </div>
            <br>
        </div>
        <div class="adminFooter">
        </div>
    </div>
</body>
</html>