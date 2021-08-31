//2 -create a struture student with members rno,name,course, address,mobileno
struct student
{
	int rno;
	char name[20];
	char course[20];
	char address[20];
	char mobileno[30];
};
#include<stdio.h>
#include<string.h>
int main()
{
	struct student s1;
	s1.rno = 50;
	strcpy(s1.name," Priyanka Mendhe");
	strcpy(s1.course," BE in CSE");
	strcpy(s1.address,"Mankapur,Nagpur.");
	strcpy(s1.mobileno,"+91 - 9579080579");//take mobile no as string bcoz it has country code ,hyphen
	
	printf("\n.....Student Details as below.........\n");
	printf("\n Roll No= %d",s1.rno);
	printf("\n Name=%s",s1.name);
	printf("\n Course=%s",s1.course);
	printf("\n Address= %s",s1.address);
	printf("\n Mobile No.=%s",s1.mobileno);
}
