// by changing data type in argument

class Calculate{

static int add(int n1 , int n2){

int res = n1+n2;
return res;

}

static double add(double n1 , double  n2, double n3){
double res = n1+n2+n3;
return res;

}

}
class Overloading3{

public static void main(String argc[]){

 //Calculate c1 = new Calculate(); becoz of static method no need of instance becoz it use for memory managment

System.out.println(Calculate.add(2,3));
System.out.println(Calculate.add(2.0,3.0,5.0));

}
}