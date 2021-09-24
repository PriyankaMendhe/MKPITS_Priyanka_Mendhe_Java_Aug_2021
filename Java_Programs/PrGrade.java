//5 wap to accept 3 subject marks then calculate total , percentage and grade.


 import java.util.*;
 class PrGrade{

public static void main(String abc[]) {

Scanner scan = new Scanner(System.in);
	int s1,s2,s3,total;
	float percentage;

	System.out.println("enter 3 subject marks.");
    s1 = scan.nextInt();
    s2 = scan.nextInt();
	s3 = scan.nextInt();

	total = s1+s2+s3;
	System.out.println(" total marks = "+total );
	percentage = (float) (total / 300.0f) * 100.0f;
	System.out.println("percentage = "+ percentage);

	if(percentage >= 75 ){
		System.out.println("\n grade = distinction");
	}
	else if(percentage >= 60 && percentage < 75) {
		System.out.println("\n grade = first ");
	}
	else if (percentage >= 45 && percentage <60 ) {
		System.out.println("\n grade = second");
	}
	else
	{
		System.out.println("\n fail");
	}

}
}