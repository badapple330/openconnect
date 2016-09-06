
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><s:text name="item_details.title1"/></title>

<!-- Bootstrap -->
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/pagination_style.css">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-1.11.3.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.js"></script>
<script src="js/jquery.pagination.js"></script>
<script src="js/kojin-jquery.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body background="images/washi.jpg">
<jsp:include page="header.jsp"/>
<div class="container" style="width:1170px;">
<jsp:include page="side_bar.jsp" />
    <div class="main">
        <div class="itemDetails">
            <h2 class="text-center sideMenu"><s:property value="category"/></h2>
            <s:property value="error"/>
            <s:iterator value="list">
            	<s:form method="post" action="GoItemDetailsAction" cssClass="li">
            		<div class="menu">
                		<img src="<s:property value="imgPath"/>" alt=""class="mainImage">
                    	<h2><s:property value="name"/></h2>
                    	<p class="salePrice"><s:text name="item_dateils.price2"/>　<s:property value="price"/><s:text name="item_details.yen"/><br>
                    		<input type="hidden" name="name" value="<s:property value="name"/>"/>
                    		<s:submit value="%{getText('item_details.detail')}" cssClass="btn btn-success"/>
                        </p>
            		</div>
            	</s:form>
            </s:iterator>
			<div class="text-center">
				<div class="pager"></div>
			</div>
		</div>
	</div>
</div>
<jsp:include page="footer.jsp" />
</div>
</body>
</html>