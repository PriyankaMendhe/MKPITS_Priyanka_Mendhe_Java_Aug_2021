//Java Serialization with Aggregation (HAS-A Relationship)


import java.io.*;

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

	Address address;

	Student(int id , String name , String course, int fees,Address address)
	{
		this.id = id;
	    this.name = name;

		this.course = course;
		this.fees = fees;

		this.address = address;
    }
}

// Serliazation data

class SerializationHAS
{

	public static void main(String argc[])
	{
         try{

			 Address addr = new Address("Mankapur","Nagpur","MH", 440035);

			 Student s1 = new Student(34, "AMitya", "BE",750000, addr);

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

				 System.out.println(s2.address.addressLine+ " "+s2.address.city+" "+s2.address.state+" "+s2.address.pincode);

				 fis.close();
			 }
			 catch(Exception ee)
			 {

				System.out.println(ee.toString());
			}



	}


}