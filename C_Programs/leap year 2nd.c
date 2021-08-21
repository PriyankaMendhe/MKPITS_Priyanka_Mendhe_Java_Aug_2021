//To determine whether a year is a leap year, follow these steps:
//if year not divisible by 100 go to next
//if year evenly divisilbe by 4 or 400 
//The year is a leap year (it has 366 days).
//else
//The year is not a leap year (it has 365 days).

#include<stdio.h>
int main()
{
	int y;
	printf("enter a year");
	scanf("%d",&y);
	
		if(y%100==0)
		{
			printf("The year is not a leap year (it has 365 days).");
		}
		else
		{
			if(y%400==0||y%4==0)
			{
				printf("The year is a leap year (it has 366 days).");
			}
			else
			{
				printf("The year is not a leap year (it has 365 days).");
			}
		}
	
	
	
	return 0;
}
