class Calculate{

void add(int n1 , int n2){

int res = n1+n2;
System.out.println("addition of 2 no. is : "+res);

}

void add(int n1 , int n2, int n3){

int res = n1+n2+n3;
System.out.println("addition of 3 no. is : "+res);

}

}
class Overloading1{

public static void main(String argc[]){

Calculate c1 = new Calculate();

c1.add(2,3);
c1.add(2,3,5);

}
}