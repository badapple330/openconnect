<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>購入手続き</title>

<!-- Bootstrap -->
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
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
    <link rel="stylesheet" href="css/message.css">
<script src="js/kojin-jquery-radio.js"></script>
<script src="js/kojin-jquery-creditcard-radio.js"></script>
<script src="http://ajaxzip3.googlecode.com/svn/trunk/ajaxzip3/ajaxzip3.js" charset="UTF-8"></script>
</head>
<body background="images/washi.jpg">

<!--↓ヘッダー↓-->
	<jsp:include page="header.jsp"/>
<!--↑ヘッダー↑-->

<div class="container" style="width:1170px;">

    <div class="main">

<!--↓サイドバー↓-->
	<jsp:include page="side_bar.jsp"/>
<!--↑サイドバー↑-->

	<div class="purchaseDisplay">
		<div class="text-center">
			<h3 class="purchaseTitle"><s:text name="purchase.title"/></h3>
				<s:form action="PurchaseConfirmationAction">
					<div class="text-center">
						<div class="purchaseSlip">
							<div class="purchaseItemTable">
								<h4>■<s:text name="purchase.order"/></h4>
									<table class="table">
										<thead>
											<tr>
											<th class="text-center"><s:text name="cart.itemImg"/></th>
												<th class="text-center"><s:text name="purchase.product"/></th>
												<th class="text-right"><s:text name="cart.price"/></th>
												<th style="width:15%;"><div class="text-right"><s:text name="purchase.quantity"/></div></th>
												<th style="width:15%;"><div class="text-right"><s:text name="purchase.price"/></div></th>
											</tr>
										</thead>
										<tbody>
										<s:iterator value="kinnosawaList">
											<tr>
												<td class="text-center"><img alt="" src="<s:property value ="imgPath"/>" style="width:50px;"></td>
												<td class="text-center"><s:property value="goodsName" /></td>
												<td class="text-right"><s:property value="goodsPrice" /><s:text name="item_details.yen"/></td>
												<td><div class="text-right"><s:property value="goodsNumber" /></div></td>
												<td style="10px"><div class="text-right"><s:property value="goodsPrice*goodsNumber" /><s:text name="item_details.yen"/></div></td>
                                            </tr>
                                        </s:iterator>
                                        </tbody>
                                        <tfoot>
                                            <tr>
                                            	<td>　　</td>
                                            	<td>　　</td>
                                                <th class = "text-right"><s:text name="purchase.sub_total"/></th>
                                                <td><div class="text-right"><s:property value="subTotalNumber" /></div></td>
                                                <td><div class="text-right"><s:property value="subTotalPrice" /><s:text name="item_details.yen"/></div></td>
                                            </tr>
                                            <tr>
                                            	<td>　　</td>
                                            	<td>　　</td>
                                                <th class = "text-right"><s:text name="purchase.tax"/>（8%)</th>
                                                <td></td>
                                                <td><div class="text-right"><s:property value="tax" /><s:text name="item_details.yen"/></div></td>
                                            </tr>
                                            <tr>
                                                <th colspan="2">※<a href="#map"><s:text name="purchase.postage"/></a><s:text name="purchase.separately"/></th>

                                                <th class = "text-right"><s:text name="purchase.total"/></th>
                                                <th><div class="text-right"><s:property value="totalNumber" /></div></th>
                                                <th><div class="text-right"><s:property value="totalPrice" /><s:text name="item_details.yen"/></div></th>
                                            </tr>
                                        </tfoot>
                                    </table>

                                </div>

                            <br>
                            <div class="">

                            <h4>■<s:text name="purchase.adress"/></h4>
                                <s:if test="%{!session.userNameAddress.equals('')}">
                                <input type="radio" name="sendAddress" value="1" id="sendAddress" checked/><label for="radio1"><s:text name="purchase.registered_address"/></label>
                                <br>

                                <!--登録済みの住所表示スペース-->
                                <div class="purchaseAddressTable" id="tr1">
                                    <table class="table">
                                        <tbody>
                                            <tr>
                                                <td><s:text name="purchase.name"/>：</td>
                                                <td><s:hidden name = "userName"><s:text name="userName"/></s:hidden></td>
                                            </tr>
                                             <tr>
                                                <td><s:text name="purchase.phone"/>：</td>
                                                <td><s:hidden name = "phoneNumber"><s:text name="phoneNumber"/></s:hidden></td>
                                            </tr>
                                             <tr>
                                                <td><s:text name="purchase.postal"/>：</td>
                                                <td><s:hidden name = "postalCode"><s:text name="postalCode"/></s:hidden></td>
                                            </tr>
                                             <tr>
                                                <td><s:text name="purchase.street_adress"/>：</td>
                                                <td><s:hidden name = "streetAddress"><s:text name="streetAddress"/></s:hidden></td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                               <!--その他の住所入力テキストボックス-->
                               <input type="radio" name="sendAddress" value="2" id="sendAddress" /><label for="radio2"><s:text name="purchase.other_address"/></label>
                                <div class="purchaseAddressTable" id="tr2">
                                    <table class="table">
                                        <tbody>
                                            <tr>
                                                <td><s:text name="purchase.name"/>：</td>
                                                <td><s:textfield cssClass="purchaseName" name="newUserName" size="40" placeholder="%{getText('purchase.example')}和菓子太郎"/></td>
                                            </tr>
                                             <tr>
                                                <td><s:text name="purchase.phone"/>：</td>
                                                <td><s:textfield cssClass="purchaseTel" name="newPhoneNumber" size="40" placeholder="%{getText('purchase.example')}08066554433"/></td>
                                            </tr>
                                             <tr>
                                                <td><s:text name="purchase.postal"/>：</td>
                                                <td><s:textfield cssClass="purchasePostalCode" name="newPostalCode" size="40" placeholder="%{getText('purchase.example')}8190025" onkeyup="AjaxZip3.zip2addr(this,'','newStreetAddress','newStreetAddress');"/></td>
                                            </tr>
                                             <tr>
                                                <td><s:text name="purchase.street_adress"/>：</td>
                                                <td><s:textfield cssClass="purchaseAddress" name="newStreetAddress" size="40" placeholder="%{getText('purchase.error_adress')}"/></td>
                                            </tr>
                                         </tbody>
                                    </table>
                                </div>
                                </s:if>
                                <s:else>
                                <s:hidden name = "sendAddress" value="2"/>
                                <div class="purchaseAddressTable" id="tr2">
                                    <table class="table">
                                        <tbody>
                                            <tr>
                                                <td><s:text name="purchase.name"/>：</td>
                                                <td><s:textfield cssClass="purchaseName" name="newUserName" size="40" placeholder="%{getText('purchase.example')}和菓子太郎"/></td>
                                            </tr>
                                             <tr>
                                                <td><s:text name="purchase.phone"/>：</td>
                                                <td><s:textfield cssClass="purchaseTel" name="newPhoneNumber" size="40" placeholder="%{getText('purchase.example')}08066554433"/></td>
                                            </tr>
                                             <tr>
                                                <td><s:text name="purchase.postal"/>：</td>
                                                <td><s:textfield cssClass="purchasePostalCode" name="newPostalCode" size="40" placeholder="%{getText('purchase.example')}8190025"/></td>
                                            </tr>
                                             <tr>
                                                <td><s:text name="purchase.street_adress"/>：</td>
                                                <td><s:textfield cssClass="purchaseAddress" name="newStreetAddress" size="40" placeholder="%{getText('purchase.error_adress')}"/></td>
                                            </tr>
                                    </table>
                                </div>
                                </s:else>

                            </div>

                           <h4>■<s:text name="purchase.credit_card"/></h4>

                           <s:if test="%{!session.cardNumber.equals('')}">
                           <input type="radio" name="creditRadio" value="1" onclick ="radioChange()" id="creditRadio1" checked/><label for="creditRadio1"><s:text name="purchase.registered_credit"/></label>
                           <br>





                            <!--登録済みのクレジットカードテキストボックス-->
                             <div class="registrationChangeLeft" id="tr3">
                                    <table class="table">
                                        <tbody>
                                             <tr>
                                                <td><s:text name="purchase.card_number"/>：</td>
                                                <td><s:property value="cardNumber" /></td>
                                            </tr>
                                        </tbody>
                                    </table>
                             </div>
                           <input type="radio" name="creditRadio" value="2" onclick ="radioChange()" id="creditRadio2" /><label for="creditRadio2"><s:text name="purchase.new_credit"/></label>
                           <br>
                                <!--その他のクレジットカードテキストボックス-->
                                <div class="registrationChangeLeft" id="tr4" style="display:none;">
                                    <table class="table">
                                        <tbody>
                                            <tr>
                                             <tr>
                                                <td><s:text name="purchase.new_card_number"/>：</td>
                                                <td><s:textfield cssClass="purchaseCardNumber" name="NewCardNumber" size="40" placeholder="%{getText('purchase.error_number')}"/></td>
                                             </tr>
                                             <tr>
                                             	<td><s:text name="purchase.card_limit"/>：</td>
												<td><s:select name="limitMonth" headerKey="0" headerValue="月" list="#{	'1':'1',
																														'2':'2',
																														'3':'3',
																														'4':'4',
																														'5':'5',
																														'6':'6',
																														'7':'7',
																														'8':'8',
																														'9':'9',
																														'10':'10',
																														'11':'11',
																														'12':'12'}" value="cardMonth" />

						 							<s:select name="limitYear" headerKey="0" headerValue="年" list="#{	'16':'16',
																														'17':'17',
																														'18':'18',
																														'19':'19',
																														'20':'20',
																														'21':'21',
																														'22':'22',
																														'23':'23',
																														'24':'24',
																														'25':'25'}" value="cardYear" />
												</td>
											 </tr>
                                             <tr>
                                                <td><s:text name="purchase.card_name"/>：</td>
                                                <td><s:textfield cssClass="purchaseCardName" name="cardName" size="40" placeholder="%{getText('purchase.error_name')}"/></td>
                                             </tr>
                                             <tr>
                                                <td><s:text name="purchase.securityCode"/>：</td>
                                                <td><s:textfield cssClass="purchaseSecurityCode" name="securityCode" size="40" placeholder="%{getText('purchase.error_code')}"/></td>
                                            </tr>
                                    </table>
                                </div>
                           <input type="radio" name="creditRadio" value="3" id="creditRadio3" onclick ="radioChange()" /><label for="creditRadio3"><s:text name="purchase.delivery"/></label>

                           </s:if>
                           <s:else>
                           <input type="radio" name="creditRadio" value="2" onclick ="radioChange()" id="creditRadio2" checked/><label for="creditRadio2"><s:text name="purchase.new_credit"/></label>
                           <br>

                                <!--その他のクレジットカードテキストボックス-->
                                <div class="registrationChangeLeft" id="tr4" style="display:'';">
                                    <table class="table">
                                        <tbody>
                                            <tr>
                                             <tr>
                                                <td><s:text name="purchase.new_card_number"/>：</td>
                                                <td><s:textfield cssClass="purchaseCardNumber" name="NewCardNumber" size="40" placeholder="%{getText('purchase.error_number')}"/></td>
                                             </tr>
                                             <tr>
                                             	<td><s:text name="purchase.card_limit"/>：</td>
												<td><s:select name="limitMonth" headerKey="0" headerValue="月" list="#{	'1':'1',
																														'2':'2',
																														'3':'3',
																														'4':'4',
																														'5':'5',
																														'6':'6',
																														'7':'7',
																														'8':'8',
																														'9':'9',
																														'10':'10',
																														'11':'11',
																														'12':'12'}" value="cardMonth" />

						 							<s:select name="limitYear" headerKey="0" headerValue="年" list="#{	'16':'16',
																														'17':'17',
																														'18':'18',
																														'19':'19',
																														'20':'20',
																														'21':'21',
																														'22':'22',
																														'23':'23',
																														'24':'24',
																														'25':'25'}" value="cardYear" />
												</td>
											 </tr>
                                             <tr>
                                                <td><s:text name="purchase.card_name"/>：</td>
                                                <td><s:textfield cssClass="purchaseCardName" name="cardName" size="40" placeholder="%{getText('purchase.error_name')}"/></td>
                                             </tr>
                                             <tr>
                                                <td><s:text name="purchase.securityCode"/>：</td>
                                                <td><s:textfield cssClass="purchaseSecurityCode" name="securityCode" size="40" placeholder="%{getText('purchase.error_code')}"/></td>
                                            </tr>
                                    </table>
                                </div>
                           <input type="radio" name="creditRadio" value="3" id="creditRadio1" onclick ="radioChange()" /><label for="creditRadio3"><s:text name="purchase.delivery"/></label>
                           </s:else>



                                <div class="registrationChangeLeft" id="tr5">
                                </div>
                            </div>
                     <font size="5" color="#ff0000" class="text-center"><s:property value="error" /></font>
                    <div class="text-center">
                        <s:submit cssClass="btn btn-success" value ="%{getText('purchase.confirmation')}"/>
                    </div>
                        </div>
                    </s:form>
                    </div>

                    <br><br><br>
                    <div class="purchaseSlip">
                        <h4  id="map">■<s:text name="purchase.about_postage"/></h4>
                        <div class="text-center">
                        <img src="images/map_LL.jpg" style="width:100%">
                        </div>
                    </div>
            </div>
        </div>
    </div>
    <script src="js/purchase.js"></script>
<!--↓フッター↓-->
    <jsp:include page="footer.jsp"/>
<!--↑フッター↑-->
</body>
</html>