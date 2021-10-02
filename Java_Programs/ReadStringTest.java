//Java Console Class

import java.io.Console;

class ReadStringTest{

public static void main(String args[]){

Console c = System.console();

System.out.println("Enter Your name");

String n = c.readLine(); // to read data

System.out.println("Welocme  " +n);


}
}

