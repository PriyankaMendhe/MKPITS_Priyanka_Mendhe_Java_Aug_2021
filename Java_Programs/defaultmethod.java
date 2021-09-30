


interface printable{

     void print();

     interface MessagePrintable{

       void msg();
     }
}

abstract class example implements printable.MessagePrintable
{
	public void print()
		{
			System.out.println("print");
	}

	public void msg()
		{
			System.out.println("msg");
	}
}

class defaultmethod extends example
{
	public static void main(String[] arg)
	{
		//example e=new example();// abstarct class cant create instance
		example e=new defaultmethod();
		e.msg();
		e.print();

	}
}
