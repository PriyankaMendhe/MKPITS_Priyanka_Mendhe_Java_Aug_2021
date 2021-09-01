//10	wap to print no. from 1 to 10 using while, dowhile and for loop.	
#include<stdio.h>
int main()
{
	 
	printf("\nPrinting no. from 1 to 10 using while ,dowhile and for loop");
	  while_print();
	  dowhile_print();
	  for_print();
	
}
void while_print()
{  int i;
	printf("\n1]Printing 1 to 10  using while loop:");
	i=1;
	while(i<=10)
	{
		printf("\t%d",i);
		i++;
	}
}
void dowhile_print()
{
	int i=1;
	printf("\n2]Printing 1 to 10  using do while loop:");
	
	do{
		printf("\t%d",i);
		i++;
		
	 }while(i<=10);
	
}
void for_print()
{ int i;
	printf("\n3] Printing 1 to 10  using for loop:");
	for(i=1;i<=10;i++)
	{
		printf("\t%d",i);
	}
	
}
