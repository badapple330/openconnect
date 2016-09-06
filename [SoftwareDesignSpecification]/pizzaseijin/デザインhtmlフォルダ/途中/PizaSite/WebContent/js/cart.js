  function entry(){
		radio = document.getElementsByName('pay')
	if(radio[1].checked){
	  document.getElementById('payBox').style.display = "";
	  document.getElementById('firstBox').style.display = "";
	  document.getElementById('payfirstBox').style.display = "";
	  document.getElementById('paysecoudBox').style.display = "";

	}else{
	  document.getElementById('payBox').style.display = "none";
	  document.getElementById('firstBox').style.display = "none";
	  document.getElementById('payfirstBox').style.display = "none";
	  document.getElementById('paysecoudBox').style.display = "none";

	}
	}
	function info(){
	radio = document.getElementsByName('adress')
	if(radio[1].checked) {
	  document.getElementById('a').style.display = "";
	  document.getElementById('b').style.display = "";
	  document.getElementById('c').style.display = "";
	  document.getElementById('d').style.display = "";
	  document.getElementById('e').style.display = "";

	}else{
	  document.getElementById('a').style.display = "none";
	  document.getElementById('b').style.display = "none";
	  document.getElementById('c').style.display = "none";
	  document.getElementById('d').style.display = "none";
	  document.getElementById('e').style.display = "none";

	}
	}
	function init(){
		entry();
		info();
	}
	window.onload = init;