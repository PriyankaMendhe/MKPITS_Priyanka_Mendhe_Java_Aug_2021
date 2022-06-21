var ch;
ch = prompt("Enter +, _ , *, to perform airthmatic operation");

a=5,b=5;
switch(ch)
{
    case '+':
        document.write(a+b);
        break;

    case '-':
        document.write(a-b);
        break;

    case '*':
        document.write(a*b);
        break;

    default: document.write("Invalid Option");
        break;
}
