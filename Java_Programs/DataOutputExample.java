//Java DataOutputStream Class

import java.io.*;

public class DataOutputExample{

public static void main(String argc[])throws IOException{

	FileOutputStream file  = new FileOutputStream("E:\\MKPITS STUDY\\java program\\1 oct\\1\\testOutput.txt");

    DataOutputStream data = new DataOutputStream(file);

    data.writeInt(65);// primitive datatype

    data.flush();
    data.close();

    System.out.println("Success..");
}

}