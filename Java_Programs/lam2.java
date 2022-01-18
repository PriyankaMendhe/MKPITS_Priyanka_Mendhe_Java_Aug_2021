//lambda function

interface inf1
{

	void dis();

}
/*
class impl1 implements inf1
{
	public void dis()
	{
		System.out.println("welcome");

	}


}*/

class lam2
{

	public static void main(String args[])
	{
		 inf1 ob =  () -> System.out.println("welcome");
		 ob.dis();

	}

}