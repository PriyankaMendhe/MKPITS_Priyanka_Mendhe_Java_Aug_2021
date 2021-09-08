//10 - wap to accept rno , name and address and then display it.

import java.util.*;
class data8
{

  public static void main(String[] abc)
  {
      int rno;
      String name;
      String address;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter roll no.");
      rno= s.nextInt();
      System.out.println("Enter Name");
      name= s.next();
      System.out.println("Enter Address");
      address= s.next();
      System.out.println("Roll no.="+ rno);
      System.out.println("Name = "+ name);
      System.out.println("Address = "+address);
     }
}
      
      