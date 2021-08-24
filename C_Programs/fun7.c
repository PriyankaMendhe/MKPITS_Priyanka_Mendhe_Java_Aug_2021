//7- wap to create a function calculate with 3 parameters (2 int and one char to accept 2 no. and operator) calculate and display the result.
#include<stdio.h>
calculate( int num1, int num2,char ch)
{
	int result;
	
	switch(ch)
	{
		case '+':
		        result = num1+num2;
		        break;
		case '-':
				result=num1-num2;
				break;
		case '/':
				result=num1/num2;
				break;
		case '*':
				result= num1 * num2 ;
				break;
		default:
				printf("Invalid Character entered");
	}
	printf("\nResult = %d",result);
}
int main()
{
	int n1, n2;
	char op;
	printf("\nenter 2 no.");
	scanf("%d%d",&n1,&n2);
	printf("\nEnter the operator like + ,- , /, * ");
	fflush(stdin);
	scanf("%c",&op);
	calculate(n1 , n2 , op);
	printf("\nBye from main");
}
