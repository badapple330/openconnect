<%@page
	import="com.internousdev.footprinter.action.PurchaseConfirmAction"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FootPrinter</title>
<jsp:include page="base/base.jsp" flush="true" />
<style>
h4 {
	color: red;
}
</style>
</head>
<body>
	<jsp:include page="base/header.jsp" flush="true" />
	<br>
	<br>
	<div class="conntainer-fluid">
		<div class="row">
			<div class="col-xs-5 col-xs-offset-3">
				<table class="table">
					<tr>
						<th colspan="4"><s:text name="lang.purchase-confirm.purchaseTicketInformation" /></th>
					</tr>
					<tr>
						<td><s:text name="lang.purchase-confirm.title" /></td>
						<td><s:property value="eventName"></s:property></td>
					</tr>
					<tr>
						<td><s:text name="lang.purchase-confirm.paymentAmount" /></td>
						<td><s:property value="price"></s:property></td>
					</tr>
					<tr>
						<td><s:text name="lang.purchase-confirm.dateAndTime" /></td>
						<td><s:property value="eventDate"></s:property></td>
						
					</tr>
				</table>
				<s:if test="%{paymentFlag}">
				<!-- クレカ情報があるときに見せる画面 -->
				<table class="table">
				
					<tr>
						<th colspan="4"><s:text name="lang.purchase-confirm.customerCard" /></th>
					</tr>
					<tr>
						<td align="left" width="100"><s:text name="lang.purchase-confirm.postalCode" /></td>
						<td colspan="3"><s:property value="postalCode" /></td>
					</tr>
					<tr>
						<td align="left" width="100"><s:text name="lang.purchase-confirm.address" /></td>
						<td colspan="3"><s:property value="address" /></td>
						
					</tr>
					<tr>
						<td align="left" width="100"><s:text name="lang.purchase-confirm.creditCardNumber" /></td>
						<td colspan="3">********<s:property value="#session.creditNum4" /></td>
					</tr>
					<tr>
						<td>
							<s:url var="goTourDetail" action="tour-detail?tourId=%{#session.tourId}" />
							<s:a href="%{goTourDetail}" cssClass="btn btn-primary btn-block"><s:text name="lang.purchase-confirm.back" /></s:a>
						</td>
						<td></td>
						<td><s:form action="purchase-registration">
								<s:submit cssClass="btn btn-primary btn-block" value="%{getText('lang.purchase-confirm.confirm')}" />
							</s:form></td>
					</tr>
				</table>
				</s:if>
				<s:else>
				<!-- クレカ情報がないときに見せる画面 -->
				<form action="payment-confirm">
				<table class="table">
					<tr>
						<td colspan="3"><h4><s:text name="lang.purchase-confirm.firstRegistration" /></h4></td>
						<td colspan="3"><h4></h4></td>
					</tr>
					<tr>
						<th colspan="3"><s:text name="lang.purchase-confirm.cardInformation" /></th>
					</tr>
					<tr>
						<td align="center" width="100"><s:text name="lang.purchase-confirm.postalCode" /></td>
						<td colspan="2">
						<s:fielderror cssClass="errmsg"><s:param>postalCode</s:param></s:fielderror>
							<s:textfield name="postalCode" cssClass="form-control" placeholder="%{getText('lang.purchase-confirm.inputPostalCodePlaceHolder')}">
							</s:textfield>
						</td>
					</tr>
					<tr>
						<td align="center" width="100"><s:text name="lang.purchase-confirm.address" /></td>
						<td colspan="2">
						<s:fielderror cssClass="errmsg"><s:param>address</s:param></s:fielderror>
								<s:textfield name="address"
								cssClass="form-control" placeholder="%{getText('lang.purchase-confirm.inputAddressPlaceHolder')}" /></td>
						<td></td>
					</tr>
					<tr>
						<td align="center" width="100"><s:text name="lang.purchase-confirm.creditCardNumber" /></td>
						<td colspan="2"><div class="errmsg"><s:property value ="errorMsg"/></div>
						<s:fielderror cssClass="errmsg"><s:param>creditNum</s:param></s:fielderror>
						<s:textfield name="creditNum"
								cssClass="form-control" placeholder="%{getText('lang.purchase-confirm.withoutAPyphenPlaceHolder')}" /></td>
					</tr>
					<tr>
						<td align="center" width="100"><s:text name="lang.purchase-confirm.expirationDate" /></td>
						<td><s:fielderror cssClass="errmsg"><s:param>expirationMonth</s:param></s:fielderror><s:textfield name="expirationMonth" cssClass="form-control"
								placeholder="%{getText('lang.purchase-confirm.monthPlaceHolder')}" /></td>
						<td><s:fielderror cssClass="errmsg"><s:param>expirationYear</s:param></s:fielderror><s:textfield name="expirationYear" cssClass="form-control"
								placeholder="%{getText('lang.purchase-confirm.yearPlaceHolder')}" /></td>
					</tr>
					<tr>
						<td><s:text name="lang.purchase-confirm.securityCode" /></td>
						<td><s:fielderror cssClass="errmsg"><s:param>securityCode</s:param></s:fielderror><s:textfield name="securityCode" cssClass="form-control"
								placeholder = "%{getText('lang.purchase-confirm.securityCodePlaceHolder')}" /></td>
						<td></td>
					</tr>

					<tr>
						<td>
							<s:url var="goTourDetail" action="tour-detail?tourId=%{#session.tourId}" />
							<s:a href="%{goTourDetail}" cssClass="btn btn-primary btn-block"><s:text name="lang.purchase-confirm.back" /></s:a>
						</td>
						<td><s:submit name="payment-confirm"
									cssClass="btn btn-primary btn-block" value="%{getText('lang.purchase-confirm.next')}" /></td>
					</tr>
				</table>
				</form>
				</s:else>
				<br> <br>

			</div>
		</div>
	</div>

	<jsp:include page="base/footer.jsp" flush="true" />
</body>
</html>