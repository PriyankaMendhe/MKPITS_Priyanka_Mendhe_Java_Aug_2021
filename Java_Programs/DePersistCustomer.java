import java.io.*;

public class DePersistCustomer{

	public static void main(String argc[])
	{
	  try{

		  FileInputStream fis = new FileInputStream("E:\\MKPITS STUDY\\java program\\7 oct\\cust.txt");

		  ObjectInputStream ois = new ObjectInputStream(fis);

		  Customer c2 = (Customer) ois.readObject();

		  fis.close();


		  System.out.println("Customer Name:   "+c2.name);
		   System.out.println("Customer email:  "+c2.email);



		}
		catch(Exception ee)
		{
			System.out.println(ee.toString());

		}

	}
}