//4- wap to accept 3 numbers and display the greater no.

import java.util.*;
class PrGreaterNo{
public static void main(String abc[]) {

	Scanner scan = new Scanner(System.in);
	int n1,n2,n3;
	System.out.println("enter 3 no.");
	n1 = scan.nextInt();
	n2 = scan.nextInt();
	n3 = scan.nextInt();

	if( n1>n2 && n1>n3 )
		System.out.println("\n n1 is greater");
	else if( n2>n3 )
		System.out.println("\n n2 is greater");
	else
		System.out.println("\n n3 is greater");

}

}
