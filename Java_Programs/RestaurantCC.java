//copy constructor

    class RestaurantCC{

    int price;
    String menuItem;
    float gst;

    RestaurantCC(int i, String item ,float gst1){

		     price =  i;
		     menuItem=item;
		     gst= gst1;
    }

    
    RestaurantCC(){
    }

    void display(){

    System.out.println("Price = "+price);
    System.out.println("Menu Item = "+menuItem);
    System.out.println("GST = "+gst);
    }


    public static void main(String anc[]){

    RestaurantCC r1 = new RestaurantCC(220, "Masala_Dosa",15);
    RestaurantCC r2 = new RestaurantCC();// calling with no argument
    
    // copying r1 constructor values to r2 object
    
    r2.price=r1.price;
    r2.menuItem=r1.menuItem;
    r2.gst=r1.gst;
    
    r1.display();
    r2.display();

    }}