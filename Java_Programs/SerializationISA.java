//Java Serialization with Inheritance (IS-A Relationship)

import java.io.*;

class Person implements Serializable{

int id;

String name;

Person(int id, String name)
{
	this.id = id;
	this.name = name;

}
}
// child class of Person
class Student extends Person{

	String course;

	int fees;

	Student(int id , String name , String course, int fees)
	{
		super(id, name);

		this.course = course;
		this.fees = fees;
    }
}

// Serliazation data

class SerializationISA
{

	public static void main(String argc[])
	{
         try{

			 Student s1 = new Student(34, "AMitya", "BE",750000);

			 FileOutputStream fos = new FileOutputStream("E:\\MKPITS STUDY\\java program\\7 oct\\Student.txt");

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


			 // dePersist or DeSerialization

			 try{

				 FileInputStream fis = new FileInputStream("E:\\MKPITS STUDY\\java program\\7 oct\\Student.txt");

				 ObjectInputStream ois = new ObjectInputStream(fis);

				 Student s2 = (Student) ois.readObject();

				 System.out.println(s2.id);

				 System.out.println(s2.name);

				 System.out.println(s2.course);

				 System.out.println(s2.fees);

				 fis.close();
			 }
			 catch(Exception ee)
			 {

				System.out.println(ee.toString());
			}



	}


}