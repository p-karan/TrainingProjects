(function(){

    function handleClick(){
        var obj={
            "partnerCode":102,
            "partnerName":"Rss",
            "mobileNumber":494949
        }
/*
            var message=txtField.value;
            websocket.send(message);
*/
        websocket.send(JSON.stringify(obj));
    }

    var button=document.getElementById("submit");
    var txtField=document.getElementById("textMessage");
    var textArea=document.getElementById("resp");
    var endButton=document.getElementById("end");
    button.addEventListener("click",handleClick)
    endButton.addEventListener("click", function(){
        websocket.close();
    })



    var websocket=new WebSocket("ws://localhost:3040/UsingWebSockets_war_exploded/wserver/Mumbai");

    function captureTextArea(message){
        var existing=textArea.value;
        if(existing === "undefined") {
            textArea.value = message.data;
        }else {
            textArea.value = existing.concat(message.data);
        }
    }

    websocket.onmessage=function(message){
        captureTextArea(message);
    }
        websocket.onopen=function(message){
            captureTextArea(message);
        }
            websocket.onclose=function(message){
                textArea.value="Connection closed---bye!";
/*                captureTextArea("Session closed try again!")
                alert(message);*/

            }
                websocket.onerror=function(message){

                }
})();