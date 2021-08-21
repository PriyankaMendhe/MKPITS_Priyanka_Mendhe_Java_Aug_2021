//
int main()
{
	int i,num;
	printf("enter no.");
	scanf("%d",&num);
	for(i=2;i<=num;i++)
	{
		if(num% i==0)
		{
			printf("\nno. is not prime");
			break;
		}
	}
	if(num==i)
	{
		printf("\n no is prime");
	}
	return 0;
}

