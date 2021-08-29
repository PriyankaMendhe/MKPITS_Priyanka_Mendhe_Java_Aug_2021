//3- create a program to accept 10 subject marks in array and then pass this array to function calculate_result 
#include<stdio.h>
int main()
{
	int arr_m[10],i;
	for(i=0;i<10;i++)
	{
		printf("Enter subject %d marks..",i);
		scanf("%d",&arr_m[i]);
	}
	calculate_result(arr_m);
}
int calculate_result(int arr_m[])
{
	int i, total=0;
	float per;
  for(i=0;i<10;i++)
	{
		total=total+arr_m[i];
	}
	printf("\nTotal of 10 subject is %d",total);
	per = (float) (total/1000.0f) * 100.0f;
	printf("\nPercentage  is %f",per);
	if(per>75)
	{
		printf(" \nGrade A+");
	}else if(per>=60 && per<75)
	{
		printf(" \nGrade A");
	}else if(per>=50&&per<60)
	{
		printf("\nGrade B");
	}else if(per>=35&&per<50)
	{
		printf("\nGrade C");
	}else
	{
		printf("\nFAIL!!");
	}
	
}
