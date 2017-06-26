<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" href="logo/oc.png">
<link rel="apple-touch-icon" href="logo/oc.png">
<title>決裁手続き電子化</title>
<link rel="stylesheet" href="css/decision_detail.css">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">

$(function () {
//連続してアニメーションさせる
    setTimeout('anime2()');
});
//anime2の動きを設定
function anime2(){
$('#box2')
	.animate({ 'opacity' : '1' }, 700)
	.animate({ 'opacity' : '0.7' }, 700);
	setTimeout('anime2()', 2100);
}

$(function () {
	setTimeout('rect()'); //アニメーションを実行
});
function rect() {
$("#rect")
	.animate({ opacity: ".5" }, 1000)
	.animate({ opacity: "1" }, 1000);
	setTimeout("rect()", 2000); //アニメーションを繰り返す間隔
}

$(function () {
	setTimeout('per()'); //アニメーションを実行
});
function rect() {
$("#permit-btn")
	.animate({ opacity: "1" }, 600)
	.animate({ opacity: ".6" }, 600);
	setTimeout("per()", 1200); //アニメーションを繰り返す間隔
}

</script>
<!-- 	ヘッダー読み込み -->
<jsp:include page="header.jsp" />
</head>
<body>
<input type="submit" id="box2" value="透過ボタン">
<a href="#" id="rect" class="square_btn">BUTTON</a>
<input type="submit" id="permit-btn" value="承認">

<a href="#" class="hvr-buzz-out">BUZZ OUT</a>









<div class="container">
<s:if test="%{#session.userFlg >= 1 && #session.userId != null}">

    <br>

    <h1>決裁手続き一覧</h1>
    ログイン中ユーザーID:<s:property value="#session.userId" /><br>


    <s:form action="DecisionDetailSelectAction">
        プロジェクト検索
        <input type="text" placeholder="例：legmina" name="searchString"
            maxlength=30>
        <input type="hidden" name="userId" value="<s:property value="#session.userId" />">
                <input type="submit" value="検索" />
    </s:form>

    <br>
    <font color="red">
    <s:property value="%{resultString}" />
    <s:property value="%{resultSelect1}" />
    <s:property value="%{resultSelect2}" />
    </font>
    <p>自のlist内：<s:property value="%{decisionDetailList2.size()}" />個</p>
    <p>全のlist内：<s:property value="%{decisionDetailList1.size()}" />個</p>
    <p>決裁未作成のlist内：<s:property value="%{decisionBeginList.size()}" />個</p>



	<!-- リーダー自プロジェクト表示用 -->
	<s:if test="%{#session.userFlg == 2}">

		<s:iterator value="decisionBeginList">

			<s:if test="%{decisionBeginList.size() > 0}">
    			<div class="pad"><br>

            <s:form action="DecisionDetailInsertAction">
					決裁手続きを始める<br>あなたのプロジェクトは...
			<table border="1">
				<tr>
					<td>プロジェクト名：</td>
					<td><s:property value="projectName" /></td>
				</tr>
				<tr>
					<td>リーダーID：</td>
					<td><s:property value="managerId" /></td>
				</tr>
				<tr>
					<td>サブリーダーID：</td>
					<td><s:property value="subManagerId" /></td>
				</tr>
				<tr>
					<td>実施兼契約決裁で<br>行う場合のみチェック<br>
						<input type="checkbox" name="decisionType" value="実施兼契約">
					</td>
					<td>
						<input type="hidden" name="projectId" value="<s:property value="projectId" />">
						<input type="hidden" name="userId" value="<s:property value="#session.userId" />">
						<input type="submit" value="追加(決済資料を作る)">
					</td>
				</tr>
			</table>

			</s:form>
				</div>
			</s:if>
			<s:else>
                nasi
			</s:else>

		</s:iterator>



 <!-- 自プロジェクト -->
        <s:iterator value="decisionDetailList2">

        <s:if test="%{decisionDetailList2.size() > 0}">

    <table border="1">
        <tr>
        <!-- プロジェクト名 -->
            <th colspan="2" rowspan="2">
                A<s:property value="projectName" />
            </th>
        <!-- 決裁種類 -->
            <td colspan="3">
                B<s:property value="decisionType" />
            </td>
        </tr>
        <tr>
        <!-- 決裁状況 -->
            <td colspan="3">
            C<!-- 実施 -->
                    <s:if test="%{decisionType == '実施'}">
                        <s:if test="decisionStatus1 == 0">
                            作成中
                        </s:if>
                        <s:elseif test="decisionStatus1 == 1">
                            申請中/承認待ち
                        </s:elseif>
                        <s:elseif test="decisionStatus1 == 2">
                            承認済み
                        </s:elseif>
                        <s:elseif test="decisionStatus2 == 3">
                            変更中
                        </s:elseif>
                    </s:if>
                <!-- 契約/実施兼契約 -->
                    <s:else>
                        <s:if test="decisionStatus2 == 0">
                            作成中
                        </s:if>
                        <s:elseif test="decisionStatus2 == 1">
                            申請中/承認待ち
                        </s:elseif>
                        <s:elseif test="decisionStatus2 == 2">
                            承認済み
                        </s:elseif>
                        <s:elseif test="decisionStatus2 == 3">
                            変更中
                        </s:elseif>
                    </s:else>
            </td>
        </tr>
        <tr>
            <s:if test="%{decisionType == '実施' || decisionType == '契約'}">     <th>D実施</th>
                <th>E契約</th>
            </s:if>
            <s:else>
                <th colspan="2">D+E実施兼契約</th>
            </s:else>
            <th>
                F<!-- 変更・遡求 -->
                <s:if test="decisionStatus2 == 2 && endDay <= 今日"><!-- &&終了日を過ぎた場合 -->
                    遡求
                </s:if>
                <s:else>
				    変更
				</s:else>
            </th>
            <th>G承認状況</th>
            <th>H申請</th>
        </tr>
        <tr>
        <!-- 編集(却下・差し戻し時も)・プレビューボタン -->
            <s:if test="%{decisionType == '実施' || decisionType == '契約'}">
            <td>
                I<!-- 実施の編集 -->
                    <s:if test="%{decisionStatus1 == 0 && decisionStatus2 == 0}">
                        <s:form action="DecisionSelectAction">
                            <input type="hidden" name="userId" value="<s:property value="#session.userId" />">
                            <input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
                                    <input type="submit" value="実施編集">
                        </s:form>
                    </s:if>
                <!-- 実施のプレビュー -->
					<s:else>
						<s:form action="DecisionPreviewAction">
                            <input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
                                    <input type="submit" value="プレビュー" >
                        </s:form>
					</s:else>
            </td>
            <td>
                J<!-- 契約の編集 -->
                    <s:if test="%{decisionStatus2 == 0 && decisionStatus1 == 2}">
                        <s:form action="DecisionSelectAction">
                            <input type="hidden" name="userId" value="<s:property value="#session.userId" />">
                            <input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
                                    <input type="submit" value="契約編集">
                        </s:form>
                    </s:if>
                <!-- 契約未着手時 -->
                    <s:elseif test="%{decisionType == '実施'}">
                        空白
                    </s:elseif>
                <!-- 契約のプレビュー -->
					<s:else>
						<s:form action="DecisionPreviewAction">
                            <input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
                                    <input type="submit" value="プレビュー" >
                        </s:form>
					</s:else>
            </td>
            </s:if>
            <s:else>
            <td colspan="2">
                I+J<!-- 実施兼契約の編集 -->
                <s:if test="%{decisionStatus2 == 0 && decisionStatus1 == 2}">
                    <s:form action="DecisionSelectAction">
                        <input type="hidden" name="userId" value="<s:property value="#session.userId" />">
                        <input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
                                <input type="submit" value="実施兼契約編集">
                    </s:form>
                </s:if>
                <!-- 実施兼契約のプレビュー -->
                <s:else>
                    <s:form action="DecisionPreviewAction">
                        <input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
                                <input type="submit" value="プレビュー" >
                    </s:form>
                </s:else>
            </td>
            </s:else>

        <!-- 変更・遡求編集ボタン -->
            <td>
                K<!-- 最終承認済みの時のみ表示 -->
                <s:if test="decisionStatus2 == 2">
                <!-- 終了日を過ぎた時のみ表示 -->
                    <s:if test="endDay <= 今日">
                        <s:form action="DecisionSelectAction">
                            <input type="hidden" name="userId" value="<s:property value="#session.userId" />">
                            <input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
                                    <input type="submit" value="遡求編集">
                        </s:form>
                    </s:if>
                <!-- 終了日までの間表示 -->
                    <s:else>
                        <s:form action="DecisionSelectAction">
                        <input type="hidden" name="userId" value="<s:property value="#session.userId" />">
                        <input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
                                <input type="submit" value="変更編集">
                        </s:form>
                    </s:else>
                </s:if>
            <!-- 作成時・未申請時 -->
                <s:else>
                    空白
                </s:else>
            </td>

        <!-- 承認状況 -->
            <td>
                L<!-- 申請中の時 -->
                <s:if test="decisionStatus1 == 1 || decisionStatus2 == 1">
                    <s:if test="permitStatus == 2">
                        先生の<span class="smart"><br></span>承認待ち
                    </s:if>
                    <s:elseif test="permitStatus == 1">
                        2人目の承認待ち
                    </s:elseif>
                    <s:elseif test="permitStatus == 0">
                        1人目の承認待ち
                    </s:elseif>
                </s:if>
                <!-- 作成中の時 -->
                <s:elseif test="(decisionStatus1 == 0 && decisionStatus2 == 0) || (decisionStatus1 == 2 && decisionStatus2 == 0)">
                    <!-- 1度でも申請している場合 -->
                    <s:if test="%{(decisionType == '実施' && jImpId != null) || (decisionType == '契約' && kImpId != null) || (decisionType == '実施兼契約' && jkImpId != null)}">
                        差し戻されました
                    </s:if>
                    <!-- まだ申請していない場合 -->
                    <s:else>
                        未申請
                    </s:else>

                </s:elseif>
                <s:elseif test="decisionStatus1 == 3 || decisionStatus2 == 3">
                    却下されました
                </s:elseif>
            </td>

        <!-- 申請ボタン -->
            <td>
                M<!-- 承認を揃えている間 -->
                <s:if test="decisionStatus2 != 2">
                <s:form action="DecisionDetailApplicationAction">

							<input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
							<input type="hidden" name="decisionType" value="<s:property value="decisionType" />">
							<input type="hidden" name="userId" value="<s:property value="#session.userId" />">
							<s:token />

						<!-- 実施・変更時(実施)の申請-->
						<s:if test="%{(decisionStatus1 == 0 || decisionStatus1 == 3) && decisionStatus2 == 0}">
							<input type="hidden" name="stringId" value="<s:property value="jImpId" />">
											<input type="submit" value="実施申請" onclick='return confirm("よろしいですか？");'>
						</s:if>

						<!-- 契約/実施兼契約・変更時(契約/実施契約)の申請 -->
						<s:elseif test="%{(decisionStatus2 == 0 || decisionStatus2 == 3) && decisionStatus1 == 2}">
							<s:if test="%{decisionType == '契約'}">
								<input type="hidden" name="stringId" value="<s:property value="kImpId" />">
											<input type="submit" value="契約申請" onclick='return confirm("よろしいですか？");'>
							</s:if>
							<s:if test="%{decisionType == '実施兼契約'}">
								<input type="hidden" name="stringId" value="<s:property value="jkImpId" />">
											<input type="submit" value="実施兼契約申請" onclick='return confirm("よろしいですか？");'>
							</s:if>
						</s:elseif>
                </s:form>
                </s:if>
                <!-- 最終承認済みかつ終了日を過ぎた時のみ表示 -->
                <s:elseif test="decisionStatus2 == 2"><!-- &&終了日を過ぎた場合 -->
                <!-- 遡求の申請 -->
                <s:form action="DecisionRecourseAction">
                    <input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
                    <input type="submit" value="遡求申請"  onclick='return confirm("よろしいですか？");'>
                </s:form>
                </s:elseif>
            </td>
        </tr>

    </table><br>

        </s:if>
        </s:iterator>


    </s:if>

<br>





<!-- 一般、他リーダー、先生表示用 -->
    <s:iterator value="decisionDetailList1">

    <table border="1">
        <tr>
        <!-- プロジェクト名 -->
            <th colspan="2" rowspan="2">
                A<s:property value="projectName" />
            </th>
        <!-- 決裁種類 -->
            <td colspan="3">
                B<s:property value="decisionType" />
            </td>
        </tr>
        <tr>
        <!-- 決裁状況 -->
            <td colspan="3">
            C<!-- 実施 -->
                    <s:if test="%{decisionType == '実施'}">
                        <s:if test="decisionStatus1 == 0">
                            作成中
                        </s:if>
                        <s:elseif test="decisionStatus1 == 1">
                            申請中/承認待ち
                        </s:elseif>
                        <s:elseif test="decisionStatus1 == 2">
                            承認済み
                        </s:elseif>
                        <s:elseif test="decisionStatus1 == 3">
                            変更中
                        </s:elseif>
                    </s:if>
                <!-- 契約/実施兼契約 -->
                    <s:else>
                        <s:if test="decisionStatus2 == 0">
                            作成中
                        </s:if>
                        <s:elseif test="decisionStatus2 == 1">
                            申請中/承認待ち
                        </s:elseif>
                        <s:elseif test="decisionStatus2 == 2">
                            承認済み
                        </s:elseif>
                        <s:elseif test="decisionStatus2 == 3">
                            変更中
                        </s:elseif>
                    </s:else>
            </td>
        </tr>
        <tr>
            <s:if test="%{decisionType == '実施' || decisionType == '契約'}">     <th>D実施</th>
                <th>E契約</th>
            </s:if>
            <s:else>
                <th colspan="2">D+E実施兼契約</th>
            </s:else>
            <!-- リーダー以上のみ表示 -->
            <s:if test="%{#session.userFlg >= 2}">
                <th>F差し戻し</th>
                <th>G却下</th>
                <th>H承認</th>
            </s:if>
            <s:else>
                <th colspan="3" rowspan="2">
                    F+G+H+K+L+M空白
                </th>
            </s:else>
        </tr>
        <tr>
    <!-- 編集・プレビューボタン -->
        <s:if test="%{decisionType == '実施' || decisionType == '契約'}">
            <td>
                I<!-- 実施のプレビュー -->
                <s:form action="DecisionPreviewAction">
                    <input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
                            <input type="submit" value="プレビュー" >
                </s:form>

            </td>
            <td>
                J<!-- 契約のプレビュー -->
                <s:if test="%{decisionType == '契約'}">
                    <s:form action="DecisionPreviewAction">
                        <input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
                                <input type="submit" value="プレビュー" >
                    </s:form>
                </s:if>
                <s:else>
                    空白
                </s:else>
            </td>
            </s:if>
            <s:else>
            <td colspan="2">
                I+J<!-- 実施兼契約のプレビュー -->
                <s:form action="DecisionPreviewAction">
                    <input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
                            <input type="submit" value="プレビュー" >
                </s:form>
            </td>
            </s:else>

        <!-- リーダー以上のみ表示 -->
        <s:if test="%{#session.userFlg >= 2}">
        <!-- 差し戻しボタン -->
            <td>
            K<!-- 申請中の時 -->
            <s:if test="decisionStatus1 == 1 || decisionStatus2 == 1">
            <s:form action="DecisionDetailRemandAction">

                    <input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
                    <input type="hidden" name="decisionType" value="<s:property value="decisionType" />">
                    <input type="hidden" name="permitStatus" value="<s:property value="permitStatus" />">

            <!-- 先生のみ -->
                <s:if test="%{#session.userFlg == 3}">
                <!-- 先生が差し戻し可能な時 -->
                    <s:if test="permitStatus == 2">
                            <input type="submit" value="差し戻し"  onclick='return confirm("よろしいですか？");'>
                    </s:if>
                    <s:else>
                        リーダー対応中
                    </s:else>
                </s:if>

            <!-- リーダーのみ -->
                <s:else>
                <!-- リーダーが差し戻し可能な時 -->
                    <s:if test="permitStatus < 2 ">
                        <s:if test="%{(jPermiterId1 || kPermiterId1) == #session.userId}">
                            あなたが1人目の承認者
                        </s:if>
                        <s:else>
                                <input type="submit" value="差し戻し"  onclick='return confirm("よろしいですか？");'>
                        </s:else>
                    </s:if>
                    <s:else>
                        先生対応中
                    </s:else>
                </s:else>

            </s:form>
            </s:if>

            <!-- 申請中の時以外 -->
            <s:else>
                現在申請なし
            </s:else>
            </td>
        <!-- 却下ボタン -->
            <td>
            L<!-- 申請中の時 -->
            <s:if test="decisionStatus1 == 1 || decisionStatus2 == 1">
            <s:form action="DecisionDetailRejectAction">

                    <input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
                    <input type="hidden" name="decisionType" value="<s:property value="decisionType" />">

            <!-- 先生のみ -->
                <s:if test="%{#session.userFlg == 3}">
                <!-- 先生が却下可能な時 -->
                    <s:if test="permitStatus == 2">
                            <input type="submit" value="却下"  onclick='return confirm("よろしいですか？");'>
                    </s:if>
                    <s:else>
                        リーダー対応中
                    </s:else>
                </s:if>

            <!-- リーダーのみ -->
                <s:else>
                <!-- リーダーが却下可能な時 -->
                    <s:if test="permitStatus < 2 ">
                        <s:if test="%{(jPermiterId1 || kPermiterId1) == #session.userId}">
                            あなたが1人目の承認者
                        </s:if>
                        <s:else>
                                <input type="submit" value="却下"  onclick='return confirm("よろしいですか？");'>
                        </s:else>
                    </s:if>
                    <s:else>
                        先生対応中
                    </s:else>
                </s:else>

            </s:form>
            </s:if>

            <!-- 申請中の時以外 -->
            <s:else>
                <s:if test="decisionStatus1 == 3 || decisionStatus2 == 3">
                    却下済み/変更中
                </s:if>
                <s:else>
                    現在申請なし
                </s:else>
            </s:else>
            </td>

        <!-- 承認ボタン -->
            <td>
            M<!-- 申請中の時 -->
            <s:if test="%{decisionStatus1 == 1 || decisionStatus2 == 1}">

            <!-- 実施の承認 -->
            <s:if test="%{decisionType == '実施'}">

                <!-- 先生のみ -->
                    <s:if test="%{#session.userFlg == 3}">
                    <!-- 先生の承認 -->
                        <s:if test="permitStatus == 2">
                            <s:form action="DecisionDetailPermitAction">
                                <input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
                                <input type="hidden" name="decisionType" value="<s:property value="decisionType" />">
                                <input type="hidden" name="userId" value="<s:property value="#session.userId" />">
                                <s:token />
                                <input type="hidden" name="permitStatus" value="0">
                                        <input type="submit" value=" 実施承認3人目" onclick='return confirm("よろしいですか？");'>
                            </s:form>
                        </s:if>
                        <s:elseif test="permitStatus == 1">
                            リーダー2人目対応中
                        </s:elseif>
                        <s:else>
                            リーダー1人目対応中
                        </s:else>
                    </s:if>

                <!-- リーダーのみ -->
                    <s:else>
                    <!-- リーダー1の承認 -->
                        <s:if test="permitStatus == 0">
                            <s:form action="DecisionDetailPermitAction">
                                <input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
                                <input type="hidden" name="decisionType" value="<s:property value="decisionType" />">
                                <input type="hidden" name="userId" value="<s:property value="#session.userId" />">
                                <s:token />
                                <input type="hidden" name="permitStatus" value="1">
                                        <input type="submit" value=" 実施承認1人目" onclick='return confirm("よろしいですか？");'>
                            </s:form>
                        </s:if>
                    <!-- リーダー2の承認 -->
                        <s:elseif test="permitStatus == 1">
                            <s:form action="DecisionDetailPermitAction">
                                <input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
                                <input type="hidden" name="decisionType" value="<s:property value="decisionType" />">
                                <input type="hidden" name="userId" value="<s:property value="#session.userId" />">
                                <s:token />
                                <input type="hidden" name="permitStatus" value="2">
                                <s:if test="%{jPermiterId1 == #session.userId}">
                                    あなたが1人目の承認者
                                </s:if>
                                <s:else>
                                        <input type="submit" value=" 実施承認2人目" onclick='return confirm("よろしいですか？");'>
                                </s:else>
                            </s:form>
                        </s:elseif>
                        <s:elseif test="permitStatus == 2">
                            先生対応中
                        </s:elseif>
                    </s:else>

            </s:if>

            <!-- 契約・実施兼契約の承認 -->
            <s:else>

                <!-- 先生のみ -->
                    <s:if test="%{#session.userFlg == 3}">
                    <!-- 先生の承認 -->
                        <s:if test="permitStatus == 2">
                            <s:form action="DecisionDetailPermitAction">
                                <input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
                                <input type="hidden" name="decisionType" value="<s:property value="decisionType" />">
                                <input type="hidden" name="userId" value="<s:property value="#session.userId" />">
                                <s:token />
                                <input type="hidden" name="permitStatus" value="0">
                                <s:if test="%{decisionType == '契約'}">
                                        <input type="submit" value="契約承認3人目" onclick='return confirm("よろしいですか？");'>
                                </s:if>
                                <s:elseif test="%{decisionType == '実施兼契約'}">
                                        <input type="submit" value="実施兼契約承認3人目" onclick='return confirm("よろしいですか？");'>
                                </s:elseif>
                            </s:form>
                        </s:if>
                        <s:elseif test="permitStatus == 1">
                            リーダー2人目対応中
                        </s:elseif>
                        <s:else>
                            リーダー1人目対応中
                        </s:else>
                    </s:if>

                <!-- リーダーのみ -->
                    <s:else>
                    <!-- リーダー1の承認 -->
                        <s:if test="permitStatus == 0">
                            <s:form action="DecisionDetailPermitAction">
                                <input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
                                <input type="hidden" name="decisionType" value="<s:property value="decisionType" />">
                                <input type="hidden" name="userId" value="<s:property value="#session.userId" />">
                                <s:token />
                                <input type="hidden" name="permitStatus" value="1">
                                <s:if test="%{decisionType == '契約'}">
                                        <input type="submit" value="契約承認1人目" onclick='return confirm("よろしいですか？");'>
                                </s:if>
                                <s:elseif test="%{decisionType == '実施兼契約'}">
                                        <input type="submit" value="実施兼契約承認1人目" onclick='return confirm("よろしいですか？");'>
                                </s:elseif>
                            </s:form>
                        </s:if>
                    <!-- リーダー2の承認 -->
                        <s:elseif test="permitStatus == 1">
                            <s:form action="DecisionDetailPermitAction">
                                <input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
                                <input type="hidden" name="decisionType" value="<s:property value="decisionType" />">
                                <input type="hidden" name="userId" value="<s:property value="#session.userId" />">
                                <s:token />
                                <input type="hidden" name="permitStatus" value="2">
                                <s:if test="%{kPermiterId1 == #session.userId}">
                                    あなたが1人目の承認者
                                </s:if>
                                <s:else>
                                    <s:if test="%{decisionType == '契約'}">
                                        <input type="submit" value="契約承認2人目" onclick='return confirm("よろしいですか？");'>
                                    </s:if>
                                    <s:elseif test="%{decisionType == '実施兼契約'}">
                                        <input type="submit" value="実施兼契約承認2人目" onclick='return confirm("よろしいですか？");'>
                                    </s:elseif>
                                </s:else>
                            </s:form>
                        </s:elseif>
                        <s:elseif test="permitStatus == 2">
                            先生対応中
                        </s:elseif>
                    </s:else>

            </s:else>

            </s:if>

            <!-- 申請中の時以外 -->
            <s:else>
                現在申請なし
            </s:else>
            </td>
        </s:if>

        </tr>

    </table>

    </s:iterator>


<br><br>

</s:if>

<s:else>
	ログイン後に表示します。
</s:else>

	<!-- 戻る -->
	<s:form action="GetAddressAction">
		<input type="submit" class="button" value="戻る">
	</s:form>

</div>



</body>
</html>