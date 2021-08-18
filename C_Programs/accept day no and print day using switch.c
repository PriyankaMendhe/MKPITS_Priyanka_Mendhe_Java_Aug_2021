// 2-  wap to accept 2 no. and operator like +,- , * and then display the result using switch.
#include<stdio.h>
int main()
{
	int num1,num2,result=0;
	char op;

	printf("enter 2 no.");
	scanf("%d%d",&num1,&num2);
	printf("enter operator like +,-,*,/");
	fflush(stdin);
	scanf("%c",&op);
	switch(op)
	{
		case '+' :
	  {
	  	result=num1+num2;
	  	 printf("result=%d",result);
	  	break;
	  }
	  case '-':
	  {
	  	result=num1-num2;
	  	  
	  	break;
	  }
	  case '*':
	  {
	  	result=num1*num2;
	  	  
	  	break;
	  }
	 case '/' :
	  {
	  	result=num1/num2;
	  	 break;
      }
	  default:
	  	printf("invalid operator");
	  	break;
	}
	
	 printf("result=%d",result);
	getche();
	
	return 0;
}
