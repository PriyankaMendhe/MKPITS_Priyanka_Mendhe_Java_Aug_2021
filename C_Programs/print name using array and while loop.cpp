//wap to accept a no. and print table of the no.
#include<stdio.h>
int main()
{
    int num,i=0,result;
	printf("enter number");
	scanf("%d",&num);
	while(i<=10)
	{
		result=num*i;
		printf("%d*%d=%d",num,i,result);
		
		i++;
	}
	
	return 0;

}
