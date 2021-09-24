//wap to accept age from the user and display whether he is elegible to vote or not.
import java.util.*;
class PrAge{

public static void main(String abc[]) {

	Scanner scan = new Scanner(System.in);

	System.out.println("enter your age");
	int age = scan.nextInt();
	if( age >= 18 ) {
		System.out.println("you are elegible to vote");
	}
	else {
		System.out.println("you are not elegible to vote");
	}

}
}