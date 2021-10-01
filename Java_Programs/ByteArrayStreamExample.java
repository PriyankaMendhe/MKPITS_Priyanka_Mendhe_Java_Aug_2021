//ByteArrayOutputStream
// ByteArrayOutputStream holds a copy of data and forwards it to multiple streams.


import java.io.*;

class ByteArrayStreamExample{

	public static void main(String argc[])throws Exception{

		FileOutputStream fout1=new FileOutputStream("E:\\MKPITS STUDY\\java program\\1 oct\\1\\data1.txt");

		FileOutputStream fout2=new FileOutputStream("E:\\MKPITS STUDY\\java program\\1 oct\\1\\data2.txt");


         ByteArrayOutputStream bout = new ByteArrayOutputStream();

         bout.write(65);

         bout.writeTo(fout1);

         bout.writeTo(fout2);

         bout.flush();

         bout.close();
         System.out.println("Success...");


 }

}