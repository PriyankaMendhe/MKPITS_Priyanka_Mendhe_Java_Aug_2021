var ch;
ch = prompt("Enter +, _ , *, to perform airthmatic operation");



let add = (a,b) => document.write(a+b);

let minus = (a,b) => { return a-b;}

let multiply = (a,b) => document.write(a*b);


switch(ch)
{
    case '+':
        add(4,5);

        break;

    case '-':
       var m = minus(5,2);
       document.write(m);
       break;

    case '*':

        multiply(15,10);
        break;

    default: document.write("Invalid Option");
        break;
}




