//29	Write a C program to check whether a given number is an armstrong number or not.																							
//	Input a number: 153																							
//	Expected Output :																							
//	153 is an Armstrong number.

int main()
{
	int n;
	printf("\n Input number : ");
	scanf("%d",&n);
	armstrong(n);
}
void armstrong(int n)
{
	int r , c, sum = 0,temp;
	temp=n;
	while(n>0)
	{
		r=n%10;
		c= r *r *r;
		sum = sum + c;
		n=n/10;
	}
	n=temp;
	if(n==sum)
	{
		printf("%d is an Armstrong number. ",n);
	}
	else
	{
		printf("%d is not an Armstrong number. ",n);
	}
	
}
