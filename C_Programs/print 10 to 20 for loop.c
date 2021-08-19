//wap to accept no. and print factorial of no. using for loop
#include<stdio.h>
int main()
{
	int i, fact,num;
	printf("enter no");
	scanf("%d",&num);
	for(i=num;i>0;i--)
	{
		fact=fact*i;
	}
	
	printf("factorial =%d",fact);
}
