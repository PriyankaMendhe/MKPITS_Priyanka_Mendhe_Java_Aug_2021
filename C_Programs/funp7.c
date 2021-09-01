//wap to accept empname,salary and calculate bonus.	

int main()
{
	int salary,bonus=0;
	char empname[20];
	printf("Input Employee Name :");
	gets(empname);
	printf("\n Input  Salary : ");
	scanf("%d",&salary);
	bonus = calculate_bonus(salary);
	
printf("\n -----Employee Details are -----\n");
printf("\nEmployee Name = %s",empname);
printf("\nEmployee Salary = %d",salary);
printf("\nEmployee Bonus = %d",bonus);
}

int calculate_bonus(int salary)
{
	int bonus=0;
	if(salary>10000)
	{
		bonus=1000;
	}else if( salary>=5000 && salary <=10000)
	{
		bonus = 500;
	}else
	{
		bonus = 100;
	}
	
	return bonus;
}		
