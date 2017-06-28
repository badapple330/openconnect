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
	<link rel="stylesheet" href="css/bootstrap.css" />
		<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
			<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->
	<link rel="stylesheet" href="css/style2.css">
	<link rel="stylesheet" href="css/group.css">
	<link rel="stylesheet" href="css/Bfooter.css">


	<!-- Javascripts
    ================================================== -->
    <script src="js/jquery-3.2.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>

</head>

<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
<div class="container-fluid">
  <div class="navbar-header">
  <a class="navbar-brand" href="botMaintenance.jsp">botくんメンテナンスページ</a>
    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#gnavi">
      <span class="sr-only">メニュー</span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
    </button>
  </div>

  <div id="gnavi" class="collapse navbar-collapse">
    <ul class="nav navbar-nav navbar-right">
      <li><a href="botExercise.jsp">言葉を教える</a></li>
      <li><a href="#">言葉を忘れさせる</a></li>
    </ul>
  </div>
  </div>
</nav>


<div class="container">
  <div class="row">
    <div class="col-sm-1 visible-lg-block"></div>

    <div class="col-sm-10">
    	<div class = "outline">
    	<br>
<h2>botくんは今日も元気です。</h2>

		</div>
    </div>

    <div class="col-sm-1 visible-lg-block"></div>
  </div>
</div>

<jsp:include page="Bfooter.jsp" />

<!--
<footer>
<div  class = "footer">
 <nav>
 <div class = "contents" >
 <div class="a" style="margin-right:20px"><a href="<s:url action="ProfileSessionAction"><s:param name="viewId" value="%{userId}"/></s:url>"><img class="pic" src ="pic/profile.png" ></a></div>

 <div class="a" style="margin-right:20px"><a href="<s:url action="GoTalkListAction"/>"><img class="pic" src ="pic/talk.png" >
 <s:if test="talkInfo > 0 and talkInfo <100"><span class="b"><s:property value="talkInfo" /></span></s:if>
 <s:if test="talkInfo >= 100 and talkInfo <1000"><span class="bh"><s:property value="talkInfo" /></span></s:if>
 <s:if test="talkInfo >= 1000"><span class="bt"><s:property value="talkInfo" /></span></s:if>
 </a></div>

 <div class="a" style="margin-right:20px; background-color:rgb(111, 207, 245);" ><a href="<s:url action="GoGroupAction"/>"><img class="pic" src ="pic/group.png" >
 <s:if test="groupInfo > 0 and groupInfo <100"><span class="b"><s:property value="groupInfo" /></span></s:if>
 <s:if test="groupInfo >= 100 and groupInfo <1000"><span class="bh"><s:property value="groupInfo" /></span></s:if>
 <s:if test="groupInfo >= 1000"><span class="bt"><s:property value="groupInfo" /></span></s:if>
 </a></div>

 <div class="a"><a href="<s:url action="GoTimelineAction"/>"><img class="pic" src ="pic/time_line.png" ></a></div>
 </div>
 </nav>
 </div>
</footer>
 -->

</body>
</html>