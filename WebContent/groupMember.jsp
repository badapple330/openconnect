<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
    <!-- ▼▼Stylesheet -->
    <link rel="stylesheet" href="css/groupMember.css">
    <!-- ▼▼jQuery -->
    <!-- ▼▼他のjavascript -->

    <script>
    // 読み込みが完了してから処理を行う
    $(window).on('load resize',function(){
      // 親画面のiframe要素
      var elm = window.parent.document.getElementById("groupMember");
      // 子要素のコンテンツサイズに合わせて調整
      elm.style.height = document.body.clientHeight + 20 + "px";
    });
    </script>
  </head>
  <body>
    <div class="modal-header">
      <button type="button" class="close" data-dismiss="modal">
        <span>&times;</span>
      </button>
      <h4 class="modal-title">メンバーを確認する</h4>
    </div>
    <div class="modal-body">
      <s:iterator value="memberList" status="i">
      <s:form action="GoProfileAction" target="_top">
        <s:hidden name="viewId" value="%{memberList.get(#i.index).userId}" />
        <input type="image" alt="" src="<s:property value="%{memberList.get(#i.index).userIcon}"/>" class="img-circle-ex">
      </s:form>
      </s:iterator>
    </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">キャンセル</button>
      </div>
  </body>
</html>