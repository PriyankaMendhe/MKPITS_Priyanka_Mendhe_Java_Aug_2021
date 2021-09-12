
//The following code example, SwitchDemo, declares an int named month whose value represents a month.
//The code displays the name of the month, based on the value of month, using the switch statement.
import java.util.*;
public class DisplayMonth
{

 public static void main( String[] args)
 {

      int month;
      String monthString;
      Scanner s =new Scanner(System.in);
     System.out.println("Enter month between 1 to12");
     month = s.nextInt();

      switch (month) {
	              case 1:  monthString = "January";
	                       break;
	              case 2:  monthString = "February";
	                       break;
	              case 3:  monthString = "March";
	                       break;
	              case 4:  monthString = "April";
	                       break;
	              case 5:  monthString = "May";
	                       break;
	              case 6:  monthString = "June";
	                       break;
	              case 7:  monthString = "July";
	                       break;
	              case 8:  monthString = "August";
	                       break;
	              case 9:  monthString = "September";
	                       break;
	              case 10: monthString = "October";
	                       break;
	              case 11: monthString = "November";
	                       break;
	              case 12: monthString = "December";
	                       break;
	              default: monthString = "Invalid month";
                           break;
      }

       System.out.println("Month = "+monthString);

   }
}