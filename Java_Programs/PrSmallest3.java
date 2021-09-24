//wap to accept 2 no. and print smallest no.


 import java.util.*;
 class PrSmallest3{
 public static void main(String abc[])
 {
	Scanner scan = new Scanner(System.in);
 	int n1, n2,n3;
 	System.out.println("enter 3 no.");
 	n1=scan.nextInt();
 	n2=scan.nextInt();
 	n3=scan.nextInt();

 	if(n1<n2&&n1<n3)
 	{
 		System.out.println("n1 is smallest");
	 }
	 else
	 {
	 		if(n2<n3)
	 		{
	 			System.out.println("n2 is smallest");
			 }
			 else
			 {
			 	System.out.println("n3 is smallest");
			 }

	 }

}
 }
