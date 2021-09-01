//4 	wap to print greater of 2 no.	

int main()
{
	int n1,n2;
	printf("\n Input the number n1 and n2: ");
	scanf("%d%d",&n1,&n2);
	calculate_greaterno(n1,n2);
}

void calculate_greaterno(int n1, int n2)
{
	if(n1>n2)
	{
		printf("   %d is greater than %d ",n1,n2);
	}
	else
	{
		
		printf("   %d is greater than %d ",n2,n1);
		
	}
	return 0;
}		
