//Reference to a Static Method
interface inter1
{
    void dis();

}
//static method
class one1
{
   public static void name()
   {
       System.out.println("Static method call by reference");
       System.out.println("Static method call by reference ");
       System.out.println("Static method call by reference");

   }

}


public class MethodReference1 {

    public static void main(String[] args) {

        inter1 ob1 = one1::name;
        ob1.dis();

     /*  inter1 ob2 =() -> System.out.println("by interface call");
       ob2.dis();*/

    }
}
