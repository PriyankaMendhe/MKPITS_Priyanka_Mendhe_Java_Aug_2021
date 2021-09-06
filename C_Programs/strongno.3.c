////strong no. or not between 1 to 50000

#include<stdio.h>
int main()
{    
    int i;
	int num ;
	int originalnum ;
	int rem,sum=0,f ;

for (i= 1   ; i<=50000 ; i++)
{
	sum=0;
	num = i;
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

