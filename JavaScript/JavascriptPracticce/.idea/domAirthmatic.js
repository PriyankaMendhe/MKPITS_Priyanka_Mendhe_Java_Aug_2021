function add()
{
    let n1 = parseInt(document.getElementById("num1").value);
    let n2 = parseInt(document.getElementById("num2").value);


    document.getElementById("res").value=n1+n2;

}

function subtract()
{
    let n1 = parseInt(document.getElementById("num1").value);
    let n2 = parseInt(document.getElementById("num2").value);


    document.getElementById("res").value=n1-n2;
}
function multiply()
{
    let n1 = parseInt(document.getElementById("num1").value);
    let n2 = parseInt(document.getElementById("num2").value);


    document.getElementById("res").value=n1*n2;

}
function divide()
{

    let n1 = parseInt(document.getElementById("num1").value);
    let n2 = parseInt(document.getElementById("num2").value);


    document.getElementById("res").value=n1/n2;

}