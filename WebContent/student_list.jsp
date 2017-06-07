<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<link rel="shortcut icon" href="logo/oc.png">
<link rel="apple-touch-icon" href="logo/oc.png">
<title>受講生一覧</title>
<link rel="stylesheet" href="css/students2.css">
</head>


<body>

 <header><s:include value="header.jsp" /></header>

 <!-- 最終的にログイン状態じゃないと見えないようにする -->

 <div class="container">

		<h1>受講生一覧</h1>




              <s:form action="StudentsSelectAction">
                <select name ="">
                <option value= "">-選択してください-</option>
                <option value= "">2017年4月生</option>
                <option value= "">2017年5月生</option>
                <option value= "">2017年6月生</option>
                <option value= "">2017年7月生</option>
                <option value= "">2017年8月生</option>
                <option value= "">2017年9月生</option>
                <option value= "">2017年10月生</option>
                <option value= "">2017年11月生</option>
                <option value= "">2017年12月生</option>
                <option value= "">2018年1月生</option>
                <option value= "">2018年2月生</option>
                <option value= "">2018年3月生</option>
                <option value= "">2018年4月生</option>
                </select>
				<input class="button" type="submit" value="表示">
			  </s:form>

         <ol>
         <li>田中太郎</li>
         <li>田中太郎</li>
         <li>田中太郎</li>
         <li>田中太郎</li>
         <li>田中太郎</li>
         <li>田中太郎</li>
         <li>田中太郎</li>
         <li>田中太郎</li>
         <li>田中太郎</li>
         <li>田中太郎</li>
         <li>田中太郎</li>
         <li>田中太郎</li>
         <li>田中太郎</li>
         <li>田中太郎</li>
         <li>田中太郎</li>
         <li>田中太郎</li>
         <li>田中太郎</li>
         <li>田中太郎</li>
         <li>田中太郎</li>
         <li>田中太郎</li>
         <li>田中太郎</li>
         <li>田中太郎</li>
         </ol>








</div>


 <footer><s:include value="footer.jsp" /></footer>


</body>
</html>