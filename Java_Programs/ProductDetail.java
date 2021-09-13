//create a class product and create 2 objects
//Defining a Product class.
    class Product
    {
     //defining fields
     int productId;//field or data member or instance variable
     String productName;
     double productPrice;

    }

    class ProductDetail
    {
		public static void main(String args[])
		{
		      //Creating an object or instance
		      Product p1=new Product();//creating an object of Product
		      p1.productId=111;
		      p1.productName="mouse";
		      p1.productPrice=120;
		      //Printing values of the object
		      System.out.println("product id = " +p1.productId);//accessing member through reference variable
		      System.out.println("product name = " + p1.productName);
		      System.out.println("product pride = " + p1.productPrice);

		      //Creating an object or instance
			  		      Product p2=new Product();//creating an object of Product
			  		      p2.productId=112;
			  		      p2.productName="dvd";
			  		      p2.productPrice=20;
			  		      //Printing values of the object
			  		      System.out.println("product id = " +p2.productId);//accessing member through reference variable
			  		      System.out.println("product name = " + p2.productName);
		      System.out.println("product pride = " + p2.productPrice);
     }
 }
