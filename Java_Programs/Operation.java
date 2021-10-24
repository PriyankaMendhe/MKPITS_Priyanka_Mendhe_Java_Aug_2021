//BOOLEAN CONTANIS
//returns true or false after matching sequence of character

import java.util.*;
class Operation{
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter email address");
		String s3=scan.next();
		// boolean ss=s3.contains("@.com");
	    boolean ss=s3.contains("@gmail.com");//match string contains mention sequence or not return true or false
	    if(ss==true)
	    {
			System.out.println("valid email address");
		}
		else
		{
			System.out.println("invalid email address");
		}

     }
    }
