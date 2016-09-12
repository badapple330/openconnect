<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<LINK rel="stylesheet" type="text/css" href="css/style.css">
<meta charset="UTF-8">
<script src="js/jquery-3.0.0.min.js"></script>
<script src="js/sendCheck.js"></script>
<title>決裁編集</title>
</head>
<body>

	<jsp:include page="header.jsp" />

<h1>決裁手続き編集画面</h1>

<s:iterator value="decisionDetailList">

<table border="1"><tr><td>
パスワード変更
<s:form action="PasswordEdit">
<input type="hidden" name="decisionDetailId" value="<s:property value="decisionDetailId"/>">
<input type="text" name="password" value="<s:property value="password"/>" pattern="^[0-9A-Za-z]+$" placeholder="半角英数字のみ">
<input type="submit" value="変更" class="button">
</s:form>

<br>
</td></tr></table>
<br>
<br>
<br>
<h1>【決裁書】</h1>
<s:form action="DecisionEdit">
<table border="1">

<tr><td>
プロジェクト名    <s:property value="projectName"/>
<br>
日付　<input type="text" name="day" value="<s:property value="day"/>" placeholder="例：2016/09/10"  maxlength="10"  required>
<br>
決裁分類
<br>

<s:if test="%{decisionType=='実施決裁'}">
<input type="radio" name="decisionType" value="実施決裁" checked>実施決裁
<input type="radio" name="decisionType" value="契約決裁">契約決裁
</s:if>
<s:else>
<input type="radio" name="decisionType" value="実施決裁" >実施決裁
<input type="radio" name="decisionType" value="契約決裁" checked>契約決裁
</s:else>

<br>
起案者ID<input type="text" name="userId" value="<s:property value="userId"/>" maxlength="4" pattern="[1-9][0-9]*" title="半角数字4桁以内"  required>
<br>
案件名<input type="text" name="itemName" value="<s:property value="itemName"/>">
<br>
概要<input type="text" name="summary" value="<s:property value="summary"/>">
<br>
理由<input type="text" name="cause" value="<s:property value="cause"/>">
<br>
実施時期・実施機関
<br>
開始日<input type="text" name="startDay" value="<s:property value="startDay"/>" placeholder="例：2016/09/10"  maxlength="10" value="2016/" required>
<br>
終了日<input type="text" name="endDay" value="<s:property value="endDay"/>" placeholder="例：2016/09/10"  maxlength="10" value="2016/" required>
<br>
</td></tr></table>
<br>
<br>
<br>
<h1>【実施計画】</h1>
<table border="1"><tr><td>
資料
<br>
<input type="text" class="bigText" name="plan" value="<s:property value="plan"/>">
<br>
</td></tr></table>
<br>
<br>
<br>
<h1>【見積書】</h1>
<table border="1"><tr><td>
人数<input type="text"name="persons" value="<s:property value="persons"/>" required>人
<br>
<input type="hidden" name="decisionDetailId" value="<s:property value="decisionDetailId"/>">
</td></tr>

</table>
<input type="submit" value="登録" class="button">
	</s:form>


</s:iterator>

<br>
<s:form action="BackGoDecisionAction">
<input type="submit" value="戻る" class="button">
</s:form>
</body>
</html>