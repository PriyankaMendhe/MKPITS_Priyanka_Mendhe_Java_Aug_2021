import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterate {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add("Praveen");
        list.add("Praveen2");
        list.add("Praveen3");
        list.add("Praveen4");

        System.out.println(list.size());

        System.out.println(".........While Loop...........");

        Iterator itr = list.iterator();
         while(itr.hasNext())
         {
             System.out.println(itr.next());



         }
        System.out.println("........For Loop........");

         for(int i =0; i< list.size();i++)
         {
             System.out.println(list.get(i));

         }

        System.out.println("............For each Loop.....");

        for (Object obj: list) {

            System.out.println(obj);

        }



    }
}
