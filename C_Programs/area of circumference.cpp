#include<stdio.h>
int main()
{
	int radius;
	float area;
	printf("enter radius");
	scanf("%d",&radius);
	area = 3.14f*radius*radius ;
	printf("area of circumference=%f",area);
}
