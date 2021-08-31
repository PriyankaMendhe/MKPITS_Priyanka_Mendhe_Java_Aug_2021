//passing structure to function
//9 - create a structure student with members rno,name and address ,
// pass this structure to function display to display structure values
struct student
{
	int rno;
	char name[20];
	char course[20];
	char address[20];
	char mobileno[30];
};
void display(struct student s1);
#include<stdio.h>
 
int main()
{
	struct student s1;
	printf("Enter roll no>>");
	scanf("%d",&s1.rno);
	printf("Enter Name of student>>");
	fflush(stdin);
	gets(s1.name);
	printf("Enter course>>");
	fflush(stdin);
	gets(s1.course);
	printf("Enter Address of student>>");
	fflush(stdin);
	gets(s1.address);
	printf("Enter Mobile no. including country code >>");
	fflush(stdin);
	gets(s1.mobileno);
	printf("\n.....Student Details as below.........\n");
	display(s1);
}
	
	void display(struct student s1)
{
	
	
	
	printf("\n Roll No= %d",s1.rno);
	printf("\n Name=%s",s1.name);
	printf("\n Course=%s",s1.course);
	printf("\n Address= %s",s1.address);
	printf("\n Mobile No.=%s",s1.mobileno);
}
