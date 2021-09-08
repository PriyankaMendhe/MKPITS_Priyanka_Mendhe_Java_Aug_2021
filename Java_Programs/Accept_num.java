//3 -wap to accept a number from the user and then print the square of a //number.
import java.util.*;
class Accept_num
{

  public static void main(String abc[])
  {
    int num;
    int square;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter number");
    num=s.nextInt();
    square = num * num;
    System.out.println("Square = " + square);
   }
}
 
