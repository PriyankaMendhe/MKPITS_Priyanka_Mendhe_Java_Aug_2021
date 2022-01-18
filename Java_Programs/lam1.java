//lambda function

interface inf1
{

	void dis();

}

class impl1 implements inf1
{
	public void dis()
	{
		System.out.println("welcome");

	}


}

class lam1
{

	public static void main(String args[])
	{
		 inf1 ob =  new impl1();
		 ob.dis();

	}

}