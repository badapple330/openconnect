$(function(){
	document.getElementById("checkButton").onclick = function(){
		var radioList = document.getElementsByName("attendance");
		var str = "選択されていません";
		for(var i=0; i<radioList.length; i++){
			if (radioList[i].checked) {
				str = radioList[i].value + "が選択されています";
				break;
			}
		}
		alert(str);
		document.getElementById("result").innerHTML = str;
	}
});