//Java Serialization with Aggregation (HAS-A Relationship)
//accepting values from user

import java.io.*;
import java.util.*;

class Address implements Serializable{

	String addressLine;

	String city;

	String state;

	int pincode;

	Address(String addressLine,String city,String state,int pincode  )
	{
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
}



//
class Student implements Serializable{

	int id;

        String name;

	 String course;

	int fees;

	transient int age; // transient do not depict state of object

	Address address;

	Student(int id , String name , String course, int fees,int age, Address address)
	{
		this.id = id;
	    this.name = name;

		this.course = course;
		this.fees = fees;

		this.age = age;

		this.address = address;
    }
}

// Serliazation data

class SerializationT
{

	public static void main(String argc[])
	{
         try{

			 Scanner scan = new Scanner(System.in);





  /// Student detail
			 System.out.println("Enter Student id");

			 int id = scan.nextInt();

			 System.out.println("Enter Student name");

			 String name = scan.next();

			 System.out.println("Enter Student course");

			 String course = scan.next();

			 System.out.println("Enter Student fees");

			 int fees= scan.nextInt();

			 System.out.println("Enter Student age");

			 			 int age= scan.nextInt();




// Student address detail


System.out.println("Enter Adress line");

			 			 String addressLine = scan.next();

			 			 System.out.println("Enter Student City");

			 			 String city = scan.next();

			 			 System.out.println("Enter Student State");

			 			 String state = scan.next();

			 			 System.out.println("Enter Student pincode");

			 			 int pincode= scan.nextInt();

			 			  Address addr = new Address(addressLine,city,state, pincode);

// creating object

			 Student s1 = new Student(id, name, course,fees,age, addr);

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

				 System.out.println(s2.age);// becoz of trasient keyword it will shows default value

				 System.out.println(s2.address.addressLine+ " "+s2.address.city+" "+s2.address.state+" "+s2.address.pincode);

				 fis.close();
			 }
			 catch(Exception ee)
			 {

				System.out.println(ee.toString());
			}



	}


}