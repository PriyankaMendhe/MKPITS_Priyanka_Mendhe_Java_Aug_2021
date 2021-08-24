//10 - wap to create function calarea with one int parameter to accept radius
//calculate and display area and circ of circle.
#include<stdio.h>
calculate_area( int r)
{
	float area, cir_circle;
	area= (float) 3.14 * r * r ;
	printf(" \narea of circle = %.2f",area);
	cir_circle= (float) 2 * 3.14f * r ;
	printf(" \ncircumference of circle = %.2f",cir_circle);
	
	
}
int main()
{
	int radius;
	printf("\nEnter the radius..");
	scanf("%d",&radius);
	calculate_area(radius);
	printf("\n exit from main");
	
}

