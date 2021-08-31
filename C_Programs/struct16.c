 //16 - create a structure to product employee salary statement.
// on  isplay to display structure values
 struct employee
{
	int empno;
	char empname[20];
	char designation[30];
	float salary;
};
#include<stdio.h>
int main()
{
	struct employee e1[3];
	int i=0;
	while(i<3)
	{
	printf("\n Enter employee id>>");
	scanf("%d",&e1[i].empno);
	printf("\n Enter employee name>>");
	fflush(stdin);
	gets(e1[i].empname);
	printf("\n Enter Employee Designation>>");
	fflush(stdin);
	gets(e1[i].designation);
	printf("\n Enter Salary>>");
	scanf("%f",&e1[i].salary);
	printf("\n----------salary Details----------------\n");
	display_salary(e1);
	i++;
	}		
}
void display_salary(struct employee e1)
{
	float hra,da,gross_salary;
	//hra 15% salary
	//da 35% of salary
	printf("\n Emp id>>%d",e1.empno);
	printf("\n Employee Name >> %s",e1.empname);
	printf("\nSalary=%f",e1.salary);
	hra = (float) (e1.salary * 0.15f);
	da=(float) (e1.salary * 0.35f);
	gross_salary= e1.salary + hra +da;
	printf("\n Gross Salary=%f",gross_salary);
	printf("\n------------------------------\n");
	
	
}
