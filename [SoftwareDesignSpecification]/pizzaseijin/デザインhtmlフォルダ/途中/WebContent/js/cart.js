  function entry(){
	radio = document.getElementsByName('pay')
	if(radio[1].checked){
	  document.getElementById('payBox').style.display = "";
	  document.getElementById('cardBox').style.display = "";
	  document.getElementById('nameBox').style.display = "";
	  document.getElementById('dateBox').style.display = "";
	  document.getElementById('codeBox').style.display = "";
	  document.getElementById('creditButton').style.display = "";
	  document.getElementById('inputCheck').style.display = "";
	}else{
	  document.getElementById('payBox').style.display = "none";
	  document.getElementById('cardBox').style.display = "none";
	  document.getElementById('nameBox').style.display = "none";
	  document.getElementById('dateBox').style.display = "none";
	  document.getElementById('codeBox').style.display = "none";
	  document.getElementById('creditButton').style.display = "none";
	  document.getElementById('inputCheck').style.display = "none";
	}
  }
  function info(){
	radio = document.getElementsByName('address')
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
	  info();
	  entry();
  }
  window.onload = init;