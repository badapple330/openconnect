<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="color" style ="background-color:<s:property value="#session.color"/>;">

<form action="colorChangeAction">
<label>
 BGC
  <input id="bg-color" type="color" value="" list="color-list" name="color">
    <datalist id="color-list">
    <option value="#000000"></option>
    <option value="#ff0000"></option>
    <option value="#008000"></option>
    <option value="#0000ff"></option>
    <option value="#ffff00"></option>
</label>
<input type="submit"  value="送信">
</form>

</div>

<a href="<s:url action='colorChangeAction' />">アクション実行！</a>
<!-- <script src="js/color.js"></script> -->
</body>
</html>





