use ramen;
db.dropDatabase();
db.createCollection("form");

db.review.insert({
  "form_id":1,
  "form_name":"舘下",
  "formAdress":motonori2580@gmail.com,
  "form_contents":"よかった",
  "form_resistration":"2016/03/23"
});
