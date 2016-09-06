<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<nav class="navbar navbar-default navbar-static-top">
    <div class="container">
        <ul class="nav navbar-nav navbar-left">
            <li>
                <s:url id="goUserList" action="user-list" />
                <s:a href="%{goUserList}" cssClass="dropdown-toggle">ユーザーリスト</s:a>
            </li>
            <li>
                <s:url id="goEventList" action="event-list" />
                <s:a href="%{goEventList}" cssClass="dropdown-toggle">イベントリスト </s:a>
            </li>
            <li>
                <s:url id="eventEntry" action="event-entry" />
                <s:a href="%{eventEntry}" cssClass="dropdown-toggle">イベント登録 </s:a>
            </li>
        </ul>
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav navbar-right">
                <li>
                    <s:url id="logout" action="admin-logout" />
                    <s:a href="%{logout}" cssClass="dropdown-toggle">ログアウト</s:a>
                </li>
            </ul>
        </div>
    </div>
</nav>