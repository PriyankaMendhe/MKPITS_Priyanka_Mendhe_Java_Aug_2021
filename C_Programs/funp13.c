//13	wap to accept a no and print table of that no.	
#include<stdio.h>
int main()
{
	int n;
	char ans;
	do{
	 
	printf("\n Input the number : ");
	scanf("%d",&n);
	print_table(n);
	printf("\nDo you want to print another no. table Press 'y'for Yes & 'n' for NO. ");
	fflush(stdin);
	scanf("%c",&ans);
	
    }while(ans=='y');
}
void print_table(int num)
{
	int i;
	for(i=1;i<=10;i++)
	{
		printf("\n%d * %d = %d ",num,i, (num*i));
	}
}
