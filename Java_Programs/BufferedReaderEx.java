//Java BufferedReader
//It can be used to read data line by line by readLine() method.

import java.io.*;

public class BufferedReaderEx{

  public static void main(String args[])throws Exception{

    FileReader fr = new FileReader( "E:\\MKPITS STUDY\\java program\\1 oct\\2\\write1.txt");

    BufferedReader  br = new BufferedReader(fr);

    int i ;

    while((i=br.read())!=-1){


       System.out.print((char)i);


    }

    br.close();

    fr.close();
  }

  }