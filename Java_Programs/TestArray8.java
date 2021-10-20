    //Java Program to demonstrate the way of passing an array
    //to method.


import java.util.*;
class TestArray8
{

     // //method calculate minimum no
	 static void minimum(int arr[])
	         {
				 int min=arr[0];

				for(int i= 1; i<arr.length;i++)
				{

				 if(min>arr[i])

					 min = arr[i];

			  }
				System.out.println("Minimun marks = "+min);

}



   public static void main(String argc[])
   {
         int arr[] = new int[5];

         Scanner scan = new Scanner(System.in);

         for(int i=0; i<5 ;i++){

         System.out.println("Enter Subject marks:");

         arr[i]=scan.nextInt();

         }

         minimum(arr);//passing array


   }

}

