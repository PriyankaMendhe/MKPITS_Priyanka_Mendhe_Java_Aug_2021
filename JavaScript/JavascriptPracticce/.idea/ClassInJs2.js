class Customer
{
    constructor(a,b) {

        document.write("Constructor Called"+a+" "+b);
    }


}
var id1 = prompt("Enter id");
var name = prompt("Enter name");
let ob1 = new Customer(id1,name);