//11 - wap to accept a number and print from number entered by the user to 1 
#include<stdio.h>
int main()
{
	int num,i=1;
	printf("enter no.");
	scanf("%d",&num);
	while(i<=num)
	{
		printf("\n%d",num);
		num--;
	}
}

