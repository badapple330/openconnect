<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>資料添付</title>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->

<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">


</head>
<body>

            <h2>資料添付</h2>
<s:form action="DecisionFileUpdateAction">
<div class="contents-set">
    <div>
    <label>資料名</label><br />
    <input type="text" class="text" size="25" name="documentName" required="required" placeholder="資料名" />
  </div>
     <div>
    <label>資料ファイル</label><br />
    <input type="file" size="35"name="documentPath" required="required" multiple="multiple" accept="application/vnd.openxmlformats-officedocument.spreadsheetml.sheet" />
  </div>
  <div><input type="submit" class="submit" value="資料を追加する" /></div>
  </div>
</s:form>

		<h2>資料削除</h2>
<s:form action="DecisionFileDeleteAction">
<div class="contents-set">
  <div>
    <label>資料名</label><br />
    <input type="text" class="text" size="25" name="documentName" required="required" placeholder="資料名" />
  </div>
  <div><input type="submit" class="submit" value="資料を削除する" /></div>
  </div>
</s:form>





</body>
</html>