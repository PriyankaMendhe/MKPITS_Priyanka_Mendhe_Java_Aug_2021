
package mkpits1;
public class Employee{

int empNo;
String empName;
int basicSal;
float bonus;

public void insert(int eNo, String eName, int bSal){

empNo=eNo;
empName=eName;
basicSal=bSal;
}
public void calculateBonus()
{
   bonus = basicSal * 0.65f;
}

public void display()
{
  System.out.println("Emp No.: "+empNo);
  System.out.println("Emp Name: "+empName);
  System.out.println("Employee Basic Salary : "+basicSal);
  System.out.println("Bonus: "+bonus);

}

}
