//accept month and print monthNumber

public class StringSwitchDemo
{

	public static int getMonthNumber(String month)
	{


	     int monthNumber=0;
        System.out.println(month);
	     if(month==null)
	     {

			 return monthNumber;
		 }

		 switch(month.toLowerCase())
		 {
			 case "Jan":
			             monthNumber=1;
			 break;
			 case "Feb":
			 			 monthNumber=2;
			 break;
			 case "Mar":
			 			 monthNumber=3;
			 break;
			 case "Apr":
			 			 monthNumber=4;
			 break;
			 case "May":
			 			 monthNumber=5;
			 break;
			 case "Jun":
			 			 monthNumber=6;
			 break;
			 case "Jul":
			 			 monthNumber=7;
			 break;
			 case "Aug":
			 			 monthNumber=8;
			 break;
			 case "Sept":
			 			 monthNumber=9;
			 break;
			 case "Oct":
			 			 monthNumber=10;
			 break;
			 case "Nov":
			 			 monthNumber=11;
			 break;
			 case "Dec":
			 			 monthNumber=12;
			 break;
			 default:
			 monthNumber=0;
			 break;
		 }
         System.out.println("Month Number = "+monthNumber);
		 return monthNumber;
}


    public static void main(String abc[])
    {

       String month ="Jan";

       int returnMonthNumber=StringSwitchDemo.getMonthNumber(month);

       if(returnMonthNumber==0)
       {
        System.out.println("Invalid Month");
       }
       else
       {
         System.out.println(returnMonthNumber);
       }
    }

 }