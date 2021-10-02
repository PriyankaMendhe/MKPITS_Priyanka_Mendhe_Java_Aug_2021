//Java DataOutputStream Class

import java.io.*;

public class DataInputExample{

public static void main(String argc[])throws IOException{

    InputStream input  = new  FileInputStream("E:\\MKPITS STUDY\\java program\\1 oct\\1\\testOutput.txt");

    DataInputStream inst = new DataInputStream(input);

    int count = input.available(); // counting no. of data availble in read file

    byte [] array = new byte[count];

    inst.read(array);

    for(byte b : array)
    {

		char k = (char)b;

		System.out.println(k+"-");
	}


}

}