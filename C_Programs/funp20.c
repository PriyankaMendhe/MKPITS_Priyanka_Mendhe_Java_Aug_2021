//20	wap to create a function calculate with 3 float arguments and display																							
//	the addition of 3 no.	

#include<stdio.h>
float calculate(float n1, float n2, float n3);

int main()
{
	float n1,n2,n3,addition;
	printf("\n Enter 3 no.");
	scanf("%f%f%f",&n1,&n2,&n3);
	addition=calculate(n1,n2,n3);
	printf("\nAddition of 2 no is = %.2f",addition);

return 0;
	
}
float calculate(float n1, float n2, float n3)
{
	float sum=0.00;
	sum=n1+n2+n3;
	
	return sum;
}
 													
