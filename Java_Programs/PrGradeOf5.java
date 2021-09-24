///wap to accept 5 subject marks then calculate total , percentage and grade.

import java.util.*;
class PrGradeOf5{

public static void main(String abc[]) {

Scanner scan = new Scanner(System.in);

int s1, s2, s3,s4,s5,total;
	float percentage;
	System.out.println("Enter 5 subject marks");
	s1 = scan.nextInt();
	s2 = scan.nextInt();
	s3 = scan.nextInt();
	s4 = scan.nextInt();
	s5 = scan.nextInt();

    total= s1+s2+s3+s4+s5;
	System.out.println("\nyour total marks are "+ total);
	percentage= total * (100.0f / 500.0f);
	System.out.println("\nyour percenatge is "+ percentage);
	if(percentage>=75)
	{
		System.out.println(" \nyou passed with distinction");
	}
	else
	{
		if(percentage<75&&percentage>=60)
		{
		  	System.out.println("\nyou passed with first class");
		}
		else
		{
			if(percentage<60&&percentage>=35)
			{
				System.out.println("\nyou passed with second class");
			}
			else
			{
				System.out.println("\nyou  are fail!!");
			}


		}

	}

}
}