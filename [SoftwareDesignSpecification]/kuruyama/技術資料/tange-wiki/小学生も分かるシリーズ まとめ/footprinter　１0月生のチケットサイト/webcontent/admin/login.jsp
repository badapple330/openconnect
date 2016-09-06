<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html">
<html lang="ja">
<head>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>FootPrinter</title>
    <jsp:include page="base/base.jsp" flush="true" />
    <style type="text/css">
	<!--
	.errorMessage {
	    color: red;
	    margin-bottom:10px ;
	}
	-->
	</style>
<body>
        <jsp:include page="base/header.jsp" flush="true" />
        <div class="conntainer-fluid">
        <div class="row">
            <div class="col-xs-5 col-xs-offset-3">
                <s:form action="admin-login-action">
                    <div class="errorMessage">
                        <s:property value="errorMsg"></s:property>
                    </div>
	                <table class="table">
	                    <tr>
	                        <th colspan="3">管理者ログイン</th>
	                    </tr>
	                    <tr>
	                        <td align="center" width="100">ID</td>
	                        <td colspan="2">
	                            <s:textfield cssClass="form-control" name="adminId" placeholder="ログインID入力" />
	                        </td>
	                    </tr>
	                    <tr>
	                        <td align="center" width="100">Password</td>
	                        <td colspan="2"><s:password cssClass="form-control" name="password" placeholder="パスワード入力" />
	                    </tr>
	                    <tr>
	                        <td colspan="3"></td>
	                    </tr>
	                </table>
	                <s:fielderror fieldName="%{getText('error.main')}" cssClass="errmsg" />
	                <s:fielderror fieldName="password" cssClass="errmsg" />
	                <div class="form-group">
                        <s:submit value="ログイン" cssClass="btn btn-primary" />
                    </div>
                </s:form>
            </div>
        </div>
    </div>
    <jsp:include page="base/footer.jsp" flush="true" />
</body>
</html>