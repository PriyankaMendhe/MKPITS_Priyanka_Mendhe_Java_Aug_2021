//3 create a class account having field accountno , bal and  method deposit and withdrawl.
 //create a subclass saving and override the deposit and withdrawl method.
import java.util.*;
 class Account{

 int accountno;
 int bal=1000;

 String deposit(int accountno , int amt)
 {
      return"Deposit method of Account class invoke";
 }
 String withdrwal(int accountno , int amt)
  {
      return"Withdrwal method of Account class invoke";
  }

}
class Saving extends Account{
	int interest = 500;

 String deposit(int accountno , int amt)
 {
	 this.accountno = accountno;
	 bal = bal +amt + interest;
    return"Deposit method of Saving class, Balance is "+bal ;
 }
  String withdrwal(int accountno , int amt)
  {
	  this.accountno = accountno;
	  bal= bal - amt;
     return "Withdrwal method of Account class, Balance is "+bal;
  }

}

class AccountOver1{

public static void main(String abc[]){

Scanner scan = new Scanner(System.in);
//for saving class
Saving s = new Saving();
String str, choice;
do{
 System.out.println("Enter Account no.");
 int accountno=scan.nextInt();
 System.out.println("Enter Amount");
 int amt=scan.nextInt();

 System.out.println("Do you want deposit or withdrwl");
 String ans =scan.next();





if(ans.equals("deposit"))
{
  str = s.deposit(accountno,amt) ;
  System.out.println(str);
}
else if(ans.equals("withdrwl"))
{
     str=s.withdrwal(accountno,amt);
     System.out.println(str);
}else
{
	System.out.println("pls Try Again!!!!");
}

System.out.println("Do you want deposit or withdrwl again,  enter 'yes or no..");
choice =scan.next();

}while(choice.equals("yes"));
}
}