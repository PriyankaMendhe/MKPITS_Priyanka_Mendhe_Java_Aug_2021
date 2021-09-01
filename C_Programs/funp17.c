//17	wap to create a function substraction which return substraction of two numbers
#include<stdio.h>
int main()
{
	int n1,n2,substract;
	printf("\n Enter 2 no.");
	scanf("%d%d",&n1,&n2);
	substract = sub(n1,n2);
	printf("\n substraction of 2 no is = %d",substract);
}
int sub(int n1, int n2)
{
	int sub=0;
	sub=n1-n2;
	return sub;
}
