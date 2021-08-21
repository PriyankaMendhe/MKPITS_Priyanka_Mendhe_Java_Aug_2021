//C program to check the sign of a given number
#include<stdio.h>
int main()
{
	int num,sign=0;
	printf(" enter the no.");
	scanf("%d",&num);
	sign = (num>0) - (num< 0);
	if(sign==1)
	{
		printf("no is positive");
	}
	else
	{
		if(sign==-1)
		{
			printf("no. is negative");
		}
		else
		{
			if(sign==0)
			{
				printf("no. is zero");
			}
		}
	}
	return 0;
}
