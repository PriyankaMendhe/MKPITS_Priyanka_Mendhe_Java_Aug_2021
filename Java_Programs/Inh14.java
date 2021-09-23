//another example of hierarchical inheritance
//create a parent class Account having fields acctno,balance
//create a class saving inherited from account class having deposit method
//create a class current inherited from account class having deposit method without interest
//accept values from user
import java.util.*;
class Account{

	int accNo;
	int balance;

	void insertAccountData(int accNo, int balance)
	{
		this.accNo= accNo;
		this.balance=balance;
	}

	void showBalance()
	{
		System.out.println("Account No. is "+accNo);
		System.out.println("Balance No. is "+balance);

    }
}

class Saving extends Account{

	 void depositToSaving(int amount)
		{
			int interest = 1000;
			balance = amount + balance + interest;
			System.out.println("Successfully Deposited Rs. "+amount+"  with Interest Rs."+interest);

		}
}

class CurrentAc extends Account{

	 void depositToCurrent(int amount)
			{
				balance = amount+balance;
				System.out.println("Successfully Deposited Rs. "+amount);
		    }
}

class Inh14{
	public static void main(String argc[]){
		Scanner scan = new Scanner(System.in);




		System.out.println("----------Saving Account-------");

		Saving s = new Saving();

		System.out.println("Enter Saving Account no.");
	    int accNo = scan.nextInt();
		System.out.println("Enter Account Balance");
		int balance = scan.nextInt();
		System.out.println("Enter Amount to deposit");
		int amount = scan.nextInt();


		s.insertAccountData(accNo,balance);
		s.depositToSaving(amount);
		s.showBalance();

		System.out.println("----------Current Account-------");
		CurrentAc c = new CurrentAc();

		System.out.println("Enter Current Account no.");
	    accNo = scan.nextInt();
	    System.out.println("Enter Account Balance");
	    balance = scan.nextInt();
		System.out.println("Enter Amount to deposit");
		amount = scan.nextInt();


		c.insertAccountData(accNo , balance);
		c.depositToCurrent(amount);
		c.showBalance();
}
}
