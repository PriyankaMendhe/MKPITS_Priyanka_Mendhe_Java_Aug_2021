//CharArrayWriter

import java.io.*;
class test1{

public static void main(String argc[])throws IOException{


	CharArrayWriter caw = new CharArrayWriter();

	caw.write("Writing common data to multiple files");

	FileWriter fw = new FileWriter("E:\\MKPITS STUDY\\java program\\5 oct\\f1.text");
	FileWriter fw1 = new FileWriter("E:\\MKPITS STUDY\\java program\\5 oct\\f2.text");
	FileWriter fw2 = new FileWriter("E:\\MKPITS STUDY\\java program\\5 oct\\f3.text");

	caw.writeTo(fw);
	caw.writeTo(fw1);
	caw.writeTo(fw2);

	fw.close();
	fw1.close();
	fw2.close();

	System.out.println("Success");

}
}



