<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "s" uri= "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>テキストファイルがある場合は読み込みができます</p>
<s:form action="BotExerciseAction" name="test">
<input type="file" id="selfile"><br>
    <textarea name="sentence" class="form-control" rows="10" cols="80%" id="sendContents" ></textarea>
    <button type="submit">送信</button>
</s:form>

<script>
var obj1 = document.getElementById("selfile");

//ダイアログでファイルが選択された時
obj1.addEventListener("change",function(evt){

  var file = evt.target.files;

  //FileReaderの作成
  var reader = new FileReader();
  //テキスト形式で読み込む
  reader.readAsText(file[0]);

  //読込終了後の処理
  reader.onload = function(ev){
    //テキストエリアに表示する
    document.test.sentence.value = reader.result;
  }
},false);
</script>
</body>
</html>