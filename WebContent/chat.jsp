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

<!-- ▼▼Stylesheet -->
<link href="css/bootstrap.css" rel="stylesheet">
<!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
<link rel="stylesheet" href="css/form.css">
<link rel="stylesheet" href="css/bb_style.css">
<link rel="stylesheet" href="css/modal.css">
<link rel="stylesheet" href="css/chat.css">
<link rel="stylesheet" href="css/imgList.css">
<!-- スタンプ系 -->
<link rel="stylesheet" href="css/form.css">
<link rel="stylesheet" href="css/dropdown.css">


<!-- ▼▼JavaScript -->
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
  setTimeout(function() {
    window.location.href = '<s:url action="GoChatAction" />';
  }, 30000);
</script>
</head>
<s:if test="groupId == 0">
  <div class="chatroomname">
    <a style="color: white;"
     href="<s:url action="GoProfileAction"><s:param name="viewId" value="%{receiverId}"/></s:url>">
      <s:property value="receiverName" /></a>
  </div>
</s:if>
<s:else>
  <div class="chatroomname">
    <s:property value="groupName" />
  </div>
</s:else>
<body style="background-color:<s:property value="#session.bColor"/>;">

  <!-- 個人チャットの際のヘッダー -->
  <s:if test="groupId == 0">
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid" style ="background-color:<s:property value="#session.hColor"/>;">
        <div class="navbar-header">
          <a class="navbar-brand"
            href="<s:url action="GoTalkListAction"/>">&laquo;</a>
        </div>
        <div class="collapse navbar-collapse" id="nav_target"></div>
      </div>
    </nav>
  </s:if>
  <!-- グループチャットの際のヘッダー -->
  <s:else>
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid" style="background-color:<s:property value="#session.hColor"/>;">
        <div class="navbar-header">
          <a class="navbar-brand" href="<s:url action="GoGroupAction"/>">&laquo;</a>
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#nav_target">
            <span class="icon-bar"></span> <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
        </div>
        <div class="collapse navbar-collapse" id="nav_target">
          <ul class="nav navbar-nav navbar-right">
            <li><a data-toggle="modal" class="cursor"
              data-target="#groupNameChange">グループ名変更</a></li>
            <li><a data-toggle="modal" class="cursor"
              data-target="#groupImageChange">グループ画像変更</a></li>
            <li><a href="<s:url action='GoGroupMemberAction' />" target="groupMember" data-toggle="modal" class="cursor"
              data-target="#groupMemberModal">メンバーを確認</a></li>
            <li class="dropdown"><a href="#"
              class="dropdown-toggle" data-toggle="dropdown">メンバーを追加
                <span class="caret"></span>
            </a>
              <ul class="dropdown-menu">
                <li><a data-toggle="modal" class="cursor"
                  onclick="document.memberform.submit();return false;">フォローリストからメンバーを追加</a>
                  <form name="memberform"
                    action="GoGroupMemberAddAction">
                    <s:hidden theme="simple" name="groupId"
                      value="%{groupId}"><s:hidden name="groupName"></s:hidden></s:hidden>
                  </form></li>
                <li><a href="#" data-toggle="modal"
                  data-target="#memberAdd">ユーザー検索でメンバーを追加</a></li>
              </ul></li>
            <li><a data-toggle="modal" class="cursor"
              data-target="#groupExit">このグループから脱退</a></li>
          </ul>
        </div>
      </div>
    </nav>


    <!-- グループ名変更画面 -->
    <div class="modal fade" id="groupNameChange" tabindex="-1">
    	<div class="modal-dialog">
    	  <div class="modal-content">
    	    <div class="modal-header">
    	      <button type="button" class="close" data-dismiss="modal">
    	        <span>&times;</span>
    	      </button>
    	      <h4 class="modal-title">グループ名更新(30字以内)</h4>
    	    </div>
    	    <s:form action="GroupNameChangeAction">
    	    <div class="modal-body">
    	    	<textarea name="groupName" class="form-control" rows="1" maxlength="30" style="list-area:none; resize:none;"><s:property value="groupName"/></textarea>
    	    </div>
    	    <div class="modal-footer">
    	    	<button type="submit" class="btn btn-primary">更新</button>
    	    </div>
    	    </s:form>
    	   </div>
    	</div>
    </div>

    <!-- グループ画像変更画面 -->
    <div class="modal fade" id="groupImageChange" tabindex="-1">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">
              <span>&times;</span>
            </button>
            <h4 class="modal-title">画像を変更する</h4>
          </div>
          <s:form action="UpdateGroupIconAction">
          <div class="modal-body">
          	<s:iterator value="groupIconList" status="rs">
          	<s:if test="%{#rs.count%2==0}">
        <div style="float:left">
            <input type="radio" name="url" value="<s:property value="url"/>"  style="background:url(./<s:property value="url"/>);background-size:100% 100%;">
            </div>
            </s:if><s:else>
            <div style="float:left; background-color:#dddddd;" >
            <input type="radio" name="url" value="<s:property value="url" />"style="background:url(./<s:property value="url"/>);background-size:100% 100%;" >
            </div>


            </s:else>
            </s:iterator>
            <div style="clear:both"></div>

          </div>
          <s:hidden name="groupId" />
          <div class="modal-footer" >
              <s:token />
              <button type="submit" class="btn btn-primary">変更</button>

            </div>
           </s:form>
        </div>
      </div>
    </div>

    <!-- グループメンバーの確認画面 -->
    <div class="modal fade" id="groupMemberModal" tabindex="-1">
      <div class="modal-dialog">
        <div class="modal-content">
          <iframe id="groupMember" name="groupMember"></iframe>
        </div>
      </div>
    </div>

    <!-- 検索画面 -->
    <div class="modal fade" id="memberAdd" tabindex="-1">
      <div class="modal-dialog modal-sm">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">
              <span>×</span>
            </button>
            <h4 class="modal-title">友達を検索する</h4>
          </div>
          <s:form action="FriendSearchAction">
            <s:hidden theme="simple" name="groupId" value="%{groupId}"></s:hidden>
            <div class="modal-body">
              <input type="text" name="userName" maxlength="50" required
                placeholder="名前を入力してください" class="groupName">
            </div>
            <div class="modal-footer">
              <s:token />
              <button type="submit" class="btn btn-primary">検索</button>
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
              <button type="button" class="btn btn-default"
                data-dismiss="modal">キャンセル</button>
              <s:hidden theme="simple" name="groupId" value="%{groupId}"></s:hidden>
              <button type="submit" class="btn btn-danger">グループから脱退</button>
            </div>
          </s:form>
        </div>
      </div>
    </div>
  </s:else>
  <div class="outline">
    <s:iterator value="chat">

      <s:if test="userId == senderId">
      <!-- 自分の投稿内容 -->
        <div class="message_right">
          <h6 class="name_right"><s:property value="senderName" /></h6>
          <div style="float: right; position: absolute; right: 0px;">
            <img class="user_icon" src="<s:property value="senderImg"/>" alt="アイコン">
            <h6 class="timeArea" title="<s:property value="(createdAt.substring(0,19))"/>"></h6>
          </div>
          <s:if test="stamp.startsWith('pic/stamp')">
            <img class="stamp_right" src="<s:property value="stamp"/>">
          </s:if>
          <s:else>
            <pre style="float: right; background-color: #9FF9FF; text-align: left; margin-right: 60px;"><s:property value="text" /></pre>
          </s:else>
        </div>
        <div style="clear: both;"></div>
      </s:if>
      <s:else>
      <!-- 他人の投稿内容 -->
        <div class="message_left">
          <h6 class="name_left"><s:property value="senderName" /></h6>
          <div style="float: left; position: absolute;">
            <img class="user_icon" src="<s:property value="senderImg"/>" alt="アイコン">
            <h6 class="timeArea" title="<s:property value="(createdAt.substring(0,19))"/>"></h6>
          </div>
          <s:if test="stamp.startsWith('pic/stamp')">
            <img class="stamp_left" src="<s:property value="stamp"/>">
          </s:if>
          <s:else>
            <pre style="float: left; margin-left: 60px;"><s:property value="text" /></pre>
          </s:else>
          <s:if test="readFlg==0">
            <span style="color: red; position: absolute; top: -10px; left: 50px;" id="targ">new!</span>
          </s:if>
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





  <div class = "nonbs-send-form" style ="background-color:<s:property value="#session.fColor"/>;">

<div class="nonbs-panel-body">
<s:form action="SubmitMessageAction">
  <div class="nonbs-form-group">
      <textarea name="text" class="nonbs-form-control" maxlength="255" ></textarea>
  </div><s:hidden name="receiverId" /><s:hidden name="groupId" /><s:hidden name="groupName" /><s:hidden name="friendsName" />
<div class="nonbs-rightside">
<button type="submit" class="btn btn-default" onclick="style.display='none'">送信</button>
</div>
</s:form>
</div>
</div>


<script>
var submit = document.getElementByClassName('submit');
function disableSubmit(button) {
  setTimeout(function() {
    button.disabled = true;
  }, 10);
  setTimeout(function() {
    button.disabled = false;
  }, 1000);
}

</script>

<div class="stamp-form">
  <a href="<s:url action='GoStampAction'></s:url>" target="stamp" class="stamp-btn" data-toggle="modal"
  data-target="#stampModal">
    <img height=20px; src="pic/stamp/icon.png">
  </a>
</div>


<div class="modal fade" id="stampModal" tabindex="-1">
  <div class="modal-dialog">
    <div class="modal-content">
      <iframe id="stamp" name="stamp"></iframe>
    </div>
  </div>
</div>

</body>
</html>