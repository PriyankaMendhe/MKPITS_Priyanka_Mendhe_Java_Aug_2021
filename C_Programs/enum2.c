//create account having member
//saving,current;
enum accounttype{ saving =1,current,loan
};

#include<stdio.h>
int main()
{
	enum accounttype act;
	act=current;
	printf("Integer Value for Current=%d",act);
}

