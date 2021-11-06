import java.util.*;
class StudentTraverseForLoop{

public static void main(String argc[])
{

      ArrayList<String> studentData = new ArrayList<String>();

      studentData.add("Pranay");
      studentData.add("Priyanka");
      studentData.add("Surbhi");
      studentData.add("Kiyansh");
      studentData.add("Hrutika");


     System.out.println("Traverse through for loop by array SIze and get() method  ");


     for(int i =0 ; i<studentData.size();i++)
     {

       System.out.println(studentData.get(i));//get function for specified index

     }
 }}