<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="css/Bfooter.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<style>
.active{
color:red;
font-size:25px;
font-weight:bold;
}

</style>

<script>
$('a').click(function() {
    var subMenu = $(this).attr('class').substring(-1,7);
    $("aside.sidebar").removeClass('active');
    if ( !$( this ).hasClass( 'active' ) ) {
            $("aside."+subMenu).addClass('active');
    }
    $(this).siblings().removeClass('active');
    $(this).toggleClass('active');
});
</script>

</head>

<footer>


	<div class="footer">
		<nav>
			<div class="contents">
				<div class="a" style="margin-right: 20px">
					<a
						href="<s:url action="ProfileSessionAction"><s:param name="viewId" value="%{userId}"/></s:url>"><img
						class="pic" src="pic/profile.png"></a>
				</div>

				<div class="a" style="margin-right: 20px">
					<a href="<s:url action="GoTalkListAction"/>"><img class="pic"
						src="pic/talk.png"> <s:if
							test="talkInfo > 0 and talkInfo <100">
							<span class="b"><s:property value="talkInfo" /></span>
						</s:if> <s:if test="talkInfo >= 100 and talkInfo <1000">
							<span class="bh"><s:property value="talkInfo" /></span>
						</s:if> <s:if test="talkInfo >= 1000">
							<span class="bt"><s:property value="talkInfo" /></span>
						</s:if> </a>
				</div>

				<div class="a" style="margin-right: 20px">
					<a href="<s:url action="GoGroupAction"/>"><img class="pic"
						src="pic/group.png"> <s:if
							test="groupInfo > 0 and groupInfo <100">
							<span class="b"><s:property value="groupInfo" /></span>
						</s:if> <s:if test="groupInfo >= 100 and groupInfo <1000">
							<span class="bh"><s:property value="groupInfo" /></span>
						</s:if> <s:if test="groupInfo >= 1000">
							<span class="bt"><s:property value="groupInfo" /></span>
						</s:if> </a>
				</div>

				<div class="a">
					<a href="<s:url action="GoTimelineAction"/>"><img class="pic"
						src="pic/time_line.png"></a>
				</div>
			</div>
		</nav>
	</div>
</footer>


</html>
