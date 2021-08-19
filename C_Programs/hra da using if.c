//wap to accept basicsalary and calculate hra,da and totalsalary.
//	(hra=45% of basicsalary,da=55% of basicsalary if basicsalary >=10000)
//(hra=25% of basicsalary,da=35% of basicsalary if basicsalary >=5000)
//(hra=15% of basicsalary,da=5% of basicsalary if basicsalary < 5000)

#include<stdio.h>
int main()
{
	int basic_sal;
	float total,hra,da;
	
	printf("Enter your basic salary");
	scanf("%d",&basic_sal);
	if(basic_sal>=10000)
	{
		hra = (float) basic_sal* 0.45f;
		da = (float) basic_sal *0.55f;	
	}
	else
	{
		if( basic_sal>=5000&&basic_sal<10000)
		{
			
			hra = (float) basic_sal* 0.25f;
		    da = (float) basic_sal *0.35f;		
	   }
		else
		{
			if(basic_sal<5000)
			{
				
				hra = (float) basic_sal* 0.15f;
		         da = (float) basic_sal *0.05f;
				
			}
			else
			{
				printf("Invalid Input");
			}
			
		}
	}
	
	total=hra+da+basic_sal;
	printf("\nHra=%.2f",hra);
	printf("\nDa=%.2f",da);
	printf("\nTotal Salary=%f",total);
return 0;
}
