//3- create a class orders having field orderid,orderdate, productname, price and quantity
//and setter and getter methods and calculatebill and display method .
import java.util.*;
class Order{

	private int orderId, quantity;
	private String orderDate, productName;
	private float price;

	//setter and getter method

	public void setOrderId(int orderId){this.orderId=orderId;}
	public void setQuantity(int quantity){this.quantity=quantity;}
	public void setOrderDate(String orderDate){this.orderDate= orderDate;}
	public void setProductName(String productName){this.productName=productName;}
	public void setPrice(float price){this.price=price;}

	public int getOrderId(){ return orderId;}
	public int getQuantity(){ return quantity;}
	public String getOrderDate(){ return orderDate;}
	public String getProductName(){ return productName;}
	public float getPrice(){return price; }

	//calculateBill

	public float calculateBill()
	{
		return  quantity * price ;


	}

	}

public class OrderEn{
	public static void main(String abc[]){

		Order o = new Order();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Order Id");
		int orderId = scan.nextInt();
		System.out.println("Enter Quantity");
		int quantity = scan.nextInt();
		System.out.println("Enter Order Date");
		String orderDate = scan.next();
		System.out.println("Enter Product Name");
		String productName = scan.next();
		System.out.println("Enter Price");
		float price = scan.nextFloat();

	o.setOrderId(orderId );
	o.setQuantity(quantity);
	o.setOrderDate(orderDate);
	o.setProductName(productName);
	o.setPrice(price);

	float totalBill = o.calculateBill();
	System.out.println(o.getOrderId()+ " "+o.getQuantity()+" "+o.getOrderDate()+ " "+o.getProductName()+ " "+o.getPrice());
	System.out.println("Total Bill is Rs."+totalBill);

		}
	}