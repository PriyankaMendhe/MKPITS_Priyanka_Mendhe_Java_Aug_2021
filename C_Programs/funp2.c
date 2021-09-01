//2 	Write a program in C to display the n terms of square natural number and their sum.																							
//	1 4 9 16 ... n Terms																							
//	Test Data :																							
//	Input the number of terms : 5																							
//	Expected Output :																							
//	The square natural upto 5 terms are :1 4 9 16 25																							
//	The Sum of Square Natural Number upto 5 terms = 55			

int main()
{
	int n;
	printf("\n Input number of terms : ");
	scanf("%d",&n);
	calculate_evenno(n);
}

void calculate_evenno(int n)
{
	int i,sq,sum=0;
	printf(" The square natural upto 5 terms are : ");
	for(i=1;i<=n;i++)
	{
		    sq=i*i;  
			printf("\t%d",sq);
			sum=sum+sq;
			  
		
	}
	printf("\n The Sum of Square Natural Number upto 5 terms = %d",sum);
	return 0;
}									
