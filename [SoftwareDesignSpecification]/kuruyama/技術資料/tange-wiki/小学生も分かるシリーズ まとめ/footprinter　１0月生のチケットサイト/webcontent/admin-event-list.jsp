<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FootPrinter</title>
<jsp:include page="base/base.jsp" flush="true" />
</head>
<body>
	<jsp:include page="base/header.jsp" flush="true" />
	<div class="conntainer">
		<div class="row">
			<div class="col-xs-5 col-xs-offset-3">
				<select>
					<option value="">年を選択してください</option>
					<option value="2013年">2013年</option>
					<option value="2014年">2014年</option>
					<option value="2015年">2015年</option>
					<option value="2016年">2016年</option>
				</select> <select>
					<option value="">月を選択してください</option>
					<option value="1月">1月</option>
					<option value="2月">2月</option>
					<option value="3月">3月</option>
					<option value="4月">4月</option>
					<option value="5月">5月</option>
					<option value="6月">6月</option>
					<option value="7月">7月</option>
					<option value="8月">8月</option>
					<option value="9月">9月</option>
					<option value="10月">10月</option>
					<option value="11月">11月</option>
					<option value="12月">12月</option>
				</select> 
				<input type="text">
				<input type="button" value="検索">
			</div><!-- col-xs-5 col-xs-offset-3 -->
		</div><!-- row -->
		<div class="row">
			<div class="col-xs-5 col-xs-offset-3">
				<table class="table">
					<tr>
						<th style="border-right: 1px solid #CCC;">イベントID</th>
						<th style="border-right: 1px solid #CCC;">イベント名</th>
						<th style="border-right: 1px solid #CCC;">イベント日</th>
						<th style="border-right: 1px solid #CCC;">イベント値段</th>
						<th style="border-right: 1px solid #CCC;">申し込み限度</th>
						<th style="border-right: 1px solid #CCC;">申し込み残数</th>
						<th style="border-right: 1px solid #CCC;">イベント詳細</th>
						<th style="border-right: 1px solid #CCC;">画像パス</th>
						<th style="border-right: 1px solid #CCC;">カテゴリID</th>
						<th style="border-right: 1px solid #CCC;">登録日</th>
						<th style="border-right: 1px solid #CCC;">更新日</th>
						<th width="20">削除</th>
					</tr>
					<s:iterator value="AdminEventList">
						<tr>
							<td align="center" width="100"><s:property value="id" /></td>
							<td align="center" width="100"><s:property value="name" /></td>
							<td align="center" width="100"><s:property value="detail" /></td>
							<td align="center" width="100"><s:property value="eventDate" /></td>
							<td align="center" width="100"><s:property value="price" /></td>
							<td align="center" width="100"><s:property
									value="numOfTickets" /></td>
							<td align="center" width="100"><s:property value="remaining" /></td>
							<td align="center" width="100"><s:property value="createdAt" /></td>
							<td align="center" width="100"><s:property value="updatedAt" /></td>
							<td align="center" width="100"><s:property
									value="categoryId" /></td>
							<td align="center" width="100"><s:property value="imgPath" /></td>
							<td align="center"><s:form action="event-delete">
									<s:hidden name="id" value="%{id}" />
									<s:submit value="削除"></s:submit>
								</s:form></td>
						</tr>
					</s:iterator>
				</table>
				<div class="row">
					<div class="col-xs-6 col-xs-offset-3">
						<ul class="pagination">
							<li><a href="#" aria-label="前のページへ"> <span
									aria-hidden="true">«</span>
							</a></li>
							<li class="active"><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">5</a></li>
							<li><a href="#" aria-label="次のページへ"> <span
									aria-hidden="true">»</span>
							</a></li>
						</ul><!-- pagination -->
					</div><!-- col-xs-6 col-xs-offset-3 -->
				</div><!-- row -->
			</div><!-- col-xs-5 col-xs-offset-3 -->
		</div><!-- /row -->
	</div><!-- /container -->
	<jsp:include page="base/footer.jsp" flush="true" />
</body>
</html>