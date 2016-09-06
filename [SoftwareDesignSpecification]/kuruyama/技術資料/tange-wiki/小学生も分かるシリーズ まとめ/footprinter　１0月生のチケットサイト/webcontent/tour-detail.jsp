<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html">

<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FootPrinter</title>
<jsp:include page="base/base.jsp" flush="true" />
<link href="css/tourDetail.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/tour-detail.js"></script>
</head>
<body>
	<jsp:include page="base/header.jsp" flush="true" />

	<br>
	<br>
	<br>
	<div class="container ">
		<div class="row">
			<div class="kakuninn col-md-8 col-md-offset-2">
				<table class="table">
					<tr class="hd">
						<th colspan="2"><s:property value="eventName"></s:property></th>
					</tr>
					<tr>
						<td><img src="img/<s:property value = "imgPath" />"
							alt="イベント画像" class="event1" /></td>
						<td><p>
								<s:property value="detail"></s:property>
							</p></td>
					</tr>
					<tr>
						<td><s:text name="lang.tour-detail.holding" /><br> <s:property value="eventDate"></s:property></td>
						<td><s:text name="lang.tour-detail.price" /><s:property value="price" /><s:text name="lang.tour-detail.$/Sheet" /><br>
							<s:text name="lang.tour-detail.numberOfTicketsRemaining" /> <s:property value="remaining"></s:property><s:text name="lang.tour-detail.sheet" />
						</td>
					</tr>
					<tr>
						<td>
							<s:url var="goTourList" action="tour-list?categoryId=%{#session.categoryId}" />
							<s:a href="%{goTourList}" cssClass="btn btn-primary btn-block"><s:text name="lang.tour-detail.back" /></s:a>
						</td>
						<td><s:if test="remaining == 0">
								<input onclick="alert('チケットは完売しました')" type="button" name="member"
							class="btn btn-primary btn-block" value=<s:text name="lang.tour-detail.soldout" />>
								</s:if><s:else><s:form action="purchase-confirm">
								<s:submit cssClass="btn btn-primary btn-block"
									name="purchase-confirm" value="%{getText('lang.tour-detail.apply')}" />
							</s:form></s:else>
						</td>
					</tr>
				</table>
			</div>
		</div>
	</div>
	<br>
	<br>
	<hr>
	<br>
	<br>
	<div class="container ">
		<div class="row">
			<div class="kakuninn col-md-8 col-md-offset-2">
				<div class="comment1"><s:text name="lang.tour-detail.newComment" /></div>
				<s:if test="#session.loginId != null">
					<form method="post">
					<br><s:text name="lang.tour-detail.commentInput" />:<br>
					<textarea placeholder=<s:text name="lang.tour-detail.placeholder" /> id="formText" name="revue"
						rows="5" cols="100"></textarea>
					<br> <input class="btn btn-primary" type="button" id="test" value=<s:text name="lang.tour-detail.send" />>
				</form>
				</s:if>
				<table id="comment" class="table">
					<s:iterator value="list" status="list">
						<tr>
							<td style="width: 50px;word-break: break-all;"><br><br><s:text name="lang.tour-detail.name" />: <s:property value="userName" /></td>
						</tr>
						<tr>
							<td style="width: 500px;word-break: break-all;"><s:text name="lang.tour-detail.comment" />: <s:property value="comment" /></td>
						</tr>
						<tr></tr>
					</s:iterator>
				</table>
			</div>
		</div>
	</div>

	<jsp:include page="base/footer.jsp" flush="true" />
</body>
</html>