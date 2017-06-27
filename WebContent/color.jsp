<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>



<form action="xxx.php" method="post">
<label>
 BGC
  <input id="bg-color" type="color" value="" list="color-list">
    <datalist id="color-list">
    <option value="#000000"></option>
    <option value="#ff0000"></option>
    <option value="#008000"></option>
    <option value="#0000ff"></option>
    <option value="#ffff00"></option>
</label>
<input type="submit" value="送信">
</form>



<script src="js/color.js"></script>
</body>
</html>





