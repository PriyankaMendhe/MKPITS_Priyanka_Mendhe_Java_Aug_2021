#include<stdio.h>
int main()
{
	int i=1,b=1,a=0,c, no;
	printf("enter the no.of element you want im series");
	scanf("%d",&no);
	while(i<=no)
	{
		printf("\n%d",a);
		
		c=a+b;
		a=b;
		b=c;
		i++;
	}
	return 0;
}
