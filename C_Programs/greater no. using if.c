 /* wap to accept 5 subject marks then calculate total , percentage and grade.*/
#include<stdio.h>
#include<conio.h>
int main()
{
	int s1, s2, s3,s4,s5,total;
	float percentage;
	printf("Enter 5 subject marks");
	scanf("%d%d%d%d%d",&s1,&s2,&s3,&s4,&s5);
    total= s1+s2+s3+s4+s5;
	printf("\nyour total marks are %d", total);
	percentage= total * (100.0f / 500.0f);
	printf("\nyour percenatge is %f", percentage);
	if(percentage>=75)
	{
		printf(" \nyou passed with distinction");
	}
	else
	{
		if(percentage<75&&percentage>=60)
		{
		  	printf("\nyou passed with first class");	
		}
		else
		{
			if(percentage<60&&percentage>=35)
			{
				printf("\nyou passed with second class");
			}
			else
			{
				printf("\nyou  are fail!!");
			}
			
				
		}
		
	}
return 0;		
}

