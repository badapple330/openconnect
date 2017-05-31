<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>




<!DOCTYPE html>
<html lang="ja">
<head>

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>プロジェクト一覧編集画面</title>


</head>
<body>

  <!-- ヘッダー読み込み -->


<div class="container">
  <h3 style="border-bottom: 1px solid rgba(0,0,0,0.1); box-shadow: 0 1px 0 rgba(255,255,255,1);">
    プロジェクト一覧編集
  </h3>

  <s:form action="AdminItemUpdateExecuteAction" method="post">
<div class="form-group">
<label for="inputItemId">編集プロジェクトID</label><p>
  【<s:property value="projectId"/>】
</p>
</div>

    <div class="form-group">
      <label for="inputItemName">プロジェクト名</label><span class="required label label-default" style="margin-left:10px; background-color:lightcoral; color:black">必須</span><BR>
      <input type="text" name="itemName" id="inputItemName" maxlength=100 class="form-control" required="required" value="<s:property value="projectName" />" />
    </div>

   <div class="form-group">
      <label for="InputPrice">管理者ID（リーダー）</label><span class="required label label-default" style="margin-left:10px; background-color:lightcoral; color:black">必須</span><BR>
      <input type="number" name="price" class="form-control" id="InputPrice" value="<s:property value="managerID" />" required="required" />
    </div>

    <div class="form-group">
      <label for="InputPrice">管理者ID（サブリーダー）</label><span class="required label label-default" style="margin-left:10px; background-color:lightcoral; color:black">必須</span><BR>
      <input type="number" name="price" class="form-control" id="InputPrice" value="<s:property value="subManagerId" />" required="required" />
    </div>


    <div>
      <span style="font-weight:bold;">開始日</span>
      <div class="input-daterange input-group datepicker">
        <input type="text" name="displayStartDttm" class="form-control" value="<s:property value="displayStartDttm" />" /><BR>
        <span style="font-weight:bold;">終了日</span><BR>
        <input type="text" name="displayEndDttm" class="form-control" value="<s:property value="displayEndDttm" />" />
      </div>
    </div>


    <div class="form-group">
      <label for="inputItemText" class="control-label">NOTE(225文字以内)</label>
      <div>
          <textarea class="form-control" rows="3" id="inputItemText" name="itemText" ><s:property value="itemText"/></textarea>
      </div>
	</div>


    <input type="hidden" name="projectId" value="<s:property value="projectId" />" />
    <div class="row text-center center-block" style="width:450px">
      <s:submit value="編集を完了する"/>
    </div>


  </s:form>

<p style="text-align:center">
  <a href="">TOPへ戻る</a>
</p>

</div>
</body>
</html>

