#include<stdio.h>
int main()
{
	int y;
	printf("\nenter year of 21st century to check leap year");
	scanf("%d",&y);
	if(y%4==0||y%400==0)
	{
		printf("The year is a leap year (it has 366 days).");
	}
	else
	{
		if(y%100==0)
		{
			printf("The year is not a leap year (it has 365 days).");
			 
		}
		
		printf("The year is not a leap year (it has 365 days).");
		
	}
	
	return 0;
}
