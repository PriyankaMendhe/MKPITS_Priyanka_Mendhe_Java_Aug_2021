//wap to accept salary from the user then calculate bonus =1000 if salary is greater than 10000 ,
 // bonus =500 if salary is greater than 5000 and less than 10000 , bonus =100 if salary is less than 5000.*/

  import java.util.*;
   class PrSalary{
   public static void main(String abc[])
 {
	Scanner scan = new Scanner(System.in);

  	System.out.println("enter your salary");
  	int sal= scan.nextInt();
  	if(sal>=10000)
  	{
  		System.out.println("your bonus is 1000");

	}
	else
	{
		if(sal>=5000&&sal<10000)
		{
		 System.out.println("your bonus is 500");
		}
		else
		{
			System.out.println("your bonus is 100");
		}
	}

}

  }
