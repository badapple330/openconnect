<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">.errorMessage {color: red;}</style>
<title>FootPrinter</title>
<jsp:include page="base/base.jsp" flush="true" />
</head>
<body>
	<jsp:include page="base/header.jsp" flush="true" />
	<div class="conntainer-fluid">
		<div class="row">
			<div class="col-xs-5 col-xs-offset-3">
				<form action="sign-up-confirm">
					<table class="table table-condensed">
						<tr>
							<th colspan="3"><s:text name = "lang.sign-up.Initial" /></th>
						</tr>
						<tr>
							<td align="center" width="100"><s:text name = "lang.sign-up.mail" /></td>
							<td colspan="2" class="errmsg"><s:property value="getErrorMsg()" />
							<s:fielderror cssClass="errmsg" ><s:param value="%{'email'}" /></s:fielderror><s:textfield name="email"
									cssClass="form-control" placeholder="example@gmail.com" />
						</tr>
						<tr>
							<td align="center" width="100"><s:text name = "lang.sign-up.pass" /></td>
							<td colspan="2"><s:fielderror cssClass="errmsg"><s:param value="%{'pass'}" /></s:fielderror><s:password name="pass" maxlength="12" cssClass="form-control"
									placeholder="%{getText('lang.sign-up.checkpass')}" /></td>
						</tr>
						<tr>

							<td align="center" width="100"><s:text name = "lang.sign-up.name" /></td>
							<td><s:fielderror cssClass="errmsg"><s:param value="%{'name'}" /></s:fielderror><s:textfield name="name" cssClass="form-control"
									placeholder="%{getText('lang.sign-up.examplename')}"/></td>
						</tr>
						<tr>
							<td align="center" width="100"><s:text name = "lang.sign-up.namekana" /></td>
							<td><s:fielderror cssClass="errmsg"><s:param value="%{'kana'}" /></s:fielderror><s:textfield name="kana" cssClass="form-control"
									placeholder="%{getText('lang.sign-up.examplenamekana')}" /></td>
						</tr>

						<tr>
							<td align="center" width="100"><s:text name = "lang.sign-up.tel" /></td>
							<td><s:fielderror cssClass="errmsg"><s:param value="%{'tel'}" /></s:fielderror><s:textfield name="tel" maxlength="11" cssClass="form-control"
									placeholder="%{getText('lang.sign-up.exampletel')}"/></td>

						</tr>
						<tr>
							<td colspan="3"></td>
						</tr>
					</table>
					<table class="table2">
						<tr>
							<th><s:url id="url" action="main" />
								<s:a href="%{url}" cssClass="btn btn-primary btn-block"><s:text name="lang.payment-confirm.back" /></s:a></th>
							<th><s:submit name="sign-up-comfirm"
								cssClass="btn btn-primary btn-block" value="%{getText('lang.sign-up.confirm')}" /></th>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
	<jsp:include page="base/footer.jsp" flush="true" />
</body>
</html>