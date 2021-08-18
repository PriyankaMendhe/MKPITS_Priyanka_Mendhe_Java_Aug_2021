//wap to accept basicsalary and designation like 'm' for manager ,
// c' for clerk and 'p' for peon
//and then calculate bonus=1000 for 'm', 500 for 'c', 100 for 'p'
//and display basicsalary,bonus and totalsalary 

# include<stdio.h>
int main()
{
	int basic_sal,total=0,bonus=0;
	char desg;
	printf("enter your basic salary");
	scanf("%d",&basic_sal);
	printf("enter your designation like m , p , c");
	fflush(stdin);
	scanf("%c",&desg);
	if(desg=='m')
	{
		bonus=1000;
	}
	else
	{
		if(desg=='c')
     	{
		bonus=500;
	    }
	    else
	    {
	    	if(desg=='p')
	        {
		        bonus=100;
	       }
	       else
	       {
	       	  printf("Invalid input");
		   }
		}
		
	}
	
	printf("\n your basic salary is %d",basic_sal);
	total=basic_sal+bonus;
	printf("\n your total salary is %d",total);
	printf("\n your bonus is %d",bonus);
	
return 0;	
}
