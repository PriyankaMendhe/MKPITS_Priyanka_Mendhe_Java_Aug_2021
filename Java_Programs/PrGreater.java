//1- wap to accept 2 no. and display the greater no.
import java.util.*;
class PrGreater{

public static void main(String abc[]) {
	Scanner scan = new Scanner(System.in);
	int num1,num2;
	System.out.println("enter 2 no");
	num1 = scan.nextInt();
	num2 = scan.nextInt();
	if( num1 > num2 ) {
		System.out.println("\n num1 is greater");
	}
	else {
		System.out.println("\n num2 is greater");
	}

}
}