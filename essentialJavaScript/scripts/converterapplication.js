var converterRef=require("./converter");
var interestCal=require('./simpleInterest');
var areaOfCircle=require('./areaOfCircle').areaOfCircle(3)
var areaCircle=require('./areaOfCircle');
console.log(converterRef.currencyConverter(200));
console.log(converterRef.farenToCel(30));
console.log(interestCal.simpleInterest(5000,2,2));
console.log(areaOfCircle);
console.log(areaCircle);