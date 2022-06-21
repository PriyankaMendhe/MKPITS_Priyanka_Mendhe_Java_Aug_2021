function display(value)
{
    document.getElementById("result").value +=value;



}

function  calculate()
{

    var c = document.getElementById("result").value;
    var calResult = eval(c);//evaluate string math expression in mathmatical format
     document.getElementById("result").value=calResult;




    var p = document.getElementById("result").value;
    var q = eval(p);
    document.getElementById("result").value = q;

}

function  clearScreen()
{

document.getElementById("result").value="";

}