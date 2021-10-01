//Java FileInputStream example 1: read single character

import java.io.FileInputStream;

public class FileInputStreamExample{

	public static void main(String argc[])
	{

		try
		{

			FileInputStream fin = new FileInputStream("E:\\MKPITS STUDY\\java program\\30 sept\\io sesson 1\\FOS4.txt");
			int i = fin.read();//It is used to read the byte of data from the input stream.
			System.out.println((char)i);
			fin.close();
			System.out.println("Success");



		}
		catch(Exception e){System.out.println(e);}

    }
}