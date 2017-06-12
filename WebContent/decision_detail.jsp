<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset=UTF-8>
<link rel="shortcut icon" href="logo/oc.png">
<link rel="apple-touch-icon" href="logo/oc.png">
<title>決裁手続き電子化</title>
<script src="js/jquery-3.1.0.min.js"></script>
<script src="js/decision_detail.js"></script>
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
			ログイン中ユーザー：<s:property value="#session.user" /><br><br>


			<s:form action="DecisionDetailSelectAction">
				プロジェクト検索
				<input type="text" placeholder="例：rewrite" name="searchString"
					maxlength=30>
				<s:submit value="検索" />
			</s:form>

			<br><font color="red">
			<s:property value="%{resultString}" />
			<s:property value="%{resultSelect}" /></font>




	<!-- 	決済リスト表示 -->
		<table border="1">
				<tr>
					<th>決済ID</th>

                    <th>プロジェクトID</th>
					<th>案件名</th>
					<th>プロジェクト名</th>

					<th>決裁種類</th>
                    <th>決済状況</th>

					<th>
						<s:if test="%{#session.userFlg == 2}">
						編集/プレビューボタン
						</s:if>
						<s:else>
						プレビューボタン
						</s:else>
					</th>

				<s:if test="%{#session.userFlg >= 2}">
					<th>申請ボタン</th>

					<th>承認ボタン</th>
					<th>差し戻しボタン</th>
					<th>
						<s:if test="%{#session.userFlg == 3}">
						却下ボタン
						</s:if>
						<s:else>
						変更ボタン
						</s:else>
					</th>
				</s:if>

                </tr>



		<!-- リーダー自プロジェクト表示用 -->
			<s:if test="%{#session.userFlg == 2}">
				<s:iterator value="decisionDetailList2">
				<tr>
				<!-- 決済ID -->
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


				<!-- 決済種類 -->
						<td class="decision_type">
                            <s:property value="decisionType" />
                        </td>
				<!-- 決済状況 -->
						<td class="decision_status">
							<s:if test="%{decisionType == '実施')}">
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


           				<!-- <s:property value="decisionStatus1" /> -->
                        	</s:if>
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


            			<!-- <s:property value="decisionStatus2" /> -->
                        	</s:else>
                        </td>


                <!-- 編集/プレビューボタン -->
						<td>
							<s:if test="%{decisionStatus1 == 0 || decisionStatus2 == 0}">
				            	<a href=".jsp"><input type="button" value="編集" /></a>
				            </s:if>
				            <s:else>
				            	<s:form action="DecisionDetailPreviewAction">
									<input type="hidden" name="decisionId" value="<s:property value="decisionId" />">
									<s:submit value="プレビュー" />
								</s:form>
				            </s:else>
                        </td>
				<!-- 申請ボタン -->
						<td>
						<!-- フォームに行って印を押す -->
							<s:if test="%{decisionStatus1 == 0 || decisionStatus2 == 0 || decisionStatus1 == 3 || decisionStatus2 == 3}">
							<s:form action="DecisionDetailApplicationAction">
								<s:if test="%{decisionType == '実施'}">
                            		<input type="hidden" name="decisionStatus1" value=1>
                         		</s:if>
                         		<s:else>
									<input type="hidden" name="decisionStatus2" value=1>
								</s:else>
									<input type="hidden" name="decisionlId" value="<s:property value="decisionId" />">
									<input type="submit" value="申請">
							</s:form>
							</s:if>
							<s:if test="%{decisionStatus1 == 1 || decisionStatus2 == 1}">
								承認待ち
							</s:if>
								承認済み
						</td>


				<!-- 承認ボタン -->
						<td>
                           ダミーボタン
                        </td>
				<!-- 差し戻しボタン -->
						<td>
                           ダミーボタン
                        </td>
                <!-- 変更ボタン -->
						<td>
							<s:if test="%{decisionStatus1 == 3 || decisionStatus2 == 3}">
				            	<a href=".jsp"><input type="button" value="変更" /></a>
				            </s:if>
				           ダミーボタン
                        </td>

				    </tr>

				</s:iterator>
			</s:if>




		<!-- 通常表示用 -->
				<s:iterator value="decisionDetailList1">
					<tr>
				<!-- 決済ID -->
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


				<!-- 決済種類 -->
						<td class="decision_type">
                            <s:property value="decisionType" />
                        </td>
				<!-- 決済状況 -->
						<td class="decision_status">
						 	<s:if test="%{decisionType == '実施')}">
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


           				<!-- <s:property value="decisionStatus1" /> -->
                        	</s:if>
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


            			<!-- <s:property value="decisionStatus2" /> -->
                        	</s:else>
                        </td>


                <!-- プレビューボタン -->
						<td>
							<s:form action="DecisionDetailPreviewAction">
								<input type="hidden" name="decisionId"
									value="<s:property value="decisionId" />">
								<s:submit value="プレビュー" />
							</s:form>
                        </td>

			<s:if test="%{#session.userFlg >= 2}">
				<!-- 申請ボタン -->
						<td>
				            ダミーボタン
						</td>


				<!-- 承認ボタン -->
						<td>







                            <a href=".jsp"><input type="button" value="承認" /></a>
                        </td>
				<!-- 差し戻しボタン -->
						<td>
							<s:if test="%{#session.userFlg == 3}">
                            	<a href=".jsp"><input type="button" value="差し戻し" /></a>
                            </s:if>
                            ダミーボタン
                        </td>
                <!-- 却下/変更ボタン -->
						<td>
                            <s:if test="%{#session.userFlg == 3}">
                            	<a href=".jsp"><input type="button" value="却下" /></a>
                            </s:if>
                            ダミーボタン(変更)
                        </td>
			</s:if>

				    </tr>

				</s:iterator>

		</table>




<br><br>



<s:if test="%{#session.userFlg >= 2}">
    <div class="pad">
            <s:form action="DecisionDetailInsertAction">
					案件の追加<br>
						<input type="text" name="projectName" placeholder="プロジェクト名" required>
						実施兼契約決裁で行う場合のみチェック
						<input type="checkbox" name="decisionType" value="実施兼契約決裁"><br>
						<input type="submit" value="追加">
			</s:form>
    </div>
</s:if>




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