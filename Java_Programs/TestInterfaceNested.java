    // nested interface
    
    interface Drawable{
    	void draw();
    	
        interface drawcube {
    			 
    			 
    			 
           int cube(int x);
	}
    }
    
    // class implement nested interface
    class Rectangle implements Drawable.drawcube{
    
    public void draw(){System.out.println("drawing rectangle");}
    public int cube(int x){return x*x*x;}
    
    
    }

    class TestInterfaceNested{
    public static void main(String args[]){
    Rectangle d=new Rectangle();
    d.draw();
    System.out.println(d.cube(3));
    }}
