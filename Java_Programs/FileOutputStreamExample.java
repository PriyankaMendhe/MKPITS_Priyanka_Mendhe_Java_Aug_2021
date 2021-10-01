// java FileOutputStream : write byte

import java.io.FileOutputStream;

public class FileOutputStreamExample{

  public static void main(String argc[])
  {

    try
    {

      FileOutputStream fout = new FileOutputStream("E:\\MKPITS STUDY\\java program\\30 sept\\io sesson 1\\FileOutputStreamExample.txt");
      fout.write(65);
      fout.close();
      System.out.println("Success.....");

    }catch(Exception e){System.out.println(e);}
  }
}