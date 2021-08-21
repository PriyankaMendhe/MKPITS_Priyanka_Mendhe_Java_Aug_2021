//4- Write a C program to find whether a given year is a leap year or not.
#include<stdio.h>
int main()
{
	int year;
	printf("Enter a year...");
	scanf("%d",&year);
	if((year%4==0) || (year%400==00))
	{
		printf("%d year is leap Year...it has 366 days",year);
	}
	else
	{
		if(year%100==0)
		{
			printf("%d year is not leap Year...it has 365 days",year);
		}
		printf("%d year is not leap Year...it has 365 days",year);
	}
}
