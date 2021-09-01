//6	wap to accept 3 subject marks and print total,per and grade.
int main()
{
	int marks1,marks2,marks3;
	printf("\n Input 3 subject marks: ");
	scanf("%d%d%d",&marks1,&marks2,&marks3);
	calculate_result(marks1,marks2,marks3);
}

void calculate_result(int marks1, int marks2, int marks3)
{
	int total=0;
	float per;
	total = marks1+ marks2 + marks3;
	printf("\n Total =%d",total);
	per = (float) (total / 300.0f) * 100.0f;
	printf("\n Percentage = %f",per);
	if(per>=75)
	{
		printf("\nGrade = A+");
		
	}
	else if(per>=60 && per<75)
	{
		printf("\nGrade = A");
	}else if( per >=50&& per <60)
	{
		printf("\nGrade = B");
	}else if(per>=35 && per<50)
	{
		printf("\nGrade = C");
	}else
	{
		printf("\nSorry!! You are fail");
	}

	return 0;
}		
