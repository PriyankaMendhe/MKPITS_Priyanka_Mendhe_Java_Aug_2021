import java.util.*;
class PrCircle{
public static void main(String abc[])
{
	Scanner scan = new Scanner(System.in);
	int radius;
	float area;
	System.out.println("enter radius");
	radius = scan.nextInt();
	area = 3.14f*radius*radius ;
	System.out.println("area of circumference= "+area);
}
}