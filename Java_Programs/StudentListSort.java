import java.util.*;
class StudentListSort{

public static void main(String argc[])
{

      ArrayList<String> studentData = new ArrayList<String>();

      studentData.add("Pranay");
      studentData.add("Priyanka");
      studentData.add("Surbhi");
      studentData.add("Kiyansh");
      studentData.add("Hrutika");


      System.out.println("Before Sorting");

      for(String str : studentData)
	  {

	  	System.out.println("Student Name: "+str);

      }

System.out.println("After Sorting");

Collections.sort(studentData);


for(String str : studentData)
{

	System.out.println("Student Name: "+str);

 }

 }}