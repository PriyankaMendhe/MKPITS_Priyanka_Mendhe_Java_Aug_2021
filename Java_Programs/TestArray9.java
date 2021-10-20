//Anonymous Array in Java



 import java.util.*;
 class TestArray9
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

          minimum(new int[]{4,5,8});//passing an anonymous array


    }

 }

