import java.util.*;
class Bill
{

	double cost=0;
	double mandatoryCost=200;
	double vehicleCost=0;
	double totalCost=0;
	double tax=0;

	void calculateBill(int unit) {
		if(unit <= 100 ) {
			cost= unit * 3.44;
		}
		else if(unit > 100 && unit <=300 ) {
			cost= unit * 7.34;
		}
		else if(unit > 300 && unit <=500 ) {
					cost= unit * 10.36;
		}
		else if(unit > 500 && unit <=1000 ) {
					cost= unit * 11.82;
		}
		else if(unit > 1000 ) {
							cost= unit * 11.82;
		}
		vehicleCost=1.38 * unit;
		totalCost=cost + vehicleCost +mandatoryCost ;
		tax = totalCost * 0.16;

		System.out.println("vehicle cost 1.38 per unit : " + vehicleCost);
		System.out.println("tax 16% of cost : " + tax);
		totalCost = totalCost + tax;

		System.out.println("Total Electricity Bill Amount " + totalCost);
	}

}

class TestBill {
public static void main(String[] arg) {
	Bill b=new Bill();
Scanner scan=new Scanner(System.in);
System.out.println("enter unit ");
int unit = scan.nextInt();
	b.calculateBill(unit);


}

}

