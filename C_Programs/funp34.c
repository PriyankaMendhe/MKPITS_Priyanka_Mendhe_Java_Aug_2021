//35	Write a program in C to find the number and sum of all integer between 100 and 200 which are divisible by 9.																							
//	Numbers between 100 and 200, divisible by 9 :																					
//	108 117 126 135 144 153 162 171 180 189 198																							
//	The sum : 1683	
#include<stdio.h>
int main()
{
	int i, sum = 0;
	printf("Numbers between 100 and 200, divisible by 9 :");
	for(i=100;i<=200;i++)
	{
		if(i%9==0)
		{
			printf("\t %d",i);
			sum= sum + i;
		}
	}
	printf("\n The sum : %d",sum);
}
