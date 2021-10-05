//PrintWrite


import java.io.*;

public class TestPrintWriter{

	public static void main(String argc[])throws IOException{

//to print over consol

		PrintWriter writer = new PrintWriter(System.out);

		writer.write("MKPITS Learning Solutions");

		writer.flush();
		writer.close();

//to print in file

PrintWriter writer1 = null ;

writer1 = new PrintWriter(new File("E:\\MKPITS STUDY\\java program\\5 oct\\printstream1.txt"));

writer1.write("USing PrintWriter ...writing in file");

writer1.flush();
writer1.close();




	}

}



