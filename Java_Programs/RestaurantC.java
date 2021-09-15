 //copy constructor

    class RestaurantC{

    int price;
    String menuItem;
    float gst;

    RestaurantC(int i, String item ,float gst1){

		     price =  i;
		     menuItem=item;
		     gst= gst1;
    }

    //receiving in RestaurantC type in g
    RestaurantC(RestaurantC r){

			     price =  r.price;
			     menuItem=r.menuItem;
			     gst=r.gst;
    }

    void display(){

    System.out.println("Price = "+price);
    System.out.println("Menu Item = "+menuItem);
    System.out.println("GST = "+gst);
    }


    public static void main(String anc[]){

    RestaurantC r1 = new RestaurantC(220, "Masala_Dosa",15);
    RestaurantC r2 = new RestaurantC(r1);// copying r1 constructor values to r2 object
    r1.display();
    r2.display();

    }}