//5 	wap to print greater of 3 no.	
int main()
{
	int n1,n2,n3;
	printf("\n Input the number n1,n2 and n3: ");
	scanf("%d%d%d",&n1,&n2,&n3);
	calculate_greaterno(n1,n2,n3);
}

void calculate_greaterno(int n1, int n2,int n3)
{
	if(n1>n2&&n1>n3)
	{
		printf("   %d is greater than %d & %d  ",n1,n2,n3);
	}
	else if(n2>n3)
	{
		
		printf("   %d is greater than %d & %d ",n2,n1,n3);
		
	}
	else
	{
		printf("   %d is greater than %d & %d ",n3,n1,n2);
		
	}
	return 0;
}		
