#include<stdio.h>
enum status{success,fail};
enum boolen{fail1,pass};// fail same name can not declare so change it in fail1
int main(void)
{
	printf("The value of success is %d",success);
	return 0;
}
