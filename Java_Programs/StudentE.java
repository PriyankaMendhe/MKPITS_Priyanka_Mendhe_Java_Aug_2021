
class Student{

//private data member
private String name;

//setter and getter method for private member

public void setName(String name){

this.name = name ;
}

public String getName()
{
    return name ;
}
}

class StudentE
{

   public static void main(String argc[])
   {
      Student s1 = new Student();
      s1.setName("Priyanka");
      System.out.println("Name is : "+ s1.getName());
      }
}