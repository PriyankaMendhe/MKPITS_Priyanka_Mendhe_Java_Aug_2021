//6 - create a struture employee with members empid, empname , designation , salary
//accept the values from the user to store employee record in structure.
//then display. 
struct employee
{
	int empid;
	char empname[20];
	char designation[30];
	float salary;
};
#include<stdio.h>
#include<string.h>
int main()
{
	struct employee e1;
	printf("\n Enter employee id>>");
	scanf("%d",&e1.empid);
	printf("\n Enter employee name>>");
	fflush(stdin);
	gets(e1.empname);
	printf("\n Enter Employee Designation>>");
	fflush(stdin);
	gets(e1.designation);
	printf("\n Enter Salary>>");
	scanf("%f",&e1.salary);
	
	printf("\n Employee id=%d",e1.empid);
	printf("\n Employee name=%s",e1.empname);
	printf("\n Employee Designation=%s",e1.designation);
	printf("\n Salary=%.2f",e1.salary);
}

