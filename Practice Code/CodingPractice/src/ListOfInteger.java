import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOfInteger {

    public static void main(String[] args) {

        boolean status=true;


     List<Integer> list = new ArrayList<Integer>();
     list.add(11);
     list.add(3);
     list.add(13);
     list.add(5);

     for(int i : list)
     {
         if(i%2==0)
         {
             status=false;
         }

     }

      if(status==true)
      {

          System.out.println("list contain only odd no");
      }
      else
      {
          System.out.println("list does not contain only odd no");
      }

    }
}
