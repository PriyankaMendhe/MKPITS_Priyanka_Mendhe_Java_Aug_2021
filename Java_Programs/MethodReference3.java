//Reference to a Constructor
interface inter2
{
    void dis();

}
//static method
class one11
{
    public static void name()
    {
        System.out.println("Static method call by reference");
        System.out.println("Static method call by reference ");
        System.out.println("Static method call by reference");

    }

}

class two2
{
    public void name2()
    {
        System.out.println("without static method body");

    }


}

class three
{

    three()
    {

        System.out.println(" Reference to constructor");

    }

}


public class MethodReference3 {

    public static void main(String[] args) {
        //calling constructor by new keyword and reference
        inter2 ob = three::new;
        ob.dis();

    }
}
