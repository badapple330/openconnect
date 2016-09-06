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
	<div class="conntainer-fluid">
		<div class="row">
			<div class="col-xs-5 col-xs-offset-3">
				
					<table class="table">

						<tr>
							<th colspan="3"><s:text name="lang.sign-up.registrationConfirmation" /></th>
							
						</tr>
						<p><s:text name="lang.sign-up.pleasePress" /></p>
						<tr>
						
						<td align="center" width="100"><s:text name="lang.sign-up.mail" /></td>
							<td colspan="2"><s:property value="#session.email"/></td>
						</tr>
						<tr>
							<td align="center" width="100"><s:text name="lang.sign-up.pass" /></td>
							<td colspan="2"><s:property value="#session.pass" /></td>
						</tr>
						<tr>
							<td align="center" width="100"><s:text name="lang.sign-up.namekana" /></td>
							<td colspan="2"><s:property value="#session.kana" /></td>
						</tr>
						<tr>
							<td align="center" width="100"><s:text name="lang.sign-up.name" /></td>
							<td colspan="2"><s:property value="#session.name" /></td>
						</tr>
						<tr>
							<td align="center" width="100"><s:text name="lang.sign-up.tel" /></td>
							<td colspan="2"><s:property value="#session.tel" /></td>
						</tr>
					</table>
					<table class="table2">
						<tr>
							<th><input type="button" name="member"
								class="btn btn-primary btn-block" value="<s:text name="lang.purchase-confirm.back" />"
								onclick="history.back()">
							</th>
							<th>
								<s:url id="url" action="sign-up-registration" />
								<s:a href="%{url}" cssClass="btn btn-primary"><s:text name="lang.sign-up.register" /></s:a>
							</th>
						</tr>
					</table>
				
				<br> <br>
			</div>
		</div>
	</div>
	<jsp:include page="base/footer.jsp" flush="true" />
</body>
</html>