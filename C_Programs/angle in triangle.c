//C program to check whether the triangle is valid or not if angles are given
//sum of tiangle is 180 it is valid with angle is != 0
#include<stdio.h>
int main()
{
	int a1, a2, a3,sum=0;
	printf(" enter 3 angles");
	scanf("%d%d%d",&a1,&a2,&a3);
	sum=a1+a2+a3;
	if(sum==180&& (a1!= 0 && a2!=0 && a3!=0))
	{
		printf("Triangle is Valid");
	}
	else
	{
			printf("Triangle is not Valid");
	}
	
	printf("\nSum=%d",sum);
	return 0;
	
}
