//10 -Write a program in C to calculate and print the Electricity bill of a given customer. The customer id., name and unit consumed by the user should be taken from the keyboard and display the total amount to pay to the customer. The charge are as follow : Go to the editor
//Unit 	Charge/unit
//upto 199 	@1.20
//200 and above but less than 400 	@1.50
//400 and above but less than 600 	@1.80
//600 and above 	@2.00

//If bill exceeds Rs. 400 then a surcharge of 15% will be charged and the minimum bill should be of Rs. 100/-
#include<stdio.h>
#include<conio.h>
int main()

{
	int customer_id, unit;
	float  amount_charges, unit_charge, surcharge_amount =0, net_amount;
	char name[20];
	printf("\nPlease enter your customer id:");
	scanf("%d",&customer_id);
	printf("\nPlease enter your Name:");
	fflush(stdin);
	gets(name);
	printf("\nPlease enter electricity unit:");
	scanf("%d",&unit);
	if(unit<199)
	{
		unit_charge = 1.20;
		amount_charges = (float) unit * 1.20;
	}
	else if( unit>199 && unit <400)
	{
		unit_charge = 1.50;
		amount_charges = (float) unit * 1.50;
	}
	else if( unit>=400 && unit <600)
	{
		unit_charge = 1.80;
		amount_charges = (float) unit * 1.80;
	}
	else if(unit>=600)
	{
		unit_charge = 2.00;
		amount_charges = (float) unit * 2;
	}
	
	if(amount_charges>400)
	{
		surcharge_amount= (float) amount_charges * 15/100 ;
	
	}
	
	net_amount=  amount_charges + surcharge_amount;
	
	printf("\n.......................................................");
	printf("\nElectricity bill of a given customer:");
	printf("\nCustomer id is =%d",customer_id);
	printf("\nCustomer Name is =%s",name);
	printf("\nUnit Consumed by customer is =%d",unit);
	printf("\nAmount Charges @Rs %.2f per unit is =%.2f",unit_charge, amount_charges);
	printf("\nSurcharge Amount Charges is =%.2f",surcharge_amount);	
	printf("\nNet Amount Paid By the Customer : =%.2f",net_amount);		
	
}
