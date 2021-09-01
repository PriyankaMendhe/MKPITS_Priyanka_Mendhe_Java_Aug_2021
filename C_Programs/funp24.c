//25	create a function to calculate area of traingle=1/2 * base * height;	
#include<stdio.h>
int main()
{
	int base,height;
	printf("Enter base & height of triangle..");
	scanf("%d%d",&base,&height);
	area_triangle(base,height);
	
}
void area_triangle(int b, int h)
{
	float area;
	area = (float) 0.5f * b *h ;
	printf(" Area Of triangle = %.2f",area);
}
