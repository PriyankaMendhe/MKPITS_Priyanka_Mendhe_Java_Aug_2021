//wap to accept 2 no. and print smallest no.

 import java.util.*;
 class PrSmallest{
 public static void main(String abc[])
 {
      Scanner scan = new Scanner(System.in);
 	int n1, n2;
 	System.out.println("enter 2 no.");
 	n1=scan.nextInt();
 	n2=scan.nextInt();
 	if(n1<n2)
 	{
 		System.out.println("n1 is smallest");
	 }
	 else
	 {
	 		System.out.println("n2 is smallest");
	 }

}
 }
