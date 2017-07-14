<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri= "/struts-tags" %>
<!DOCTYPE html>
<html lang="ja">
<div class="modal-header">
  <button type="button" class="close" data-dismiss="modal"><span>×</span></button>
  <h6 class="modal-title">スタンプ</h6>
</div>

<div class="m-http://localhost:8080/openconnect/GoChatAction.action#text">
  <ul id="normal" class="dropmenu">
    <s:iterator value="stampPackageList">
      <li><a href="#"><img src="<s:property value="stampList.get(0).stamp"/>" height="50px"></a>
        <div class="stamps">
          <s:iterator value="stampList">
            <s:form action="SubmitMessageAction">
              <s:hidden name="receiverId" />
              <s:hidden name="groupId" />
              <s:hidden name="groupName" />
              <s:hidden name="friendsName" />
              <s:hidden name="stampId" />
              <button type="submit" onclick="disableSubmit(this);">
                <img class="imgzoon" src="<s:property value="stamp"/>">
              </button>
            </s:form>
          </s:iterator>
        </div></li>
    </s:iterator>
  </ul>
</div>
</html>