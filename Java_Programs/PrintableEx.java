//ex  Interface fields are public, static and final by default, and the methods are public and abstract

interface Printable{

int MIN = 5 ;
void print();
}

public class PrintableEx implements Printable
{
 public void print(){
	// MIN = 8; Compile time error  u can not assign value to static final variable

 System.out.println("min : "+MIN);


  }
 public static void main(String argc[])
 {

 PrintableEx p = new PrintableEx();
 p.print();

 }
 }

