<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html">
<html lang="ja">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>FootPrinter</title>
    <jsp:include page="base/base.jsp" flush="true" />
    <link href="css/event-entry-confirm.css" rel="stylesheet" type="text/css" />
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
                <p><span class="event-subtitle">イベント名</span>：<s:property value="#session.eventName"/></p>
                <p><span class="event-subtitle">イベント実施日</span>：<s:property value="#session.eventDate"/></p>
                <p><span class="event-subtitle">イベント価格</span>：<s:property value="#session.showPrice"/></p>
                <p><span class="event-subtitle">発行チケット枚数</span>：<s:property value="#session.numOfTickets"/></p>
                <p><span class="event-subtitle">旅行先カテゴリー</span>：<s:property value="#session.categoryName"/></p>
                <p><span class="event-subtitle">イベント詳細</span>：<s:property value="#session.eventDetail"/></p>
                <p><span class="event-subtitle">画像登録</span>：<s:property value="#session.imgPath"/></p>
                <s:form action="event-entry-registration">
                    <s:submit value="登録完了" cssClass="btn btn-primary"/>
                </s:form>
            </div>
        </div>
    </div>
    <jsp:include page="base/footer.jsp" flush="true" />
</body>
</html>