//16-wap to create 3 functions
//1- caltotal , calpercentage and display grade 
//accept 3 subject marks and display the result
#include<stdio.h>
float calpercentage( int total);
void display_grade( float per);
int main()
{
	int sub1, sub2,sub3,total;
	float percentage;
	printf("\nEnter 3 subject nmarks..");
	scanf("%d%d%d",&sub1,&sub2,&sub3);
	total = caltotal(sub1,sub2,sub3);
	printf("\nTotal = %d",total);
	percentage = calpercentage(total);
	printf("\nPercenatge= %.2f",percentage);
    display_grade(percentage);
	 
	
	
}
int caltotal(int s1, int s2, int s3)
{
	int total;
	total=s1+s2+s3;
	return total;
	
}
float calpercentage( int total)
{
	float percentage;
   percentage = (float) (total /300.f) * 100.f;
   return percentage;
	
}
void display_grade( float per)
{
	
	if(per>=75)
	{
		printf("\nGrade A+");
	}
	else if(per>=60 && per<75)
	{
		printf("\nGrade A");
	}
	else if(per>=50 && per<60)
	{
		printf("\nGrade B");
	}
	else if( per>=35 && per<50)
	{
		printf("\nGrade C");
	}
	else
	{
		printf("\nFAIL....");
	}
	
}
