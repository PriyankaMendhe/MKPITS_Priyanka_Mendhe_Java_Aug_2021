//15 - create a structure array to produce result of student.
//create a structure student with members rno,name and address , pass this structure to function 
//display to display structure values
struct student
{
	int rno;
	char name[20]; 
	char address[20];
	int marks1;
	int marks2;
	int marks3;
	 
};
void display_result(struct student s1);
#include<stdio.h>
int main()
{
	struct student s1[3];
	int i=0;
	while(i<3)
	{
	
	printf("\nEnter roll no>>");
	scanf("%d",&s1[i].rno);
	printf("Enter Name of student>>");
	fflush(stdin);
	gets(s1[i].name);
	printf("Enter Address of student>>");
	fflush(stdin);
	gets(s1[i].address);
	printf("Enter marks 1>>");
	scanf("%d",&s1[i].marks1);
	printf("Enter marks 2>>");
	scanf("%d",&s1[i].marks2);
	printf("Enter marks 3>>");
	scanf("%d",&s1[i].marks3);
	printf("\n.....Student Details as below.........\n");
	display_result(s1[i]);
	printf("\n------------------------------------------\n");
	i++;
    }
}
void display_result(struct student s)
{
	
	int total;
	float per;
	
	printf("\n Roll No= %d",s.rno);
	printf("\n Name=%s",s.name);
	printf("\n Address= %s",s.address);
	total=s.marks1+s.marks2+s.marks3;
	printf("\n Total of 3 subject=%d",total);
	per = (float)(total/300.0f)*100.0f;
	printf("\n percentage=%.2f",per);
	if(per>=75)
	{
		printf("\n Grade A+");
	}else if(per>=60&&per<75)
	{
		printf("\n Grade = A");
	}else if(per>=50&&per<60)
	{
		printf("\n Grade = B");
		
	}else if(per>=35&&per<50)
	{
		printf("\n Grade = C");
	}else
	{
		printf("\n Fail!!!");
	}
	
	
	
}
