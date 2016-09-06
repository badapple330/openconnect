<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="fmt" uri="/struts-tags"%>
<!DOCTYPE html">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>FootPrinter</title>
    <!-- cssのリンク -->
    <link rel="stylesheet" type="text/css" href="./css/main.css">
    <link rel="stylesheet" type="text/css" media="screen,projection" href="cssmap-continents/cssmap-continents.css" />
    <!-- jsのリンク -->
    <script type="text/javascript" src="js/jquery-2.1.4.js"></script>
    <script type="text/javascript" src="js/main_map.js"></script>
    <script type="text/javascript" src="js/jquery.cssmap.js"></script>

</head>
<body onLoad="function()">
	<jsp:include page="base/header.jsp" flush="true" />

	<h1 class="heading4"><s:text name = "lang.main.search" /><br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<small class="small"><s:text name = "lang.main.subsearch" /></small></h1><br>
   <div id="example1" class="sample active">
	  <div id="map-continents">
	    <ul class="continents">
	      <s:url id="categoryList" action="tour-list"></s:url>
	      <li class="c1"><s:a href="%{categoryList}?categoryId=1"><s:text name="lang.main.africa" /></s:a></li>
		  <li class="c2"><s:a href="%{categoryList}?categoryId=2"><s:text name="lang.main.asia" /></s:a></li>
		  <li class="c3"><s:a href="%{categoryList}?categoryId=3"><s:text name="lang.main.australia" /></s:a></li>
	      <li class="c4"><s:a href="%{categoryList}?categoryId=4"><s:text name="lang.main.europe" /></s:a></li>
		  <li class="c5"><s:a href="%{categoryList}?categoryId=5"><s:text name="lang.main.northamerica" /></s:a></li>
		  <li class="c6"><s:a href="%{categoryList}?categoryId=6"><s:text name="lang.main.southamerica" /></s:a></li>
		</ul>
	  </div>
	</div>
	<s:url id="all_list" action="tour-list"></s:url>
    <s:a href="%{all_list}" cssClass="btn btn-info"><s:text name="lang.main.list" /></s:a>
    <br><br><br>
    <hr>
 	<h1 class="text-center"><s:text name="lang.main.new" /></h1>
    <div class="container">
	    <div class="row">
          <s:iterator value="newtourList1">
		    <div class="col-md-4">
		      <div class="thumbnail">
		        <s:url id="newtour" action="tour-detail"></s:url>
		        <s:a href="%{newtour}?tourId=%{id}">
		          <img src="img/<s:property value = "imgPath" />" alt="イベント写真" class="event3" />
		        </s:a>
		        <h3>
		          <strong><s:property value = "name" /></strong>
		        </h3>
		        <p> <s:property value = "detail" /> </p>
		        <p> &nbsp;&nbsp;<s:text name = "lang.main.date" />&nbsp;:&nbsp;<s:property value = "date" /> <br>
		            &nbsp;&nbsp;<s:text name = "lang.main.money" />&nbsp;:&nbsp;<s:text name = "lang.main.enmoney" /><s:property value = "price" /><s:text name = "lang.main.jamoney" /> </p>
		      </div>
            </div>
	      </s:iterator>
        </div>
         <div class="row">
         <s:if test="newtourList2 != null">
          <s:iterator value="newtourList2">
		    <div class="col-md-4">
		      <div class="thumbnail">
		        <s:url id="newtour" action="tour-detail"></s:url>
		        <s:a href="%{newtour}?tourId=%{id}">
		          <img src="img/<s:property value = "imgPath" />" alt="イベント写真" class="event3" />
		        </s:a>
		        <h3>
		          <strong><s:property value = "name" /></strong>
		        </h3>
		        <p> <s:property value = "detail" /> </p>
		        <p> &nbsp;&nbsp;<s:text name = "lang.main.date" />&nbsp;:&nbsp;<s:property value = "date" /> <br>
		            &nbsp;&nbsp;<s:text name = "lang.main.money" />&nbsp;:&nbsp;<s:text name = "lang.main.enmoney" /><s:property value = "price" /><s:text name = "lang.main.jamoney" /> </p>
		      </div>
            </div>
	      </s:iterator>
	      </s:if>
        </div>
	</div>
	<hr>
	<div class="container">
	  <div class="row">
	    <div class="col-md-5 col-md-offset-1">
	      <h3><s:text name="lang.main.access" /></h3>
	      <table class="company">
	        <tbody>
	          <tr>
	            <th class="arrow_box"><s:text name="lang.main.company" /></th>
	            <td>Foot Printer</td>
	          </tr>
	          <tr>
	            <th class="arrow_box"><s:text name="lang.main.location" /></th>
	            <td>〒113-0034<br>
	                <s:text name="lang.main.ken" /><br>
	                <s:text name="lang.main.biru" />
	            </td>
	          </tr>
	          <tr>
	            <th>TEL</th>
	            <td>123-4567-8910</td>
	          </tr>
	          <tr>
	            <th><s:text name="lang.main.business" /></th>
	            <td>
	               <s:text name="lang.main.travel" />
	            </td>
	          </tr>
	        </tbody>
	      </table>
	    </div>
	    <div class="col-md-5">
	      <h3>GoogleMap</h3>
	      <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3239.9132982562437!2d139.76492981508756!3d35.70375113634421!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x60188c18b82a5b79%3A0xf4b11fd9c5add54c!2z44CSMTEzLTAwMzQg5p2x5Lqs6YO95paH5Lqs5Yy65rmv5bO277yT5LiB55uu77yS4oiS77yR77ySIOW-oeiMtuODjuawtOWkqeelnuODk-ODqw!5e0!3m2!1sja!2sjp!4v1446693417087"
	              width="400" height="300"  style="border: 0"></iframe>
	    </div>
	  </div>
	</div>

	<s:a href="#" cssClass="btn btn-info"><s:text name="lang.main.top" /></s:a>
	<br>
	<br>
	<jsp:include page="base/footer.jsp" flush="true" />
</body>
</html>