class parent
{
	void display()
	{
		System.out.println("hello from parent class display method");
	}
}

//creating child class
class child extends parent {

	//overriding base class display method
	void display() {
		System.out.println("hello from child class display method");
	}
}

//////////
class RunTimePolymorphism
{
	public static void main(String[] arg)
	{
		parent c; // c is reference variable of super class parent
		 c=new child();
		c.display();
	}
}
