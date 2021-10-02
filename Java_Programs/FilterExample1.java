//Java FilterOutputStream Class

import java.io.*;

public class FilterExample1{

public static void main(String args[])throws IOException{

File data = new File("E:\\MKPITS STUDY\\java program\\1 oct\\1\\testOutput.txt");

FileOutputStream file = new FileOutputStream(data);

FilterOutputStream filter = new FilterOutputStream(file);

String s = "Welcome to MKPITS";

byte b[] = s.getBytes();

filter.write(b);

filter.close();

file.close();

System.out.println("Success");

}

}