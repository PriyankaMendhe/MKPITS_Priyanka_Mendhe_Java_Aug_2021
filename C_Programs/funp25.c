//26	create a function to caluclate area of a rectangle.		= length * width
#include<stdio.h>
int main()
{
	int length , width;
	printf("Enter length , width of Rectangle..");
	scanf("%d%d",&length,&width);
	area_triangle(length , width);
	
}
void area_triangle(int l, int w)
{
	float area;
	area = (float)  l * w ;
	printf(" Area Of Rectangle = %.2f",area);
}
