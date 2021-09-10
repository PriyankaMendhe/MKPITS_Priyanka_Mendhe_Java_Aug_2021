//The following program, IfElseDemo, assigns a grade based on the value of a test score: an A for a score of
//90% or above, a B for a score of 80% or above, and so on.

 class IfElseDemo
 {

    public static void main(String atc[])
    {

      int test_score=50;
      char grade;

       if(test_score >=75)
       {

          grade = 'A';
          System.out.println("Grade= "+ grade);


       }else if(test_score>=60 && test_score <75)
       {

          grade = 'A';
          System.out.println("Grade= "+ grade);

       }else if(test_score>=50 && test_score <60)
       {

          grade = 'B';
          System.out.println("Grade= "+ grade);



       }else if(test_score>=35 && test_score <50)
       {

          grade = 'C';
          System.out.println("Grade= "+ grade);

       }else if(test_score <35)
       {

          grade = 'F';

          System.out.println("Grade= "+ grade);

       }




}}



