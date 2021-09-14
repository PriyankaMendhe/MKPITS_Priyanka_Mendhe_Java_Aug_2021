//maintaining records of employees.

class Employee
{
    int employeeId;
    String employeeName;
    String employeeDesg;
    Float employeeSalary;
    String employeeBloodGroup;
    String employeeAddress;

    //method to initialize object

 void insert(int eId, String eName, String eDesg, float eSal, String eBG, String eAdd)
 {
      employeeId=eId;
      employeeName= eName;
      employeeDesg=eDesg;
      employeeSalary= eSal;
      employeeBloodGroup= eBG;
      employeeAddress= eAdd;
 }
 void display()
 {

 System.out.println("Employee ID: "+employeeId);
 System.out.println("Employee Name: "+employeeName);
 System.out.println("Employee Designation: "+employeeDesg);
 System.out.println("Employee Salary: "+employeeSalary);
 System.out.println("Employee Blood Group: "+employeeBloodGroup);
 System.out.println("Employee Address: "+employeeAddress);

 System.out.println("---------Display in one Line--------------");
 System.out.println(employeeId+ " "+employeeName+ " "+employeeDesg+ " "+employeeSalary+ " "+employeeBloodGroup+ " "+employeeAddress);
 System.out.println("***************************************************************");
 }

}

 class EmployeeRecord
 {
     public static void main(String abc[])
     {
           Employee e1= new Employee(), e2=new Employee(), e3= new Employee();

         e1.insert(1,"Priyanka Mendhe", "Manager", 25000, "O+ve","Mankapur_Nagpur");
         e1.display();

         e2.insert(2,"Samira Shrii", "Seo_Exe.", 10000, "A", "Jafar Nagar,Nagpur");
         e2.display();

         e3.insert(3,"Afreen Khan","Director", 50000, "A+", "Nandanvan Nagpur");
         e3.display();
     }
}