 // 3- wap to accept age and print whether he is minor, young or old
 
#include<stdio.h>
int main()
{
	int age;
	printf("Enter your age");
	scanf("%d",&age);
	if(age<=18)
	{
		printf("you are miner ");
	}
	else
	{
		if(age>18 && age<=40)
		{
			printf("\nyou are young");
		}
		else
		{
			printf("\nyou are old");
		}
		
	}
	return 0;
}


