//Java Console Class

import java.io.Console;

class ReadPasswordTest{

public static void main(String args[]){

Console c = System.console();

System.out.println("Enter Your name");

String n = c.readLine(); // to read data



System.out.println("Enter your password");

char ch[] = c  . readPassword();

String pass = String.valueOf(ch);// convert character array into string

System.out.println("Name is : "+n);

System.out.println("Password is "+pass);






}
}

