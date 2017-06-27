<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<!-- <meta http-equiv="refresh" content="1">-->
<title>chat sample</title>

<!-- Stylesheet
    ================================================== -->
<link href="css/bootstrap3.css" rel="stylesheet">
<!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
<link rel="stylesheet" href="css/Bfooter.css">
<link rel="stylesheet" href="css/form.css">
<link rel="stylesheet" href="css/style2.css">
<link rel="stylesheet" href="css/modal.css">
<link rel="stylesheet" href="css/chat.css">


<!-- Javascripts
    ================================================== -->
<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/toast.js"></script>
<script type="text/javascript" src="js/jquery_elapse.js"></script>
<!-- 自動リンクのプログラム -->
<script src="js/autoLink.js"></script>
<s:iterator value="msgList">
  <script type="text/javascript">
    $(function() {
      var toast = new Toast();
      var msg = "<s:property value="msg"/>";
      if (msg != "") {
        toast.show(msg);
      }
    });
  </script>
</s:iterator>
<script type="text/javascript">
  setTimeout("location.reload()", 1000 * 30)
</script>
</head>
<s:if test="groupId == 0">
  <div class="chatroomname">
    <a style="color: white;"
      href="<s:url action="ProfileSessionAction"><s:param name="viewId" value="%{receiverId}"/></s:url>"><s:property
        value="receiverName" /></a>
  </div>
</s:if>
<s:else>
  <div class="chatroomname">
    <s:property value="groupName" />
  </div>
</s:else>
<body>

  <!-- 個人チャットの際のヘッダー -->
  <s:if test="groupId == 0">
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <a class="navbar-brand" href="<s:url action="GoTalkListAction"/>">&laquo;</a>
        </div>
        <div class="collapse navbar-collapse" id="nav_target"></div>
      </div>
    </nav>
  </s:if>
  <!-- グループチャットの際のヘッダー -->
  <s:else>
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <a class="navbar-brand" href="<s:url action="GoGroupAction"/>">&laquo;</a>
          <button type="button" class="navbar-toggle collapsed"
            data-toggle="collapse" data-target="#nav_target">
            <span class="icon-bar"></span> <span class="icon-bar"></span> <span
              class="icon-bar"></span>
          </button>
        </div>
        <div class="collapse navbar-collapse" id="nav_target">
          <ul class="nav navbar-nav navbar-right">
            <li><a data-toggle="modal" class="cursor" data-target="#groupMemberModal">メンバーを確認</a></li>
            <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">メンバーを追加 <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li><a data-toggle="modal" class="cursor"
                  onclick="document.memberform.submit();return false;">フォローリストからメンバーを追加</a>
                  <form name="memberform" action="GoGroupMemberAddAction">
                    <s:hidden theme="simple" name="groupId" value="%{groupId}"></s:hidden>
                  </form></li>
                <li><a href="#" data-toggle="modal" data-target="#memberAdd">ユーザー検索でメンバーを追加</a></li>
              </ul></li>
            <li><a data-toggle="modal" class="cursor" data-target="#groupExit">このグループから脱退</a></li>
          </ul>
        </div>
      </div>
    </nav>
  </s:else>
  <!-- グループメンバーの確認画面 -->
  <div class="modal fade" id="groupMemberModal" tabindex="-1">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">
            <span>&times;</span>
          </button>
          <h4 class="modal-title">メンバーを確認する</h4>
        </div>
        <div class="modal-body">
          <iframe id="groupMember" src="<s:url action="GoGroupMemberAction" />"></iframe>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">キャンセル</button>
        </div>
      </div>
    </div>
  </div>

  <!-- 検索画面 -->
<div class="modal fade" id="memberAdd" tabindex="-1">
	<div class="modal-dialog modal-sm">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"><span>×</span></button>
				<h4 class="modal-title">友達を検索する</h4>
			</div>
			<s:form action="FriendSearchAction">
			<s:hidden theme="simple" name="groupId" value="%{groupId}"></s:hidden>
				<div class="modal-body">
					<input type="text" name="userName" maxlength="50" required placeholder="名前を入力してください" class="groupName">
				</div>
			<div class="modal-footer">
				<s:token/>
				<button type="submit" class="btn btn-primary" >検索</button>
			</div>
			</s:form>
		</div>
	</div>
</div>

  <!-- グループ脱退の確認画面 -->
  <div class="modal fade" id="groupExit" tabindex="-1">
    <div class="modal-dialog modal-sm">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">
            <span>×</span>
          </button>
          <h4 class="modal-title">グループを脱退する</h4>
        </div>
        <s:form action="MemberRemoveAction">
          <div class="modal-body">
            <p>グループから脱退すると、これまでの投稿も閲覧できなくなります。よろしいですか？</p>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">キャンセル</button>
            <s:hidden theme="simple" name="groupId" value="%{groupId}"></s:hidden>
            <button type="submit" class="btn btn-danger">グループから脱退</button>
          </div>
        </s:form>
      </div>
    </div>
  </div>

  <div class="outline">
    <s:iterator value="postList">

      <!-- 自分の投稿内容 -->
      <s:if test="userId==senderId">
        <div align="right" style="float: right; width: 100%; position:relative; min-height:110px; margin-right:10px;">
          <div style="float: right;position:absolute;right:0px;">
            <img src="<s:property value="senderImg"/>" alt=""
              width="50px" height="50px" style="border-radius:50%; margin-left:5px;">
            <h6 style="  max-width:50px;overflow: hidden;">
              <s:property value="senderName" />
            </h6>
            <h6 style="  max-width:50px;overflow: hidden;">
              <span class="timeArea"
                title="<s:property value="(postAt.substring(0,19))"/>"></span>
            </h6>
          </div>

          <s:if test="img.startsWith('pic/stamp')">
          <div  style="width:70%;float: right; margin-bottom:10px;margin-right:60px;"><img src="<s:property value="img"/>" style="border-radius:8px; width:50%; max-width:300px;"></div>
          </s:if><s:else>
          	<pre style="float: right; background-color: #9FF9FF; text-align: left; margin-right:60px;"
          	><s:property value="postContents" /></pre>
          </s:else>
        </div>
        <div style="clear: both;"></div>
      </s:if>
      <!-- 他人の投稿内容 -->
      <s:else>
		<div style="float:left; width:100%; position:relative; min-height:110px; margin-left:10px;">
          <div style="float:left; position:absolute;">
            <img src="<s:property value="senderImg"/>" alt=""
              width="50px" height="50px" style="border-radius:50%;">
            <h6 style="  max-width:50px;overflow:hidden">
              <s:property value="senderName" />

            </h6>
            <h6 style=" max-width:50px;overflow:hidden;">
              <span class="timeArea"
                title="<s:property value="(postAt.substring(0,19))"/>"></span>
            </h6>
          </div>
          <s:if test="img.startsWith('pic/stamp')">
          	<div  style="width:70%;float: left; margin-bottom:10px;margin-left:60px;"><img src="<s:property value="img"/>" style="border-radius:8px; width:50%; max-width:300px;" ></div>
          </s:if><s:else>
          	<pre style="float: left; margin-left:60px;"><s:property value="postContents" /></pre>
          </s:else>
        <s:if test="readFlg==0"><span style="color:red; position:absolute; top:-10px;left:50px;"id="targ">new!</span></s:if>
        </div>
        <div style="clear: both;"></div>
      </s:else>
    </s:iterator>
    <div style="clear: both;" id="targ"></div>
  </div>
  <br>

  <script>
    window.onload = function() {
      var element = document.getElementById("targ");
      var rect = element.getBoundingClientRect();
      var positionY = rect.top + window.pageYOffset;
      window.scrollTo(0, positionY - 100);
    }
  </script>
  <s:include value="form.jsp" />
</body>
</html>