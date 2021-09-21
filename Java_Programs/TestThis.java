//  this: to invoke current class method

class A{

    void m(){System.out.println("hello m");}

    void n()
   {
    System.out.println("hello n");

    m();//same as this.m()

   // this.m();
   }

}
    class TestThis{

    public static void main(String args[]){
    A a=new A();
    a.n();

    }}
