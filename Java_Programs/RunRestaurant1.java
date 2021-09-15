// constructor with parameter

    class Restaurant{

    int price;
    String menuItem;


    Restaurant(){

     System.out.println("Constructor Called");

     price = 120;
     menuItem="GulabJamun";
    }

     Restaurant(int i, String item){

	     System.out.println(" 2nd Constructor Called");

	     price =  i;
	     menuItem=item;
	}




    void display(){

    System.out.println("Price = "+price);
    System.out.println("Menu Item = "+menuItem);
    }

    }
    class RunRestaurant1{

    public static void main(String anc[]){

    Restaurant r1 = new Restaurant();
    Restaurant r2 = new Restaurant(220, "Masala_Dosa");
    r1.display();
    r2.display();

    }}
