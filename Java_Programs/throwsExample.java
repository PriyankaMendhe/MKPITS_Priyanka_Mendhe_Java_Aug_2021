import java.io.*;
class  throwsExample{

static void validate(int age) throws Exception
{
         if(age<18)
          throw  new  Exception("age is less than 18");

        else

          System.out.println("welcome to vote");
}

public static void main(String args[]){

		  try
		   {
              validate(13);
	       }
	       catch(Exception ee)
	      {
		  System.out.println(ee.toString());
	      }

 }
}







