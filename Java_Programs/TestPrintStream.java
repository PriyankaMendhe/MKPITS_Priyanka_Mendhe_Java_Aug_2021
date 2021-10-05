//PrintStream


import java.io.*;

public class TestPrintStream{

public static void main(String argc[])throws IOException{

FileOutputStream fout = new FileOutputStream("E:\\MKPITS STUDY\\java program\\5 oct\\printstream.txt");

PrintStream pout = new PrintStream(fout);

pout.println("2016");
pout.println("Hello JAVA");
pout.println("Welcome to JAva");

pout.close();
fout.close();

System.out.println("Success");

}

}




