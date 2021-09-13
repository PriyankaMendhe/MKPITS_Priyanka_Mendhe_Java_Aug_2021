//create a class employee having empno,empname,designation and salary
class Employee
{
int empNo;
String empName;
String empDesg;
double empSalary;

 void insertEmpInfo(int eNo,String eName, String eDesg, double eSal)
 {
   empNo=eNo;
   empName=eName;
   empDesg=eDesg;
   empSalary = eSal;
 }
 void displayEmpInfo()
 {
       System.out.println(" Employee No = "+ empNo);
      System.out.println(" Employee name = "+ empName);
       System.out.println(" Employee Designation = "+ empDesg);
       System.out.println(" Employee Salary = "+ empSalary);
 }
}
 class EmployeeInfo
 {
   public static void main(String abc[])
   {

      Employee e1 = new Employee();
      Employee e2 = new Employee();
      e1.insertEmpInfo(1,"Priyanka_Mendhe","Manager",25000.25);
      e1.displayEmpInfo();
      e2.insertEmpInfo(2,"Priyankaaa","Clerk",5000.25);
      e2.displayEmpInfo();

}}