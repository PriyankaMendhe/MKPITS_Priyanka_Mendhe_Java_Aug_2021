//7 wap to create a variable num and store value 5 in it. then create a pointer ptr and 
//store the address of num variable and the print the value of num variable using pointer.
#include<stdio.h>
int main()
{
	int num,*ptr;
	num=5;
	ptr = &num;//store address of num variable
	printf("Num=%d",*ptr);//  *ptr shows that value which is stored on ptr address
}
