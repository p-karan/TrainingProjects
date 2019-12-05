<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="msg"></div>
<button id="getButton">Get Doctor Details</button>
<script>
    var getButton=document.getElementById("getButton");
    var msgDiv=document.getElementById("msg");
    getButton.addEventListener("click",function(){
        $.get("http://localhost:4050/DoctorManagement_war_exploded/webapi/medicine",function(response){
            msgDiv.innerHTML=response.medicineName;
        });
    });
</script>
<script type="text/javascript" src="jquery-3.4.1.js"></script>
</body>
</html>