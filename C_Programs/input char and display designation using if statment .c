// wap to accept basic_sal and designation and calculate bonus 1000 for m, 500 for c, 100 for p and display total  using if statment
//m manager p peon c clerk
//total=bonus+basic_sal

#include<stdio.h>
#include<conio.h>
int main()

{
	int basic_sal,bonus=0,total;
	char designation;
	printf("Enter Basic Salary");
	scanf("%d",&basic_sal);
	printf("enter the designation like m,p,c");
	fflush(stdin);
	scanf("%c",&designation);
	if(designation=='m')
	{
	    bonus=1000;
	}
	else
	{
		if(designation=='p')
	{
		bonus=100;
		
	}
	else
	{
		
		if(designation=='c')
	    bonus=500;
	    printf("Invalid Input");
    }
	
	}
total=basic_sal+bonus;
printf("Total=%d",total);


return 0;
}
	
	


