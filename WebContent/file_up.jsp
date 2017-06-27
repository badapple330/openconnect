<%@ page language="java" contentType="text/html; charset=ISO-8859-1;"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>upload</title>
</head>
<body>
<br><br>
 <form action="upload" method="post" enctype="multipart/form-data">
      <label for="myFile">fileupload</label>
      <input type="file" name="myFile" />
      <input type="submit" value="upload"/>
   </form>

</body>
</html>