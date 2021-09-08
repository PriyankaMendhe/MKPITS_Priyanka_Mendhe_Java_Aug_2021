//2- wap to accept 2 no. and then print addition of 2 no.

import java.util.*;
class Add
{
  
   public static void main(String args[])
   {
      int num1,num2;
       
       Scanner s= new Scanner(System.in);
       System.out.println("Enter Number1");
       num1=s.nextInt();
       System.out.println("Enter Number2");
       num2=s.nextInt();
       int add = num1+num2;
       System.out.println("Addition of 2 no. is = "+ add);
    }
}