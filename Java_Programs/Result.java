//wap to accept 3 subject marks and calculate total , per and grade
import java.util.*;
class Result
{

   public static void main(String arf[])
   {

      int m1,m2,m3, total=0;
      char grade;
      float per;

      Scanner s = new Scanner(System.in);

      System.out.println("Enter marks 1");
      m1=s.nextInt();
      System.out.println("Enter marks 2");
      m2=s.nextInt();
      System.out.println("Enter marks 3");
      m3=s.nextInt();

      total = m1 +m2+m3;
      System.out.println("Total Marks = "+total);
      per = (float) (total /300f) * 100f;

      if(per>=75)
      {
          grade = 'A';

      }else if(per>=60 && per <75)
      {
          grade = 'B';
      }else if(per>=50 && per<60)
      {
          grade = 'C';
      }else
      {
          grade = 'D';
      }

      System.out.println("Percentage = "+per);
      System.out.println("Grade = "+grade);
    }
}



