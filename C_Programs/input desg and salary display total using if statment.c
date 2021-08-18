// wap to accept basic_sal and designation and calculate bonus 1000 for m, 500 for c, 100 for p and display total  using switch
//m manager p peon c clerk
//total=bonus+basic_sal

#include<stdio.h>
#include<conio.h>
int main()
{
	int basic_sal,bonus=0,total=0;
	char designation;
	printf("Enter Basic Salary");
	scanf("%d",&basic_sal);
	printf("enter the designation like m,p,c");
	fflush(stdin);
	scanf("%c",&designation);
	switch(designation)
	{
		case 'm':
			 bonus=1000;
			 break;
		case 'p':
			 bonus=100;
			 break;
		case 'c':
			 bonus=500;
			 break;
		default:
			printf("invalid input");
			break;
   }
	printf("Bonus=%d",bonus);	
    total=basic_sal+bonus;
    printf("\nTotal=%d",total);

}
	
	


