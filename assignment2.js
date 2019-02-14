var express = require('express')();


express.get('/:year/:id', function(req, res){
var age=req.params.id;
var bornyear=req.params.year-age;
   res.send('birthyear is ' + bornyear);
});
express.listen(3000);