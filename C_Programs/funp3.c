//Write a c program to check whether a given number is a perfect number or not.																							
//	Input the number : 56																							
//	Expected Output :																							
//	The positive divisor : 1 2 4 7 8 14 28																							
//	The sum of the divisor is : 64																							
//	So, the number is not perfect.		
//
int main()
{
	int n;
	printf("\n Input the number : ");
	scanf("%d",&n);
	calculate_perfectno(n);
}

void calculate_perfectno(int n)
{
	int i,divisor,sum=0;
	printf(" The positive divisor : ");
	for(i=n;i>=2;i--)
	{
		if(n%i==0)
		{
			divisor=n/i;
			printf("\t%d",divisor );
			sum=sum+divisor;
		}
		     	
	}
	printf("\n The sum of the divisor is : %d",sum);
	
	if(sum==n)
	{
		printf("\n the number is perfect.");
	}
	else
	{
		printf("\n the number is not perfect.");
		
	}
	return 0;
}																
