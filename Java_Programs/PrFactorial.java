//wap to accept a no. print factorial of that no.

import java.util.*;
class PrFactorial{
public static void main(String abc[]){

	Scanner scan = new Scanner(System.in);
int num,fact=1;
	System.out.println("enter number");
	 num = scan.nextInt();

	while(num > 0) {
		fact=fact * num;
		num=num-1;
	}
	System.out.println("\n factorial of a number is "+fact );

}
}