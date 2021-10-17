import java.io.*;

public class Persist{

public static void main(String argc[])
{

 try
 {

 Student s1 = new Student(2452, "Priyanka Mendhe");

 FileOutputStream fos = new FileOutputStream("E:\\MKPITS STUDY\\java program\\7 oct\\f1.txt");

 ObjectOutputStream oos = new ObjectOutputStream(fos);

 oos.writeObject(s1);

 oos.flush();
 fos.close();
 System.out.println("Success");


 }
 catch(Exception ee)
 {
    System.out.println(ee.toString());
 }



}
}