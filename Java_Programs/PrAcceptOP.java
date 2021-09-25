//3 -  wap to accept 2 no and operator like +,- * and display the result.

import java.util.*;
class PrAcceptOP{

public static void main(String abc[]) {

	Scanner scan = new Scanner(System.in);
	int num1,num2;
	int result=0;
	char op;

	System.out.println("enter 2 no.");
	num1 = scan.nextInt();
	num2=scan.nextInt();
	System.out.println("Enter operator like +,-,*");
	op = scan.next().charAt(0);

	if( op == '+' ) {
		result=num1+num2;
	}
	else if ( op == '-' ) {
		result=num1-num2;
	}
	else if(op == '*') {
		result=num1*num2;
	}
	else
	{
		System.out.println("not a valid operator");
	}

		System.out.println("\n result = "+result);
}
}
