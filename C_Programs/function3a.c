//3 wap to create function deposite ,withdrawl returning bal.
#include<stdio.h>
int main()
{
	int  amount, bal=1000;
	int ac_no;
	char name[20];
	int bal1, bal2;
	printf("\nEnter Your Account No.  ");
	scanf("%d",&ac_no);
	printf("\n Enter your name : ");
	fflush(stdin);
	gets(name);
	printf("\nEnter Amount..");
	scanf("%d",&amount);
	bal1 =desposit( ac_no, amount, bal, name);
	show_bal(  ac_no,  bal1,  name);
	bal2 =withdrawl(ac_no, amount, bal, name);
    show_bal(  ac_no,  bal2,  name);
	 
		
}
int desposit( int ac_no,int amount, int bal, char name[])
{
	if(amount>0)
	{
		bal = amount + bal;
		printf(" \n Account Detail After Deposit");
	     
	}
	else
	{
	   printf(" \n Amount deposited must be greater than 0 (zero)");	
		 
	}
return bal;
}

int withdrawl(int ac_no,int amount,int bal, char name[])
{
	if(amount<= bal)
	{
		bal = bal - amount;
		 
	     printf(" \n Account Detail After withdrwl");
		
	}
	else
	{
		printf(" \n No withdrwl due to insuffient fund");
		
	}
	return bal;
}
void show_bal(int ac_no,int bal, char name[])
{
	printf("\n------------------------------------------------------\n");
	printf("\n A/c No. = %d", ac_no);
	printf("\nName of Account Holder = %s",name);
	printf("\n  Balance = %d", bal);
	printf("\n------------------------------------------------------\n");
	
}
