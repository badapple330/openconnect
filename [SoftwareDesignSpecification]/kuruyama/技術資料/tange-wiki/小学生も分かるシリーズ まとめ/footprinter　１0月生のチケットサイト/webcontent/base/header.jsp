<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<header class="jumbotron">
	<div class="container">
	    <s:url var="main" action="main" />
		<h1><s:a href="%{main}" cssClass="title-name" style="color:yellow;text-decoration:none">Foot Printer</s:a></h1>
		<div class="title">
		<p>~<s:text name="lang.header.subtitle"/>~</p>
		</div>
		<p>
		    <s:if test="#session.loginId == null">
		    <s:url var="signUp" action="sign-up" />
			    <s:url var="login" action="login" />
			    <s:a href="%{signUp}" cssClass="btn btn-lg midashi-btn"><s:text name = "lang.header.Singup" /> &raquo;</s:a>
			    <s:a href="%{login}" cssClass="btn btn-lg midashi-btn">Login &raquo;</s:a>
		    </s:if>
		    <s:else>
		        <p><s:property value="#session.userName"/>さん</p>
		        <s:url id="logout" action="logout" />
                <s:a href="%{logout}" cssClass="btn btn-lg midashi-btn">Logout &raquo;</s:a>
            </s:else>
		</p>
	</div>

</header>