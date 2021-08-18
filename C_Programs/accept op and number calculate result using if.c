//7- wap to accept 2 no. and operator like +,-,* and then display the result.
#include<stdio.h>
int main()
{
	int num1, num2,result=0;
	char op;
	printf("Enter 2 no.");
	scanf("%d%d",&num1,&num2);
	printf("Enter operator like + , -, * ");
	fflush(stdin);
	scanf("%c",&op);
	if(op=='+')
	{
		result=num1+num2;
	}
	else
	{
		if(op=='-')
		{
			result=num1-num2;
		}
		else
		{
			if(op=='*')
			{
				result=num1*num2;
			}
			else
			{
				printf("\ninvalid operator entry");
			}
		}
	}
	
	printf("\nresult=%d",result);
}
