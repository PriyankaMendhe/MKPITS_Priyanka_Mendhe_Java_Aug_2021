import java.util.Arrays;

public class sort
{

    public static void main(String[] args)
    {

      int numbers[]={22,89,1,32,19,5};

       //Parallel sort Method for sorting int array
       Arrays.parallelSort(numbers,0,6);
System.out.println("sort between index 0 to 6");
       for(int x:numbers)
       {


          System.out.println(x);

       }
//Parallel sort Method for sorting int array
       Arrays.parallelSort(numbers,2,5);
 System.out.println("sort between index 2 to 5");
       for(int x:numbers)
       {


          System.out.println(x);

       }





}

}





