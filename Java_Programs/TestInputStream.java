//FileINputStream


import java.io.*;
public class TestInputStream{

public static void main(String argc[])throws IOException{

InputStream stream = new FileInputStream("E:\\MKPITS STUDY\\java program\\5 oct\\printstream.txt");

Reader r = new InputStreamReader(stream);

int data = r.read();

   while(data != -1)
 {

System.out.print((char)data);
 data = r.read();

 }

}}

