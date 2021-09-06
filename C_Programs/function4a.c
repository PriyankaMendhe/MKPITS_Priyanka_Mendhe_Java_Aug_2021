//4 wap to accept actno,amount,and transaction(whether you want to deposit or withdrawl or showbalance) and 
//call the appropriate function
#include<stdio.h>
#include<string.h>
#include<conio.h>
int main()
{
	int  amount, bal=1000;
	int ac_no;
	char name[20],transaction[20];
	printf("\n Enter Your Account No.  ");
	scanf("%d",&ac_no);
	printf("\n Enter your name : ");
	fflush(stdin);
	gets(name);
	printf("\n Enter whether you want to deposit or withdrawl or showbalance....");
	fflush(stdin);
	gets(transaction);
	
	if(strcmp(transaction ,"deposit")==0)
	{
		printf("\n Enter Amount to be deposit..");
	    scanf("%d",&amount);
		desposit( ac_no, amount, bal, name);
	}
	else if(strcmp(transaction , "withdrawl")==0)
	{
		printf("\n Enter Amount to withdrwal..");
	    scanf("%d",&amount);
		withdrawl(ac_no, amount, bal, name);
	}
	else
	{
		show_bal(ac_no, bal,name);
    }
}

void desposit( int ac_no,int amount, int bal, char name[])
{
	if(amount>0)
	{
		bal = amount + bal;
		printf("\n------------------------------------------------------\n");
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
		printf("\n------------------------------------------------------\n");
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
	printf("\n*******************************************************");
	printf("\n A/c No. = %d", ac_no);
	printf("\n Name of Account Holder = %s",name);
	printf("\n  Balance = %d", bal);
	printf("\n*******************************************************\n");
	
}
