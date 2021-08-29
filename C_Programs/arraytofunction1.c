//1- create a array of 3 elements and pass it to the funtion display to display the elements of an array
#include<stdio.h>
int main()
{
	int arr[3]={1,2,3};
	display( arr);//passing only name of array //call function only by name with semicolan;
}
void display( int arr [])//accepting array with datatype and [] and function has return type void
{
	printf(" arr [0]= %d",arr[0] );
	printf(" arr [1]= %d",arr[1]);
    printf(" arr [2]= %d",arr[2]);
}
