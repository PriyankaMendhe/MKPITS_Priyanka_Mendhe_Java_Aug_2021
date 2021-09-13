//create a class product and initilize it with method.

class Product
{

   int productId;
   String productName;
   double productPrice;

   void insertProductInfo(int pid, String name , double price)
   {
        productId=pid;
           productName=name;
              productPrice=price;
   }
   void displayProductInfo()
   {
       System.out.println(" productId = "+ productId);
       System.out.println(" product name = "+ productName);
       System.out.println(" product price = "+ productPrice);

   }
}

class ProductInfo
{

public static void main(String abc[])

{

    Product p1 = new Product();
    Product p2 = new Product();


  p1.insertProductInfo(85,"Mouse" , 452.75);
  p1.displayProductInfo();
  p2.insertProductInfo(851,"Keyboard" , 600);
  p2.displayProductInfo();
}
}