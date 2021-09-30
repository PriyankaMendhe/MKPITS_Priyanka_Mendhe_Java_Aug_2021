

//If a class implements multiple interfaces, it is known as multiple inheritance.

interface Printable{

	void print();

}

interface showable{

	void show();
}

class M1 implements Printable,Showable{

	public void print() {

		 System.out.println("Hello");
   }

   public void show(){

	   System.out.println("Welcome");
}

public static void main(String args[]){

	M1 i = new M1();

	i.print();
	i.show();
}
}