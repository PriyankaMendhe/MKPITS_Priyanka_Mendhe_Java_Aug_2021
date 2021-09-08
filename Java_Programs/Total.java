//- 4- wap to accept to length , breadth, height and then print volume

import java.util.*;
class Total
{
  
   public static void main(String args[])
   {
      int m1,m2,m3;
       
       Scanner s= new Scanner(System.in);
       System.out.println("Enter Marks1");
       m1=s.nextInt();
       System.out.println("Enter Marks2");
       m2=s.nextInt();
       System.out.println("Enter Marks3");
       m3=s.nextInt();
       int total = m1+m2+m3;
       System.out.println("Total is = "+ total);
    }
}