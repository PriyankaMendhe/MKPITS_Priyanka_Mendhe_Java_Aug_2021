//7- wap to accept basicsal and designation and calculate 
//hra 12% of basic for m, hra=5% of basic for c, hra =8% of basic for p
//calculate total =hra + basic

#include<stdio.h>
#include<conio.h>
int main()
{
	int basic_sal;
	char designation;
	float total,hra;
	printf("Enter basic salary");
	scanf("%d",&basic_sal);
	printf("\nEnter designation like m, p, c");
	fflush(stdin);
	scanf("%c",&designation);
	switch(designation)
	{
		case 'm':
			hra=  0.12 * basic_sal;
			break;
		case 'p':
			hra= 0.08 * basic_sal;
			break;
		case 'c':
			hra= 0.05 * basic_sal;
			break;
		default:
		printf("Invalid Input");
		break;
	}
	
	total=hra+basic_sal;
	printf("\nhra=%f",hra);
	printf("\nTotal=%f",total);
	
}


