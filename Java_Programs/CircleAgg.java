// Aggregation
//

class Operation{
	int square(int num){

		return num*num;

		}
}

class Circle{
	Operation op;
	double pi;
	double area(int radius)
	{

		op = new Operation();
		int sq =op.square(radius);
	    double ar = pi * sq;
	    return ar;
   }
}

class CircleAgg{

	public static void main(String arg[]){

		Circle c1 = new Circle();
		c1.pi=3.14;
		double result =c1.area(4);
		System.out.println("Area of Circle = "+result);
}
}