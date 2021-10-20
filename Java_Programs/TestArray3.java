import java.util.*;
 class TestArray3
    {

        public static void main(String argc[])
        {

			int total=0;
			float per;

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

	              total = total + arr[i];
          }

          System.out.println("Total = " +total);

            per = (float) (total/500.0f) * 100.0f;

          System.out.println("Percentage = " +per);


        }

        }

