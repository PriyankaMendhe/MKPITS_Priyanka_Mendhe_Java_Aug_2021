//13 - wap to print febonachi series do while
#include<stdio.h>
int main()
{
	int n1=0,i, n2=1, n3, element;
	printf("Enter no. of element");
	scanf("%d",&element);
	printf("%d\t%d",n1,n2);
	i=1;
	do{
		n3=n1+n2;
		printf("\t%d",n3);
		n1=n2;
		n2=n3;
	i++;	
	}while(i<=element);
}
