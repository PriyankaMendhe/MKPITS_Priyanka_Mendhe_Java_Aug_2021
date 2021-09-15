 //Java Program to demonstrate the use of the parameterized constructor.  constructor with parameter

    class Restaurant{

    int price;
    String menuItem;

    Restaurant(int i, String item){


	     price =  i;
	     menuItem=item;
	}

    void display(){

    System.out.println("Price = "+price);
    System.out.println("Menu Item = "+menuItem);
    }

    }
    class RunRestaurant2{

    public static void main(String anc[]){

    Restaurant r1 = new Restaurant(125,"Gulab_Jamun");
    Restaurant r2 = new Restaurant(220, "Masala_Dosa");
    r1.display();
    r2.display();

    }}
