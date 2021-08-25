////1.wap to accept age of 5 students using for loop and then display the average age
#include<stdio.h>
int main()
{
	int age,i,total;
	float avg;
	printf("\n enter age of 5 student....");
	for(i=1;i<=5;i++)
	{
		printf("\nEnter age [%d]:" ,i);
		scanf("%d",&age);
		total = total + age;
		
	}
	
	avg = (float) total/5 ;
	printf("\n Average of 5 students age :%.2f",avg);
	return 0;
}
