// accept desgination and print bonus using switch

import java.util.*;
class Bonus
{

  public static void main(String args[])
  {

    String desg;
    String name;
    int eno, bonus=0;
    Scanner s = new Scanner(System.in);

    System.out.println("Enter Employee No. ");
    eno=s.nextInt();
    System.out.println("Enter Employee Name. ");
    name =s.next();
    System.out.println("Enter Employee Designation ");
    desg=s.next();

    switch(desg)
    {

     case "manager" : bonus=1000;
     break;
     case "clerk" : bonus = 500;
     break;
     case "peon": bonus = 100;
     break;
     default:
      System.out.println("Invalid input");
      break;
     }
 System.out.println(" Employee No. "+ eno);
 System.out.println(" Employee Name. "+name);
 System.out.println(" Employee Desgination. "+desg);
     System.out.println("Bonus = "+bonus);
   }
}
