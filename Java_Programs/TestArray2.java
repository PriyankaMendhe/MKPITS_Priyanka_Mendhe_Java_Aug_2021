 import java.util.*;
 class TestArray2
    {

        public static void main(String argc[])
        {

          Scanner scan = new Scanner(System.in);

          int[] arr =new int[5];//declaration and Instantiation

         for(int i=0; i<arr.length ; i++)
         {
           System.out.println("Enter Subject Marks ");

            arr[i]=scan.nextInt();
         }

          //display

           for(int i=0; i<arr.length ; i++)
	      {
	              System.out.println("Marks = "+arr[i]);
          }

        }

        }



