
    //Let us see another example of default constructor  
    //which displays the default values  
    
    class Restaurant{
    
    int price;
    String menuItem;
    
    void display(){
    
    System.out.println("Price = "+price);
    System.out.println("Menu Item = "+menuItem);
    }
    
    }
    class RunRestaurant{
    
    public static void main(String anc[]){
    
    Restaurant r1 = new Restaurant();
    Restaurant r2 = new Restaurant();
    r1.display();
    r2.display();
    
    }}
    