//8	wap to accept character and print whether it is vowel or not.	

int main()
{
	char ch;
	printf("\n Input a character like (a-z) & (A-Z) : ");
	scanf("%c",&ch);
	check_vowel(ch);
}
void check_vowel(char ch)
{
	if((ch=='a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u')|| (ch=='A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U'))
	{
		printf (" %c is a vowel",ch);
	}
	else
	{
		printf (" %c is not a vowel",ch);
	}
}
