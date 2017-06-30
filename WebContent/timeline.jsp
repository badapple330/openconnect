<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "s" uri= "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>タイムライン</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<!-- Stylesheet
    ================================================== -->
	<link href="css/bootstrap.css" rel="stylesheet">
		<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
			<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->
	<link rel="stylesheet" href="css/style2.css">
	<link rel="stylesheet" href="css/timeline.css">
	<link rel="stylesheet" href="css/Bfooter.css">

	<!-- Javascripts
    ================================================== -->
    <script src="js/jquery-3.2.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<!-- ↓相対時刻を表示するプログラム↓ -->
	<script type="text/javascript" src="js/jquery_elapse.js"></script>
	<!-- ↓通知表示のプログラム↓ -->
	<script src="js/toast.js"></script>
	<!-- 自動リンクのプログラム -->
	<script src="js/autoLink.js"></script>
	<script type="text/javascript">
	<!--
	function check(){
	if(document.tlSend.sendContents.value == ""){
		window.alert('必須項目に未入力がありました');
		return false;
		}
		else{
			return true;
		}
	}
	// -->
	</script>
	<s:iterator value="msgList" >
	<script type="text/javascript">
		$(function(){
			var toast = new Toast();
			var msg = "<s:property value="msg"/>";
			if(msg != ""){
				toast.show(msg);
			}

		});
	</script>
	</s:iterator>
	</head>
<body>

<div class="outline" >
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid" style ="background-color:<s:property value="#session.hColor"/>;">
    <div class="navbar-header">
      <a class="navbar-brand" href="applist.jsp">Openconnect</a>
   <button type="button" class="send" data-toggle="modal" data-target="#sampleModal">
	<span class="glyphicon glyphicon-pencil"></span>  投稿
</button>
    </div>

  </div>
</nav>


<!-- タイムラインの投稿フォーム -->
<div class="modal fade" id="sampleModal" tabindex="-1">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"><span>×</span></button>
				<h4 class="modal-title">タイムラインを投稿する</h4>
			</div>

<s:form action="SendTimelineAction" name="tlSend" onSubmit="return check()" id="tl">
<div class="modal-body">
	<div class="panel panel-default">
		<div class="panel-body">
    		<textarea name="sendContents" class="form-control" rows="10" cols="80%" maxlength="255" id="sendContents"></textarea>
    	</div>
    	<div class="modal-footer">
    	<s:token/>
    		<button type="submit" class="btn btn-primary">送信</button>
    	</div>
	</div>
</div>
</s:form>
</div>
	</div>
</div>

<!-- ここまで -->


<div class="container" >
<div class="outline" id="outline">

<div class="col-sm-1 visible-lg-block"></div>

<div class="col-sm-10">
<s:iterator value="tlList">
<!-- 自分の投稿内容 -->
 <s:if test="userId==senderId" >
	<div class="timeline" style="<s:if test="userId==reUserId">background-color: #daeaec;</s:if> border-left: solid 6px #f5504b;/*左線*/;">
		<a href="#" data-toggle="modal" data-target="#timelineDelete<s:property value="timelineId"/>" id="deleteIcon"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></a>
		<div class="timeimg">
			<a href="<s:url action="ProfileSessionAction"><s:param name="viewId" value="%{senderId}"/></s:url>">
			<img src="<s:property value="userImg"/>"   alt="" class="img-rounded-ex"></a>
		</div>
		<div class="timetext">
			<h4><a href="<s:url action="ProfileSessionAction"><s:param name="viewId" value="%{senderId}"/></s:url>">
			<s:property value="userName"/></a></h4>
			<span class="timeArea" title="<s:property value="(sendAt.substring(0,19))"/>"></span>
			<div class="glyphicon glyphicon-share-alt" aria-hidden="true" id="receive" data-toggle="modal" data-target="#timelineReceive<s:property value="timelineId"/>"></div>
			<div class="text">返信する</div>

			<div style="clear:both;"></div>
			<pre id="sendcontents"><s:property value="sendContents" /></pre>
		</div>
		<div class="btn-area">
			<div style="text-align:right">
				<img src="pic/q.png" width= "13" height="13">x<s:property value="point"/>
			</div>
		</div>

			<!-- 返信画面 -->
		<div class="modal fade" id="timelineReceive<s:property value="timelineId"/>" tabindex="-1">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"><span>×</span></button>
						<h4 class="modal-title">この投稿に返信する</h4>
					</div>
					<s:form action="SendTimelineAction">
						<div class="modal-body">
							<pre class="sendcontents"><s:property value="sendContents" /></pre>
							<textarea name="reSendContents" class="form-control" rows="10" cols="80%" maxlength="205"></textarea>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">キャンセル</button>
							<s:hidden theme="simple" name="reTimelineId" value="%{timelineId}"></s:hidden>
							<s:hidden theme="simple" name="userName" value="%{userName}"></s:hidden>
							<button type="submit" class="btn btn-primary">投稿</button>
						</div>
					</s:form>
				</div>
			</div>
		</div>


	<!-- 投稿削除の確認画面 -->
		<div class="modal fade" id="timelineDelete<s:property value="timelineId"/>" tabindex="-1">
			<div class="modal-dialog modal-sm">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"><span>×</span></button>
						<h4 class="modal-title">この投稿を削除します</h4>
					</div>
					<s:form action="DeleteTimelineAction">
						<div class="modal-body">
							<pre class="sendcontents" id="sendcontents"><s:property value="sendContents" /></pre>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">キャンセル</button>
							<s:hidden theme="simple" name="timelineId" value="%{timelineId}"></s:hidden>
							<button type="submit" class="btn btn-danger">削除</button>
						</div>
					</s:form>
				</div>
			</div>
		</div>

	<!-- 返信の場合の返信先のツイート -->
	<s:if test="reSendContents != null">
	<div class="reTimeline">
		<div class="timeimg">
			<a href="<s:url action="ProfileSessionAction"><s:param name="viewId" value="%{senderId}"/></s:url>">
			<img src="<s:property value="reImg"/>"   alt="" class="img-rounded-re"></a>
		</div>
		<div class="timetext">
			<h4><a href="<s:url action="ProfileSessionAction"><s:param name="viewId" value="%{senderId}"/></s:url>">
			<s:property value="reUserName"/></a></h4>
			<span class="timeArea" title="<s:property value="(reSendAt.substring(0,19))"/>"></span>
			<div style="clear:both;"></div>
			<pre><s:property value="reSendContents" /></pre>
		</div>
		</div>
 	</s:if>



	</div>
 </s:if>


<!-- 他人の投稿内容 -->
 <s:else>
	<div class="timeline" <s:if test="userId==reUserId">style="background-color: #daeaec;"</s:if> >
		<div class="timeimg">
			<a href="<s:url action="ProfileSessionAction"><s:param name="viewId" value="%{senderId}"/></s:url>">
			<img src="<s:property value="userImg"/>"   alt="" class="img-rounded-ex"    width="50" height="50"></a>
		</div>
		<div class="timetext">
			<h4><a href="<s:url action="ProfileSessionAction"><s:param name="viewId" value="%{senderId}"/></s:url>">
			<s:property value="userName"/></a></h4>
			<span class="timeArea" title="<s:property value="(sendAt.substring(0,19))"/>"></span>
			<div class="glyphicon glyphicon-share-alt" aria-hidden="true" id="receive" data-toggle="modal" data-target="#timelineReceive<s:property value="timelineId"/>"></div>
			<div class="text">返信する</div>
			<div style="clear:both;"></div>
			<pre id="sendcontents"><s:property value="sendContents" /></pre>
		</div>

	<!-- 返信画面 -->
		<div class="modal fade" id="timelineReceive<s:property value="timelineId"/>" tabindex="-1">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"><span>×</span></button>
						<h4 class="modal-title">この投稿に返信する</h4>
					</div>
					<s:form action="SendTimelineAction">
						<div class="modal-body">
							<pre class="sendcontents"><s:property value="sendContents" /></pre>
							<textarea name="reSendContents" class="form-control" rows="10" cols="80%" maxlength="205"></textarea>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">キャンセル</button>
							<s:hidden theme="simple" name="reTimelineId" value="%{timelineId}"></s:hidden>
							<s:hidden theme="simple" name="userName" value="%{userName}"></s:hidden>
							<button type="submit" class="btn btn-primary">投稿</button>
						</div>
					</s:form>
				</div>
			</div>
		</div>
		<div class="btn-area">
		<!-- いいね後 -->
			<div style="text-align:right">
				<s:if test="goodFlg"><button type="button" class="good"></button><img src="pic/q.png" width= "20" height="20">

				</s:if>
			</div>
		<!-- いいね前 -->
			<s:else>
				<s:form action="btnAction"><s:hidden name="userId" value="%{userId}"/><s:hidden name="senderId" value="%{senderId}"/><s:hidden name="timelineId" value="%{timelineId}"/><s:hidden name="btn_flg" value="1"/>
					<div style="text-align:right">
						<button type="button" onClick="submit()" class="good"><img src="pic/fff.png" width= "20" height="20"></button>
					</div>
				</s:form>
			</s:else>

			<div style="text-align:right">
				<img src="pic/q.png" width= "13" height="13">x<s:property value="point"/>
			</div>
		</div>


			<!-- 返信の場合の返信先のツイート -->
	<s:if test="reTimelineId != 0">
	<div class="reTimeline">
		<div class="timeimg">
			<a href="<s:url action="ProfileSessionAction"><s:param name="viewId" value="%{senderId}"/></s:url>">
			<img src="<s:property value="reImg"/>"   alt="" class="img-rounded-re"></a>
		</div>
		<div class="timetext">
			<h4><a href="<s:url action="ProfileSessionAction"><s:param name="viewId" value="%{senderId}"/></s:url>">
			<s:property value="reUserName"/></a></h4>
			<span class="timeArea" title="<s:property value="(reSendAt.substring(0,19))"/>"></span>
			<div style="clear:both;"></div>
			<pre><s:property value="reSendContents" /></pre>
		</div>
		</div>
 	</s:if>
</div>
</s:else>

 <div style="clear:both;"></div>
</s:iterator>
 <s:if test="tlList.size()==0">
 <h2>まだ投稿がありません</h2>
 <p><a  href="#" data-toggle="modal" data-target="#sampleModal">投稿をする</a>か、他の人をフォローしましょう！</p>
 </s:if>
</div>

<div class="col-sm-1 visible-lg-block"></div>
</div>
<!-- /container -->
  </div>
  </div>

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

 <div class="a" style="margin-right:20px" ><a href="<s:url action="GoGroupAction"/>"><img class="pic" src ="pic/group.png" >
 <s:if test="groupInfo > 0 and groupInfo <100"><span class="b"><s:property value="groupInfo" /></span></s:if>
 <s:if test="groupInfo >= 100 and groupInfo <1000"><span class="bh"><s:property value="groupInfo" /></span></s:if>
 <s:if test="groupInfo >= 1000"><span class="bt"><s:property value="groupInfo" /></span></s:if>
 </a></div>

 <div class="a" style="background-color:rgb(111, 207, 245);"><a href="<s:url action="GoTimelineAction"/>"><img class="pic" src ="pic/time_line.png" ></a></div>
 </div>
 </nav>
 </div>
 </footer> -->
 <jsp:include page="Bfooter.jsp" />

</body>
</html>