//27	create a function to calculate area and circ. of a circle.		
//area 3.14 * r *r;
//circ 2 * 3.14 * 3;

#include<stdio.h>
int main()
{
	int radius;
	printf("\nEnter radius of circle..");
	scanf("%d",&radius);
	area_circle(radius);
	area_circumference(radius);
	
}
void area_circle(int radius) 
{
	float area;
	area = (float)  3.14f * radius * radius ;
	printf("\n Area Of Circle = %.2f",area);
}
void area_circumference(int radius) 
{
	float area_circum;
	area_circum = (float)  3.14f * 2 * radius ;
	printf("\n Area Of Circumference = %.2f",area_circum);
}

