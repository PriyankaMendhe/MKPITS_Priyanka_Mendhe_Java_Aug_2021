class Operation{

int square(int num){   return num*num; }

}
class Circle{

Operation op;//aggregation
double pi;

double areaOfCircle(int radius)
{

 op = new Operation();

 int sq =op.square(radius);
 double ar = pi * sq ;
 return ar;

}}

class TestAggregation
{

	public static void main(String arg[]){
Circle c1= new Circle();
c1.pi=3.14;
double result=c1.areaOfCircle(4);

System.out.println(result);


}

}


