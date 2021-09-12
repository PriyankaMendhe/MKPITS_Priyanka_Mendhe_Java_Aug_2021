//The following program, IfElseDemo, assigns a grade based on the value of a test score: an A for a score of
//90% or above, a B for a score of 80% or above, and so on.

import java.util.*;
class Grade
{

   public static void main(String[] arc)
   {


       int test_marks;
       char grade='X';

       Scanner s =new Scanner(System.in);

       System.out.println("Enter your test marks");
       test_marks= s.nextInt();
       if(test_marks>=75)
       {
		   grade = 'A';
	   }else if (test_marks>=60 && test_marks <75)
	   {
		   grade='B';
	   }else  if(test_marks>=50 && test_marks <60)
	   {
		   grade = 'C';

	   }else if(test_marks>=35 && test_marks <50)
	   {
		   grade = 'D';
	   }else
	   {
		   System.out.println("Fail");
	   }

       System.out.println("Grade = "+grade);

    }
 }