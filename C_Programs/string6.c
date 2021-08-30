//6 wap to accept empno,firstname , lastname, designation and salary of the employee and display it.
#include<stdio.h>
int main()
{
	int empno,salary;
	char first_name [20], last_name[20], designation[10];
	puts("\nenter your emp_no.:");
		 
	scanf("%d",&empno);//better for integer value scanf
	puts("\nenter your first name:");
	fflush(stdin);
	gets(first_name);
	puts("\nenter your last name");
	fflush(stdin);
	gets(last_name);//best for string
	puts("\nEnter your designation:");
	fflush(stdin);
	gets(designation);
	puts("\nEnter your Salary:");
	scanf("%d",&salary);//
	
	puts("\nEmployee details as below");
    printf("\n Emp id is %d",empno);
     printf("\n Emp first name is %s",first_name);
      printf("\n Emp last name is %s",last_name);
       printf("\n Emp desigantion is %s",designation);
        printf("\n Emp salary  is %d",salary);
    
}
