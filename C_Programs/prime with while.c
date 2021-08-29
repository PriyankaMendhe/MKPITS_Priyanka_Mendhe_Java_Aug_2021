#include<stdio.h>
int main()
{
	int i=1,num,count=0;
	printf("Enter the no..");
	scanf("%d",&num);
	while(i<=num)
	{
		if(num%i==0)
		{
        count++;
			
		}
		i++;
		
	}
	if(count==2)
	{
		printf("%d is a prime no.",num);
	}
	else
	{
		
		printf("%d is not a prime no.",num);
	}
}
