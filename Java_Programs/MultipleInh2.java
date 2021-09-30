
//A class implements an interface, but one interface extends another interface.

interface Printable{

	void print();
}

interface Showable extends Printable{

	void show();
}

class MultipleInh2 implements Showable{

	public void print(){System.out.println("Hello");}
	    public void show(){System.out.println("Welcome");}


	    public static void main(String abc[])
	    {

			MultipleInh2 obj = new MultipleInh2();
			obj.print();
			obj.show();

		}
}