//13 wap to accept salary of 10 persons using while loop and print totalsalary and average salary.
#include<stdio.h>
int main()
{
	int i, salary, total_sal=0;
	float avg_sal;
	for(i=1;i<=10;i++)
	{
		printf("Enter Salary of [%d]st person:",i);
		scanf("%d",&salary);
		total_sal=total_sal+salary;
		
	}
	printf("\nTotal Salary of 10 person is: %d",total_sal);
	avg_sal= (float) total_sal/10;
	printf("\nAvarage Salary of 10 person is: %.2f",avg_sal);
	
}
