//Check whether the triangle is equilateral, scalene, or isosceles......
//Isosceles triangle: In geometry, an isosceles triangle is a triangle that has two sides of equal length.
//equilateral triangle: In geometry, an equilateral triangle is a triangle in which all three sides are equal.
//Scalene triangle: A scalene triangle is a triangle that has three unequal sides.

#include<stdio.h>
int main()
{
	int s1,s2,s3;
	printf("\nEnter three sides of triangle :");
	scanf("\t%d%d%d",&s1,&s2,&s3);
	if(s1==s2 && s1==s3)
	{
		printf("equilateral triangle");
	}
	else
	{
		if(s1==s2 || s2==s3 ||s1==s3)
		{
			printf("Isosceles triangle");
		}
		else
		{
		        printf("Scalene triangle");	
		}
	}
	return 0;
}
