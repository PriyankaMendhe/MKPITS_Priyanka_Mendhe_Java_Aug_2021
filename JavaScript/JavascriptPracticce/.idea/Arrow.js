
//simple function
let name = () =>document.write("Welcome to javascript");

name();

//function with argument
var a=4;
let name2 = (a) =>document.write("Value of A: "+a);

name2(a);


let name3 = (a,b) => document.write("Addition : "+(a+b));

name3(4,5);

//function with no argument
let name4 =(a,b) => {return a+b;}

var add=name4(5,6);

document.write("<br>"+add);