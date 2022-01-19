
//Null pointer Exception

public class Null1
{


public static void main(String args[])
{
      String s[]=new String[5];
      s[0]="ram";
      s[1]="shyam";

      System.out.println(s[0].toUpperCase());
     //  System.out.println(s[2].toUpperCase());//error

     if(s[2]==null)
     {
		 System.out.println("No data");

	 }
      else
      {

		   System.out.println(s[2].toUpperCase());

	  }




}



}