//accept and print with scanf , getch()  and getche()

#include<stdio.h>
#include<conio.h>
int main(){
	char ch;
	printf("enter character ");
	scanf("%c",&ch); // will wait for user pressing enter key
	printf("\n char = %c",ch);
	
		printf("\nenter another character ");
	ch=getch(); // will not wait for enter key to be pressed and does not echo char.
	printf("\n char = %c",ch);
	
		printf("\nenter another character ");
	ch=getche(); // will not wait for enter key but it will echo char.
	printf("\n char = %c",ch);
}


