//non-static method reference

interface interone
{
    void dis();

}
//static method
class one
{
    public static void name()
    {
        System.out.println("Static method call by reference");
        System.out.println("Static method call by reference ");
        System.out.println("Static method call by reference");

    }

}

class two
{
    public void name2()
    {
        System.out.println("without static method body");

    }


}



public class MethodReference2 {
    public static void main(String[] args) {
     /*
         //without reference regular way
        two ob2 = new two();
        ob2.name2(); */


        two ob3 = new two();
   interone ob = ob3::name2;
   ob.dis();

    }
}
