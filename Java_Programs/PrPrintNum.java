//wap to accept a number and print from 1 to the number entered by the user
import java.util.*;
class PrPrintNum{
public static void main(String abc[]){

Scanner scan = new Scanner(System.in);
	int num;
	int i=1;
	System.out.println("enter number");
	num = scan.nextInt();
	
	while(i <= num) {
		System.out.println("\nnum = "+i);
		i=i+1;
	}
	
	
}
}