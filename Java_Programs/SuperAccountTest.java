//create a parent class account having fields accountno and balance. and constructor with 2 parameters
//create a subclass saving inherited from account class having fields interest
//and constructor with 3 parameters and from this call parent class constructor.
//and a display method, deposit method and withdrawl method
class Account{

	int accountNo;
	int balance;
	Account(int accountNo,int balance ){
		this.accountNo =accountNo;
		this.balance = balance;
    }
    void display()
    {
		System.out.println("Account No: "+accountNo);


	}
}

class Saving extends Account{
	int intrest;

	Saving(int accountNo,int balance,int intrest )
	{
		super(accountNo, balance);
		this.intrest = intrest;
    }
		void display()
		{
			super.display();
			System.out.println("Balance: "+balance);
		}
		void deposit(int amount)
		{
			balance  = balance +amount + intrest;
			System.out.println("Successfully Deposited amount .."+amount);
			display();
		}
		void withdrwal(int amount)
		{
			balance  = balance - amount;
			System.out.println("Successfully WithDrawl  amount....."+amount);
			display();

		}

	}
class SuperAccountTest{

public static void main(String arg[]){

	Saving s = new Saving(456213,5000,1000);

	s.display();

	//calling deposit method
	s.deposit(2000);

	//calling withdrwal method
	s.withdrwal(1000);

}
}
