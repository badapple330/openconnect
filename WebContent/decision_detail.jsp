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
</head>
<body>

		<!-- 	ヘッダー読み込み -->
		<jsp:include page="header.jsp" />

<div class="container">
<s:if test="%{#session.userFlg >= 1}">

			<br>
			<!-- 一覧表示 -->
			<h1>決裁手続き一覧</h1>
			ログイン中ユーザー：<s:property value="#session.user" /><br>ID:<s:property value="#session.userId" /><br>


			<s:form action="DecisionDetailSelectAction">
				プロジェクト検索
				<input type="text" placeholder="例：legmina" name="searchString"
					maxlength=30>
				<input type="submit" value="検索" />
			</s:form>

			<br>
			<font color="red">
			<s:property value="%{resultString}" />
			<s:property value="%{resultSelect1}" />
			<s:property value="%{resultSelect2}" />
			</font>




	<!-- リーダー自プロジェクト表示用 -->
	<s:if test="%{#session.userFlg == 2}">

		<s:iterator value="decisionDetailList2">
		<p>自のlist内：<s:property value="%{decisionDetailList2.size()}" />個</p>
		<p>全のlist内：<s:property value="%{decisionDetailList1.size()}" />個</p>
		<p>決済未作成のlist内：<s:property value="%{decisionBeginList.size()}" />個</p>
		<s:if test="%{decisionDetailList2.size() > 0}">

			<table border="1">

				<tr>
					<th>決裁ID</th>

                    <th>プロジェクトID</th>
					<th>案件名</th>
					<th>プロジェクト名</th>

					<th>決裁種類</th>
                    <th>決裁状況</th>

					<th>編集/プレビューボタン</th>
					<th>申請ボタン</th>
					<th>変更ボタン</th>
                </tr>

				<tr>
				<!-- 決裁ID -->
					<td class="decision_id">
						<s:property value="decisionId" />
					</td>


				<!-- プロジェクトID -->
					<td class="project_id">
						<s:property value="projectId" />
					</td>
				<!-- 案件名 -->
					<td>
						<s:property value="decisionName" />
					</td>
				<!-- プロジェクト名 -->
					<td class="project_name">
						<s:property value="projectName" />
					</td>


				<!-- 決裁種類 -->
					<td class="decision_type">
						<s:property value="decisionType" />
					</td>
				<!-- 決裁状況 -->
					<td class="decision_status">
					<!-- 実施 -->
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


                <!-- 編集/プレビューボタン -->
					<td>
					<!-- 実施の編集 -->
						<s:if test="%{decisionStatus1 == 0 && decisionStatus2 == 0}">
							<s:form action="DecisionSelectAction">
								<input type="hidden" name="userId" value="<s:property value="#session.userId" />">
								<input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
								<input type="submit" value="実施編集">
							</s:form>
						</s:if>
					<!-- 契約/実施兼契約の編集 -->
						<s:elseif test="%{decisionStatus2 == 0 && decisionStatus1 == 2}">
							<s:form action="DecisionSelectAction">
								<input type="hidden" name="userId" value="<s:property value="#session.userId" />">
								<input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
								<input type="submit" value="契約/実施兼契約編集">
							</s:form>
						</s:elseif>
					<!-- プレビュー -->
						<s:else>
							<s:form action="DecisionPreviwAction">
								<input type="hidden" name="userId" value="<s:property value="#session.userId" />">
								<input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
								<input type="submit" value="プレビュー" >
							</s:form>
						</s:else>
					</td>


				<!-- 申請ボタン -->
					<td>
					<!-- 作成中/変更中の時 -->
					<s:if test="%{decisionStatus1 != 1 || decisionStatus1 != 2 || decisionStatus2 != 1 || decisionStatus2 != 2}">

						<s:form action="DecisionDetailApplicationAction">
							<input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
							<input type="hidden" name="decisionType" value="<s:property value="decisionType" />">

						<!-- 実施・変更時(実施)の申請-->
						<s:if test="%{( decisionStatus1 == 0 || decisionStatus1 == 3 ) && decisionStatus2 == 0}">
											<input type="submit" value="実施申請">
						</s:if>

						<!-- 契約・実施兼契約・変更時(契約/実施契約)の申請 -->
						<s:if test="%{decisionStatus1 == 2 && ( decisionStatus2 == 0 || decisionStatus2 == 3 )}">
							<s:if test="%{decisionType =='契約' }">
											<input type="submit" value="契約申請">
							</s:if>
							<s:if test="%{decisionType =='実施兼契約' }">
											<input type="submit" value="実施兼契約申請">
							</s:if>
						</s:if>

						</s:form>
					</s:if>
					<!-- 作成中/変更中以外の時 -->
					<s:else>
							ダミー
					</s:else>
					</td>


				<!-- 変更ボタン -->
					<td>
					<!-- 変更中の時 -->
					<s:if test="%{decisionStatus1 == 3 || decisionStatus2 == 3}">

						<s:form action="DecisionSelectAction">
							<!-- <input type="hidden" name="userId" value="<s:property value="#session.userId" />"> -->
							<input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
							<input type="submit" value="変更" />
						</s:form>
					</s:if>

					<!-- 変更中の時 以外-->
					<s:else>
						ダミーボタン
					</s:else>
				</td>
			</tr>

			</table>

		</s:if>
		</s:iterator>




		<s:iterator value="decisionBeginList">

			<s:if test="%{decisionDetailList2.size() == 0 && decisionBeginList.size() > 0}">
    			<div class="pad">

            <s:form action="DecisionDetailInsertAction">
					案件の追加<br>あなたのプロジェクトは...
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
						<input type="submit" value="追加(決済資料を作る)">
					</td>
				</tr>
			</table>

			</s:form>
				</div>
			</s:if>

		</s:iterator>


	</s:if>




		<!-- 一般、他リーダー、先生表示用 -->

			<table border="1">
				<tr>
					<th>決裁ID</th>

                    <th>プロジェクトID</th>
					<th>案件名</th>
					<th>プロジェクト名</th>

					<th>決裁種類</th>
                    <th>決裁状況</th>

					<th>プレビューボタン</th>

					<s:if test="%{#session.userFlg >= 2}">
					<th>承認ボタン</th>

							<s:if test="%{#session.userFlg == 3}">
							<th>差し戻しボタン</th>
							<th>却下ボタン</th>
							</s:if>

					</s:if>

				</tr>


				<s:iterator value="decisionDetailList1">

				<tr>
			<!-- 決裁ID -->
					<td class="decision_id">
						<s:property value="decisionId" />
					</td>


			<!-- プロジェクトID -->
					<td class="project_id">
						<s:property value="projectId" />
					</td>
			<!-- 案件名 -->
					<td>
						<s:property value="decisionName" />
					</td>
			<!-- プロジェクト名 -->
					<td class="project_name">
						<s:property value="projectName" />
					</td>


			<!-- 決裁種類 -->
					<td class="decision_type">
						<s:property value="decisionType" />
					</td>
			<!-- 決裁状況 -->
					<td class="decision_status">
					<!-- 実施 -->
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
			<!-- プレビューボタン -->
					<td>
						<s:form action="DecisionSelectAction">
							<input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
							<input type="submit" value="プレビュー">
						</s:form>
					</td>


		<!-- リーダー以上のみ表示 -->
		<s:if test="%{#session.userFlg >= 2}">

			<!-- 承認ボタン -->
					<td>
					<!-- 申請中の時 -->
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
										<input type="hidden" name="permitStatus" value="0">
										<input type="submit" value=" 実施承認3人目">
									</s:form>
								</s:if>
								<s:else>
									リーダー承認中
								</s:else>
							</s:if>

						<!-- リーダーのみ -->
							<s:else>
							<!-- リーダー1の承認 -->
								<s:if test="permitStatus == 0">
									<s:form action="DecisionDetailPermitAction">
										<input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
										<input type="hidden" name="permitStatus" value="1">
										<input type="submit" value=" 実施承認1人目">
									</s:form>
								</s:if>
							<!-- リーダー2の承認 -->
								<s:elseif test="permitStatus == 1">
									<s:form action="DecisionDetailPermitAction">
										<input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
										<input type="hidden" name="permitStatus" value="2">
										<input type="submit" value=" 実施承認2人目">
									</s:form>
								</s:elseif>
								<s:elseif test="permitStatus == 2">
									先生承認中
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
										<input type="hidden" name="permitStatus" value="0">
										<input type="submit" value=" 契約/実施兼契約承認3人目">
									</s:form>
								</s:if>
								<s:else>
									リーダー承認中
								</s:else>
							</s:if>

						<!-- リーダのみ -->
							<s:else>
							<!-- リーダー1の承認 -->
								<s:if test="permitStatus == 0">
									<s:form action="DecisionDetailPermitAction">
										<input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
										<input type="hidden" name="permitStatus" value="1">
										<input type="submit" value=" 契約/実施兼契約承認1人目">
									</s:form>
								</s:if>
							<!-- リーダー2の承認 -->
								<s:if test="permitStatus == 1">
									<s:form action="DecisionDetailPermitAction">
										<input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
										<input type="hidden" name="permitStatus" value="2">
										<input type="submit" value=" 契約/実施兼契約承認2人目">
									</s:form>
								</s:if>
								<s:elseif test="permitStatus == 2">
									先生承認中
								</s:elseif>
							</s:else>
					</s:else>

					</s:if>
					<!-- 申請中の時以外 -->
					<s:else>
						現在申請なし
					</s:else>
					</td>


			<s:if test="%{#session.userFlg == 3}">

			<!-- 差し戻しボタン -->
					<td>
					<!-- 申請中の時 -->
					<s:if test="decisionStatus1 == 1 || decisionStatus2 == 1">
						<!-- リーダー2人承認済み時 -->
						<s:if test="permitStatus == 2">

					<!-- 実施の差し戻し -->
						<s:if test="%{decisionType == '実施'}">
							<s:form action="DecisionDetailPermitAction">
								<input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
								<input type="hidden" name="decisionStatus1" value="0">
								<input type="hidden" name="permitStatus" value="0">
										<input type="submit" value="実施差し戻し" /><!-- submit統一 -->
							</s:form>
						</s:if>
					<!-- 契約・実施兼契約の差し戻し -->
						<s:else>
							<s:form action="DecisionDetailPermitAction">
								<input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
								<input type="hidden" name="decisionStatus2" value="0">
								<input type="hidden" name="permitStatus" value="0">
								<s:if test="%{decisionType == '契約'}">
										<input type="submit" value="契約差し戻し" /><!-- submit統一 -->
								</s:if>
								<s:else>
										<input type="submit" value="実施兼契約差し戻し" /><!-- submit統一 -->
								</s:else>

							</s:form>
						</s:else>

						</s:if>
						<s:else>
							リーダー承認中
						</s:else>
					</s:if>
					<!-- 申請中の時以外 -->
					<s:else>
						現在申請なし
					</s:else>
					</td>

			<!-- 却下ボタン -->
					<td>
					<!-- 申請中の時 -->
					<s:if test="decisionStatus1 == 1 || decisionStatus2 == 1">
						<!-- リーダー2人承認済み時 -->
						<s:if test="permitStatus == 2">

						<s:form action="DecisionDetailPermitAction">
							<input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
							<input type="hidden" name="permitStatus" value="0">

					<!-- 実施の却下 -->
							<s:if test="%{decisionType == '実施'}">
								<input type="hidden" name="decisionStatus1" value="3">
								<input type="submit" value="実施却下" /><!-- submit統一 -->
							</s:if>

						<!-- 契約・実施兼契約の却下 -->
							<s:else>
								<input type="hidden" name="decisionStatus2" value="3">
								<s:if test="%{decisionType == '契約'}">
									<input type="submit" value="契約却下" /><!-- submit統一 -->
								</s:if>
								<s:else>
									<input type="submit" value="実施兼契約却下" /><!-- submit統一 -->
								</s:else>
							</s:else>

						</s:form>

						</s:if>
						<s:else>
							リーダー承認中
						</s:else>
					</s:if>

					<!-- 申請中の時以外 -->
					<s:else>
						現在申請なし
					</s:else>
					</td>

			</s:if>

		</s:if>

				</tr>
				</s:iterator>

		</table>


<br><br>

</s:if>

<s:else>
	ログイン後に表示します。
</s:else>

	<!-- 	戻る -->
	<s:form action="GetAddressAction">
		<input type="submit" class="button" value="戻る">
	</s:form>

</div>

</body>

</html>