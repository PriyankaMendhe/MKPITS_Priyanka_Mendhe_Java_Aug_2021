//9 Once a string is defined, it cannot be reassigned to another set of characters. However, using pointers, we can assign the set of characters to the string. 
//Consider the following example.
#include<stdio.h>
int main()
{
	char *p = "Hello MKPITS";
	printf(" Before assigning: %s\n",p);
	p="hello";
	printf("After assigning = %s\n",p);
	p="Hello World";
	printf("Again Assigning= %s\n",p);
	
}
