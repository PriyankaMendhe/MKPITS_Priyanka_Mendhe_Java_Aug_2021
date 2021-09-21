//Calling default constructor from parameterized constructor:

    class A{

    A()// constructor with no parameter
    {System.out.println("hello a");

    A();}

    A(int x)// constructor with parameter
    {
   // this();// call A with no parameter or

    this();

    System.out.println(x);
    }
    }

    class TestThis1{

    public static void main(String args[]){

    A a=new A(10);  // intialise constructor with parameter


    }}
