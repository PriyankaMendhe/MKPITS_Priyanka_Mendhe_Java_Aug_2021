//10 - wap to accept a number and print from 1 to the number entered by the user
#include<stdio.h>
int main()
{
	int num,i=1;
	printf("enter no.");
	scanf("%d",&num);
	while(i<=num)
	{
		printf("\n%d",i);
		i++;
	}
}


