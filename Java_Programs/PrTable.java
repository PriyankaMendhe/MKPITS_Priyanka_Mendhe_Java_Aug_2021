//wap to accept a no. and print the table of that no.

import java.util.*;
class PrTable{
public static void main(String abc[]){

Scanner scan = new Scanner(System.in);
	int num,result;
	int i=1;
	System.out.println("enter number");
        num = scan.nextInt();

	while(i <= 10) {
		result = num * i;
		System.out.println(num+ " * "+ i + " = "+result);
		i=i+1;
	}
}

}
