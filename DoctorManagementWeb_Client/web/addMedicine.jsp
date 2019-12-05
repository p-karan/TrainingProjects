<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type = "text/javascript" src="jquery-3.4.1.js"></script>
</head>
<body>
<form action="" id="frm">
    <div>
        <label>Medicine Code : </label>
        <input type="text" id="medicineCode"/>
    </div>
    <div>
        <label>Medicine Name : </label>
        <input type="text" id="medicineName"/>
    </div>
    <div>
        <label>Rate per unit : </label>
        <input type="text" id="ratePerUnit"/>
    </div>
    <div id="msg"></div>
    <button id="getButton">Add Medicine</button>
</form>
<script>
    var getButton = document.getElementById("getButton");
    var msgDiv = document.getElementById("msg");
    $(function (){
        $("#getButton").on('click',function (event) {
            event.preventDefault();
            var medicineCode = $("#medicineCode").val();
            var medicineName = $("#medicineName").val();
            var ratePerUnit = $("#ratePerUnit").val();
            var data = '{"code":'+medicineCode+',"medicineName":"'+medicineName+'","ratePerUnit":'+ratePerUnit+'}'//JSON.stringify($("#frm").serialize());
            //console.log(data)

            var jsonData=JSON.stringify($("#frm").serialize());
            $.ajax({
                type:"POST",
                url:"http://localhost:4050/DoctorManagement_war_exploded/webapi/medicine",
                contentType:"application/json",
                data:'json',//data,
                success:function(resp){
                    $("#msg").html(resp);
                }
            });
        });
    });
</script>
</body>
</html>