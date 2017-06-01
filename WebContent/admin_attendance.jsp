<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="logo/oc.png">
<link rel="apple-touch-icon" href="logo/oc.png">
<title>勤怠確認</title>

<script src="js/jquery-3.1.0.min.js"></script>
<script type="text/javascript" src="js/attendance.js"></script>
<link rel="stylesheet" href="css/attendance.css">
</head>

<body>
	<!-- ヘッダー-->
	<jsp:include page="header.jsp" />

<div class="container">
<!-- タイトル -->
<h3 style="border-bottom: 1px solid rgba(0,0,0,0.1); box-shadow: 0 1px 0 rgba(255,255,255,1);">勤怠確認</h3>


    <!-- 検索窓 -->
  <s:form action="AdminAttendanceAction" value="date" method="get">
  <div class="input-group">
  <input type="date" name="date" placeholder="2017-07-01">
  <span class="input-group-btn">
  <button class="btn btn-default" type="submit">
<i class="glyphicon glyphicon-search"></i>
  </button>
  </span>
  </div>
  </s:form>





<!-- 顧客一覧 -->
<table class="table table-striped table-borderd">
  <thead>
    <tr>
      <th>報告日時</th>
      <th>受講開始月</th>
      <th>性</th>
      <th>名</th>
      <th>出欠状況</th>
      <th>備考</th>
    </tr>
  </thead>

  <tbody>
<!-- ここからinterator、繰り返し処理 -->
<s:iterator value="searchList">
<tr>
  <td>
  <s:property value="date"/>
  </td>
  <td>
    <s:property value="month"/>
  </td>
  <td>
  <td>
    <s:property value="familyNameKanji"/>
  </td>
  <td>
    <s:property value="givenNameKanji"/>
  </td>
  <td>
    <s:property value="attendance" />
  </td>
  <td>
    <s:property value="reason" />
  </td>

</s:iterator>

</tbody>

</table>

<!-- 以下ページネーション -->

<s:if test ="%{displayList.size() !=0}">
	<div class="text-center">
		<ul class="pagination pagination-lg">
			<s:if test="pageNum == 1">
				<li class="disabled"><span aria-hidden="true">&lt;&lt;</span></li>
				<li class="disabled"><span aria-hidden="true">&lt;</span></li>
			</s:if>

			<s:else>
			<s:if test = "pageNum != 0">
			<li><a href="<s:url action="AdminCustomerAction" >
                     <s:property value="allPages(0)"/>
                   </s:url>
                   "aria-label="最初のページへ"> <span aria-hidden="true">&lt;&lt;</span>
				</a></li>
			</s:if>
				<li><a
					href="<s:url action="AdminCustomerAction" >
                   <s:param name="pageNum" >
                     <s:property value="pageNum - 1"/>
                   </s:param>
                   </s:url>
                   "aria-label="前のページへ"> <span aria-hidden="true">&lt;</span>
				</a></li>
			</s:else>


			<s:if test="%{allPages.size() < 5}">
				<s:iterator value="allPages">
					<li <s:if test="pageNum == pageId"> class="active" </s:if>><a
						href="<s:url action="AdminCustomerAction" >
                   <s:param name="pageNum" >
                     <s:property value="pageId"/>
                   </s:param>
                 </s:url>
                 "><s:property value="pageId" />
                </a></li>
				</s:iterator>
			</s:if>


			<s:else>
				<s:if test="pageNum < 5">
					<s:iterator value="allPages" begin="0" end="4">
						<li <s:if test="pageNum == pageId"> class="active" </s:if>>
						<a href="<s:url action="AdminCustomerAction" >
                   <s:param name="pageNum" >
                     <s:property value="pageId"/>
                   </s:param>
                 </s:url>
                 "><s:property value="pageId" /> </a></li>
					</s:iterator>
				</s:if>


				<s:elseif test="pageNum > 2 && pageNum < allPages.size() - 2">
					<s:iterator value="allPages" begin="%{pageNum - 3}" end="%{pageNum + 1}">
						<li <s:if test="pageNum == pageId"> class="active" </s:if>>
						<a href="<s:url action="AdminCustomerAction" >
                   <s:param name="pageNum" >
                     <s:property value="pageId"/>
                   </s:param>
                 </s:url>
                 "><s:property value="pageId" /> </a></li>
					</s:iterator>
				</s:elseif>


				<s:else>
					<s:iterator value="allPages" begin="%{allPages.size() - 5}"
						end="%{allPages.size(allPages.size() - 1)}">
						<li <s:if test="pageNum == pageId"> class="active" </s:if>>
						<a href="<s:url action="AdminCustomerAction" >
                   <s:param name="pageNum" >
                     <s:property value="pageId"/>
                   </s:param>
                 </s:url>
                 "><s:property value="pageId" /> </a></li>
					</s:iterator>
				</s:else>
			</s:else>


			<s:if test="pageNum  == allPages.size()">
				<li class="disabled"><span aria-hidden="true">&gt;</span></li>
				<li class="disabled"><span aria-hidden="true">&gt;&gt;</span></li>
			</s:if>
			<s:else>
				<li><a
					href="<s:url action="AdminCustomerAction">
                     <s:param name="pageNum" >
                       <s:property value="pageNum + 1"/>
                     </s:param>
                     </s:url>
                   "aria-label="次のページへ"> <span aria-hidden="true">&gt;</span>
				</a></li>
				<s:if test = "pageNum != allPages.size()">
				<li><a
					href="<s:url action="AdminCustomerAction">
                     <s:param name="pageNum" >
                       <s:property value="pageNum = allPages.size()"/>
                     </s:param>
                     </s:url>
                   "aria-label="最後のページへ"> <span aria-hidden="true">&gt;&gt;</span>
				</a></li>
				</s:if>
			</s:else>

		</ul>
	</div>
	</s:if>


</div>



</body>
</html>