//5 - wap to accept 2 no. and opertor and display the result using goto statement
#include<stdio.h>
#include<conio.h>
int main()
{
	int n1,n2,res=0;
	char op;
	printf("enter 2 no.");
	scanf("%d%d",&n1,&n2);
	fflush(stdin);
    printf("enter operator like +, - , * ,/ ");
    scanf("%c",&op);
    
	if(op=='+')
	{
		goto addition;
	}
	else if(op=='-')
	{
		goto substraction;
	}
	else if(op=='*')
	{
		goto multiplication;
		
	}
	else if(op=='/')
	{
		goto division;
		
	}
	else
	{
		printf("Invalid Input");
		goto end;	
		
	}
	//creating labels for goto statement
addition:
	
	res= n1+ n2;
	
	goto end;
	
substraction:
	
	res=n1-n2;
	goto end;
	
multiplication:
	
	res= n1*n2;
	goto end;
	
division:
	
	res=n1/n2;
	goto end;
	
end:
	printf("\nResult=%d",res);
	
	
}
