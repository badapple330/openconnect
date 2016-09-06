<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>横線グラフ</title>
<style>
#myGraph rect {
stroke: orange;
stroke-width : 3px;
fill : red;
}
</style>
<script src="js/d3.js"></script>
</head>
<body>
<button id="upDateButton">データ更新</button>
<svg id="myGraph" ></svg>
<script src="js/sample.js"></script>
</body>
</html>