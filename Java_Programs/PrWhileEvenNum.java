// wap to print even no. from 1 to 10 using while loop

class PrWhileEvenNum{
public static void main(String abc[]){

	int num=1;
	while(num<=10) {
		if(num%2==0){
		System.out.println("num= " +num);
	}
		num=num+1;
	}
	System.out.println("\n bye");
}
}