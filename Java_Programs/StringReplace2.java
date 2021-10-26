

import java.util.*;
class StringReplace2
{

public static void main(String argc[]){



Scanner sc=new Scanner(System.in);
System.out.println("enter your name");
String fn=sc.next();
StringBuffer sb=new StringBuffer(fn);
System.out.println("enter your lname");
String ln=sc.next();
    sb.replace(1,5,ln);//now original string is changed
    System.out.println(sb);//

}

}