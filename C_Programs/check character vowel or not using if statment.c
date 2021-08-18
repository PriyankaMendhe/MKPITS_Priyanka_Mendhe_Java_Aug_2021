// wap to accept designation like m,p,c and display the full designation using switch statment.

#include<stdio.h>
#include<conio.h>
int main()

{
	char ch;
	printf("enter the designation like m,p,c");
	scanf("%c",&ch);
	switch(ch)
	{
		case 'm':
			
			printf("designation is Manager");
			break;
		case 'p':
			
			printf("designation is peon");
			break;
		case 'c':
			printf("Designation is Clerk");
			break;
		
		default:
			printf("Invalid Input");
			break;
	}
return 0;
}
	
	


