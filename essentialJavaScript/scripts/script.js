var module=(function(){

    var app={};
    var baseSize=10;
    app.changeFont = function(){
        var heading=document.getElementById("heading");
        heading.style.fontSize=baseSize+"px";
        baseSize=baseSize+2;

    }
    app.init = function(){
        var increaseImage=document.getElementById("incFont");
        increaseImage.addEventListener("click",app.changeFont);
    }
    app.init();
    

    
})();