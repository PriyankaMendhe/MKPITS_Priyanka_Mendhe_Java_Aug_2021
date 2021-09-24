//10 wap to accept basic_salary of employee and then calculate
	//hra= 25 % of basic_salary
	//da=35% of basic_salary
	//totalsalary= hra + da + basic_salary.
import java.util.*;
class PrTotalSalary{
public static void  main(String arf[])
{
    Scanner scan = new Scanner(System.in);
    float basic_sal, total_salary, da, hra;

    System.out.println("Enter basic salary");
    basic_sal = scan.nextFloat();
    hra = basic_sal * 25 / 100   ;
    da  = basic_sal * 35/ 100    ;

    total_salary = basic_sal + da + hra;

    System.out.println("Total Salary is Rs "+ total_salary);
}

}
