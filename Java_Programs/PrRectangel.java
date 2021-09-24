import java.util.*;
class PrRectangel{

public static void main(String abc[])
{
     Scanner scan = new Scanner(System.in);
	int length,bredth,area;
	System.out.println("enter length and bredth");
	length = scan.nextInt();
	bredth = scan.nextInt();
	area = length*bredth;
	System.out.println("area of rectangle= "+area);
}
}