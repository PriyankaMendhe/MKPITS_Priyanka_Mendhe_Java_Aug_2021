import java.util.*;
class StudentReverseT{

public static void main(String argc[])
{

      ArrayList<String> studentData = new ArrayList<String>();

      studentData.add("Pranay");
      studentData.add("Priyanka");
      studentData.add("Surbhi");
      studentData.add("Kiyansh");
      studentData.add("Hrutika");


     System.out.println("Traverse in reverse order through ListIterator()");

     ListIterator<String> itr = studentData.listIterator(studentData.size());

     while(itr.hasPrevious())//check for more previous data
     {

        System.out.println(itr.previous());//print and shift to previous data

     }
 }}