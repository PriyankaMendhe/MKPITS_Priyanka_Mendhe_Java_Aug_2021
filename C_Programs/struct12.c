//11- wap to create a structure array of 3 elements of structure student
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
	struct student s[3];
	int i=0;
	while(i<3)
	{
	
	printf("\nEnter roll no>>");
	scanf("%d",&s[i].rno);
	printf("Enter Name of student>>");
	fflush(stdin);
	gets(s[i].name);
	printf("Enter course>>");
	fflush(stdin);
	gets(s[i].course);
	printf("Enter Address of student>>");
	fflush(stdin);
	gets(s[i].address);
	printf("Enter Mobile no. including country code >>");
	fflush(stdin);
	gets(s[i].mobileno);
	printf("\n.....Student Details as below.........\n");
	display(s[i]);
	
    } 
}
	
	void display(struct student s)
{
	printf("\n Roll No= %d",s.rno);
	printf("\n Name=%s",s.name);
	printf("\n Course=%s",s.course);
	printf("\n Address= %s",s.address);
	printf("\n Mobile No.=%s",s.mobileno);
}
