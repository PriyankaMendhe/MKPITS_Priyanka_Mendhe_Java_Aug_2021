public class SingletonClassDemo {

    public static void main(String[] args) {

        singledemo ob2 = singledemo.getobject1();

        singledemo ob3 = singledemo.getobject1();

        if(ob2==ob3)
        {
            System.out.println("Equal");

        }
        else
        {
            System.out.println("not Equal");

        }

    }
}
class singledemo
{
   static singledemo ob1 = new singledemo();

   static singledemo getobject1()
   {

       return ob1;

   }

}