 // 11 - wap to accept a no. and then print whether it is prime no. or not.
 
#include<stdio.h>
int main()
{
	int num;
	printf("enter the no.");
	scanf("%d",&num);
	while(num%2!=0&&num%num==0)
	{
		printf("entered no is prime no. %d",num);
		
	}
	
	printf("entered no is not a prime no. %d",num);
	
}
