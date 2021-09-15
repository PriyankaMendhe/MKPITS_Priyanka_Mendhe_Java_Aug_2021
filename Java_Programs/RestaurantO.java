//Java Program to demonstrate the use of the parameterized constructor.  constructor with parameter
//constructor overloading

    class RestaurantO{

    int price;
    String menuItem;
    float gst;

    RestaurantO(int i ){   price =  i;
	}

    RestaurantO(int i, String item ,float gst1){

		     price =  i;
		     menuItem=item;
		     gst= gst1;
    }

    void display(){

    System.out.println("Price = "+price);
    System.out.println("Menu Item = "+menuItem);
    System.out.println("GST = "+gst);
    }


    public static void main(String anc[]){

    RestaurantO r1 = new RestaurantO(125);
    RestaurantO r2 = new RestaurantO(220, "Masala_Dosa",15);
    r1.display();
    r2.display();

    }}