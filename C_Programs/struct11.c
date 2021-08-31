//10 - repeat the above program by creating 2 structure variables stud1 and stud2
//create a structure student with members rno,name and address , pass this structure to function 
//display to display structure values
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
	struct student s1,s2;
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
	
	printf("\nEnter roll no>>");
	scanf("%d",&s2.rno);
	printf("Enter Name of student>>");
	fflush(stdin);
	gets(s2.name);
	printf("Enter course>>");
	fflush(stdin);
	gets(s2.course);
	printf("Enter Address of student>>");
	fflush(stdin);
	gets(s2.address);
	printf("Enter Mobile no. including country code >>");
	fflush(stdin);
	gets(s2.mobileno);
	printf("\n.....Student Details as below.........\n");
	display(s2);
}
	
	void display(struct student s)
{
	
	
	
	printf("\n Roll No= %d",s.rno);
	printf("\n Name=%s",s.name);
	printf("\n Course=%s",s.course);
	printf("\n Address= %s",s.address);
	printf("\n Mobile No.=%s",s.mobileno);
}
