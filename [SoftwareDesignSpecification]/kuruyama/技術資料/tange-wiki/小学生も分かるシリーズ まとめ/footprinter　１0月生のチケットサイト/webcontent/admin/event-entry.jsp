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
	<jsp:include page="base/navi.jsp" flush="true" />
	<div class="conntainer">
		<div class="row">
			<div class="col-xs-5 col-xs-offset-3">
				<table class="table">
					<tr>
						<th colspan="3">イベント登録</th>
					</tr>
				</table>
				<s:form action="event-entry-confirm" enctype="multipart/form-data">
					<div class="form-group">
						<label>イベント名</label>
						<s:textfield name="eventName" cssClass="form-control"
							placeholder="イベント名"></s:textfield>
						<s:fielderror cssClass="errmsg">
							<s:param value="%{'eventName'}" />
						</s:fielderror>
					</div>
					<div class="form-group">
						<label>イベント実施日</label>
						<s:textfield name="eventDate" cssClass="form-control"
							placeholder="例:2016/01/01"></s:textfield>
						<s:fielderror cssClass="errmsg">
							<s:param value="%{'eventDate'}" />
						</s:fielderror>
					</div>
					<div class="form-group">
						<label>イベント価格</label>
						<s:textfield name="price" cssClass="form-control" placeholder="数字のみ"></s:textfield>
						<s:fielderror cssClass="errmsg">
							<s:param value="%{'price'}" />
						</s:fielderror>
					</div>
					<div class="form-group">
						<label>発行チケット枚数</label>
						<s:textfield name="numOfTickets" cssClass="form-control"
							placeholder="数字のみ"></s:textfield>
						<s:fielderror cssClass="errmsg">
							<s:param value="%{'numOfTickets'}" />
						</s:fielderror>
					</div>
					<div class="form-group">
						<label>旅行先カテゴリー</label>
						<select name="categoryId" class="form-control">
						  <option value="1">アフリカ</option>
						  <option value="2">アジア</option>
						  <option value="3">オーストラリア</option>
						  <option value="4">ヨーロッパ</option>
						  <option value="5">北アメリカ</option>
						  <option value="6">南アメリカ</option>
						</select>
					</div>
					<div class="form-group">
						<label>イベント詳細</label>
						<s:textarea name="eventDetail" cssClass="form-control"></s:textarea>
						<s:fielderror cssClass="errmsg">
							<s:param value="%{'eventDetail'}" />
						</s:fielderror>
					</div>
					<div class="form-group">
						<label>画像登録</label>
						<s:file name="eventImage" label="Event Image" required="true"></s:file>
						<s:fielderror cssClass="errmsg">
							<s:param value="%{'eventImage'}" />
						</s:fielderror>
					</div>
					<div class="form-group" align="right">
						<s:submit value="登録確認へ" cssClass="btn btn-primary" />
					</div>
				</s:form>
			</div>
		</div>
	</div>
	<jsp:include page="base/footer.jsp" flush="true" />

</body>
</html>