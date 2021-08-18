// wap to accept designation like m,p,c and display the full designation using switch statment.

#include<stdio.h>
#include<conio.h>
int main()

{
	char ch;
	printf("enter the designation like m,p,c");
	scanf("%c",&ch);
	if(ch=='m')
	{
		printf("Designation is Manager");
		
	}
	else
	{
		if(ch=='p')
	{
		printf("Designation is Peon");
		
	}
	else
	{
		
		if(ch=='c')
	    printf("Designation is clerk");
	    else
	    {
		printf("Invalid Input");
	    }
    }
	
	}


return 0;
}
	
	


