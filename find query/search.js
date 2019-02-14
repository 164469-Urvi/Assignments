//db.adminCommand({setParameter:true,textSearchEnabled:true});
//db.movie.ensureIndex({"synopsis":"text"});
//db.movie.find({$text:{$search:"Bilbo"}});
//db.movie.find({$text:{$search:"Gandalf"}});
//db.movie.find({$text:{$search:"Bilbo Gandalf"}});
//db.movie.find({$text:{$search:"Bilbo\"Gandalf\""}}).pretty() 
db.movie.find({$text:{$search:"gold\"group\"\"dragon\""}}).pretty();
