<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="header.jsp" />
<meta charset="UTF-8">
<link rel="shortcut icon" href="logo/oc.png">
<link rel="apple-touch-icon" href="logo/oc.png">
<script src="js/bootstrap.js"></script>
<script src="js/jquery-3.1.0.min.js"></script>
<script src="js/sendCheck.js"></script>
<script type="text/javascript" src="js/decision_preview.js"></script>
<title>決裁プレビュー</title>
<link rel="stylesheet" type="text/css" href="css/decision_preview.css">
</head>
<body>
	<s:if test="%{#session.userFlg >= 1}">

		<h1 id="decisionTitle">実施決裁プレビュー画面</h1>
		<br>
		<br>
		<s:if test="decisionPreviewList.size() == 0">
				<h1>まだ何も編集されていません。</h1>
		</s:if>
	<s:property value="%{resultString}" /><br>
		<s:iterator value="decisionPreviewList">
			<div class="container"  style="position:relative; z-index:-1;">
				<div class="well well-sm">
					<div class="row">
						<div class="col-sm-12 col-xs-12">
								<table class="table-responsive">
									<tr>
										<td>
											<div align="right">
												日付
												<s:property value="applyDay" />
											</div>
											<div class="row">
												<div class="col-sm-12">
													<label>決裁分類：</label><s:property value="decisionType"/>
													<br>
												</div>
											</div>

											<div class="row">
												<div class="col-sm-12">
													<label>起案者</label>
													<br>
												</div>
											</div>

											<div class="row">
												<div class="col-sm-12">
													<s:iterator value="nameList">
														<label>氏名</label><s:property value="familyNameKanji" />
																			<s:property value="givenNameKanji" />
													</s:iterator>
												</div>
											</div>

											<div class="row">
												<div class="col-sm-12">
														<label>案件名：</label><s:property value="decisionName" />
													<br>
												</div>
											</div>

											<div class="row">
												<div class="col-sm-12">
													<label>概要：</label>
													<br><s:property value="summary" />
												</div>
											</div>


											<br>
											<div class="row">
												<div class="col-sm-12">
													<div class="center">
														<h1>記</h1>
													</div>
												</div>
											</div>
											<br>
											<div class="row">
												<div class="col-sm-12">
													<label>１）理由・目的</label>
													<br><s:property value="cause" />
												</div>
											</div>

											<br>
											<br>
											<div class="row">
												<div class="col-sm-12">
													<label>２）費用</label>
												</div>
											</div>

											<br>
											<div class="row">
												<div class="col-sm-12">
												<label>建設費用</label><s:property value="bildCost" /> 万円
												<br>
												<label>損益費用：</label><s:property value="benefit" /> 万円
												<br>
												<label>合計費用：</label><s:property value="amountAll" />万円
												<br>
												</div>
											</div>

											<div class="row">
												<div class="col-sm-12">
													<label>３）実施時期・実施期間</label>
													<br>
													<s:property value="startDay" />～<s:property value="endDay" />
													<br>
												</div>
											</div>

											<br>
											<div align="right">以上</div>
											<br>
											<br>
											<div class="row">
												<div class="col-sm-12 hidden-xs">
													<table id="tableApproval">
														<tr style="width:70%;">
															<td>―：<br><br></td>
															<td>起案番号：<s:property value="jImpId" /><br><br></td>
															<td><div class="width4">実施決裁番号：<s:property value="jDecId" /><br><br></div></td>
														</tr>
														<tr style="height:100px;">
															<td><label style="margin-bottom:20px; margin-left:5px;">承認者：</label><s:iterator value="jPermiter1nameList"><s:property value="familyNameKanji" /><s:property value="givenNameKanji" /></s:iterator><br><label style="margin-left:5px;">日付：</label><s:property value="jPermitDay1" /></td>
															<td><label style="margin-bottom:20px; margin-left:5px;">承認者：</label><s:iterator value="jPermiter2nameList"><s:property value="familyNameKanji" /><s:property value="givenNameKanji" /></s:iterator><br><label style="margin-left:5px;">日付：</label><s:property value="jPermitDay2" /></td>
															<td><label style="margin-bottom:20px; margin-left:5px;">承認者：</label><s:iterator value="jPermiter3nameList"><s:property value="familyNameKanji" /><s:property value="givenNameKanji" /></s:iterator><br><label style="margin-left:5px;">日付：</label><s:property value="jPermitDay3" /></td>
														</tr>
													</table>
												</div>
												<%-- スマホの場合の表示 --%>
												<div class="col-xs-12 visible-xs">
													<table>
														<tr>
															<td>―：<br><br></td>
															<th>承認者：<s:iterator value="jPermiter1nameList"><s:property value="familyNameKanji" /><s:property value="givenNameKanji" /></s:iterator><br>日付：<s:property value="jPermitDay1" /></th>
														</tr>
														<tr>
															<td>起案番号：<s:property value="jImpId" /><br><br></td>
															<th>承認者：<s:iterator value="jPermiter2nameList"><s:property value="familyNameKanji" /><s:property value="givenNameKanji" /></s:iterator><br>日付：<s:property value="jPermitDay2" /></th>
														</tr>
														<tr>
															<td>実施決裁番号：<s:property value="jDecId" /><br><br></td>
															<th>承認者：<s:iterator value="jPermiter3nameList"><s:property value="familyNameKanji" /><s:property value="givenNameKanji" /></s:iterator><br> <br>日付：<s:property value="jPermitDay3" /></th>
														</tr>
													</table>
												</div>
												<%-- スマホの場合の表示/ --%>
											</div>
											<br>
										</td>
									</tr>
								</table>
							</div>
						</div>
				</div>
			</div>

			<div class="container">
				<div class="well well-sm">
					<div class="row">
						<div class="col-sm-12 col-xs-12">
								<br>
								<br>
								<table class="table-responsive">
									<tr>
										<td>
										<div class="row">
											<div class="col-sm-12 col-xs-12">
												<h2>実施計画</h2>
												<br>
											</div>
										</div>
											<p>以下の通り、当該開発計画を実施して良いかお伺いしたい。</p>
											<br>
											<br>
											<label>資料：</label>
											<br>
											<s:property value="plan" />
											<s:if test="downloadList.size() > 0">
											<s:form action="DecisionDetailDownloadAction">
												<br>
												<s:iterator value="downloadList">
													<div class="textInline">
														<input type="submit" value="ダウンロード" class="downloadButton" />
														<s:property value="fileName" /><br>
													</div>
													<input type="hidden" value="<s:property value="fileName" />" class="fileNameStr">
												</s:iterator>
												<input type="hidden" name="fileName" value="" class="fileName">
												<input type="hidden" name="decisionDetailId" value="<s:property value="decisionDetailId" />">
											</s:form>
											</s:if>
										</td>
									</tr>
								</table>
								<br>
								<form>
									<input class="btn btn-default center-block" type="button" value="戻る" onclick="history.back()" style="position:relative; z-index:1;">
								</form>
						</div>
					</div>
				</div>
			</div>
		</s:iterator>
	</s:if>

</body>
</html>