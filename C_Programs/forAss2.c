//12- wap to print fabonachii series using for loop.
#include<stdio.h>
int main()
{
	int a=0 ,b=1,c, i ,n;
	printf("Enter the no. elements u want in series..");
	scanf("%d",&n);
	printf("\nfabonachii series..");
	for(i=1;i<=n;i++)
	{
		printf("\t%d",a);
		
		c=a+b;
		a=b;
		b=c;
	}
}
