
//SequenceInputStream example

//reads the data from two files and writes into another file


import java.io.*;

class InputStreamExample1{

	public static void main(String argc[])throws Exception{

		FileInputStream input1 = new FileInputStream("E:\\MKPITS STUDY\\java program\\30 sept\\io session 2\\testin.txt");

		FileInputStream input2 = new FileInputStream("E:\\MKPITS STUDY\\java program\\30 sept\\io session 2\\readfile.txt");

		FileOutputStream output = new FileOutputStream("E:\\MKPITS STUDY\\java program\\30 sept\\io session 2\\testout.txt");



	    SequenceInputStream inst = new SequenceInputStream(input1, input2);

	    int j;

	    while((j = inst.read())!= -1){

			output.write(j);

	    }

	    inst.close();
	    output.close();
	    input1.close();
	    input2.close();

        System.out.println("Success");
 }

}