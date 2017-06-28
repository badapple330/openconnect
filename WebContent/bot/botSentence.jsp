<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "s" uri= "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>botくんメンテナンス</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<!-- Stylesheet
    ================================================== -->
	<link rel="stylesheet" href="../css/bootstrap.css" />
		<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
			<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->
	<link rel="stylesheet" href="../css/style2.css">
	<link rel="stylesheet" href="../css/Bfooter.css">
	<link rel="stylesheet" href="../css/jquery.bootgrid.min.css">


	<!-- Javascripts
    ================================================== -->
    <script src="../js/jquery-3.2.1.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
	<script src="../js/jquery.bootgrid.js"></script>

	<script>
$(function() {
	$("#grid-basic").bootgrid();
});
</script>

</head>

<body>
<header><jsp:include page="botHeader.jsp" /></header>


<div class="outline">
<br>
<h3>覚えさせた文章</h3>
<table id="grid-basic" class="table table-condensed table-hover table-striped">
    <thead>
        <tr>
            <th data-column-id="id" data-type="numeric">ID</th>
            <th data-column-id="sender">要約</th>
            <th data-column-id="received" data-order="desc">覚えさせた日</th>
        </tr>
    </thead>
    <tbody>
    	<s:iterator value="masterList" >
        <tr>
            <td><s:property value="sentenceId"/></td>
            <td><s:property value="label"/></td>
            <td><s:property value="createdAt"/></td>
        </tr>
        </s:iterator>
    </tbody>
</table>

</div>



</body>
</html>