//4
//wap to accept a number and print square of that number 
//program should ask the user "do you want  to continue or not, if yes press y or n ? " 
//if user presses 'y' and then it should ask for another number
//if user presses 'n' the program should end.
#include<stdio.h>
int main()
{
	int num, square;
	char ans;
	do
	{
		printf("\nEnter no");
		scanf("%d",&num);
		square= num*num;
		printf("\nSquare of %d is = %d",num,square);
		printf("\ndo you want  to continue or not, if yes press y or n ?");
		fflush(stdin);
		scanf("%c",&ans);
		
	}while(ans=='y');
	printf("\n bye");
}

