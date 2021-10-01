//Java FileInputStream example 2: read all characters


import java.io.FileInputStream;

public class FileInputStreamExample2{

	public static void main(String argc[])
	{

		try
		{

			FileInputStream fin = new FileInputStream("E:\\MKPITS STUDY\\java program\\30 sept\\io sesson 1\\FOS4.txt");

			int i =0;
			while((i = fin.read())!= -1)
			{
			System.out.print((char)i);

		    }
			fin.close();



		}
		catch(Exception e){System.out.println(e);}

    }
}