
//: An interface can have another interface which is known as a nested interface

interface printable{

void print();

  interface massagePrintable{
  
  void msg();
  }
 }
 
class Example implements printable.massagePrintable{

public void print (){System.out.println("print");}
public void msg (){System.out.println(" msg");}

}

class NestedInterface{

public static void main(String argc[]){

Example e = new Example();

e.print();
e.msg();
}
}

