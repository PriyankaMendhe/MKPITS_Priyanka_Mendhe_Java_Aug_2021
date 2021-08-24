//9 - wap to create function result with 3 int parameters to accept 3 subject marks
//calculate and display total, percentage and grade.
#include<stdio.h>
void result(int sub1, int sub2, int sub3)
{
	int total;
	float per;
	total= sub1+sub2+sub3;
	per = (float) (total/300.0f) * 100.0f ;
	printf("\nTotal of 3 subject is : %d",total);
	printf("\nPercentage is : %.2f",per);
	if(per>75)
	{
		printf("\nGrade = Distinction");
	}
	else if( per>=60 && per<75)
	{
		printf("\nGrade = First");
	}
	else if ( per>=50 && per<60)
	{
		printf("\nGrade = Second");
	}
	else if ( per>=35 && per<50)
	{
		printf("\nGrade = Third");
	}
	else if( per<35)
    {
	    printf("\n Sorry!! Fail..");
	}	
}
int main()
{
	int s1,s2,s3;
	printf("\nEnter 3 subject marks..");
	scanf("%d%d%d",&s1,&s2,&s3);
	result( s1, s2, s3);
	printf("\nExit from main");
	
}

