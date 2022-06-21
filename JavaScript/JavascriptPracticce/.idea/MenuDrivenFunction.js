var ch;
ch = prompt("Enter +, _ , *, to perform airthmatic operation");

a=5,b=5;
switch(ch)
{
    case '+':
        add();

        break;

    case '-':
        minus(a,b);
        var c = a-b;
        document.write(c);
        break;

    case '*':

        multiply()
        break;

    default: document.write("Invalid Option");
        break;
}

function add( )
{
    document.write(a+b);
}

function minus(a,b)
{
    return a-b;
}

function multiply()
{
    document.write(a*b);
}