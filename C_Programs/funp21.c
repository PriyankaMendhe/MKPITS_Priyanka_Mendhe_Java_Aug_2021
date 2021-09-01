//21	create a function to check whether no is even or odd.		
#include<stdio.h>
int main()
{
	int num;
	printf("Enter no..");
	scanf("%d",&num);
	check_evenodd(num);
}
void check_evenodd(int num)
{
	if(num%2==0)
	{
		printf("\n No. is even no");
	}
	else
	{
		printf("\n no. is odd no.");
	}
}
