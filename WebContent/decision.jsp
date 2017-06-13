<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html >
<html lang=ja>
<head>
<meta charset="utf-8">
<!-- Stylesheet
      ================================================== -->
<link rel="stylesheet" type="text/css" href="css/decision_jissi.css">

<!-- Javascripts
      ================================================== -->
<script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>


<title>実施決裁</title>
<script type="text/javascript">
	function calculation() {
		// 設定開始

		// 開発端末
		var price1 = parseFloat(document.form1.goods1.value * 7); // 単価を設定
		document.form1.field1.value = price1; // 小計を表示

		// リソース環境巣要領
		var price2 = parseFloat((document.form1.goods2.value * 0.6).toFixed(1)); // 単価を設定
		document.form1.field2.value = price2; // 小計を表示

		// 回線使用料
		var price3 = parseFloat(document.form1.goods3.value * 1); // 単価を設定
		document.form1.field3.value = price3; // 小計を表示

		// 施設使用量
		var price4 = parseFloat(document.form1.goods4.value * 55.5); // 単価を設定
		document.form1.field4.value = price4; // 小計を表示

		// 建設費用
		var total = parseFloat(price1 + price2 + price3 + price4);

		// 建設費用を表示
		document.form1.field_total.value = total;

		// 開発要員
		var price5 = parseFloat(document.form1.goods5.value * 100); // 単価を設定
		document.form1.field5.value = price5; // 小計を表示

		// リソース環境巣要領
		var price6 = parseFloat((document.form1.goods6.value * 0.5).toFixed(1)); // 単価を設定
		document.form1.field6.value = price6; // 小計を表示

		// 損益費用
		var all = parseFloat(price5 + price6);

		// 損益費用を表示
		document.form1.field_all.value = all;

		//建設費用(2)
		var bild = parseFloat(price1 + price2 + price3 + price4);

		// 建設費用(2)を表示
		document.form1.field_bild.value = bild;

		// 損益費用
		var benefit = parseFloat(price5 + price6);

		// 損益費用を表示
		document.form1.field_benefit.value = benefit;

		//合計金額
		var submit = parseFloat(price1 + price2 + price3 + price4 + price5
				+ price6);

		// 損益費用を表示
		document.form1.field_submit.value = submit;

		// 設定終了

	}

	function OnButtonClick() {
		var fileRef = document.getElementById('File1');
		var outFrame = document.getElementById('output');

		for (i = 0; i < fileRef.files.length; i++) {
			outFrame.innerHTML = fileRef.files[i].name + "<br/>";
		}

	}

	//選択箇所全入力
	$(function() {
		$("#input").on("keyup change", function() {
			$("#a,#b,#c,#d").val($(this).val());
		});
	});
</script>

</head>


<body>
  <form action="#" name="form1">


    	<table class="main" border="2">
			<tr>

	<th class="kian">起案者名</th>

    <s:iterator value="nameList">
      <td><input type="text" name="name" size="8" value="<s:property value="familyNameKanji" />">
      <s:property value="<s:property value='nameList.familyNameKanji'/>"/>
      </td>
     </s:iterator>

<th colspan="2"><s:property value="<s:property value='nameList.familyNameKanji'/>"/>プロジェクト承認者</th>

<td><input type="text" name="name" size="8" placeholder="氏名"></td>

<td><input type="text" name="name" size="8" placeholder="氏名"></td>

<td><input type="text" name="name" size="9" placeholder="氏名"></td>

<th colspan="2">承認番号</th>

<td colspan="2"><input type="text" name="name" size="32" placeholder="氏名"></td>

</tr>

<tr>

<th>起案番号</th>





				<td colspan="2"><input type="text" readonly="readonly"
				 value="<s:property value="iDraftingId" />"></td>



				<th>決裁番号</th>

				<td colspan="2"><input type="text" readonly="readonly" value="<s:property value="iApprovalId" />" ></td>

				<th colspan="2">実施時期・実施機関</th>

				<td colspan="3"><input type="date" name="" placeholder="YYYY-MM-DD"
					value="<s:property value="startDay" />" > ~ <input
					type="date" name="" placeholder="YYYY-MM-DD" value="<s:property value="endDay" />"
					></td>


			</tr>


			<tr>
				<th class="atama">決裁頭紙</th>




				<s:iterator value="decisionList">
				<td colspan="10"><textarea cols="100" rows="4" name="頭紙"><s:property value="head" /></textarea></td>
	            </s:iterator>


			</tr>


			<tr>
				<th>案件名</th>






                 <s:iterator value="decisionList">
				<td colspan="3"><textarea cols="60" rows="4" name="projectname"><s:property value="decisionName" /></textarea></td>
						</s:iterator>





				<th>費用</th>

				<td colspan="6">建設費用：<input type="text" name="field_bild"
					value="<s:property value="bildCost" />" readonly="readonly"
					size="8">万円 損益費用：<input type="text" name="field_benefit"
					value="<s:property value="benefit" />" readonly="readonly" size="8">万円
					合計：<input type="text" name="field_submit"
					value="<s:property value="amountAll" />" readonly="readonly"
					size="8">万円
				</td>



			</tr>

			<tr>
				<th>概要</th>
				<s:iterator value="decisionList">
				<td colspan="10"><textarea cols="125"
						rows="4" name="案件名"><s:property value="summary" /></textarea></td>
                 </s:iterator>

			</tr>





			<tr>
				<th>理由・目的</th>



				<s:iterator value="decisionList">
				<td colspan="10"><textarea cols="125"rows="4" name="案件名"><s:property value="cause" /></textarea></td>
                  </s:iterator>

			</tr>



		</table>





<br><br>









		<table class="sub" border="2">




			<tr>
				<th>　　　　</th>



				<th>1単位当たりの金額(万円)</th>


				<th>個数</th>



				<th>小計(万円)</th>


			</tr>


			<tr>

				<th>開発端末</th>




				<td><s:property value="prove" /></td>





				<td><input type="number" placeholder="メンバー人数を入力" name="goods1"
					id="input" value="" onChange="calculation()"></td>

				<td><input type="number" name="field1" size="20" value=""
					readonly="readonly">万円</td>
			</tr>

			<tr>

				<th>リリース環境使用料</th>

				 <s:iterator value="decisionList">
				<td><s:property value="re" /></td>
                 </s:iterator>


				<td><input type="number" name="goods2" id="a" value=""
					onChange="calculation()" readonly="readonly"></td>


				<td><input type="number" name="field2" size="20" value=""
					readonly="readonly">万円</td>

			</tr>


			<tr>
				<th>回線使用料</th>





				 <s:iterator value="decisionList">
				<td><s:property value="line" /></td>
                 </s:iterator>


				<td><input type="number" name="goods3" id="b" value=""
					onChange="calculation()" readonly="readonly"></td>

				<td><input type="number" name="field3" size="20" value=""
					readonly="readonly">万円</td>




			</tr>

			<tr>

				<th>施設使用料</th>






                 <s:iterator value="decisionList">
                <td><s:property value="room" /></td>
                </s:iterator>




				<td><input type="number" value="1" name="goods4"
					onChange="calculation()" readonly="readonly"></td>

				<td><input type="number" name="field4" size="20" value="55.5"
					readonly="readonly">万円</td>




			</tr>

			<tr>

				<th>建設費用</th>

				<td></td>

				<td></td>



				<td><input type="text" name="field_total" readonly="readonly"
					size="20" readonly="readonly">万円</td>


			</tr>






		</table>



<br><br>





		<table class="math" border="2">





			<tr>

			<th></th>

				<th>1単位当たりの金額(万円)</th>

				<th>個数</th>


				<th>小計(万円)</th>


			</tr>


			<tr>
				<th>開発要員</th>


                 <s:iterator value="decisionList">
				<td><s:property value="human" /></td>
				</s:iterator>



				<td><input type="number" name="goods5" id="c" value=""
					onChange="calculation()" readonly="readonly"></td>
				<td><input type="number" name="field5" size="20" value=""
					readonly="readonly">万円</td>

			</tr>

			<tr>
				<th>雑費</th>

                <s:iterator value="decisionList">
				<td><s:property value="etc" /></td>
                 </s:iterator>

				<td><input type="number" name="goods6" id="d" value=""
					onChange="calculation()" readonly="readonly"></td>
				<td><input type="number" name="field6" size="20" value=""
					readonly="readonly">万円</td>

			</tr>


			<tr>
				<th>損益費用(万円)</th>
				<td></td>
				<td></td>
				<td><input type="text" name="field_all" readonly="readonly"
					size="20">万円</td>





			</tr>





		</table>


<br><br>



	</form>




	<h2>WBS、チーム体制図、画面遷移図を添付</h2>


	<div class="file">

		<form action="decideaction">



			<input id="File1" type="file" multiple size="30" /><input
				id="Button1" type="button" value="開く" onclick="OnButtonClick();" />
			<div id="output"></div>

		</form>

	</div>



<br><br>

	<div class="save">
		<s:form action="DecisionUpdateAction">
			<input type="submit" value="編集を保存" name="update">

		</s:form>


	</div>

	<div>
		<s:form action="DecisionSelectAction">
			<input type="submit" value="表示">

		</s:form>


      </div>




</body>
</html>