//8 wap to accept 3 numbers and then print addition of 3 numbers.

import java.util.*;
class PrAddition{
public static void main(String abc[])
{
	Scanner scan = new Scanner(System.in);
	
	int a,b,c,add;
        System.out.println("enter three numbers for addition");
	a = scan.nextInt();
	b = scan.nextInt();
	c = scan.nextInt();	 
	add= a+b+c;
        System.out.println("Addition of three no. is= "+add);
}
	 
	 
}
