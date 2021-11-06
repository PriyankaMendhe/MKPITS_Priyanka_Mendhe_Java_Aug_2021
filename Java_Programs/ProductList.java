//User-defined class objects in Java ArrayList
import java.util.*;
class ProductList{

String pname;
int pid;
int price;

ProductList(String pname, int pid , int price)
{
   this.pname=pname;
   this.pid=pid;
   this.price = price;


}

public static void main(String argc[])
{

  ProductList p1 = new ProductList("Laptop",123,45000);
  ProductList p2 = new ProductList("Mouse",121,600);
  ProductList p3 = new ProductList("Keyboard",120,5000);

  ArrayList<ProductList> pList = new ArrayList<ProductList>();

  pList.add(p1);
  pList.add(p2);
  pList.add(p3);

  Iterator itr = pList.iterator();

  while(itr.hasNext())
  {


     ProductList pValue = (ProductList) itr.next();
     System.out.println(pValue.pname+ " "+pValue.pid+ " "+pValue.price);


  }

}
}