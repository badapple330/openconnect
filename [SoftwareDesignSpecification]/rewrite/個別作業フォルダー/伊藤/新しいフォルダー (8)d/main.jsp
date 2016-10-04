<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メイン</title>
<link rel="stylesheet" href="css/slick-theme.css">
<link rel="stylesheet" href="css/slick.css">
<link rel="stylesheet" href="css/task.css">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="js/slick.min.js"></script>
<script src="js/mainmain.js"></script>
</head>
<body>
	<header><jsp:include page="header.jsp" /></header>
	<div align="center">
		<font size="30">注目の記事</font>
	</div>

<section>
<ul class="slider multiple-item">
	<s:iterator value="MainList">
		<s:form action="WithdrawReviewAction" style="display:inline">
			<li><button type="submit" name="site_janre"
				value="<s:property value="site_janre" />">
				<img src="<s:property value="image_url" />" width="250" height="330">
			</button></li>
		</s:form>
	</s:iterator>
</ul>
	</section>



	<div id="jenre">
		<div align="center">
			<h1>ジャンル</h1>
			<table>
				<tr class="culm1">
					<th><s:form action="SelectAction">
							<input type="hidden" name="site_janre" value="politics" />
							<input type="submit" value="政治"
								style="border: none; background-color: transparent;">
						</s:form></th>
					<th><s:form action="SelectAction">
							<input type="hidden" name="site_janre" value="economy" />
							<input type="submit" value="経済"
								style="border: none; background-color: transparent;">
						</s:form></th>
					<th><s:form action="SelectAction">
							<input type="hidden" name="site_janre" value="IT" />
							<input type="submit" value="IT"
								style="border: none; background-color: transparent;">
						</s:form></th>
					<th><s:form action="SelectAction">
							<input type="hidden" name="site_janre" value="bussiness" />
							<input type="submit" value="ビジネス"
								style="border: none; background-color: transparent;">
						</s:form></th>
				</tr>
				<tr class="culm2">
					<th><s:form action="SelectAction">
							<input type="hidden" name="site_janre" value="entertainment" />
							<input type="submit" value="エンタメ"
								style="border: none; background-color: transparent;">
						</s:form></th>
					<th><s:form action="SelectAction">
							<input type="hidden" name="site_janre" value="foppery" />
							<input type="submit" value="おしゃれ"
								style="border: none; background-color: transparent;">
						</s:form></th>
					<th><s:form action="SelectAction">
							<input type="hidden" name="site_janre" value="beauty" />
							<input type="submit" value="美容"
								style="border: none; background-color: transparent;">
						</s:form></th>
					<th><s:form action="SelectAction">
							<input type="hidden" name="site_janre" value="blog" />
							<input type="submit" value="ブログ"
								style="border: none; background-color: transparent;">
						</s:form></th>
				</tr>
			</table>
		</div>
	</div>
	<footer id="footer"><jsp:include page="footer.jsp" /></footer>
</body>
</html>
