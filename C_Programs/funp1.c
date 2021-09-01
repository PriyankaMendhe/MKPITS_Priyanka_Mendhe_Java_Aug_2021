//1- Write a program in C to display the n terms of even natural number and their sum																							
//	for eg																							
//	Input number of terms : 5																							
//	Expected Output :																							
//	The even numbers are :2 4 6 8 10																							
//	The Sum of even Natural Number upto 5 terms : 30
#include<stdio.h>
int main()
{
	int n;
	printf("\n Input number of terms : ");
	scanf("%d",&n);
	calculate_evenno(n);
}

void calculate_evenno(int n)
{
	int i,j=2,sum=0;
	printf(" The even numbers are : ");
	for(i=1;i<=n;i++)
	{
		 
			printf("\t%d",j);
			sum=sum+j;
			j=j+2;
		
	}
	printf("\n The Sum of even Natural Number upto 5 terms : %d",sum);
	return 0;
}
