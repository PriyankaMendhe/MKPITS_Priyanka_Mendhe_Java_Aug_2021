//6 - wap to accept basicsalary and then calculate bonus
//( bonus =1000 if salary > 10000, bonus=500 if salary > 5000 or bonus=100)
#include<stdio.h>
int main()
{
	int basic_sal,bonus=0;
	printf("Enter your salary");
	scanf("%d",&basic_sal);
	if(basic_sal>10000)
	{
		bonus=1000;
	}
	else
	{
		if(basic_sal>=5000)
		{
			bonus=500;
		}
		else
		{
			bonus=100;
		}
	}
	
	printf("\nyour bonus=%d",bonus);
	return 0;
}
