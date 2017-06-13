<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="logo/oc.png">
<link rel="apple-touch-icon" href="logo/oc.png">
<title>勤怠報告完了</title>

<script src="js/jquery-3.1.0.min.js"></script>
<script type="text/javascript" src="js/attendance.js"></script>
<link rel="stylesheet" href="css/attendance.css">
</head>
<body>
	<!-- ヘッダー-->
	<jsp:include page="header.jsp" />

	<div class="container">

	<h1>勤怠確認完了</h1>
	<br>
	<h3>以下の内容で勤怠の送信を完了しました。</h3>

	<label>
	日時:
	<s:property value="atYear"/>年<s:property value="atMonth"/>月<s:property value="atDay"/>日
    </label><br>
           <label>
               名前:
               <s:iterator  value="atUserList"><s:property value="familyNameKanji"/>　<s:property value="givenNameKanji"/></s:iterator>
           </label><br>

           <label>
               出欠:<s:property value="attendance"/>
           </label><br>

           <label>
               備考:<s:property value="reason"/>
           </label><br>



<br>
	<div>
	<a href="index.jsp" class="openConnect">Topに戻る</a>
	</div>
</div>
</body>
</html>