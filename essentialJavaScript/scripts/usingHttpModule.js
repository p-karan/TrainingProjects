
var http=require('http');

var server=http.createServer((request,response)=>{
    if(request.url==='/welcome') {
        response.setHeader("content-type", "text/text");
        response.status = 200;
        response.end('Hello World from Node JS');
    }
    if(request.url==='/info') {
        response.setHeader("content-type", "application/json");
        response.status = 200;
        response.end(JSON.stringify({"BookName":"Mastering Node"}));
    }
    });
    server.listen(3000,function(){
       console.log("Server running in port 3000!");
    });