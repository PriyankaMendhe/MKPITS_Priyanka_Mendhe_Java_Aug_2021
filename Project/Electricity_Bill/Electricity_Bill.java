//The bill will be calculated as per below slab
//0-100 units (Rs. 3.44 per unit)
//101-300 units (Rs. 7.34 per unit)
//301-500 units (Rs. 10.36 per unit)
//501-1000 units (Rs. 11.82 per unit)
//>1000 units (Rs. 11.82 per unit)
//Apart from the above slab, there are few fixed costs added to each bill as below
//Mandatory Cost: Rs. 200
//Vehicle Cost @ 1.38 per unit
//Tax @ 16% on total cost

import java.util.*;
class ElectricityBillInput
{

  double mandatoryCost=200;
  double tax;
  double cost;
  double vehicleCost;
  double totalCost =0;
  double netBill;
  float perUnitValue =0;

  void calculateCost(int unit)
  {
     if( unit>0 &&  unit <=100)
     {
         cost = unit * 3.44f;
         perUnitValue= 3.44f;

     }
     else if( unit>=101 &&  unit <=300)
     {
		 cost =  unit * 7.34f;
		 perUnitValue= 7.34f;

	 }
	 else if(unit >=301 &&  unit <=500)
	 {
		cost =  unit * 10.36f;
		 perUnitValue= 10.36f;


     }
     else if( unit >=501 &&  unit <=1000)
	 {
		cost =  unit * 11.82f;
		perUnitValue= 10.36f;

     }
     else if( unit>1000)
	 {
		cost =  unit * 11.82f;
		perUnitValue= 10.36f;
         }

  }

  void calculateNetBill(int unit)
  {
      vehicleCost = unit * 1.38f;
	  totalCost= mandatoryCost + cost + vehicleCost ;
      tax = totalCost * 0.16f;
	  netBill = totalCost + tax ;
  }

  void displayElectricityBill(int unit, int eId, String eName)
  {   System.out.println("-------------Electricity Bill --------------------");
	  System.out.println("Customer Id : "+eId);
	  System.out.println("Customer Name : "+eName);
	  System.out.println("Customer unit : "+unit);
	  System.out.println("Cost : "+cost);
	  System.out.println("Vehicle Cost : " +vehicleCost );
	  System.out.println("Mandatory Cost : "+mandatoryCost);
	  System.out.printf("Total Cost : %.2f \n", totalCost);
	  System.out.printf("Tax on Total cost: %.2f\n ",tax);
	  System.out.printf("Your Net Electricity Bill :: Rs. %.2f per Unit is : %.2f\n",perUnitValue,netBill);
  }
}
class Electricity_Bill
{

 public static void main(String avc[])
 {

 Scanner scan = new Scanner(System.in);

 ElectricityBillInput e1 = new ElectricityBillInput();

//Accept customer detail and unit from user
 System.out.println("Enter your Customer Id");
 int eId= scan.nextInt();
 System.out.println("Enter your Name");
 String eName= scan.next();
 System.out.println("Enter your Electricity Unit");
 int eUnit = scan.nextInt();

 //Calculate and display method
 e1.calculateCost(eUnit);
 e1.calculateNetBill(eUnit);
 e1.displayElectricityBill(eUnit, eId, eName);

 }


}