//24	create a function to print table of a number.	

#include<stdio.h>
int main()
{
	int n;
	char ans;
	printf("\n Input the number : ");
	scanf("%d",&n);
	print_table(n);
	 
}
void print_table(int num)
{
	int i;
	for(i=1;i<=10;i++)
	{
		printf("\n%d * %d = %d ",num,i, (num*i));
	}
}
