<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>グループ一覧</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Stylesheet
    ================================================== -->
<link rel="stylesheet" href="css/bootstrap.css" />
<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
			<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->
<link rel="stylesheet" href="css/bb_style.css">
<link rel="stylesheet" href="css/group.css">
<link rel="stylesheet" href="css/Bfooter.css">


<!-- Javascripts
    ================================================== -->
<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/toast.js"></script>
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
  setTimeout("location.reload()", 1000 * 60)
</script>

</head>

<!-- ヘッダです -->
<body style="background-color:<s:property value="#session.bColor"/>;">
  <br>
  <nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid"
      style="background-color:<s:property value="#session.hColor"/>;">
      <div class="navbar-header">
        <a class="navbar-brand" href="applist.jsp">Openconnect</a>
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#gnavi">
          <span class="sr-only">メニュー</span> <span class="icon-bar"></span>
          <span class="icon-bar"></span> <span class="icon-bar"></span>
        </button>
      </div>

      <div id="gnavi" class="collapse navbar-collapse">
        <ul class="nav navbar-nav navbar-right">
          <li><a data-toggle="modal" data-target="#groupAdd" class="cursor">グループを追加</a></li>
        </ul>
      </div>
    </div>
  </nav>

  <!-- モーダル・ダイアログ -->
  <div class="modal fade" id="groupAdd" tabindex="-1">
    <div class="modal-dialog modal-sm">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">
            <span>×</span>
          </button>
          <h4 class="modal-title">グループを作成する</h4>
        </div>
        <s:form action="GroupTokenAction">
          <div class="modal-body">
            <h5>グループ名</h5>
            <input type="text" name="groupName" maxlength="50" required
              placeholder="グループ名を入力してください" class="groupName">

          </div>
          <div class="modal-footer">
            <s:token />
            <button type="submit" class="btn btn-primary">グループを作る</button>
          </div>
        </s:form>
      </div>
    </div>
  </div>





  <div class="container">
    <div class="row">

      <s:property value="groupList.get(0).groupName" />
        <div class="outline">
          <s:iterator value="groupList">
            <s:form action="GoChatAction">
              <s:hidden theme="simple" name="groupId" value="%{groupId}"></s:hidden>
              <s:hidden name="groupName"></s:hidden>
              <button type="submit" class="group">
                <img src="<s:property value="groupIcon"/>" alt="" class="img-circle-ex">
                <h3><s:property value="groupName" /></h3>
                <p><s:property value="lastMsg" /></p>

                <s:if test="unreadCount > 0 && unreadCount < 100">
                  <span class="tell"><s:property value="unreadCount" /></span>
                </s:if>
                <s:if test="unreadCount >= 100">
                  <span class="tellOver">100~ </span>
                </s:if>
              </button>
            </s:form>
          </s:iterator>
          <s:if test="groupList.size()==0">
            <div style="position: fixed; top: 40%; textalign: centger;">
              <a data-toggle="modal" data-target="#groupAdd" class="cursor">
                グループに参加していません。
                <br>グループを作成してみましょう。
              </a>
            </div>
          </s:if>
        </div>

    </div>
  </div>
  <jsp:include page="Bfooter.jsp" />
</body>
</html>