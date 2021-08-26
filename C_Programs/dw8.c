//9 - wap to accept 5 subject marks using  while loop and print the sum of 5 subjects.
//and percentage and print grade 
int main()
{
	int sub_marks,sum=0,i=1;
	float per;
	do{
		printf("\nEnter subject marks.. ");
		scanf("%d",&sub_marks);
		sum = sum + sub_marks;
		i++;	
	}while(i<=5);
	
	printf("\nSum of 5 subject is = %d",sum);
	per = (float) (sum/500.f ) * 100.f ;
	printf("\nPercentage= %.2f",per);
	if(per>=75)
	{
		printf("\n Grade = Distinction");
		
	}else if ( per>=60 && per<75)
	{
		printf("\n Grade = A");
	}else if( per>=50 && per<60)
	{
		printf("\n Grade =  B");
	}else if( per >=35 && per<50)
	{
		printf("\n Grade =  C");
	}else
	{
		printf("\n Grade = fail");
	}
	return 0;
}

