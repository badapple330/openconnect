<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix = "s" uri= "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>グループ追加</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<!-- Stylesheet
    ================================================== -->
	<link href="css/bootstrap.css" rel="stylesheet">
	<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
		<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->
	<link href="css/style.css" rel="stylesheet">
	<link href="css/groupAdd.css" rel="stylesheet">
	<link rel="stylesheet" href="css/Bfooter.css">
	<link href="css/multi-select.css" media="screen" rel="stylesheet" type="text/css">

	<!-- Javascripts
    ================================================== -->
    <script src="js/jquery-3.2.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/toast.js"></script>
	<script type="text/javascript" src="js/jquery.multi-select.js"></script>
	<script type="text/javascript">
		$(function(){
  			$('#multi-select').multiSelect();
		});
	</script>
		<script type="text/javascript">
		$(function(){
			$('#memberSend').submit(function(){
			if($('[name=memberList]').val() == ""){
				var toast = new Toast();
				toast.show("メンバーを選択してください");
				return false;
			}
			else{
				return true;
			}
			});
		})
	</script>
</head>
<body>
<div class="outline">
	<h2>グループメンバーの追加</h2>
	<br><br>

	<form action="GroupMemberAddAction" id="memberSend" onSubmit="return check()">
		<h4>左のセレクトボックスから、参加するメンバーを選択してください</h4>

		<br><br>
<select multiple="multiple" id="multi-select" name="addMemberList">
<s:iterator value="followList" >
  <option value='<s:property value="userId"/>'><s:property value="userName"/></option>
</s:iterator>
</select>
  <br><br>
<s:hidden theme="simple" name="groupId" value="%{groupId}"></s:hidden>
  <button type="submit" class="btn btn-primary btn-lg">グループを作成</button>
</form>
</div>

<footer><div  class = "footer">
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
 </div></footer>
</body>
</html>