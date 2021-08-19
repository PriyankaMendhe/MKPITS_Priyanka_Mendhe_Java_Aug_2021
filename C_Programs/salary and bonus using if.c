//wap to accept basicsalary and designation like 'm' for manager ,
//'c' for clerk and 'p' for peon
//and then calculate bonus=45% of basicsalary for 'm', bonus=35% of basicsalary for 'c', bonus=15% of basic salary  for 'p'
//and display basicsalary,bonus and totalsalary 
#include<stdio.h>
int main()
{
	int basic_sal;
	char desg;
	float bonus=0,total;
	printf("enter your basic salary");
	scanf("%d",&basic_sal);
	printf("Enter your designation");
	fflush(stdin);
	scanf("%c",&desg);
	if(desg=='m')
	{
		bonus= (float) basic_sal * 0.45;
		
	}
	else
	{
	    if(desg=='p')
		{
			
				bonus= (float) basic_sal * 0.15;
			
	    }	
	    else
	    {
	    	if(desg=='c')
	    	{
	    			bonus= (float) basic_sal * 0.35;
			}
			else
			{
				printf("invalid input");
			}
		}
	}
	total=basic_sal+bonus;
	printf("\nBasic Salary=%d",basic_sal);
	printf("\n Bonus =%.2f",bonus);
	printf("\nTotal Salary=%.2f",total);
	
	
	return 0;
}
