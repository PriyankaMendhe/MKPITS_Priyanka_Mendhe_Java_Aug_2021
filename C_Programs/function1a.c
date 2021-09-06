// wap to accept account no. and amount and initial_bal=1000 and create function deposit, withdrawl and show_balance .
#include<stdio.h>
int main()
{
	int  amount,initial_bal=1000;
	int ac_no;
	
	
	printf("\nEnter Your Account No.  ");
	scanf("%d",&ac_no);
	printf("\nEnter Amount..");
	scanf("%d",&amount);
	desposit( ac_no, amount,initial_bal);
	withdrawl(ac_no, amount,initial_bal);
	 
	
}

desposit( int ac_no,int amount,int initial_bal)
{
	int latest_bal=0;
	latest_bal=amount + initial_bal;
	printf("\nBalance after Deposit...\n\n");
	show_balance(ac_no, amount,latest_bal);
	
}
withdrawl(int ac_no,int amount,int initial_bal)
{
	int latest_bal=0;
	latest_bal=initial_bal - amount;
	printf("\nBalance after Withdrwl...\n");
	show_balance(ac_no, amount,latest_bal);
}
show_balance(int ac_no,int amount,int balance)
{
	printf("\n Account No= %d\n",ac_no);
	printf("\n Amount = %d\n",amount);
	printf("\n Current Balance = %d\n",balance);
	
}
