///Constructor with no argument

class Employee
{

int empId;
String empName;

   Employee()
   {
      System.out.println("Default constructor Called");
      empId=101;
      empName="Priyanka";

   }

   void display()
   {
    System.out.println("Emp Id :"+empId+ "Emp Name = "+empName);

   }
  }
  class EmployeeTest{

  public static void main(String avc[]){

  Employee e1 = new Employee();
  e1.display();

  }
  }