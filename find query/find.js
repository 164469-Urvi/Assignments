db.movie.find({"year":{$lte:2000}}).pretty();
db.movie.find({
      $or:[
          {"year":{$lt:2000}},{"year":{$gt:2010}}
      ]
   }
)
db.movie.find().pretty();
db.movie.find({"actors":"Brad Pitt"}).pretty();

   