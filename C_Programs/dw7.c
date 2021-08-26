//wap to accept 5 subject marks using do while loop and print the sum of 5 subjects.
#include<stdio.h>
int main()
{
	int sub_marks,sum=0,i=1;
	float per;
	do{
		printf("\nEnter subject marks.. ");
		scanf("%d",&sub_marks);
		sum = sum + sub_marks;
		i++;	
	}while(i<=5);
	
	printf("\nSum of 5 subject is = %d",sum);
	per = (float) (sum/500.f ) * 100.f ;
	printf("\nPercentage= %.2f",per);
	return 0;
}
