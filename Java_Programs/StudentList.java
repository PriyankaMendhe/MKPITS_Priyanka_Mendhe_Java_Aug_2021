import java.util.*;
class StudentList{

public static void main(String argc[])
{

      ArrayList<String> studentData = new ArrayList<String>();

      studentData.add("Pratik");
      studentData.add("Priyanka");
      studentData.add("Surbhi");
      studentData.add("Kiyansh");
      studentData.add("Hrutika");

//printing
    System.out.println(studentData);

//printing by another name

Iterator itr = studentData.iterator();

while(itr.hasNext())
{
	System.out.println(itr.next());


}

}
}