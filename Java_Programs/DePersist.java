import java.io.*;

public class DePersist{

public static void main(String argc[]){

try{

FileInputStream fis = new FileInputStream("E:\\MKPITS STUDY\\java program\\7 oct\\f1.txt");

ObjectInputStream ois = new ObjectInputStream(fis);

Student s1 = (Student)ois.readObject();

fis.close();

System.out.println("Student Id:  "+s1.id);
System.out.println("Student Name:   "+s1.name);

}
catch(Exception ee)
{

   System.out.println(ee.toString());

}

}


}