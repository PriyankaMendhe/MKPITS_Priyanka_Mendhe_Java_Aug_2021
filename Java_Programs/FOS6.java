//wap to accept your name and write this name in a file
import java.util.*;
import java.io.FileOutputStream;

public class  FOS6{

	public static void main(String argc[])
	{

		try
		{

		 FileOutputStream fout = new FileOutputStream("E:\\MKPITS STUDY\\java program\\30 sept\\io sesson 1\\FOS6.txt");

		 Scanner scan = new Scanner(System.in);

		 System.out.println("Enter Your Name");

		 String name = scan.nextLine();

		 byte b[] = name.getBytes();

		 fout.write(b);
		 fout.close();


		System.out.println("Success");
		}
		catch(Exception ee){System.out.println(ee.toString());}


	}
}