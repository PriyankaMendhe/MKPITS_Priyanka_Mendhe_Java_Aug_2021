//create a class account having field accountno , bal and  method deposit and withdrawl.
//create a subclass saving inherited from account class and override the deposit(with interest) and withdrawl method.
//create a subclass current  inherited from account  and override the deposit(without interest) and withdrawl method
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
	  this.accountno = accountno;
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
	  if(amt > bal){

		  return  "insufficient fund ";
	  }else
	  {
	 this.accountno = accountno;
	 bal= bal - amt;
     return "Withdrwal method of Account class, Balance is "+bal; }
  }

}
class Current extends Account{

 String deposit(int accountno , int amt)
 {
	 this.accountno = accountno;
	 bal = bal +amt;
    return"Deposit method of Current  class, Balance is "+bal ;
 }
  String withdrwal(int accountno , int amt)
  {   if(amt > bal){

		  return  "insufficient fund ";
	  }else
	  {
	  this.accountno = accountno;
	  bal= bal - amt;
     return "Withdrwal method of Current  class, Balance is "+bal;}
  }

}


class AccountOver2{

public static void main(String abc[]){

Scanner scan = new Scanner(System.in);
//for saving class
Saving s = new Saving();
Current c = new Current();
String str ;


 System.out.println("Enter Account no.");
 int accountno=scan.nextInt();
 System.out.println("Enter Amount");
 int amt=scan.nextInt();
 System.out.println("Enter Saving or Current (Account type)");
 String accType =scan.next();

 if(accType.equals("Saving")){


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
}else if( accType.equals("Current")) // for current account type
 {
	System.out.println("Do you want deposit or withdrwl");
    String ans =scan.next();

  if(ans.equals("deposit"))
  {
  str = c.deposit(accountno,amt) ;
  System.out.println(str);
  }
  else if(ans.equals("withdrwl"))
  {
     str=c.withdrwal(accountno,amt);
     System.out.println(str);
  }else
     {
	System.out.println("pls Try Again!!!!");
      }

 }else
 {

	 System.out.println("Invalid account type entered pls Try Again!!!!");
 }

}
}