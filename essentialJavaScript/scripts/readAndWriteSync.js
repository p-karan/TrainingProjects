var fs=require('fs');
var app={};
app.write=function() {
  /* var resp= */
       fs.writeFileSync("Sample2.txt", 'Hello World');
   console.log("File write - Done!");
}

app.read=function () {
    console.log("File read - start");
    var data=fs.readFileSync("Sample2.txt",'utf-8');
    console.log("File read - complete!");
}
app.write();
app.read();