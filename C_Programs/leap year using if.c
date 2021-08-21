#include<stdio.h>
int main()
{
	int leap_year;
	printf("enter a year");
	scanf("%d",&leap_year);
	if(leap_year%400==0)
	{
		printf("\nyear is leap year");
	}
	{
		if(leap_year%100==0)
		{
			printf("it is not leap year");
		}
		else
		{
			if(leap_year%4==0)
			{
				printf("year is leap year");
			}
			printf("it is not leap year");
			
		}
	}
	return 0;
}
