//16	wap to create a function sample which return a int value.
#include<stdio.h>
int main()
{
	int n1,n2,addition;
	printf("\n Enter 2 no.");
	scanf("%d%d",&n1,&n2);
	addition = add(n1,n2);
	printf("\nAddition of 2 no is = %d",addition);
}
int add(int n1, int n2)
{
	int sum=0;
	sum=n1+n2;
	return sum;
}
