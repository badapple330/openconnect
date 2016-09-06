function radioChange(){
	radio = document.getElementsByName("creditRadio");
	if(radio[0].checked){
		document.getElementById("tr3").style.display = "";
		document.getElementById("tr4").style.display = "none";
		document.getElementById("tr5").style.display = "none";
	}else if(radio[1].checked){
		document.getElementById("tr3").style.display = "none";
		document.getElementById("tr4").style.display = "";
		document.getElementById("tr5").style.display = "none";
	}else{
		document.getElementById("tr3").style.display = "none";
		document.getElementById("tr4").style.display = "none";
		document.getElementById("tr5").style.display = "";
	}
}