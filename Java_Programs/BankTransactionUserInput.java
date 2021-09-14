//Java Program to demonstrate the working of a banking-system
//where we deposit and withdraw amount from our account.
//Creating an Account class which has deposit() and withdraw() methods

//accept value from user
import java.util.*;
class Bank
{
   int accNo;
   String accName;
   String accType;
   float amount;
   void insertData(int aNo, String aName, String aType, float amt)
   {
       accNo= aNo;
       accName = aName;
       accType = aType;
       amount = amt;

   }

   void deposit(float amt)
   {
       amount = amount+amt;
       System.out.println("rs."+ amt +"  Amount Successfully Desposit in your Account");
   }

   void withdrawl(float amt)
   {
       if(amt>amount)
	   {
		  System.out.println("Unable to withdrwl due to insufficient Balance");
	   }
	   else
	   {
		 amount=amount-amt;
		 System.out.println("rs."+ amt +"  Amount Successfully withdrwl from your Account");
	   }
   }

   void checkBalance()
   {
       System.out.println("Your Current Balance is : "+amount);
   }

   void displayBalance()
   {
     System.out.println("");
	 System.out.println(accNo+ " "+accName+ " " +accType+ " "+amount);
	 System.out.println("*********************************************************************");

   }
}
class BankTransactionUserInput
{

 public static void main(String abc[])
 {
    Bank b1= new Bank();

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter Account No: ");
    int aNo = scan.nextInt();

    System.out.println("Enter Account Holder Name: ");
    String aName = scan.next();

    System.out.println("Enter Account Type: ");
    String aType = scan.next();

    System.out.println("Enter Amount: ");
    float amt = scan.nextFloat();

    b1.insertData(aNo, aName, aType, amt);

    //transaction
    b1.displayBalance();
    System.out.println("Enter Amount to desposit: ");
	float amt1 = scan.nextFloat();

    b1.deposit(amt1);
    b1.checkBalance();

    b1.displayBalance();
	System.out.println("Enter Amount to withdraw: ");
	float amt2 = scan.nextFloat();

    b1.withdrawl(amt2);
    b1.displayBalance();


 }

}




