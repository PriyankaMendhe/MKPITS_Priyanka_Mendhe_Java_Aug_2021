//Java Program to demonstrate the working of a banking-system
//where we deposit and withdraw amount from our account.
//Creating an Account class which has deposit() and withdraw() methods

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
class BankTransaction
{

 public static void main(String abc[])
 {
    Bank b1= new Bank(), b2= new Bank(), b3= new Bank();
    // insert data
    b1.insertData(89568558,"Priyanka Mendhe", "Saving Account",5000);
    b2.insertData(8576,"Raju MIshra", "Current Account",50000);
    b3.insertData(54845,"Aman Kamble", "Current Account",80000);

    //transaction
    b1.displayBalance();
    b1.deposit(3000);
    b1.checkBalance();
    b1.withdrawl(1000);
    b1.displayBalance();

    b2.displayBalance();
    b2.deposit(5000);
	b2.checkBalance();
	b2.withdrawl(1500);
    b2.displayBalance();

    b3.displayBalance();
    b3.deposit(2000);
	b3.checkBalance();
	b3.withdrawl(1800);
    b3.displayBalance();
 }

}




