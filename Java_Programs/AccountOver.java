 //3 create a class account having field accountno , bal and  method deposit and withdrawl.
 //create a subclass saving and override the deposit and withdrawl method.

 class Account{

 int accountno;
 int bal=1000;

 void deposit(int amt)
 {
     System.out.println("Deposit method of Account class invoke");
 }
 void withdrwal(int amt)
  {
      System.out.println("Withdrwal method of Account class invoke");
  }

}
class Saving extends Account{

 void deposit(int amt)
 {
	 bal = bal +amt;
     System.out.println("Deposit method of Saving class, Balance is "+bal);
 }
 void withdrwal(int amt)
  {
	  bal= bal - amt;
      System.out.println("Withdrwal method of Account class, Balance is "+bal);
  }

}

class AccountOver{

public static void main(String abc[]){
//  for account class
//Account a = new Account();
//a.deposit(100);
//a.withdrwal(50);

//for saving class
Saving s = new Saving();
s.deposit(200);
s.withdrwal(100);



}
}