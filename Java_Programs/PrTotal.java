//9 wap to accept 5 subject marks and print total and average marks


import java.util.*;
class PrTotal{
public static void main(String abc[])
{
	Scanner scan = new Scanner(System.in);
	int sub1,sub2,sub3,sub4,sub5,total,avg;
	System.out.println("enter 5 subject marks");
	sub1= scan.nextInt();
	sub2 = scan.nextInt();
	sub3 = scan.nextInt();
	sub4 = scan.nextInt();
	sub5 = scan.nextInt();

    total= sub1+sub2+sub3+sub4+sub5;
    avg=total/5;
	System.out.println("total of 5 subject are= "+total);
	System.out.println("\nAverage of 5 subject are= "+avg);
}

}
