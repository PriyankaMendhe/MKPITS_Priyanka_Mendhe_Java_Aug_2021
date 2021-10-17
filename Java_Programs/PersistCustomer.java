import java.io.*;
public class PersistCustomer{

	public static void main(String argc[])
	{
		try
		{

			Customer c1 = new Customer("Priyanka","abc@gmail.com");

			FileOutputStream fos = new FileOutputStream("E:\\MKPITS STUDY\\java program\\7 oct\\cust.txt");

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(c1);

			oos.flush();
			fos.close();

			System.out.println("Success");


		}
		catch(Exception ee)
		{
			System.out.println(ee.toString());
		}

	}
}
