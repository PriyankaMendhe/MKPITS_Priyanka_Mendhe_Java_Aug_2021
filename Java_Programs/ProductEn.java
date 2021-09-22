//2- create a class Product having field productid,productname,productprice and
//setter and getter method.


import java.util.*;
class Product
{
private int productId;
private String productName;
private float productPrice;

//setter and getter method

public void setProductId(int productId ) { this.productId=productId;}
public void setProductName(String productName ) { this.productName=productName;}
public void setProductPrice(float productPrice ) { this.productPrice=productPrice;}

public int getProductId(){ return productId;}
public String getProductName(){ return  productName;}
public float getProductPrice(){ return productPrice;}

}
class ProductEn{

	public static void main(String args[]){

		Product p = new Product();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Product Id");
		int productId = scan.nextInt();
		System.out.println("Enter Product Name");
		String productName = scan.next();
		System.out.println("Enter Product price ");
		float productPrice = scan.nextFloat();

		p.setProductId(productId );
		p.setProductName(productName );
		p.setProductPrice(productPrice);
		//display data

		System.out.println(p.getProductId()+ " "+p.getProductName()+ "   Rs." +p.getProductPrice());
	}}