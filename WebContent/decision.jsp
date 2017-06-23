<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html >
<html lang=ja>
<head>
<meta charset="utf-8">
<!-- Stylesheet
      ================================================== -->
<link rel="stylesheet" type="text/css" href="css/decision_implementation.css">

<!-- Javascripts
      ================================================== -->
      <script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>

<title>実施決裁</title>
<script type="text/javascript">
//選択箇所全入力
$(function() {
$("#input").on("keyup change", function() {
$("#res,#lines,#c,#d").val($(this).val());
 });
});
</script>
</head>

<body>



<h1 align=center>実施決裁</h1>

<s:property value="%{resultString}" />

<table>
<tr>
<td>
<div>
<s:form action="DecisionSelectAction">
<input type="submit" value="表示">
</s:form>
</div>
</td>
</tr>
</table>

<s:form action="DecisionUpdateAction">


<table class="main" border="2">

<tr>
<td class="kian"><b>起案者名</b>
</td>
<s:if test="nameList != null && !nameList.isEmpty()">
<td>
<s:iterator value="nameList">
<s:if test="familyNameKanji != null && !familyNameKanji.isEmpty()">
 <s:property value='familyNameKanji'/><s:property value='givenNameKanji'/>
  </s:if>
</s:iterator>
</td>
</s:if>
<td>
<s:else>
<input type="text" readonly="readonly" value="未定義">
</s:else>
</td>
</tr>

<tr>
<td><b>起案番号</b></td>
<td colspan="2"><s:property value="jImpId" /></td>
<tr>

<th>案件名</th>

<td colspan="3">
<s:iterator value="decisionList">
<textarea cols="50" rows="4" name="decisionName"><s:property value="decisionName" /></textarea>
</s:iterator>
</td>

</tr>

<tr>
<th>概要</th>
<s:if test="decisionList != null && !decisionList.isEmpty()">
<td colspan="10">
<s:iterator value="decisionList">
<textarea cols="125" rows="4" name="summary"><s:property value="summary" /></textarea>
</s:iterator>
</s:if>
<s:else>
<td>
<textarea cols="125" rows="4" name="summary">未定義</textarea>
</td>
</s:else>


</tr>

<tr>
<th>(1)内容</th>
<td colspan="10">
<s:if test="decisionList != null && !decisionList.isEmpty()">
<s:iterator value="decisionList">
<textarea cols="125" rows="4" name="cause"><s:property value="cause" /></textarea>
</s:iterator>
</s:if>
<s:else>
<textarea cols="125" rows="4" name="cause">未定義<s:property value="cause" /></textarea>
</s:else>
</td>
</tr>

<tr>
<th>(2)費用</th>
<s:if test="decisionList != null && !decisionList.isEmpty()">
<s:iterator value="decisionList">
<td colspan="6">
建設費用：<input type="text" name="bildCost" value="<s:property value="bildCost" />" readonly="readonly" size="8">万円 <br>
損益費用：<input type="text" name="benefit" value="<s:property value="benefit" />" readonly="readonly" size="8">万円<br>
合&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;計：<input type="text"  value="<s:property value="amountAll" />" readonly="readonly" size="8">万円
</td>
</s:iterator>
</s:if>
<s:else>
<td colspan="6">
建設費用：<input type="text" name="bildCost" value="<s:property value="bildCost" />" readonly="readonly" size="8">万円 <br>
損益費用：<input type="text" name="benefit" value="<s:property value="benefit" />" readonly="readonly" size="8">万円<br>
合&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;計：<input type="text" value="<s:property value="amountAll" />" readonly="readonly" size="8">万円
</td>
</s:else>


</tr>

<tr>
<td><b>(3)期間</b></td>
<s:if test="decisionList != null && !decisionList.isEmpty()">
<s:iterator value="decisionList">
<td colspan="3">
<input type="date" name="startDay" size="7" required placeholder="YYYYMMDD" value="<s:property value="startDay" />">  ~
<input type="date" name="endDay" size="7" required placeholder="YYYYMMDD" value="<s:property value="endDay" />">
</td>
</s:iterator>
</s:if>
<s:else>
<td colspan="3">
<input type="date" name="startDay" size="7" required placeholder="YYYYMMDD" value="<s:property value="startDay" />">  ~
<input type="date" name="endDay" size="7" required placeholder="YYYYMMDD" value="<s:property value="endDay" />">
</td>
</s:else>

</tr>

<tr>
<td><b>承認者</b></td>
<td>
承認者名<br>
承認者名<br>
承認者名
</td>
</tr>

</table>


<div align="center">
<h3>建設費用</h3>
</div>

<table class="sub" border="2">
<tr>
<th></th>
<th>単価(万円)</th>
<th>個数</th>
<th>小計(万円)</th>
</tr>


<tr>
<th>開発端末</th>
<td>
<s:if test="decisionList != null && !decisionList.isEmpty()">
<s:iterator value="decisionList">
<input type="number"  name="prove" value="<s:property value="prove" />">
</s:iterator>
</s:if>
<s:else>
<input type="number"  name="prove" value="<s:property value="prove" />">
</s:else>
</td>

<s:if test="decisionList != null && !decisionList.isEmpty()">
<s:iterator value="decisionList">
<td>
<input type="number" name="persons" value="<s:property value="persons"/>" placeholder="メンバー人数を入力" name="persons" id="input">
</td>
</s:iterator>
</s:if>
<s:else>
<td>
<input type="number" name="persons"  value="<s:property value="persons"/>" placeholder="メンバー人数を入力" name="persons" id="input">
</td>
</s:else>
<s:if test="decisionList != null && !decisionList.isEmpty()">
<s:iterator value="decisionList">
<td>
<input type="number" readonly="readonly" size="20"   value="<s:property value="totalProve"/>">
</td>
</s:iterator>
</s:if>
<s:else>
<td>
<input type="number" readonly="readonly" size="20"   value="<s:property value="totalProve"/>">
</td>
</s:else>
</tr>


<tr>
<th>リリース環境使用料</th>
<s:if test="decisionList != null && !decisionList.isEmpty()">
<s:iterator value="decisionList">
<td>
<input type="number" readonly="readonly" name="re"  value="<s:property value="re" />">
</td>
</s:iterator>
</s:if>
<s:else>
<td>
<input type="number" readonly="readonly" name="re"  value="">
</td>
</s:else>
<s:if test="decisionList != null && !decisionList.isEmpty()">
<s:iterator value="decisionList">
<td><input type="number"  id="res"  value="<s:property value="persons"/>" readonly="readonly"></td>
</s:iterator>
</s:if>
<s:else>
<td><input type="number"  id="res"  value="" readonly="readonly"></td>
</s:else>
<s:if test="decisionList != null && !decisionList.isEmpty()">
<s:iterator value="decisionList">
<td><input type="number"  size="20"  value="<s:property value="totalRe"/>" readonly="readonly">万円</td>
</s:iterator>
</s:if>
<s:else>
<td><input type="number"  size="20"  value="" readonly="readonly">万円</td>
</s:else>
</tr>

<tr>
<th>回線使用料</th>
<s:if test="decisionList != null && !decisionList.isEmpty()">
<s:iterator value="decisionList">
<td><input type="number"  readonly="readonly" name="line"  value="<s:property value="line" />"></td>
</s:iterator>
</s:if>
<s:else>
<td><input type="number"  readonly="readonly" name="line"  value=""></td>
</s:else>
<s:if test="decisionList != null && !decisionList.isEmpty()">
<s:iterator value="decisionList">
<td><input type="number"id="lines" value="<s:property value="persons"/>" readonly="readonly"></td>
</s:iterator>
</s:if>
<s:else>
<td><input type="number"id="lines" value="" readonly="readonly"></td>
</s:else>
<s:if test="decisionList != null && !decisionList.isEmpty()">
<s:iterator value="decisionList">
<td><input type="number" size="20"  readonly="readonly" value="<s:property value="totalLine"/>">万円</td>
</s:iterator>
</s:if>
<s:else>
<td><input type="number" size="20"  readonly="readonly" value="">万円</td>
</s:else>
</tr>

<tr>
<th>施設使用料</th>
<s:if test="decisionList != null && !decisionList.isEmpty()">
<s:iterator value="decisionList">
<td><input type="number"  readonly="readonly" name="room" value="<s:property value="room" />"></td>
</s:iterator>
</s:if>
<s:else>
<td><input type="number"  readonly="readonly" name="room" value=""></td>
</s:else>
<s:if test="decisionList != null && !decisionList.isEmpty()">
<s:iterator value="decisionList">
<td><input type="number"  value="1"  readonly="readonly"></td>
</s:iterator>
</s:if>
<s:else>
<td><input type="number"  value="1"  readonly="readonly"></td>
</s:else>
<s:if test="decisionList != null && !decisionList.isEmpty()">
<s:iterator value="decisionList">
<td><input type="number" size="20"  value="<s:property value="totalRoom" />" readonly="readonly">万円</td>
</s:iterator>
</s:if>
<s:else>
<td><input type="number" size="20"  value="" readonly="readonly">万円</td>
</s:else>
</tr>

<tr>
<th>建設費用</th>
<td></td>
<td></td>
<td>
<s:if test="decisionList != null && !decisionList.isEmpty()">
<s:iterator value="decisionList">
<input type="number" value="<s:property value="bildCost"/>" size="20" readonly="readonly">万円
</s:iterator>
</s:if>
<s:else>
<input type="number" value="">万円
</s:else>
</td>
</tr>

</table>

<div align="center">
<h3>損益費用</h3>
</div>

<table class="math" border="2">

<tr>
<th></th>
<th>単価(万円)</th>
<th>個数</th>
<th>小計(万円)</th>
</tr>

<tr>
<th>開発要員</th>
<s:if test="decisionList != null && !decisionList.isEmpty()">
<s:iterator value="decisionList">
<td><input type="number" name="human" value="<s:property value="human" />"></td>
</s:iterator>
</s:if>
<s:else>
<td><input type="number" name="human" value=""></td>
</s:else>
<s:if test="decisionList != null && !decisionList.isEmpty()">
<s:iterator value="decisionList">
<td><input type="number" id="c"  value="<s:property value="persons"/>" readonly="readonly"></td>
</s:iterator>
</s:if>
<s:else>
<td><input type="number" id="c"  value="" readonly="readonly"></td>
</s:else>
<s:if test="decisionList != null && !decisionList.isEmpty()">
<s:iterator value="decisionList">
<td><input type="number"  size="20" value="<s:property value="totalHuman"/>"readonly="readonly">万円</td>
</s:iterator>
</s:if>
<s:else>
<td><input type="number"  size="20" value=""readonly="readonly">万円</td>
</s:else>
</tr>

<tr>
<th>雑費</th>
<s:if test="decisionList != null && !decisionList.isEmpty()">
<s:iterator value="decisionList">
<td><input type="number" name="etc" value="<s:property value="etc" />" readonly="readonly"></td>
</s:iterator>
</s:if>
<s:else>
<td><input type="number" name="etc" value="" readonly="readonly"></td>
</s:else>
<s:if test="decisionList != null && !decisionList.isEmpty()">
<s:iterator value="decisionList">
<td><input type="number"  id="d"  value="<s:property value="persons"/>" readonly="readonly"></td>
</s:iterator>
</s:if>
<s:else>
<td><input type="number"  id="d"  value="" readonly="readonly"></td>
</s:else>
<s:if test="decisionList != null && !decisionList.isEmpty()">
<s:iterator value="decisionList">
<td><input type="number" size="20"  value="<s:property value="totalEtc"/>"readonly="readonly">万円</td>
</s:iterator>
</s:if>
<s:else>
<td><input type="number" size="20"  value=""readonly="readonly">万円</td>
</s:else>
</tr>

<tr>
<th>損益費用(万円)</th>
<td></td>
<td></td>
<s:if test="decisionList != null && !decisionList.isEmpty()">
<s:iterator value="decisionList">
<td><input type="number"  value="<s:property value="benefit"/>" readonly="readonly" size="20">万円</td>
</s:iterator>
</s:if>
<s:else>
<td><input type="number"  value="" readonly="readonly" size="20">万円</td>
</s:else>
</tr>

</table>

<input type="submit" value="編集を保存">
</s:form>


<h2><a href="./attach_help.jsp" target="_blank">資料添付</a></h2>

<div align=center>
<form action="upload" method="post" enctype="multipart/form-data">
      <label for="myFile">フォルダをアップロード</label>
      <input type="file" name="myFile" />
      <input type="submit" value="Upload"/>
   </form>
</div>

</body>
</html>