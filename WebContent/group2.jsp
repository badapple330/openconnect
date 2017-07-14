<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title></title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
  <!-- ▼▼Stylesheet -->
  <link rel="stylesheet" href="css/normalize.css">
  <link rel="stylesheet" href="css/b_style2.css">
  <link rel="stylesheet" href="css/group2.css">
  <!-- ▼▼jQuery -->
  <script src="js/jquery-3.2.1.min.js"></script>
  <!-- ▼▼他のjavascript -->
  <script src="js/bootstrap.min.js"></script>

</head>
<body>
<div class="group_list">
  <s:property value="errorMsg"/>
  <s:iterator value="groupList" status="i">
    <s:form action="GoChatAction2">
      <s:hidden name="groupId" value="%{groupList.get(#i.index).groupId}" />
      <button class="group" type="submit">
        <img class="group_icon" alt="グループアイコン" src="<s:property value="groupList.get(#i.index).groupIcon"/>">
        <div class="group_body">
          <div class="group_name"><s:property value="groupList.get(#i.index).name"/></div>
            <s:if test="groupList.get(#i.index).lastMsg != null">
              <div class="last_msg">
                <s:property value="groupList.get(#i.index).lastMsg" />
              </div>
            </s:if>
          </div>
        <div class="group_info">
          <s:if test="today != groupList.get(#i.index).lastMsgDate">
            <span class="last_msg_time"><s:property value="groupList.get(#i.index).lastMsgDate"/></span>
          </s:if>
          <span class="last_msg_time"><s:property value="groupList.get(#i.index).lastMsgTime"/></span>
        </div>
      </button>
    </s:form>
  </s:iterator>
</div>
</body>
</html>