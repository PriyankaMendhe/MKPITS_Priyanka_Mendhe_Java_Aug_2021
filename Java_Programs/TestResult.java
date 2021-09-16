import mkpits1.Result;
import java.util.*;
class TestResult{
public static void main(String abc[])
{
 Result r1 = new Result();
 Scanner scan = new Scanner(System.in);

System.out.println("Enter Physics Marks");
int phy = scan.nextInt();
System.out.println("Enter Chemistry Marks");
int chem = scan.nextInt();
System.out.println("Enter Biology Marks");
int bio = scan.nextInt();

// calling method from mkpits1.result

int total=r1.calculateTotal(phy, chem, bio);
System.out.println("Total = "+total);

float per = r1.calculatePercentage();
System.out.println("Percentage = "+per);

String grade = r1.calculateGrade();
System.out.println("Grade = "+grade);

}





}


