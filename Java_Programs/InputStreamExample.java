

//we are printing the data of two files testin.txt and testout.txt.

import java.io.*;

class InputStreamExample{

	public static void main(String argc[])throws Exception{

		FileInputStream input1 = new FileInputStream("E:\\MKPITS STUDY\\java program\\30 sept\\io session 2\\testin.txt");

		FileInputStream input2 = new FileInputStream("E:\\MKPITS STUDY\\java program\\30 sept\\io session 2\\testout.txt");

	    SequenceInputStream inst = new SequenceInputStream(input1, input2);

	    int j;

	    while((j = inst.read())!= -1){

			System.out.print((char)j);

	    }

	    inst.close();
	    input1.close();
	    input2.close();
 }

}