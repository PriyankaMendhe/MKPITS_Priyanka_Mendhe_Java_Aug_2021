import java.io.*;

public class BufferedOutputStreamExample{

	public static void main(String args[])throws Exception{


		FileOutputStream fout = new  FileOutputStream("E:\\MKPITS STUDY\\java program\\30 sept\\io sesson 1\\BufferData.txt");

		BufferedOutputStream bout = new BufferedOutputStream(fout);

		String s = "Welcome to Mkpits.";

		byte b[] = s.getBytes();

		bout.write(b);

		bout.close();

		fout.close();

		System.out.println("Success");
}}
