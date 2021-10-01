import java.io.FileOutputStream;

public class FOS5{

	public static void main(String argc[])
	{

		try
		{

		 FileOutputStream fout = new FileOutputStream("E:\\MKPITS STUDY\\java program\\30 sept\\io sesson 1\\FOS5.txt");
		 String s = "Learning Java";

		 byte b[] = s.getBytes();

		 fout.write(b);
		 fout.close();


		System.out.println("Success");
		}
		catch(Exception e){System.out.println(e);}


	}
}