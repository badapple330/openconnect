<%@page import="com.internousdev.kinnosawa.dto.GoCartDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.internousdev.kinnosawa.dao.GoCartDAO"%>
<%@page import="com.sun.xml.internal.bind.v2.schemagen.xmlschema.List"%>
<%@page import="java.util.ListIterator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>カート</title>

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
        <div class="itemDetails" style="margin-top:23px;">
            <div class="signUp">
                <h3 class="sideMenu"><s:text name="cart.in"/></h3>
                <s:iterator value="list" status="rs">
                	<form name="form<s:property value="#rs.count"/>" action="GoCartDeleteAction" method="post">
                		<input type="hidden" name="id" value="<s:property value="goodsId"/>"/>
                	</form>
                </s:iterator>
                <s:if test="list.size()>0">
                <s:form action ="CartUpdateAction" method ="post">
                	<table class="table">
                		<thead>
                			<tr>
                				<th class="text-center"><s:text name="cart.delete"/></th>
                				<th class="text-center"><s:text name="cart.itemImg"/></th>
                    			<th class="text-center"><s:text name="cart.itemName"/></th>
                    			<th class="text-center"><s:text name="cart.price"/></th>
                    			<th class="text-center"><s:text name="cart.num"/></th>
                    			<th class="text-center"><s:text name="cart.sub"/></th>
                    		</tr>
                    	</thead>
                    	<tbody>
                			<s:iterator value="list" status="rs">
                				<tr>
                					<td class="text-center">
                						<s:hidden value ="%{goodsId}" name="id"/>
                						<a href="javascript:document.form<s:property value="#rs.count"/>.submit()" class="btn btn-default"><s:text name="cart.delete"/></a>
                					</td>
                					<td class="text-center">
                						<img src="<s:property value="imgPath"/>" style="width:50px">
                					</td>
                					<td class="text-center">
										<s:property value="name"/>
                    				</td>
                    				<td class="text-center">
										<s:property value="price"/>
                    				</td>
                    				<td class="text-center">
                    					<s:textfield cssStyle="text-align:right; width:30px " maxlength="2" value="%{count}" name="cnt"/>
                    				</td>
                    				<td class="text-center">
                    					<s:property value="countPrice"/><s:text name="item_details.yen"/>
                    				</td>
                    			</tr>
                			</s:iterator>
                			<tr>
                				<td></td>
                				<td></td>
                				<td></td>
                				<td></td>
								<th class="text-center"><s:text name="cart.sub"/></th>
								<td class="text-center"><s:property value="allPrice"/><s:text name="item_details.yen"/></td>
							</tr>
							<tr>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<th class="text-center"><s:text name="cart.tax"/></th>
								<td class="text-center"><s:property value="tax"/><s:text name="item_details.yen"/></td>
							</tr>
							<tr>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<th class="text-center"><s:text name="cart.total"/></th>
								<td class="text-center"><s:property value="taxPrice"/><s:text name="item_details.yen"/></td>
							</tr>
						</tbody>
					</table>
					<div class="text-right">
						<s:text name="cart.attention"/>
					</div>
					<br>
					<div class="text-center">
						<s:submit cssClass="btn btn-default" value="%{getText('cart.up')}"/>
						<s:submit cssClass="btn btn-success" value="%{getText('cart.pur')}" formaction="GoCartToPurchaseAction"/>
					</div>
                </s:form>
                </s:if>
				<s:else>
					<h4 style="color:red;"><s:text name="cart.null"/></h4>
				</s:else>
				<h4><s:property value="updateMessage"/></h4>
                <br>
                <br>
                <img src="images/map_LL.jpg" style="width:100%">


        	</div>
    	</div>
	</div>
</div>
<jsp:include page="footer.jsp" />
</body>
</html>