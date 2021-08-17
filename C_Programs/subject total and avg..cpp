#include<stdio.h>
int main()
{
	int sub1,sub2,sub3,sub4,sub5,total,avg;
	printf("enter 5 subect marks");
	scanf("%d%d%d%d%d",&sub1,&sub2,&sub3,&sub4,&sub5);
    total= sub1+sub2+sub3+sub4+sub5;
    avg=total/5;
	printf("total of 5 subject are=%d",total);
	printf("\nAverage of 5 subject are=%d",avg);
}
