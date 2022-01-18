// static function


interface inf
{

	public static void name1()
	{
          System.out.println("Static method of  Interface call");

     }


}

class impl2 implements inf
{



}

public class StaticFunction
{
	    public static void main(String args[])
	   {

	//impl2 ob = new impl2();
	//ob.name1();error

	//impl2.name1();error

	inf.name1();




		}

}