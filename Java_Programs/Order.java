package mkpits2;
public class Order{
int orderNo;
String orderName;
String orderDate;
String customerName;
int price;
int quantity;
float totalBillAmount;

public void insert(int oNo,String oName, String oDate,String cName,int p, int q)
{
orderNo=oNo;
orderName=oName;
orderDate=oDate;
customerName=cName;
price=p;
quantity=q;
}

public void calculculateBill()
{
  totalBillAmount = price * quantity;
}

public void display()
{

System.out.println("order No: "+orderNo);
System.out.println("order Date: "+orderDate);
System.out.println("Customer Name: "+customerName);
System.out.println("Order Name: "+orderName);
System.out.println("price: "+price);
System.out.println("Quantity: "+quantity);
System.out.println("TotalBillAmount: "+totalBillAmount);

}

}

