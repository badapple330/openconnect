<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FootPrinter</title>
<jsp:include page="base/base.jsp" flush="true" />
</head>
<body>
	<jsp:include page="base/header.jsp" flush="true" />

	<br>
	<br>
	<div class="conntainer-fluid">
		<div class="row">
			<div class="col-xs-5 col-xs-offset-3">
				<s:form action="payment-registration">
					<table class="table">
						<tr>
							<th colspan="4"><s:text name="lang.payment-confirm.checkPaymentInformation" /></th>
						</tr>
						<tr>
							<td><s:text name="lang.payment-confirm.postalCode" /></td>
							<td><s:property value="#session.postalCode" /></td>
						</tr>
						<tr>
							<td><s:text name="lang.payment-confirm.address" /></td>
							<td><s:property value="#session.address" /></td> 
						</tr>
						<tr>
							<td><s:text name="lang.payment-confirm.creditCardNumber" /></td>
							<td>********<s:property value="creditNum4" /></td>
							
						</tr>
						<tr>
							<td><s:text name="lang.payment-confirm.expirationDate" /></td>
							<td><s:property value="expiredDate" /></td>

						</tr>
						<tr>
							<td colspan="3"></td>
						</tr>
					</table>
					<table class="table2">
						<tr>
							<td>
								<s:url var="purchaseConfirm" action="purchase-confirm?tourId=%{#session.tourId}" />
								<s:a href="%{purchaseConfirm}" cssClass="btn btn-primary btn-block"><s:text name="lang.purchase-confirm.back" /></s:a>
							</td>
							<td><s:submit cssClass="btn btn-primary btn-block"
									value="%{getText('lang.payment-confirm.RegistrationConfirmed')}" /></td>
						</tr>
					</table>
				</s:form>
				<br> <br>

			</div>
		</div>
	</div>
	<jsp:include page="base/footer.jsp" flush="true" />
</body>
</html>