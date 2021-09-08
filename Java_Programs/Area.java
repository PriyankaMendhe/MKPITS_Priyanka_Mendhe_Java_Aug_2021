//- wap to accept length and breadht of rectangle and then print area of //rectangle.

import java.util.*;
class Area
{
  
   public static void main(String args[])
   {
      int length,bredth;
       
       Scanner s= new Scanner(System.in);
       System.out.println("Enter lenght");
       length=s.nextInt();
       System.out.println("Enter bredth");
       bredth=s.nextInt();
       int area = length * bredth;
       System.out.println("Area of Rectangle is = "+ area);
    }
}