//CharArrayWriter

import java.io.*;
class test2{

public static void main(String argc[])throws IOException{

 char[] chars = "_Priyanka_".toCharArray();

 CharArrayReader charArrayReader =
     new CharArrayReader(chars);

 int data = charArrayReader.read();

 while(data != -1)
 {
   //do something with data

   data = charArrayReader.read();

   System.out.print((char)data);
 }

charArrayReader.close();



}
}



