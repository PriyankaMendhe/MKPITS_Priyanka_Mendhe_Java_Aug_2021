//wap to accept a no. and print table of the no.
#include<stdio.h>
int main()
{
    int num,i=1,result;
	printf("enter number");
	scanf("%d",&num);
	printf("multiplication table for %d",num);
	while(i<=10)
	{
		result=num*i;
		printf("\n%d*%d=%d",num,i,result);
		
		i++;
	}
	
	return 0;

}
