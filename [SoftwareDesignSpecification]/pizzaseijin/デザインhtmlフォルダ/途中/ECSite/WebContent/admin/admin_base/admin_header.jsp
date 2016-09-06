<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<header>
  <div class="container">
    <div class="row">
    	<div class="header-left">
      		<img class="logo" src="../img/logo.png">
    	</div>
    </div>
<!--<s:if test="#session.admin_loginId != null"> </s:if> -->
    <s:if test="true">
    	<div class="row">
    		<div class="col-md-offset-8">
    			<a href="admin_login.jsp"><input type="button" class="btn btn-danger" value="ログアウト"></a><br><br>
    		</div>
    	</div>
    </s:if>
  </div>
</header>