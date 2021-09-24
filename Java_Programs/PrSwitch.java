//wap to accept a  day number between 1 and 7 and then display the dayname. using switch
 import java.util.*;
class PrSwitch{
	public static void main(String abc[]){
	Scanner scan = new Scanner(System.in);

	System.out.println("enter dayno between 1 and 7");
    int dayno= scan.nextInt();

	switch(dayno) {
		case 1 :
			System.out.println("\n monday");
			break;
		case 2 :
			System.out.println("\n tuesday");
			break;
		case 3 :
			System.out.println("\n wednesday");
			break;
		case 4 :
			System.out.println("\n thurday");
			break;
		case 5 :
			System.out.println("\n friday");
			break;
		case 6 :
			System.out.println("\n saturday");
			break;
		case 7 :
			System.out.println("\n sunday");
			break;
		default:
			System.out.println("\n invalid day no");
			break;
	}
}
}
