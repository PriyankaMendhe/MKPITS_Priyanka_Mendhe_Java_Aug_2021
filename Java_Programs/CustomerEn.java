//1- create a class Customer having field customerid, customername , customeremail,customermobile and setter and getter method
import java.util.*;
class Customer
{
private int customerId;
private String customerName , customerEmail,customerMobile;

//setter and getter method

public void setCustomerId(int customerId ) { this.customerId=customerId;}
public void setCustomerName(String customerName ) { this.customerName=customerName;}
public void setCustomerEmail(String customerEmail ) { this.customerEmail=customerEmail;}
public void setCustomerMobile(String customerMobile ) {this.customerMobile=customerMobile;}

public int getCustomerId(){ return customerId;}
public String getCustomerName(){ return customerName;}
public String getCustomerEmail(){ return customerEmail;}
public String getCustomerMobile(){ return customerMobile;}

}
class CustomerEn{

	public static void main(String args[]){

		Customer c = new Customer();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Customer Id");
		int customerId = scan.nextInt();
		System.out.println("Enter Customer Name");
		String customerName = scan.next();
		System.out.println("Enter Customer Email Id ");
		String customerEmail = scan.next();
		System.out.println("Enter Customer Mobile no. ");
		String customerMobile = scan.next();

		c.setCustomerId(customerId);
		c.setCustomerName(customerName);
		c.setCustomerEmail(customerEmail);
		c.setCustomerMobile(customerMobile);

		//display data

		System.out.println(c.getCustomerId()+ " "+c.getCustomerName()+ " " +c.getCustomerEmail()+" "+c.getCustomerMobile());

	}}