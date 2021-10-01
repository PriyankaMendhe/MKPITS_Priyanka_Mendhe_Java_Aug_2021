//Buffer Input

import java.io.*;

public class BufferedInputStreamExample{

	public static void main(String args[])throws Exception{


		FileInputStream fin = new  FileInputStream("E:\\MKPITS STUDY\\java program\\30 sept\\io session 2\\testfile.txt");

		BufferedInputStream bin = new BufferedInputStream(fin);

		int i;

		while((i = bin.read()) != -1){

		System.out.print((char)i);

		}

		bin.close();
		fin.close();





}}
