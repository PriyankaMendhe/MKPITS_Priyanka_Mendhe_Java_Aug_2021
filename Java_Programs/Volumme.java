//- 4- wap to accept to length , breadth, height and then print volume

import java.util.*;
class Volumme
{
  
   public static void main(String args[])
   {
      int length,bredth,height ;
       
       Scanner s= new Scanner(System.in);
       System.out.println("Enter lenght");
       length=s.nextInt();
       System.out.println("Enter bredth");
       bredth=s.nextInt();
       System.out.println("Enter height");
       height=s.nextInt();
       int vol = length * bredth * height;
       System.out.println("Volumme is = "+ vol);
    }
}