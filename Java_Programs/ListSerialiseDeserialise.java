//serialize an ArrayList object and then deserialize it.

import java.io.*;
import java.util.*;
class ListSerialiseDeserialise{

	public static void main(String argc[]){


  ArrayList<String> al = new ArrayList<String>();

  al.add("Ravi");
  al.add("Raveena");
  al.add("Ravindra");
  al.add("Ravish");


  try{

	  FileOutputStream fos = new FileOutputStream("file1");
	  ObjectOutputStream oos = new ObjectOutputStream(fos);

	  oos.writeObject(al);
	  fos.close();
	  oos.close();

	  //Deserialization

	  FileInputStream fis = new FileInputStream("file1");

	  ObjectInputStream ois = new ObjectInputStream(fis);

	  ArrayList list = (ArrayList) ois.readObject();

	  System.out.println(list);


     }
  catch(Exception ee)
  {

	  System.out.println(ee);

  }




	}

}