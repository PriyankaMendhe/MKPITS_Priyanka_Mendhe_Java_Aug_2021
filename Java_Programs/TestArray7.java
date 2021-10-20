
//Passing Array to a Method in Java
////create an integer array of 5 elements to store 5 subject marks

import java.util.*;
class TestArray7
{

     // //method calculate
	 static void calculate(int marks[])
	         {
				 int total = 0;
				 float per;

				 for(int i : marks)
				 {
					 total = total + i;

				}

				System.out.println("total = "+total);

				per = (float) (total/500.0f) * 100.0f;
				System.out.println("Percenatge = "+per);



		 }

   public static void main(String argc[])
   {
         int arr[] = new int[5];

         Scanner scan = new Scanner(System.in);

         for(int i=0; i<5 ;i++){

         System.out.println("Enter Subject marks:");

         arr[i]=scan.nextInt();

         }

         calculate(arr);//passing array


   }

}

