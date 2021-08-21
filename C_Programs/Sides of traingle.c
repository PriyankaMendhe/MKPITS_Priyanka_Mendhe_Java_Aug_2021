//C program to check whether the triangle is valid or not if sides are given
// addition of 2 sides of triangle always greater than 3rd side(logic)
#include<stdio.h>
int main()
{
	int s1, s2, s3;
	printf("enter 3 sides of triangle");
	scanf("%d%d%d",&s1,&s2,&s3);
	
	if( s1+s2 >s3 && s1+s3>s2 && s3+s2>s1)
	{
		printf("\nTriangle is valid");
	}
	else
	{
			printf("Triangle is not valid");
	}
}
