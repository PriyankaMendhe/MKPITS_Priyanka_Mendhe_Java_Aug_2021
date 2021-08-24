//6 wap to accept salary and calculate bonus and total salary using goto statement.
//example of goto statement to do calculation.
#include<stdio.h>
int main()
{
	int sal,bonus,total=0;
	char desg;
	printf("Enter your salary");
	scanf("%d",&sal);
	printf("enter your designation as m , p, c ");
	fflush(stdin);
	scanf("%c",&desg);
	if( desg=='m')
	{
		goto manager;
		
	}
	else if (desg=='p')
	{
		goto peon;
		
	}
	else if (desg=='c')
	{
		goto clerk;
	}
	else
	{
		printf("Invalid Input");
		goto end;
	}
	//creating lables;
	
	manager:
		
		bonus = 1000;
		total=sal + bonus;
		goto end;
	peon:
		
		bonus=100;
		total=sal+bonus;
		goto end;
	clerk:
		
		bonus=500;
		total=sal+bonus;
		goto end;
	end:
		printf("\nBonus : %d",bonus);
		printf("\nTotal Salary : %d",total);
	
}
