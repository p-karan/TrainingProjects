var fs=require('fs');
var app={};
app.write=function(text) {
    fs.appendFile("Sample.txt", text, (err) => {
        if (err) {
            console.log(err);
        } else {
            console.log('File write - Done')
        }
        fs.close(1,function(){
            console.log("file closed");
        });
    });
}

app.read=function () {
    fs.readFile("Sample.txt",'utf-8',(data,err)=>{
        if(err){
            console.log(err);
        } else {
            console.log(data)
        }
        fs.close(1,function(){
            console.log("file closed");
        });
    });
}
app.write(" Karan ");
app.read();