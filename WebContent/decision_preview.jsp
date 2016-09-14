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
<title>決裁プレビュー</title>
</head>
<body>

	<jsp:include page="header.jsp" />

	<h1>決裁プレビュー画面</h1>
	<br>
	<br>
	<s:if test="decisionDetailList.size() == 0">
		まだ何も編集されていません。
	</s:if>
	<s:iterator value="decisionDetailList">
			<table border="1">
				<tr>
					<td>
						<div align="right">
							日付
							<s:property value="day" />
						</div> <br> 決裁分類：<s:property value="decisionType" /> <br>
						起案者：<br> ユーザーID：<s:property value="userId" /><br> 氏名 <s:property
							value="familyNameKanji" />
						<s:property value="givenNameKanji" /> <br> <br> 案件名：<s:property
							value="itemName" /> <br> <br> 概要： <br> <s:property
							value="summary" /> <br> <br>
						<center>
							<h1>記</h1>
						</center> <br> １）理由・目的 <br> <s:property value="cause" /> <br>
						<br> ２）費用 <br> 建設費用：<s:property
							value="developmentPersonnelSum" /> 万円 <br> 損益費用：<s:property
							value="profitAndLossCost" /> 万円 <br> 合計費用： <s:property
							value="sum" />万円 <br> <br> ３）実施時期・実施期間 <br> <s:property
							value="startDay" />～<s:property value="endDay" /> <br> <br>
						<div align="right">以上</div> <br> <br>
						<table border="1" align="center">
							<tr>
								<td>―：<br>
								</td>
								<td>起案番号：<br>
								</td>
								<td>実施決裁番号：<br>
								</td>
							</tr>
							<tr>
								<td>承認者：<br>
								<br>日付：
								</td>
								<td>承認者：<br>
								<br>日付：
								</td>
								<td>承認者：<br>
								<br>日付：
								</td>
							</tr>
						</table> <br>
					</td>
				</tr>
			</table>
			<br>
			<br>
			<table border="1">
				<tr>
					<td>
						<h2>実施計画</h2> <br> <br> 以下の通り、当該開発計画を実施して良いかお伺いしたい。 <br>
						<br> 資料： <br> <s:property value="plan" /> <br>
					</td>
				</tr>
			</table>
			<br>
			<br>
			<table border="1">
				<tr>
					<td>
						<h2 align="center">見積書</h2> <br>・以下は、建設費用と損益費用の表である。 <br>
・建設費用と損益費用それぞれの小計を出し合計費用を求める。

 <br>・小数点以下が発生する金額に関しては小計にて切り上げて表示する。 <br> <br>


						<center>建設費用表</center>
						<table border="1" class="cost_Table">
							<tr>
								<td><b>建設費用</b></td>
								<td>1単位当たりの金額（万円）</td>
								<td>個数</td>
								<td>小計（万円）</td>
							</tr>
							<tr>
								<td>開発端末</td>
								<td>8</td>
								<td><s:property value="persons" /></td>
								<td><s:property value="developmentTerminal" /></td>
							</tr>
							<tr>
								<td>リリース環境使用料</td>
								<td>0.6</td>
								<td>1</td>
								<td>1.0</td>
							</tr>
							<tr>
								<td>回線使用料</td>
								<td>1</td>
								<td>1</td>
								<td>1.0</td>
							</tr>
							<tr>
								<td>施設使用料</td>
								<td>55.5</td>
								<td>1</td>
								<td>56.0</td>
							</tr>
							<tr>
								<td>建設費用（万円）</td>
								<td></td>
								<td></td>
								<td><s:property value="developmentPersonnelSum" /></td>
							</tr>
						</table> <br> <br>


						<center>損益費用表</center>
						<table border="1" class="cost_Table">
							<tr>
								<td><b>損益費用</b></td>
								<td>1単位当たりの金額（万円）</td>
								<td>個数</td>
								<td>小計（万円）</td>
							</tr>
							<tr>
								<td>開発要員</td>
								<td>100</td>
								<td><s:property value="persons" /></td>
								<td><s:property value="developmentPersonnel" /></td>
							</tr>
							<tr>
								<td>雑費</td>
								<td>0.5</td>
								<td>1</td>
								<td>1.0</td>
							</tr>
							<tr>
								<td>損益費用（万円）</td>
								<td></td>
								<td></td>
								<td><s:property value="profitAndLossCost" /></td>
							</tr>
						</table> <br> <br> 合計費用
						<table border="1" class="cost_Table">
							<tr>
								<td>建設費用（万円）</td>
								<td><s:property value="developmentPersonnelSum" /></td>
							</tr>
							<tr>
								<td>損益費用（万円）</td>
								<td><s:property value="profitAndLossCost" /></td>
							</tr>
							<tr>
								<td>合計費用（万円）</td>
								<td><s:property value="sum" /></td>
							</tr>
						</table>

					</td>
				</tr>
			</table>
		</s:iterator>
		<form>
<input type="button" value="戻る" onclick="history.back()">
</form>
</body>
</html>