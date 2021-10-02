// java BufferedWriterClass

import java.io.*;

public class BufferedWriterEx{

public static void main(String argc[])throws IOException{

	FileWriter writer = new FileWriter("E:\\MKPITS STUDY\\java program\\1 oct\\2\\write1.txt");

	BufferedWriter buffer = new BufferedWriter(writer);

	buffer.write("Welcome to MKPITS");

	buffer.close();
	System.out.println("Success");


}
}