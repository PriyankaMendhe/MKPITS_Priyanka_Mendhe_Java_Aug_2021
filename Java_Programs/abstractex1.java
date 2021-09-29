abstract class account {
	abstract void deposit() ; //method without body
	void withdrawl() {
		// method with body
		System.out.println("withdrawl method");
	}
}
class saving extends account {
	void deposit() {
		System.out.println("deposit method of saving class");
	}
}
class abstractex1
{
	public static void main(String[] arg) {
		//account act=new account();// error since you cannot create instance of abstract class
		account act=null;

		act=new saving();
		act.deposit();
	}
}
