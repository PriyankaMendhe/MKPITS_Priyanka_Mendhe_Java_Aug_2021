//11- wap to create a function calculate with 3 parameters (2 int and one char to accept 2 no. and operator) 
//calculate and return the result
#include<stdio.h>
int calculate( int n1, int n2, char op)
{
	int result;
	switch(op)
	{
		    case '+':
			result=n1+n2;
			break;
			case '-':
			result=n1-n2;
			break;
			case '*':
			result=n1*n2;
			break;
			case '/':
			result=n1/n2;
			break;
			default:
				printf("\nInvalid operator entered..");
				break;
		
	}
	return result;
	
}
int main()
{
	int num1, num2,result;
	char op;
	printf("enter 2 no.");
	scanf("%d%d",&num1, &num2);
	printf("enter operator like + , - , * ,/ ");
	fflush(stdin);
	scanf("%c",&op);
	result= calculate ( num1, num2, op);
	printf("\nResult= %d",result);
}
