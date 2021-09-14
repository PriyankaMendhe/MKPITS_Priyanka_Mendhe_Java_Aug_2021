//create a class customer having custid,custname,custaddress,mobno,email.

class Customer
{

   int customerId;
   String customerName;
   String customerAdd;
   String customerMob;
   String customerEmail;



   void insertProductInfo(int cid, String name ,String add, String mob, String email)
   {
        customerId=cid;
        customerName=name;
        customerAdd=add;
        customerMob=mob;
        customerEmail=email;
   }
   void displayProductInfo()
   {
       //System.out.println(" customerId = "+ customerId);
      // System.out.println(" customer name = "+ customerName);
      // System.out.println("customerAdd   = "+ customerAdd);
      // System.out.println("customer mobile no.   = "+ customerMob);
      // System.out.println("customer Email   = "+ customerEmail);

      System.out.println(customerId+" "+ customerName+ " "+customerAdd+ " "+customerMob+ " " +customerEmail);//printing both way

   }
}

class CustomerInfo
{

public static void main(String abc[])

{

    Customer c1 = new Customer();
    Customer c2 = new Customer();


  c1.insertProductInfo(85,"Gulmohar" , "Mankapur","9856020548","abc@gmail.com");
  c1.displayProductInfo();
  System.out.println("----------Next Info-------------");
  c2.insertProductInfo(851,"Aakar_Mishra" ,"Sadar","85795245632","xyz@gmail.com");
  c2.displayProductInfo();
}
}