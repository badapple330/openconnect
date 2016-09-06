<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><s:text name="item_details.title2"/></title>

<!-- Bootstrap -->
<link rel="stylesheet" href="css/bootstrap.css">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-1.11.3.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.js"></script>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body background="images/washi.jpg">
<jsp:include page="header.jsp" />
<div class="container" style="width:1170px;">
<jsp:include page="side_bar.jsp" />
    <div class="main">
        <div class="itemDetails">
            <h2 class="text-center sideMenu"><s:text name="item_details.title2"/></h2>
            <s:property value="error"/>
                <div class="detail">
                <div class="text-center">
                    	<img src="<s:property value="imgPath" />" >
                    	</div>
                    <div class="absolute">
                        <p ><s:property value="detail"/></p>
                        <ul>
                            <li><s:text name="item_details.keep"/><br/>
                                <em><s:text name="item_datails.attention"/></em></li>
                            <li><s:text name="item_details.sale"/></li>
                            <li><s:text name="item_details.alle"/><s:property value="allergie"/></li>
                        </ul>
                        </div>
                </div>
                　※<s:text name="item_details.info"/>
                <br>
                　　<s:text name="item_details.secondInfo"/>
                <br>
                <br>
                <h4><s:property value="maxMessage"/></h4>
                <s:form action="IntoCartReturnAction">
                	<div class="item" >
                		<p class="trimming">
                    	<img src="<s:property value="setImgPath" />" style="margin-left:-5px; width:70%; margin-bottom:20px;">
                    	</p>
                    	<div style="float:right; margin-bottom:20px;">
                    	<h3><s:property value="name"/></h3>
                    	<br>
                    	<table>
                        	<tr class="table">
                        	<th><s:text name="item_dateils.price1"/></th>
                        	<th class="box"><s:text name="item_details.num"/></th>
                        	</tr>
                        	<tr class="table">
                            <th><s:text name="item_details.num1"/><s:property value="price" /><s:text name="item_details.yen"/></th>
                            <td class="box"><input name="cnt" type="text" value="1"size="5" maxlength="2" ></td>
                        </tr>
                        <tr>
                        	<td>　　</td><td>　　</td>
                        </tr>
                        <tr>
                        <td></td>
                			<td><s:submit value="%{getText('item_details.cart')}" cssClass="btn btn-success"/></td>
                		</tr>
                		<tr>
                		<td></td>
                		<td>
                		<s:property value="message"/>
                		</td>
                		</tr>
                	</table>
                	</div>
                	<br>
                </div>
                <input type="hidden" name="itemId" value="<s:property value="id"/>"/>
                <input type="hidden" name="name" value="<s:property value="name"/>"/>
                </s:form>
                <br>
            </div>
    </div>
</div>
<jsp:include page="footer.jsp" />
</body>
</html>