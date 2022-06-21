
//withdraw problem

var bal=5000;
var amt = prompt("Enter amount to withdraw");

if(amt>bal)
{
    alert("Insuffient Fund");

}else
{

    var confirmation =confirm("Are you sure to withdraw the amount");


    if(String(confirmation)=="true")
    {
        bal = amt - bal;
        alert("Collect your amount: "+amt);
        alert("Your Balance is : "+bal);
    }
    else
    {
        alert("Transaction Cancle");

    }
}