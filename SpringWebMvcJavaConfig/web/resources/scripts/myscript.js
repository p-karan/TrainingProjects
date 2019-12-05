(function(){

    var txtField=document.getElementById("code");
    console.log("In Script");
    txtField.addEventListener("focus",function(){
        var para=document.getElementById("msg");
        para.style.display='none';
    });
})();