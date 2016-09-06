<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<header>
  <div class="container">
    <div class="row">
    	<div class="header-left">
      		<img class="logo" src="img/logo.png">
    	</div>
    </div>
    <s:if test="#session.adminFlag == false">
    	<div class="row">
    		<div class="col-md-offset-8">
    			<s:form action="admin_logout">
    				<s:submit class="btn btn-danger" value="ログアウト" /><br><br>
    			</s:form>
    		</div>
    	</div>
    </s:if>
  </div>
</header>