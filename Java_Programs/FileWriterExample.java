//using Java FileWriter class.

import java.io.FileWriter;

public class FileWriterExample{

	public static void main(String argc[])
	{

		try
		{

			FileWriter fw = new FileWriter("E:\\MKPITS STUDY\\java program\\30 sept\\io session 2\\FileWriter1.txt");

			String s = "WELCOMES TO MKPITS OR Welcome to MKPITS";
			 fw.write(s);
			 fw.close();
			System.out.println("Success");



		}
		catch(Exception e){System.out.println(e);}

    }
}