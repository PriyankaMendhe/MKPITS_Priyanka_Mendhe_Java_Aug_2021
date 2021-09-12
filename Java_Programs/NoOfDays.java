//wap to find no. of day by accepting month and year from user

import java.util.*;
class NoOfDays
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int month;
		int numDays=0;
		int year;

		System.out.println("Enter month");
		month = s.nextInt();
		System.out.println("Enter Year");
		year= s.nextInt();

        switch(month)
        {

	       case 1: case 3: case 5 :
           case 7: case 8: case 10:

           numDays=31;
           break;

           case 4: case 6:
		   case 9: case 11:

		   numDays = 30;
		   break;

		  case 2:
		                 if (((year % 4 == 0) &&  !(year % 100 == 0)) || (year % 400 == 0))
		                     numDays = 29;
		                 else
		                     numDays = 28;
		                 break;
		   default:

		                 System.out.println("Invalid Month.");
		                 break;
	   }

       System.out.println("Days = "+numDays);
}

}




