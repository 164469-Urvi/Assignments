var express=require('express');
var app=express();
app.get('/hello',function(req,res){
res.send("hello world");
});
app.listen(process.argv[2]);