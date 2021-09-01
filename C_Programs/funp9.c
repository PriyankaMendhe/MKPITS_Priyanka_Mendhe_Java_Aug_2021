//9	wap to accept empname and designation and salary calculate bonus
//m-manager , p-peon . c=clerk
#include<stdio.h>
int main()
{
	int salary,bonus=0;
	char empname[20];
	char desg;
	printf("Input Employee Name :");
	gets(empname);
	printf("Input Employee Designation as m, p, c :");
	fflush(stdin);
	scanf("%c",&desg);
	printf("\n Input  Salary : ");
	scanf("%d",&salary);
	printf("\n -----Employee Details are -----\n");
    printf("\nEmployee Name = %s",empname);
    printf("\nEmployee Salary = %d",salary);
    calculate_bonus(desg);
}
void calculate_bonus(char desg)
{
	int bonus=0;
	if(desg=='m')
	{
		bonus=1000;
		printf("\nEmployee Bonus = %d",bonus);
	}else if( desg=='c')
	{
		bonus = 500;
		printf("\nEmployee Bonus = %d",bonus);
	}else if (desg=='p')
	{
		bonus = 100;
		printf("\nEmployee Bonus = %d",bonus);
	}
	
	return  0;
}	
