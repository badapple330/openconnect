<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><s:text name="my_page.MyPageTitle"/></title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel ="stylesheet" href="css/pagination_style.css"/>
<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/bootstrap.js"></script>
<script src="js/jquery.pagination.js"></script>
<script src="js/my-page.js"></script>
<script src="js/show-pass.js"></script>
</head>
<body background="images/washi.jpg">
<jsp:include page="header.jsp"/>
	<div class="container" style="width:1170px;">
		<div class="main" style="background-color : #f5deb3">
			<div class="signUp" style="font-weight:bold;">
        		<div class="text-center">
            		<h2 class="text-center sideMenu " style="margin-top:20px;"><s:text name="my_page.MyPageSubTitle"/></h2>
        		</div>
				<hr>
  					 <div class="UserInformation" >
						<div class="panel panel-danger">
                    	  <div class="table-responsive">
                    	<s:if test="HistoryList.size()>0">
                        <table class="table table-bordered table-hover" >
                          <thead>
                            <tr>
                              <th><s:text name="my_page.MyPageOrderNumber"/></th>
                              <th><s:text name="my_page.MyPageItemName"/></th>
                              <th><s:text name="my_page.MyPageItemPrice"/></th>
                              <th><s:text name="my_page.MyPagePurchaseNumber"/></th>
                              <th><s:text name="my_page.MyPageCreatedAt"/></th>
                              <th><s:text name="my_page.MyPageAddressee"/></th>
                            </tr>
                          </thead>
                          <tbody>
						<s:iterator value="HistoryList" status="rs">
                            <tr class="li">
                            	<th><s:property value="orderNumber"/></th>
                            	<th>
                            		<form name="form<s:property value="#rs.count" />" method="post" action="GoItemDetailsAction">
                            			<input type="hidden" name="name" value="<s:property value="name" />" />
                            		</form>
                            			<p>
                            				<a href="javascript:document.form<s:property value="#rs.count" />.submit()">
                            					<s:property value="name" />
                            				</a>
                            			</p>


                            	</th>
                            	<th><s:property value="price * number" /></th>
                            	<th><s:property value="number" /></th>
                            	<th><s:property value="createdAt" /></th>
                            	<th><s:property value="address" /></th>
						   </s:iterator>
						    </tbody>
 							 </table>
 							  <p><s:text name="my_page.MyPageSendPrice"/></p>
 							  <div class="pager"></div>
 							  </s:if>
 							  <s:else>
 							  		<table class="table table-bordered table-hover" >
                          <thead>
                            <tr>
                              <th><s:text name="my_page.MyPageOrderNumber"/></th>
                              <th><s:text name="my_page.MyPageItemName"/></th>
                              <th><s:text name="my_page.MyPageItemPrice"/></th>
                              <th><s:text name="my_page.MyPagePurchaseNumber"/></th>
                              <th><s:text name="my_page.MyPageCreatedAt"/></th>
                              <th><s:text name="my_page.MyPageAddressee"/></th>
                            </tr>
                          </thead>
                          <tbody>
                          </tbody>
                          </table>
                          	<p><s:text name="my_page.MyPageNoPurchase"/></p>
 						</s:else>
   						 </div>
                  	  </div><!-- パネル終わり -->
					</div>

   				    <div class="PurchaseHistory">
    					<div class="panel panel-danger">
                    	   <div class="table-responsive">
                       		 <table class="table table-bordered ">
                         		 <thead>
                             		<tr>
                                    <th><s:text name="my_page.MyPageUserInformation"/></th>
                                    </tr>

                         		 </thead>
                         		  <tbody >
                         		 <s:iterator value="UserList">
                            	 <tr><td><s:text name="my_page.MyPageName"/></td>  <td><s:property value="name" /></td></tr>
                            	 <tr><td ><s:text name="my_page.MyPagePhonetic"/></td>  <td><s:property value="nameKana" /></td></tr>
                            	 <tr><td ><s:text name="my_page.MyPageEmail"/></td> 	<td><s:property value="email" /></td></tr>
                            	 <tr><td style="vertical-align:middle"><s:text name="my_page.MyPagePassword"/></td> <td><input type="password"class="password" value="<s:property value="password"/>" disabled style="border:none; background-color:white; font-size:15px;width: 100%;  ">
                            	 <input type="checkbox" id="changePassCheck"><s:text name="my_page.MyPagePasswordCheck"/></td></tr>
                            	 <tr><td ><s:text name="my_page.MyPagePhoneNumber"/></td> <td><s:property value="telNum" /></td></tr>
                            	 <tr><td ><s:text name="my_page.MyPagePostalCode"/></td> <td><s:property value="postalCode" /></td></tr>
                            	 <tr><td ><s:text name="my_page.MyPageAddress"/></td> <td><s:property value="address" /></td></tr>
                            	 <tr><td ><s:text name="my_page.MyPageCreditCard"/></td> <td><s:property value="cardNum" /></td></tr>
								</s:iterator>
								 </tbody>
                         	 </table>
                   		  </div>
                  	   </div><!-- パネル終わり -->
                   	 <div class="text-left">
                   	 <br>
                        <s:a href="GoRegistrationChangeAction" cssClass="btn btn-default btn-sm" style="height:30px; font-weight:bold;"><s:text name="my_page.MyPageRegistrationContentsChange"/></s:a>
                   	    <s:a href="WithdrawalConfirmationAction" cssClass="btn btn-default btn-sm"><s:text name="my_page.MyPageWithdrawal"/></s:a>

                     </div>
        		   </div>
   		  <div class="text-center" style="clear:left; padding-top:80px;" >
            <hr>
       		<s:a href="GoTopPageAction"><s:text name="my_page.MyPageGoBackToTopPage"/></s:a>
            <br>
            <br>
   		 </div>
    		</div>
        </div>
    </div>
<jsp:include page="footer.jsp"/>
</body>
</html>