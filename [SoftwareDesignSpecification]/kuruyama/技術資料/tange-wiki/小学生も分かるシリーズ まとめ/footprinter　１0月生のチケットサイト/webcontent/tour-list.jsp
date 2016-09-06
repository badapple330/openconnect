<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FootPrinter</title>
<jsp:include page="base/base.jsp" flush="true" />
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<jsp:include page="base/header.jsp" flush="true" />

	<br>

	<div class="container">
		<s:iterator value="tourList">
			<div class="row">
				<div class="media">
				<s:url id="tour-detail" action="tour-detail"></s:url>
					<s:a href="%{tour-detail}?tourId=%{Id}" cssClass="media-left"><img
						src="img/<s:property value = "imgPath" ></s:property>" alt="写真"
						class="event3" /></s:a>
					
					<div class="media-body">
						<h3 class="media-heading">
							<s:property value="name"></s:property>
						</h3>
						<p>
						    <s:text name = "lang.tour-list.date" />
							<s:property value="eventDate"></s:property>
							<s:text name = "lang.tour-list.price" />
							 <s:text name = "lang.tour-list.money" />
							<s:property value="Price"></s:property>
							<br>
							<s:property value="detail"></s:property>
						</p>
						
						
						
					</div>

				</div>
				<hr>
			</div>
		</s:iterator>
	</div>


	<br>
	<br>
	<br>
	<div class="botan">
		<s:a href="#" cssClass="btn btn-info"><s:text name="lang.main.top" /></s:a>
	</div>
	
	

<div class="row">
		<div class="row">
			<div class="col-xs-10 col-xs-offset-5">
				<ul class="pagination">
					
					<li>
						<s:url id="tour-list" action="tour-list"></s:url>
						<s:a href="%{tour}?page=0&categoryId=%{categoryId}" cssClass="media-left">1</s:a>
					</li>
					<li>
					    <s:url id="tour-list" action="tour-list"></s:url>
					     <s:a href="%{tour}?page=5&categoryId=%{categoryId}" cssClass="media-left">2</s:a>
					</li>
					<li>
					    <s:url id="tour-list" action="tour-list"></s:url>
					    <s:a href="%{tour}?page=10&categoryId=%{categoryId}" cssClass="media-left">3</s:a>
					</li>
					<li>
					    <s:url id="tour-list" action="tour-list"></s:url>
					    <s:a href="%{tour}?page=15&categoryId=%{categoryId}" cssClass="media-left">4</s:a>
					</li>
					<li>
					    <s:url id="tour-list" action="tour-list"></s:url>
					    <s:a href="%{tour}?page=20&categoryId=%{categoryId}" cssClass="media-left">5</s:a>
					</li>
				</ul>
			</div>
		</div>
	</div>









		<br> <br> <br>
		<jsp:include page="base/footer.jsp" flush="true" />
</body>
</html>