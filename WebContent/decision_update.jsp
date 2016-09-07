<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>Insert title here</title>
</head>
<body>

<s:iterator value="decisionDetailList">
<s:property value="decisionDetailId" />
<s:property value="projectName" />
<s:property value="decisionId" />
<s:property value="decisionType" />
<s:property value="decisionStatus" />
</s:iterator>
</body>
</html>