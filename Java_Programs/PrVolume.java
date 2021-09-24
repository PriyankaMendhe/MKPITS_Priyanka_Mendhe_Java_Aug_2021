//7 - wap to accept length, breadth and height and then print volume .
import java.util.*;
class PrVolume{
public static void main(String abc[])
{
	Scanner scan = new Scanner(System.in);
	int l,b,h,volumme;
	System.out.println("enter lenght,bredth and height");
	l = scan.nextInt();
	b = scan.nextInt();
	h = scan.nextInt();
    volumme= l*b*h;
	System.out.println("Volumme= "+volumme);
}
}