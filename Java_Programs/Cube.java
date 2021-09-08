//3 -wap to accept a number from the user and then print the cube of a //number.
import java.util.*;
class Cube
{

  public static void main(String abc[])
  {
    int num;
    int cube;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter number :");
    num=s.nextInt();
    cube = num * num *num ;
    System.out.println("Cube :" + cube);
  }
}
    
     
 
