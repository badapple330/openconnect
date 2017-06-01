<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<link rel="shortcut icon" href="logo/oc.png">
<link rel="apple-touch-icon" href="logo/oc.png">
<title>受講生一覧</title>
<link rel="stylesheet" href="css/students2.css">
</head>


<body>

 <jsp:include page="header.jsp" />

 <div class="container">

		<h1>受講生一覧</h1>

		<s:if test="%{#session.userFlg >= 1}">


              <s:form action="StudentsSelectAction">
                <select name ="someone">
                <option value= "">
				<input class="button" type="submit" value="表示">
			</s:form>





		</s:if>
</div>


</body>
</html>