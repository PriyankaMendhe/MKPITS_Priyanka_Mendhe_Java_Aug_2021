//6 - wap to create a function sum with 2 int parameters and write code in it to add and display the addition of 2 no.
#include<stdio.h>
void sum (int n1 , int n2)
{
	int sum ;
	sum = n1+n2;
	printf("sum of no.= %d",sum);
}
int main()
{
	int n1=8,n2=5;
	sum(n1,n2);
	printf("end");
	
}
