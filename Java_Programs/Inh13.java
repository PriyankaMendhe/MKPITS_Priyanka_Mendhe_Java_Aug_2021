//another example of hierarchical inheritance
//create a parent class Account having fields acctno,balance
//create a class saving inherited from account class having deposit method
//create a class current inherited from account class having deposit method without interest

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
		System.out.println("Account No. is"+accNo);
		System.out.println("Balance No. is"+balance);

    }
}

class Saving extends Account{

	 void depositToSaving(int amount)
		{
			int interest = 1000;
			balance = amount + balance + interest;
			System.out.println("Successfully Deposited Rs. "+amount);

		}
}

class CurrentAc extends Account{

	 void depositToCurrent(int amount)
			{
				balance = amount+balance;
				System.out.println("Successfully Deposited Rs. "+amount);
		    }
}

class Inh13{
	public static void main(String argc[]){

		System.out.println("----------Saving Account-------");

		Saving s = new Saving();

		s.insertAccountData(12345 , 5000);
		s.depositToSaving(5000);
		s.showBalance();

		System.out.println("----------Current Account-------");
		CurrentAc c = new CurrentAc();

				c.insertAccountData(54321 , 50000);
				c.depositToCurrent(10000);
				c.showBalance();
}
}


