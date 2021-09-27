class Calculate{

static int add(int n1 , int n2){

int res = n1+n2;
return res;

}

static int add(int n1 , int n2, int n3){

int res = n1+n2+n3;
return res;

}

}
class Overloading2{

public static void main(String argc[]){

 //Calculate c1 = new Calculate(); becoz of static method no need of instance becoz it use for memory managment

System.out.println(Calculate.add(2,3));
System.out.println(Calculate.add(2,3,5));

}
}