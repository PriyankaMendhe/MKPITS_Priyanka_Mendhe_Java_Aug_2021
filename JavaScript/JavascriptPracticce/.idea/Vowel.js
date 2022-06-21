var ch;
ch = prompt("Enter alphabet to check vowel or not");
switch(ch)
{
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
    case 'A':
    case 'E':
    case 'I':
    case 'O':
    case 'U':
        document.write("vowel character");
        break;
    default: document.write("Not an vowel");
        break;
}
    