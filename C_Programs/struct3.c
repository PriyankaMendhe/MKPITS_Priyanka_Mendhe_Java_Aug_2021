//3- create a structure employee with members empno,empname,designation and salary.
struct employee
{
	int empno;
	char empname[20];
	char designation[30];
	float salary;
};
#include<stdio.h>
#include<string.h>
int main()
{
	struct employee e1;
	e1.empno = 50;
	strcpy(e1.empname," Priyanka Mendhe");
	strcpy(e1.designation," Asst. Marketing Manager");
	e1.salary=20000.0f;
	 
	
	printf("\n.....Employee Details as below.........\n");
	printf("\n Employee No= %d",e1.empno);
	printf("\n Name=%s",e1.empname);
	printf("\n Designation=%s",e1.designation);
	printf("\n Salary= %.2f",e1.salary);
	 
}
