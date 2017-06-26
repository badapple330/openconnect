<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=nc">
<title>検索結果一覧</title>

<link rel="stylesheet" href="css/normarize.css">
<link rel="stylesheet" href="css/follow.css">
<link rel="stylesheet" href="css/Bfooter.css">
<link href="css/bootstrap.css" rel="stylesheet">
<link rel="stylesheet" href="css/FriendList.css">


</head>

<body>

	<h2>友達一覧</h2>

	<!-- 検索結果をモーダル内で一覧表示する。 -->

	<div class="modal-body">
		<div class="panel panel-default">
			<div class="panel-body">

				<s:iterator value="usersList" status="i">
					<s:set name="flag" value="1"></s:set>
					<s:iterator value="checkList" status="j">
						<s:if
							test="usersList.get(#i.index).userId == checkList.get(#j.index).done">
							<s:set name="flag" value="0"></s:set>
						</s:if>

					</s:iterator>

					<s:if test='#flag == 1'>
				    <s:if test="%{#session.userId != usersList.get(#i.index).userId}">

						<div class="friends-container">
							<div class="userbox">
							<a
								href="<s:url action="ProfileSessionAction"><s:param name="viewId" value="usersList.get(#i.index).userId"/></s:url>">
								<img class="profimg" src="<s:property value="usersList.get(#i.index).userImg"/>"
								alt=""> <s:property
									value="usersList.get(#i.index).userName" /> Lv:<s:property
									value="usersList.get(#i.index).lv" />
							</a>
							</div>

							<div class="follow-btn">


								<s:if test="groupId == 0">
										<div class="square_btn">
											<a
												href="<s:url action="FollowListSessionAction"><s:param name="viewId" value="usersList.get(#i.index).userId"/></s:url>">
												フォローする</a>
										</div>
										<a
											href="<s:url action="FollowListSessionAction"><s:param name="viewId" value="usersList.get(#i.index).userId"/></s:url>">
												<img  class="followIcon" src="pic/follow.png" alt="フォロワーボタン" title="フォローする">
											</a>
									</s:if>
									<s:else>
										<div class="square_btn">
											<a
												href="<s:url action="GroupMemberAddAction"><s:param name="addMemberList" value="usersList.get(#i.index).userId"/></s:url>">
												グループに追加する</a>
										</div>
									</s:else>

							</div>

						</div>

					</s:if>
					</s:if>
				</s:iterator>
			</div>
			<div class="modal-footer">
				<s:token />
			</div>
		</div>
	</div>

	<footer>
		<div  class = "footer">
 <nav>
 <div class = "contents" >
 <div class="a" style="margin-right:20px; background-color:rgb(111, 207, 245);"><a href="<s:url action="ProfileSessionAction"><s:param name="viewId" value="%{userId}"/></s:url>"><img class="pic" src ="pic/profile.png" ></a></div>

 <div class="a" style="margin-right:20px"><a href="<s:url action="GoTalkListAction"/>"><img class="pic" src ="pic/talk.png" >
 <s:if test="talkInfo > 0 and talkInfo <100"><span class="b"><s:property value="talkInfo" /></span></s:if>
 <s:if test="talkInfo >= 100 and talkInfo <1000"><span class="bh"><s:property value="talkInfo" /></span></s:if>
 <s:if test="talkInfo >= 1000"><span class="bt"><s:property value="talkInfo" /></span></s:if>
 </a></div>

 <div class="a" style="margin-right:20px" ><a href="<s:url action="GoGroupAction"/>"><img class="pic" src ="pic/group.png" >
 <s:if test="groupInfo > 0 and groupInfo <100"><span class="b"><s:property value="groupInfo" /></span></s:if>
 <s:if test="groupInfo >= 100 and groupInfo <1000"><span class="bh"><s:property value="groupInfo" /></span></s:if>
 <s:if test="groupInfo >= 1000"><span class="bt"><s:property value="groupInfo" /></span></s:if>
 </a></div>

 <div class="a"><a href="<s:url action="GoTimelineAction"/>"><img class="pic" src ="pic/time_line.png" ></a></div>
 </div>
 </nav>
 </div>
	</footer>

</body>
</html>
