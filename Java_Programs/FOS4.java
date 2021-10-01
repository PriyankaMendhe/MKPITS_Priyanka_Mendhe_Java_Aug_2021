//Java FileOutputStream example 2: write string

import java.io.FileOutputStream;

public class FOS4{

	public static void main(String argc[])
	{

		try
		{

			FileOutputStream fout = new FileOutputStream("E:\\MKPITS STUDY\\java program\\30 sept\\io sesson 1\\FOS4.txt");
			String s = "WELCOMES TO MKPITS OR Welcome to MKPITS";
			byte b[]=s.getBytes();//converting string into byte

			fout.write(b);
			fout.close();
			System.out.println("Success");



		}
		catch(Exception e){System.out.println(e);}

    }
}