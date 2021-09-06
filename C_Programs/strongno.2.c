//strong no. or not accept no from user

#include<stdio.h>
int main()
{
	int num ;
	int originalnum ;
	int rem,sum=0,f ;

	printf("\nEnter no. to check strong no..");
	scanf("%d",&num);
	originalnum=num;
	
	while(num!=0)
	{
		rem = num%10;
		num= num/10;
		f = factorial(rem);
		sum = sum + f;
	}
	if(sum==originalnum)
	{
		printf("\n %d is a strong no. ",originalnum);
	}
	else
	{
		printf("\n %d is not a strong no. ",originalnum);
	}
}
int factorial(int r)
{
	int fact=1;
	while(r > 0)
	{
		fact = fact * r;
		r--;
	}
	return fact;
}

