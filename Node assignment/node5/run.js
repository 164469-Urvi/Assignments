var fs=require('fs');


var data = fs.readFileSync('file.txt', 'utf8').split(' ');
var c=0;
for(var i=0;i<data.length;i++){

    if(data[i]=='john'){
        c++;
      
    }
  
}

console.log(c);
console.log(data);