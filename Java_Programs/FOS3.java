// java FileOutputStream ex


import java.io.FileOutputStream;

public class FOS3 {

public static void main(String argc[])
{
	try
	{
		FileOutputStream fout = new FileOutputStream("E:\\MKPITS STUDY\\java program\\30 sept\\io sesson 1\\FOS3.txt");
		fout.write(68);
		fout.close();
		System.out.println("Success");
	}
	catch(Exception e) {System.out.println(e);}


}
}
