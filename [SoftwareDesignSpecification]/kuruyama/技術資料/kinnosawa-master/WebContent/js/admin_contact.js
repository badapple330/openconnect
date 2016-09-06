var page = 0;
var view = 3;
var trs = document.getElementsByTagName("tr");
var number = trs.length;
var maxPage = Math.ceil((number - 1) / view);
var lis = document.getElementById("pagination").getElementsByTagName("li");
window.onload = next;

function next(){
	if(number != 0 && page != maxPage){
		page++;
		for(var i = view; i > 0; i--){
			var index = page * view + 1 - i;
			if(index < number){
				trs[index].style.display = "";
			}
			if(index > view){
				trs[index - view].style.display = "none";
			}
		}
	}
	paging();
};

function previous(){
	if(number != 0 && page > 1){
		page--;
		for(var i = view; i > 0; i--){
			var index = page * view + 1 - i;
			trs[index].style.display = "";
			if(index + view < number){
				trs[index + view].style.display = "none";
			}
		}
	}
	paging();
};

function select(num){
	for(var i = 1; i < number; i++){
		trs[i].style.display = "none";
	}
	for(var i = view; i > 0; i--){
		var index = num * view + 1 - i;
		if(index < number){
			trs[index].style.display = "";
		}
	}
	page = num;
	paging();
};

function paging(){
	if(maxPage < 6){
		for(var i = 1; i <= 5; i++){
			if(i <= maxPage){
				lis[i].className = "";
				lis[i].style.display = "";
				lis[i].getElementsByTagName("a")[0].innerHTML = i;
				lis[i].getElementsByTagName("a")[0].href = "javascript:select(" + i+ ")";
			}else{
				lis[i].style.display = "none";
			}
		}
		lis[page].className = "active";
	}else{
		if(page <= 3){
			for(var i = 1; i <= 3; i++){
				lis[i].className = "";
				lis[i].style.display = "";
				lis[i].getElementsByTagName("a")[0].innerHTML = i;
				lis[i].getElementsByTagName("a")[0].href = "javascript:select(" + i + ")";
			}
			lis[page].className = "active";
			lis[4].className = "";
			lis[4].getElementsByTagName("a")[0].style.cursor = "default";
			lis[4].getElementsByTagName("a")[0].href = "#";
			lis[4].getElementsByTagName("a")[0].innerHTML = "…";
			lis[5].className = "";
			lis[5].getElementsByTagName("a")[0].href = "javascript:select(" + maxPage + ")";
			lis[5].getElementsByTagName("a")[0].innerHTML = maxPage;
		}else if(maxPage - 2 <= page){
			for(var i = 5; i >= 3; i--){
				lis[i].className = "";
				lis[i].style.display = "";
				lis[i].getElementsByTagName("a")[0].innerHTML = i - 5 + maxPage;
				lis[i].getElementsByTagName("a")[0].href = "javascript:select(" + (i - 5 + maxPage) + ")";
			}
			lis[5 - maxPage + page].className = "active";
			lis[2].className = "";
			lis[2].getElementsByTagName("a")[0].style.cursor = "default";
			lis[2].getElementsByTagName("a")[0].href = "#";
			lis[2].getElementsByTagName("a")[0].innerHTML = "…";
			lis[1].className = "";
			lis[1].getElementsByTagName("a")[0].href = "javascript:select(" + 1 + ")";
			lis[1].getElementsByTagName("a")[0].innerHTML = 1;
		}else{
			for(var i = 1; i <= 5; i++){
				lis[i].className = "";
			}
			lis[2].getElementsByTagName("a")[0].style.cursor = "default";
			lis[2].getElementsByTagName("a")[0].href = "#";
			lis[2].getElementsByTagName("a")[0].innerHTML = "…";
			lis[3].className = "active";
			lis[3].getElementsByTagName("a")[0].innerHTML = page;
			lis[3].getElementsByTagName("a")[0].href = "javascript:select(" + page+ ")";
			lis[4].getElementsByTagName("a")[0].style.cursor = "default";
			lis[4].getElementsByTagName("a")[0].href = "#";
			lis[4].getElementsByTagName("a")[0].innerHTML = "…";
		}
	}
};