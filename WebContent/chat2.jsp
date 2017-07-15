<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
  <title>チャット</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <!-- ▼▼Stylesheet -->
  <link rel="stylesheet" href="css/normalize.css">
  <link rel="stylesheet" href="css/b_style2.css">
  <link rel="stylesheet" href="css/chat2.css">
  <style>
  body {
    background-color: #4682B4;
  }
  </style>
  <!-- ▼▼jQuery -->
  <script src="js/jquery-3.2.1.min.js"></script>
  <!-- ▼▼JavaScript -->
  <script src="js/toast.js"></script>

  <script>
  var toast = new Toast();
  var notice = "";

  var webSocket = null;
  window.onload = function() {
    var groupId = '<s:property value="groupId"/>';
    var myId = '<s:property value="userId"/>';
    var myName = '<s:property value="#session.userName"/>';
    var myIcon = '<s:property value="#session.userIcon"/>';
    var myMsg = {         //送信するメッセージ（アイコン、名前、本文）
      id : myId,
      name : myName,
      icon : myIcon,
      text : ''
    };

    var messageForm = document.getElementById('message_form');      //フォーム（フォーム全体）
    var messageInput = document.getElementById('message_input');    //フォーム（入力領域）
    var messageSubmit = document.getElementById('message_submit');  //フォーム（送信ボタン）

    var anchor = document.createElement('a');
    anchor.href = 'chat';   //例：http://localhost:8080/openconnect/chat
    var uri = anchor.href.replace('http://', 'ws://').replace('https://', 'wss://').replace('openconnect', 'webSocket');
    webSocket = new WebSocket(uri + '/' + groupId);

    var appendSystemMessage = function(msg, color) {
      var messageElement = document.createElement('div');
      messageElement.setAttribute('class', 'system_message');
      messageElement.style.color = color;
      messageElement.innerText = msg;
      var brElement = document.createElement('br');
      //▼メッセージ領域の一番最後に追加する
      messageArea.insertBefore(messageElement, null);
      messageArea.insertBefore(brElement, null);
    }
    webSocket.onopen = function() {
      appendSystemMessage('通信を開始しました', 'blue');
    }
  //▼▼通信が切断されたときの動作
    webSocket.onclose = function() {
      appendSystemMessage('通信が切断されました', 'red');
    }
  //▼▼エラーが発生したときの動作
    webSocket.onerror = function(message) {
      appendSystemMessage(message, 'red');
    }

    var messageArea = document.getElementById('message_area');    //受信したメッセージを表示する領域
    messageArea.setAttribute('style', 'padding-bottom: ' + (messageInput.clientHeight + 20) + 'px;');
    var height = 30;
    messageInput.style.height = height + 'px';
    //▼▼入力フォーム内の文章が改行したときに、フォームの高さとスクロール位置を調整する関数
    function adustMessageInput() {
      var scroll = 0;
      while(messageInput.scrollHeight < height + 10) {
        scroll -= 20;
        height -= 20;
        messageInput.style.height = height + 'px';
      }
      while (messageInput.scrollHeight > height + 10 && messageInput.scrollHeight < 80) {
        scroll += 20;
        height += 20;
      }
      if (messageInput.scrollHeight > 80) {
        scroll += 90 - height;
        height = 90;
      }
      messageInput.style.height = height + 'px';
      messageArea.setAttribute('style', 'padding-bottom: ' + (height + 20) + 'px;');
      window.scrollBy(0, scroll);
    }
    adustMessageInput();
    //▼▼入力フォームが空のときは送信ボタンを無効にする
    if ('' == messageInput.value) {
      messageSubmit.disabled = true;
    }
    messageInput.oninput = function(e) {
      if ('' == messageInput.value) {
        messageSubmit.disabled = true;
      } else {
        messageSubmit.disabled = false;
      }
      adustMessageInput();
    }
    //▼▼送信ボタンが押されたときの動作
    messageForm.onsubmit = function(e) {
      myMsg.text = messageInput.value;
      var msgContainer = JSON.stringify(myMsg);
      if (webSocket && '' != messageInput.value) {
        webSocket.send(msgContainer);
        setTimeout(function() {
          messageInput.value = '';
        }, 50);
      }
      messageSubmit.disabled = true;
    }
    //▼▼メッセージ領域にメッセージを追加する関数
    var appendMessage = function(recievedMsg) {
      if(myId == recievedMsg.id){                   //自分のメッセージ（右側）の時
        var message = document.createElement('div');
        message.setAttribute('class', 'message_right');
          var userIcon = document.createElement('img');
          userIcon.setAttribute('class', 'user_icon');
          userIcon.alt = 'icon';
          userIcon.src = recievedMsg.icon;
          var textContainer = document.createElement('div');
          textContainer.setAttribute('class', 'text_container_right');
            var senderName = document.createElement('div');
            senderName.setAttribute('class', 'sender_name_right');
            senderName.innerText = recievedMsg.name;
            var text = document.createElement('pre');
            text.setAttribute('class', 'text bubble_right');
            text.innerText = recievedMsg.text;
          textContainer.appendChild(senderName);
          textContainer.appendChild(text);
          var time = document.createElement('span');
          time.setAttribute('class', 'time');
          time.innerText = recievedMsg.time;
        message.appendChild(userIcon);
        message.appendChild(textContainer);
        message.appendChild(time);
      } else {                                      //他人のメッセージ（左側）の時
        notice = "新しいメッセージを受信しました";
        toast.show(notice);

        var message = document.createElement('div');
        message.setAttribute('class', 'message_left');
          var userIcon = document.createElement('img');
          userIcon.setAttribute('class', 'user_icon');
          userIcon.alt = 'icon';
          userIcon.src = recievedMsg.icon;
          var textContainer = document.createElement('div');
          textContainer.setAttribute('class', 'text_container_left');
            var senderName = document.createElement('div');
            senderName.setAttribute('class', 'sender_name_left');
            senderName.innerText = recievedMsg.name;
            var text = document.createElement('pre');
            text.setAttribute('class', 'text bubble_left');
            text.innerText = recievedMsg.text;
          textContainer.appendChild(senderName);
          textContainer.appendChild(text);
          var time = document.createElement('span');
          time.setAttribute('class', 'time');
          time.innerText = recievedMsg.time;
        message.appendChild(userIcon);
        message.appendChild(textContainer);
        message.appendChild(time);
      }
      //▼メッセージ領域の一番最後に追加する
      messageArea.insertBefore(message, null);
    }
  //▼▼メッセージを受信したときの動作
    webSocket.onmessage = function(e) {
      var recievedMsg = JSON.parse(e.data);
      appendMessage(recievedMsg);
    }
  }
  </script>
</head>
<body>
  <!-- メッセージ領域 -->
  <div id="message_area">

    <s:if test="chat != null">
      <s:iterator value="chat" status="i">
        <s:if test="#i.index == 0">
        <!-- 最初のメッセージの前に日付を表示する -->
          <span class="system_message"><s:property value='chat.get(#i.index).creationDate'/></span>
          <br>
        </s:if>
        <s:if test="#i.index > 0 && !chat.get(#i.index).creationDate.equals(chat.get(#i.index - 1).creationDate)">
        <!-- 前のメッセージと送信日が違う場合、日付を表示する -->
          <span class="system_message"><s:property value='chat.get(#i.index).creationDate'/></span>
          <br>
        </s:if>
        <s:if test="userId.equals(chat.get(#i.index).senderId)">
        <!-- 自分のメッセージ -->
          <div class="message_right">
            <img class="user_icon" alt="icon" src="<s:property value='chat.get(#i.index).senderImg'/>">
            <div class="text_container_right">
              <div class="sender_name_right"><s:property value="chat.get(#i.index).senderName" /></div>
              <pre class="text bubble_right"><s:property value="chat.get(#i.index).text" /></pre>
            </div>
            <span class="time"><s:property value="chat.get(#i.index).creationTime" /></span>
          </div>
        </s:if>
        <s:else>
        <!-- 他人のメッセージ -->
          <div class="message_left">
            <img class="user_icon" alt="icon" src="<s:property value='chat.get(#i.index).senderImg'/>">
            <div class="text_container_left">
              <div class="sender_name_left"><s:property value="chat.get(#i.index).senderName" /></div>
              <pre class="text bubble_left"><s:property value="chat.get(#i.index).text" /></pre>
            </div>
            <span class="time"><s:property value="chat.get(#i.index).creationTime" /></span>
          </div>
        </s:else>
      </s:iterator>
    </s:if>
  </div>
  <footer>
    <s:set name="currentUserId" value="%{userId}"></s:set>
    <s:form action="SendMessageAction" id="message_form" target="dummy_iframe">
      <s:hidden name="groupId" value="%{groupId}"></s:hidden>
      <!-- 入力フォーム -->
      <textarea name="text" id="message_input" ></textarea>
      <!-- 送信ボタン -->
      <button type="submit" id="message_submit" >送信</button>
    </s:form>
    <iframe name="dummy_iframe" class="none"></iframe>
  </footer>
</body>
</html>