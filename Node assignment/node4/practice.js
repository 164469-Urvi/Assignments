var fs = require('fs');

var data = "hello people welcome";

fs.writeFile('newfile.txt', data, function(err, data){
    if (err) console.log(err);
    console.log("Successfully Written to File.");
});