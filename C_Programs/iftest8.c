//-Write a C program to read roll no, name and marks of three subjects and calculate the total, percentage and division.
#include<stdio.h>
int main()
{
	int roll_no , marks1, marks2, marks3, total;
	char name;
	float percentage;
	printf("\n Enter your roll no..");
	scanf("%d",&roll_no);
	printf("Enter three subject marks");
	scanf("%d%d%d",&marks1,&marks2,&marks3);
	total = marks1+marks2+marks3;
	percentage = (float) total * 100/300 ;
	printf("\nTotal marks obtained=%d",total);
	printf("\n Percentage = %.2f",percentage);
	if(percentage>=75&&percentage<=100)
	{
		printf("\n You got distinction");
	}
	else
	{
		if(percentage>=60 && percentage<75)
		{
			printf("\n You got First Division..");
		}
		else
		{
			if( percentage>=50 && percentage<60)
			{
				printf("\n You got second Division..");
				
			}
			else
			{
				if( percentage>=35 && percentage<50)
				{
					printf("\n You got third Division..");
					
				}
				else
				{
					printf("\n You are Fail..");
				}
				
			}
		}
	}
}
