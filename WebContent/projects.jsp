<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
<link rel="shortcut icon" href="logo/oc.png">
<link rel="apple-touch-icon" href="logo/oc.png">
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="css/projects.css" type="text/css">
<script src="js/jquery-3.1.0.min.js"></script>
<script src="js/projects.js"></script>
<script src="js/pagenation.js"></script>

<title>プロジェクト一覧</title>
</head>
<body>

	<!-- ヘッダー -->
	<header><jsp:include page="header.jsp" /></header>

	<!-- 一覧表示 -->
	<!--<div class="container"> -->




		<h1 class="centered">プロジェクト一覧</h1><!--  class="page-header" align ="center" -->


		<!-- userflg1以下(未ログイン状態)の場合非表示 -->
		<!-- userflg1以上(ログイン状態)の場合表示 -->
		<!-- userflg3のみ編集・削除・追加が可能（仕様）-->


		<s:iterator value="siteInfoList">
			<ul>
				<s:a href="%{siteUrl}">
					<s:property value="siteName" />
					<br>
				</s:a>
			</ul>
		</s:iterator>
		<s:property value="notLoginMsg" />

<!-- flg判定 -->		<s:if test="%{#session.userFlg < 1}">
			<h1 class="centered">ログイン後に表示されます。</h1>
			<BR><BR><BR>
		</s:if>

<!-- flg判定 -->		<s:if test="%{#session.userFlg >= 1}">
			<s:form action="ProjectsSelectAction">
			<div class="centered">
             --- プロジェクト名を入力 ---<br>
				<input type="text" maxlength="100" name="search"
					placeholder="例：rewrite">
				<input type="submit" value="検索">
				</div>
			</s:form>
			<br><BR>
			<div class="centered">
			<font color="red">
			<s:property value="%{resultString}" />
			<s:property value="resultSelect" />
			</font>
			</div>
			<br><BR>

			<div class="table-scroll">
			<s:form action="ProjectsUpdateAction">


				<table border="1" class="centered responsive table-scroll">
					<tbody id="list_body">
						<tr>
							<td></td>
							<td>ID</td>
							<td>プロジェクト名</td>


							<td><div class="largetext">管理者(リーダー)</div></td>

							<td><div class="largetext">管理者（サブ)</div></td>
							<td><div class="middletext">開始日（yyyy/MM/dd）</div></td>
							<td><div class="middletext">終了日（yyyy/MM/dd）</div></td>
							<td>備考</td>
						</tr>
						<s:iterator value="searchList">
							<!-- 繰り返し -->
							<!-- 表示 -->
							<tr>
								<td><input type="hidden" name="projectIdList"
									value="<s:property value="projectId"/>" class="projectId"></td>

								<td><s:property value="projectId" /></td>

								<td><input type="text" name="projectNameList"
									maxlength="100" value="<s:property value="projectName"/>"
									class="projectNamelist" placeholder="例：rewrite"></td>



								<td><s:property value="managerFamilyNameKanji" /> <s:property
										value="managerGivenNameKanji" /></td>



								<td><s:property value="subManagerFamilyNameKanji" /> <s:property
										value="subManagerGivenNameKanji" /></td>


								<td><input type="text" name="projectStartDateList"
									pattern="([0-2][0-9]{3})\/([0-1][0-9])\/([0-3][0-9])"
									title="（yyyy/MM/dd）で入力して下さい" maxlength="10"
									value="<s:property value="startDate"/>"
									class="projectStartDatelist" placeholder="例：2016/08/06"></td>

								<td><input type="text" name="projectEndDateList"
									pattern="([0-2][0-9]{3})\/([0-1][0-9])\/([0-3][0-9])"
									title="（yyyy/MM/dd）で入力して下さい" maxlength="10"
									value="<s:property value="endDate"/>"
									class="projectEnddatelist" placeholder="例：2016/08/10"></td>

								<td><input type="text" name="projectNoteList"
									maxlength="100" value="<s:property value="note"/>"
									class="projectNotelist"></td>



<!-- flg判定 -->			<td><s:if test="%{#session.userFlg == 3}">
										<input type="button" value="削除" class="modal-open">
									</s:if></td>

							</tr>

						</s:iterator>
					</tbody>
				</table>

				<BR>

						<!-- pagenation -->
	<br>
		<br>
		<div id="pager" class="centered  fixedButton">
			<div id="page_ctrl">
				<ul id="page_before">
					<li id="page_prev">prev</li>
				</ul>
				<ul id="page_number"></ul>
				<ul id="page_after">
					<li id="page_next">next</li>
				</ul>
			</div>
		</div>
		<br>
		<br>

<!-- flg判定 -->	<s:if test="%{#session.userFlg == 3}">
        <div class="centered  fixedButton">
      	<input class="button" type="submit" value="編集完了">
      	</div><BR><BR>
				</s:if>
			</s:form>
			</div>
			<br>
<!-- flg判定 -->	<s:if test="%{#session.userFlg == 3}">
				<div class="table-scroll">
				<s:form action="ProjectsInsertAction">

					<table border="1" class="centered add"><!-- class="centered responsive" -->

						<tr>

							<td>プロジェクト名</td>
							<td>管理者(リーダー)</td>
							<td>管理者(サブリーダー)</td>
							<td>開始日(yyyy/MM/dd)</td>
						</tr>

						<tr>

							<td><input type="text" name="projectName"
								placeholder="例：rewrite" maxlength=100 title="" required></td>

							<td><input type="text" pattern="[1-9][0-9]*" title="半角数字のみ"
								name="managerId" placeholder="半角数字で入力" maxlength="10" required
								max="userId"></td>

							<td><input type="text" pattern="[1-9][0-9]*" title="半角数字のみ"
								name="subManagerId" placeholder="半角数字で入力" maxlength="10"
								required></td>
							<td><input type="date"
								pattern="([0-2][0-9]{3})\/([0-1][0-9])\/([0-3][0-9])"
								name="startDate" required></td>
						</tr>
					</table>

					<BR>
                    <div class="centered fixedButton">
					<input class="button" type="submit" value="追加する">
					</div>
					<br>
					<br>

				</s:form>
				</div>

				<br>


				<div class="container">

				<input type="button" value="＋受講生一覧表示" id="listButton">
				<div id="studentsElement">
					<table border="1">
						<tr>
							<th>ユーザーID</th>
							<th>姓(英語)</th>
							<th>名(英語)</th>
							<th>姓(漢字)</th>
							<th>姓(かな)</th>
							<th>名(漢字)</th>
							<th>名(かな)</th>
						</tr>
						<s:iterator value="studentsList">
							<tr>
								<td><s:property value="userId" /></td>
								<td><s:property value="familyName" /></td>
								<td><s:property value="givenName" /></td>
								<td><s:property value="familyNameKanji" /></td>
								<td><s:property value="familyNameKana" /></td>
								<td><s:property value="givenNameKanji" /></td>
								<td><s:property value="givenNameKana" /></td>
							</tr>
						</s:iterator>
					</table>
				</div>
				</div>
			</s:if>


			<div id="modal-main">
				<!-- #contents START -->
				<div id="modal-style" class="centered">
				<br>
					<table class="modal_border responsive">


						<tr>
							<td>プロジェクト名
								<div class="delete-projectname modalDelete"></div>
							</td>
						</tr>
						<tr>
							<td>管理者（リーダー）
								<div class="delete-projectmanagerid modalDelete"></div>
							</td>
						</tr>
						<tr>
							<td>管理者（サブリーダー）
								<div class="delete-projectsubmanagerid modalDelete"></div>
							</td>
						</tr>
						<tr>
							<td>開始日
								<div class="delete-projectstartdate modalDelete"></div>
							</td>
						</tr>
						<tr>
							<td>終了日
								<div class="delete-projectenddate modalDelete"></div>
							</td>
						</tr>
						<tr>
							<td>備考
								<div class="delete-projectnote modalDelete"></div>
							</td>
					</table>
					<input type="button" class="delete-true button" value="削除">
					<input type="button" class="modal-close button" value="閉じる">

					<div class="delete-prepare">
						<p>本当に削除しますか。</p>

						<s:form action="ProjectsDeleteAction">
							<input type="hidden" name="projectId" value=""
								class="true-delete">
							<input type="submit" class="delete-true button" value="はい">
							<input type="button" class="modal-close button" value="いいえ">
						</s:form>

					</div>
				</div>
			</div>

			<div id="contents">
				<br>
			</div>

			<br>
			<br>


		</s:if>


		<s:form action="GetAddressAction">
		<div class="centered">
			<input type="submit" class="button" value="戻る">
			</div>
		</s:form>
		<BR>



</body>
</html>