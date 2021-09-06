//2 wap to check whether amount to be deposited or withdrawl

#include<stdio.h>
int main()
{
	int  amount, bal=1000;
	int ac_no;
	char name[20];
	printf("\nEnter Your Account No.  ");
	scanf("%d",&ac_no);
	printf("\n Enter your name : ");
	fflush(stdin);
	gets(name);
	printf("\nEnter Amount..");
	scanf("%d",&amount);
	desposit( ac_no, amount, bal, name);
	withdrawl(ac_no, amount, bal, name);
	 
		
}
void desposit( int ac_no,int amount, int bal, char name[])
{
	if(amount>0)
	{
		bal = amount + bal;
		printf(" \n Account Detail After Deposit");
	    show_bal(ac_no, bal,name);
	}
	else
	{
	   printf(" \n Amount deposited must be greater than 0 (zero)");	
		 
	}
}
void withdrawl(int ac_no,int amount,int bal, char name[])
{
	if(amount<= bal)
	{
		bal = bal - amount;
		printf(" \n Account Detail After Withdrwl");
	    show_bal(ac_no, bal, name);
		
	}
	else
	{
		printf(" \n No withdrwl due to insuffient fund");
		
	}
}
void show_bal(int ac_no,int bal, char name[])
{
	printf("\n------------------------------------------------------\n");
	printf("\n A/c No. = %d", ac_no);
	printf("\nName of Account Holder = %s",name);
	printf("\n  Balance = %d", bal);
	printf("\n------------------------------------------------------\n");
	
}
