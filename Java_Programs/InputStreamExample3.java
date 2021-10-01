//SequenceInputStream example

//reads the data from more than two files and writes into another file


import java.io.*;
import java.util.*;

class InputStreamExample3{

	public static void main(String argc[])throws Exception{

		FileInputStream input1 = new FileInputStream("E:\\MKPITS STUDY\\java program\\30 sept\\io session 2\\a.txt");

		FileInputStream input2 = new FileInputStream("E:\\MKPITS STUDY\\java program\\30 sept\\io session 2\\b.txt");

		FileInputStream input3 = new FileInputStream("E:\\MKPITS STUDY\\java program\\30 sept\\io session 2\\c.txt");

		FileInputStream input4 = new FileInputStream("E:\\MKPITS STUDY\\java program\\30 sept\\io session 2\\d.txt");


		// Creating vector object to all Stream

		Vector v = new Vector();

		v.add(input1);
		v.add(input2);
		v.add(input3);
		v.add(input4);

		Enumeration e = v.elements();

		//passing the enumration object inthe constructor

	    SequenceInputStream inst = new SequenceInputStream(e);

	    int j;

	    while((j = inst.read())!= -1){

			System.out.print((char)j);

	    }

	    inst.close();

	    input1.close();
	    input2.close();
	    input3.close();
	    input4.close();

        System.out.println("Success");
 }

}