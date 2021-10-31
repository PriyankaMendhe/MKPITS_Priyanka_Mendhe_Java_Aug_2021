import java.util.*;
class StudentList1{

public static void main(String argc[])
{

      ArrayList<String> studentData = new ArrayList<String>();

      studentData.add("Pranay");
      studentData.add("Priyanka");
      studentData.add("Surbhi");
      studentData.add("Kiyansh");
      studentData.add("Hrutika");

 for(String str : studentData)
 {
         System.out.println("Student Name: "+str);

 }

}
}