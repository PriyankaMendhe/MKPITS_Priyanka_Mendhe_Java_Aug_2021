class Employee
{
    constructor(a,b) {

        document.write("Constructor Called"+a+" "+b);
    }
    name()
    {

        document.write("Function called")
    }
}

let ob1 = new Employee(2,"Priyanka");

ob1.name();