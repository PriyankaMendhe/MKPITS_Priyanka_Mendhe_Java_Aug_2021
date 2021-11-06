//serialise and deseralise
import java.io.*;
import java.util.*;
class Serialize{


public static void main(String argc[])
{

  try{
  ArrayList<String> a1 = new ArrayList<String>();

  a1.add("Aakash");
  a1.add("Aakasha");
  a1.add("AakashVani");

  FileOutputStream fos = new FileOutputStream("file2");

  ObjectOutputStream oos = new ObjectOutputStream(fos);

  oos.writeObject(a1);
  fos.close();
  oos.close();

FileInputStream fis = new FileInputStream("file2");

  ObjectInputStream ois = new ObjectInputStream(fis);

  ArrayList arr = (ArrayList) ois.readObject();

  System.out.println(arr);

  fis.close();
  ois.close();



  }
  catch(Exception ee)
  {

     System.out.println(ee);

  }


}}