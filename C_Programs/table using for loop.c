//7 - wap to accept a no. and print table of that no. using for loop.
#include<stdio.h>
int main()
{
	int i,num,result;
	printf("Enter no. for table");
	scanf("%d",&num);
		for(i=1;i<=10;i++)
	{
		result=num*i;
		printf("\n%d * %d = %d",num,i,result);
	}
}
