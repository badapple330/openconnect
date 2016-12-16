
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" href="logo/oc.png">
<link rel="apple-touch-icon" href="logo/oc.png">
<title>Open Connect</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<script src="js/bootstrap.js"></script>
</head>
<body>
  <jsp:include page="header.jsp" />
    <div class="container">
      <h1 class="page-header">アプリ一覧</h1>
	  <s:iterator value="siteInfoList">
          <ul>
            <s:a href="%{siteUrl}">
              <h1><s:property value="siteName" /></h1>
            </s:a>
          </ul>
      </s:iterator>
      <s:property value="notLoginMsg" />
	</div>
	<!-- 勤怠管理サイト -->
<!-- 	<div class="container"> -->
<!-- 		<h1 class="page-header">勤怠管理</h1> -->
<%-- 		<s:if test="notLoginMsg != null"> --%>
<%-- 			<s:property value="notLoginMsg"></s:property> --%>
<%-- 		</s:if> --%>
<%-- 		<s:else> --%>
<!-- 			<ul> -->
<%-- 				<s:a href="GoKintaiChooseAction">勤怠管理を行う方はこちらへ</s:a> --%>
<!-- 			</ul> -->
<%-- 		</s:else> --%>
<!-- 	</div> -->
</body>
</html>